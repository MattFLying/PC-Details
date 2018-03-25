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

import java.util.List;

import pcd.Component;

/**
 * Class representation of disk.
 * 
 * @author Mateusz Mucha
 */
public final class Disk extends Component {
	private static final long serialVersionUID = 2552773150423460545L;
	private List<HardDisk> diskList;

	/**
	 * Default constructor.
	 * 
	 * @param _diskList
	 */
	public Disk(List<HardDisk> _diskList) {
		super(null);
		this.diskList = _diskList;
	}

	/**
	 * Method to get hard disks.
	 * 
	 * @return list of hard disks
	 */
	public List<HardDisk> getDiskList() {
		return diskList;
	}

	@Override
	public String componentAsString() {
		StringBuilder sb = new StringBuilder("==== Hard Disk List ====");

		getDiskList().forEach(hdd -> {
			sb.append("\n");
			sb.append(hdd.componentAsString());
		});

		return sb.toString();
	}

	/**
	 * Class representation of hard disk.
	 * 
	 * @author Mateusz Mucha
	 */
	public static final class HardDisk extends Component {
		private static final long serialVersionUID = -6385229838268812700L;
		private String name, model, size, readBytes, writeBytes;
		private long reads, writes, transferTime, timeStamp;
		private List<Partition> partitions;

		public HardDisk(String _id, String _name, String _model, String _size, long _reads, String _readBytes,
				long _writes, String _writeBytes, long _transferTime, long _timeStamp, List<Partition> _partitions) {
			super(_id);
			this.name = _name;
			this.model = _model;
			this.size = _size;
			this.reads = _reads;
			this.readBytes = _readBytes;
			this.writes = _writes;
			this.writeBytes = _writeBytes;
			this.transferTime = _transferTime;
			this.timeStamp = _timeStamp;
			this.partitions = _partitions;
		}

		/**
		 * Method to get hard disk name.
		 * 
		 * @return hard disk name
		 */
		public String getName() {
			return name;
		}

		/**
		 * Method to set hard disk name.
		 * 
		 * @param _name
		 */
		public void setName(String _name) {
			this.name = _name;
		}

		/**
		 * Method to get hard disk model.
		 * 
		 * @return hard disk model
		 */
		public String getModel() {
			return model;
		}

		/**
		 * Method to set hard disk model.
		 * 
		 * @param _model
		 */
		public void setModel(String _model) {
			this.model = _model;
		}

		/**
		 * Method to get hard disk size.
		 * 
		 * @return hard disk size
		 */
		public String getSize() {
			return size;
		}

		/**
		 * Method to set hard disk size.
		 * 
		 * @param _size
		 */
		public void setSize(String _size) {
			this.size = _size;
		}

		/**
		 * Method to get hard disk reads.
		 * 
		 * @return hard disk reads
		 */
		public long getReads() {
			return reads;
		}

		/**
		 * Method to set hard disk reads.
		 * 
		 * @param _reads
		 */
		public void setReads(long _reads) {
			this.reads = _reads;
		}

		/**
		 * Method to get hard disk read bytes.
		 * 
		 * @return hard disk read bytes
		 */
		public String getReadBytes() {
			return readBytes;
		}

		/**
		 * Method to set hard disk read bytes.
		 * 
		 * @param _readBytes
		 */
		public void setReadBytes(String _readBytes) {
			this.readBytes = _readBytes;
		}

		/**
		 * Method to get hard disk writes.
		 * 
		 * @return hard disk writes
		 */
		public long getWrites() {
			return writes;
		}

		/**
		 * Method to set hard disk writes.
		 * 
		 * @param _writes
		 */
		public void setWrites(long _writes) {
			this.writes = _writes;
		}

		/**
		 * Method to get hard disk write bytes.
		 * 
		 * @return hard disk write bytes
		 */
		public String getWriteBytes() {
			return writeBytes;
		}

		/**
		 * Method to set hard disk write bytes.
		 * 
		 * @param _writeBytes
		 */
		public void setWriteBytes(String _writeBytes) {
			this.writeBytes = _writeBytes;
		}

		/**
		 * Method to get hard disk time transfer.
		 * 
		 * @return hard disk time transfer
		 */
		public long getTransferTime() {
			return transferTime;
		}

		/**
		 * Method to set hard disk time transfer.
		 * 
		 * @param _transferTime
		 */
		public void setTransferTime(long _transferTime) {
			this.transferTime = _transferTime;
		}

		/**
		 * Method to get hard disk time stamp.
		 * 
		 * @return hard disk time stamp
		 */
		public long getTimeStamp() {
			return timeStamp;
		}

		/**
		 * Method to set hard disk time stamp.
		 * 
		 * @param _timeStamp
		 */
		public void setTimeStamp(long _timeStamp) {
			this.timeStamp = _timeStamp;
		}

		/**
		 * Method to get partitions of disk.
		 * 
		 * @return partitions of disk
		 */
		public List<Partition> getPartitions() {
			return partitions;
		}

		/**
		 * Method to set partitions of disk.
		 * 
		 * @param _partitions
		 */
		public void setPartitions(List<Partition> _partitions) {
			this.partitions = _partitions;
		}

		@Override
		public String componentAsString() {
			StringBuilder sb = new StringBuilder("=== Hard Disk ===");

			sb.append("\nHDD ID: ");
			sb.append(getId());
			sb.append("\nHDD Name: ");
			sb.append(getName());
			sb.append("\nHDD Model: ");
			sb.append(getModel());
			sb.append("\nHDD Size: ");
			sb.append(getSize());
			sb.append("\nHDD Read Bytes: ");
			sb.append(getReadBytes());
			sb.append("\nHDD Reads: ");
			sb.append(getReads());
			sb.append("\nHDD Wrie Bytes: ");
			sb.append(getWriteBytes());
			sb.append("\nHDD Writes: ");
			sb.append(getWrites());
			sb.append("\nHDD Time Stamp: ");
			sb.append(getTimeStamp());
			sb.append("\nHDD Transfer Time: ");
			sb.append(getTransferTime());
			sb.append("\n==== HDD Partitions ====");
			getPartitions().forEach(part -> {
				sb.append("\n");
				sb.append(part.componentAsString());
			});

			return sb.toString();
		}
	}
}