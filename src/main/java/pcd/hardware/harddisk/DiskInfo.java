/**
 * Copyright 2018 Mateusz Mucha mateusz.marek.mucha@gmail.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pcd.hardware.harddisk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import oshi.SystemInfo;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HWPartition;
import oshi.software.os.OSFileStore;
import oshi.software.os.OperatingSystem;
import pcd.hardware.HardwareAbstract;
import pcd.hardware.HardwareInfo;
import pcd.util.FormatUtil;

/**
 * Class to build hard disk informations. Should be use as command to build
 * model component of hard disk.
 * 
 * @author Mateusz Mucha
 */
public final class DiskInfo extends HardwareAbstract implements HardwareInfo<Disk> {
	/**
	 * Default constructor.
	 */
	public DiskInfo() {
		super(null);
	}

	/**
	 * Constructor with new SystemInfo object of OSHI API.
	 * 
	 * @param _systemInfo
	 *            - system info object of OSHI API
	 */
	public DiskInfo(SystemInfo _systemInfo) {
		super(_systemInfo, null);
	}

	public Disk buildHardware() {
		List<Disk.HardDisk> diskList = new ArrayList<Disk.HardDisk>();

		Arrays.asList(getHardwareAbstractionLayer().getDiskStores()).forEach(hwDisk -> {
			List<Partition> partitionList = partitionList(hwDisk);

			Disk.HardDisk disk = new Disk.HardDisk(hwDisk.getSerial(), hwDisk.getName(), hwDisk.getModel(),
					FormatUtil.formatBytesDecimal(hwDisk.getSize()), hwDisk.getReads(),
					FormatUtil.toBytes(hwDisk.getReadBytes()), hwDisk.getWrites(),
					FormatUtil.toBytes(hwDisk.getWriteBytes()), hwDisk.getTransferTime(), hwDisk.getTimeStamp(),
					partitionList);
			diskList.add(disk);
		});

		return new Disk(diskList);
	}

	/**
	 * Method to configure list of partitions of hard disk.
	 * 
	 * @param _hwDisk
	 * @return list of partitions of hard disk
	 */
	private List<Partition> partitionList(HWDiskStore _hwDisk) {
		OperatingSystem operatingSystem = getSystemInfo().getOperatingSystem();
		List<OSFileStore> fileSystems = Arrays.asList(operatingSystem.getFileSystem().getFileStores());
		List<Partition> partitionList = new ArrayList<Partition>();

		List<HWPartition> partitions = Arrays.asList(_hwDisk.getPartitions());
		for (HWPartition hwPartition : partitions) {
			for (OSFileStore fileStore : fileSystems) {
				if (hwPartition.getMountPoint().equals(fileStore.getMount())) {
					Partition partition = new Partition(hwPartition.getIdentification(), hwPartition.getName(),
							hwPartition.getType(), hwPartition.getUuid(), hwPartition.getMountPoint(),
							hwPartition.getMajor(), hwPartition.getMinor(),
							FormatUtil.formatBytesDecimal(hwPartition.getSize()), fileStore.getType(),
							fileStore.getUsableSpace(), fileStore.getTotalSpace());
					partitionList.add(partition);
				}
			}
		}

		return partitionList;
	}
}