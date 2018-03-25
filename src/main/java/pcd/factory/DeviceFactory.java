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
package pcd.factory;

import oshi.SystemInfo;
import oshi.software.os.OperatingSystem.ProcessSort;
import pcd.hardware.HardwareInfo;
import pcd.hardware.cpu.CpuInfo;
import pcd.hardware.gpu.GpuInfo;
import pcd.hardware.harddisk.DiskInfo;
import pcd.hardware.memory.MemoryInfo;
import pcd.hardware.motherboard.MoboInfo;
import pcd.hardware.network.NetworkInfo;
import pcd.software.SoftwareInfo;
import pcd.software.bios.BiosInfo;
import pcd.software.os.OsInfo;
import pcd.software.processes.ProcessInfo;

/**
 * Class factory to create informations of hardware and software.
 * 
 * @author Mateusz Mucha
 */
public final class DeviceFactory {
	/**
	 * Enumerate type represents hardware type.
	 * 
	 * @author Mateusz Mucha
	 */
	public enum HardwareType {
		CPU, GPU, RAM, MOBO, HDD, NETWORK;
	}

	/**
	 * Enumerate type represents software type.
	 * 
	 * @author Mateusz Mucha
	 */
	public enum SoftwareType {
		OS, BIOS, PROCESSES;
	}

	/**
	 * Method to get hardware information object.
	 * 
	 * @param _type
	 * @return hardware information object
	 */
	public static HardwareInfo getHardware(HardwareType _type) {
		switch (_type) {
		case CPU:
			return new CpuInfo();
		case GPU:
			return new GpuInfo();
		case RAM:
			return new MemoryInfo();
		case MOBO:
			return new MoboInfo();
		case HDD:
			return new DiskInfo();
		case NETWORK:
			return new NetworkInfo();
		default:
			throw new IllegalArgumentException("Type of hardware not supported: " + _type);
		}
	}

	/**
	 * Method to get hardware information object. Used new system info object of
	 * OSHI API.
	 * 
	 * @param _type
	 * @param _systemInfo
	 * @return hardware information object
	 */
	public static HardwareInfo getHardware(HardwareType _type, SystemInfo _systemInfo) {
		switch (_type) {
		case CPU:
			return new CpuInfo(_systemInfo);
		case GPU:
			return new GpuInfo(_systemInfo);
		case RAM:
			return new MemoryInfo(_systemInfo);
		case MOBO:
			return new MoboInfo(_systemInfo);
		case HDD:
			return new DiskInfo(_systemInfo);
		case NETWORK:
			return new NetworkInfo(_systemInfo);
		default:
			throw new IllegalArgumentException("Type of hardware not supported: " + _type);
		}
	}

	/**
	 * Method to get software information object. Processes will get all of them
	 * with no sorting.
	 * 
	 * @param _type
	 * @return software information object
	 */
	public static SoftwareInfo getSoftware(SoftwareType _type) {
		switch (_type) {
		case OS:
			return new OsInfo();
		case BIOS:
			return new BiosInfo();
		case PROCESSES:
			return new ProcessInfo(null, 0);
		default:
			throw new IllegalArgumentException("Type of software not supported: " + _type);
		}
	}

	/**
	 * Method to get software information object.
	 * 
	 * @param _type
	 * @param _processSort
	 *            - type of sorting processes. Could be sorted by e.g. name, cpu
	 *            usage etc. If is null theen there is no sorting. If don't want
	 *            to get processes jsut use null.
	 * @param _processesCount
	 *            - number of processes to create. If 0 then all processes will
	 *            be created. If don't want to get processes jsut use 0.
	 * @return software information object
	 */
	public static SoftwareInfo getSoftware(SoftwareType _type, ProcessSort _processSort, int _processesCount) {
		switch (_type) {
		case OS:
			return new OsInfo();
		case BIOS:
			return new BiosInfo();
		case PROCESSES:
			return new ProcessInfo(_processSort, _processesCount);
		default:
			throw new IllegalArgumentException("Type of software not supported: " + _type);
		}
	}

	/**
	 * Method to get software information object. Used new system info object of
	 * OSHI API. Processes will get all of them with no sorting.
	 * 
	 * @param _type
	 * @param _systemInfo
	 * @return software information object
	 */
	public static SoftwareInfo getSoftware(SoftwareType _type, SystemInfo _systemInfo) {
		switch (_type) {
		case OS:
			return new OsInfo(_systemInfo);
		case BIOS:
			return new BiosInfo(_systemInfo);
		case PROCESSES:
			return new ProcessInfo(_systemInfo, null, 0);
		default:
			throw new IllegalArgumentException("Type of software not supported: " + _type);
		}
	}

	/**
	 * Method to get software information object. Used new system info object of
	 * OSHI API.
	 * 
	 * @param _type
	 * @param _systemInfo
	 * @param _processSort
	 *            - type of sorting processes. Could be sorted by e.g. name, cpu
	 *            usage etc. If is null theen there is no sorting. If don't want
	 *            to get processes jsut use null.
	 * @param _processesCount
	 *            - number of processes to create. If 0 then all processes will
	 *            be created. If don't want to get processes jsut use 0.
	 * @return software information object
	 */
	public static SoftwareInfo getSoftware(SoftwareType _type, SystemInfo _systemInfo, ProcessSort _processSort,
			int _processesCount) {
		switch (_type) {
		case OS:
			return new OsInfo(_systemInfo);
		case BIOS:
			return new BiosInfo(_systemInfo);
		case PROCESSES:
			return new ProcessInfo(_systemInfo, _processSort, _processesCount);
		default:
			throw new IllegalArgumentException("Type of software not supported: " + _type);
		}
	}
}