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
import pcd.hardware.cpu.Cpu;
import pcd.hardware.gpu.Gpu;
import pcd.hardware.harddisk.Disk;
import pcd.hardware.memory.Ram;
import pcd.hardware.motherboard.Motherboard;
import pcd.hardware.network.Network;
import pcd.software.bios.Bios;
import pcd.software.os.OperatingSystem;
import pcd.software.processes.Process;

/**
 * Class factory to create informations of hardware and software. Returned right
 * builded components ready to manage of data.
 * 
 * @author Mateusz Mucha
 */
public class PCDetailsFactory {

	/**
	 * Method to get builded informations of processor.
	 * 
	 * @return informations of processor
	 */
	public static Cpu getProcessorInfo() {
		return (Cpu) DeviceFactory.getHardware(DeviceFactory.HardwareType.CPU).buildHardware();
	}

	/**
	 * Method to get builded informations of processor. Used new system info
	 * object of OSHI API.
	 * 
	 * @param _systemInfo
	 * @return informations of processor
	 */
	public static Cpu getProcessorInfo(SystemInfo _systemInfo) {
		return (Cpu) DeviceFactory.getHardware(DeviceFactory.HardwareType.CPU, _systemInfo).buildHardware();
	}

	/**
	 * Method to get builded informations of graphic cards.
	 * 
	 * @return informations of graphic cards
	 */
	public static Gpu getGraphicCardsInfo() {
		return (Gpu) DeviceFactory.getHardware(DeviceFactory.HardwareType.GPU).buildHardware();
	}

	/**
	 * Method to get builded informations of graphic cards. Used new system info
	 * object of OSHI API.
	 * 
	 * @param _systemInfo
	 * @return informations of graphic cards
	 */
	public static Gpu getGraphicCardsInfo(SystemInfo _systemInfo) {
		return (Gpu) DeviceFactory.getHardware(DeviceFactory.HardwareType.GPU, _systemInfo).buildHardware();
	}

	/**
	 * Method to get builded informations of hard disk.
	 * 
	 * @return informations of hard disk
	 */
	public static Disk getHardDiskInfo() {
		return (Disk) DeviceFactory.getHardware(DeviceFactory.HardwareType.HDD).buildHardware();
	}

	/**
	 * Method to get builded informations of hard disk. Used new system info
	 * object of OSHI API.
	 * 
	 * @param _systemInfo
	 * @return informations of hard disk
	 */
	public static Disk getHardDiskInfo(SystemInfo _systemInfo) {
		return (Disk) DeviceFactory.getHardware(DeviceFactory.HardwareType.HDD, _systemInfo).buildHardware();
	}

	/**
	 * Method to get builded informations of memory.
	 * 
	 * @return informations of memory
	 */
	public static Ram getMemoryInfo() {
		return (Ram) DeviceFactory.getHardware(DeviceFactory.HardwareType.RAM).buildHardware();
	}

	/**
	 * Method to get builded informations of memory. Used new system info object
	 * of OSHI API.
	 * 
	 * @param _systemInfo
	 * @return informations of memory
	 */
	public static Ram getMemoryInfo(SystemInfo _systemInfo) {
		return (Ram) DeviceFactory.getHardware(DeviceFactory.HardwareType.RAM, _systemInfo).buildHardware();
	}

	/**
	 * Method to get builded informations of motherboard.
	 * 
	 * @return informations of motherboard
	 */
	public static Motherboard getMotherboardInfo() {
		return (Motherboard) DeviceFactory.getHardware(DeviceFactory.HardwareType.MOBO).buildHardware();
	}

	/**
	 * Method to get builded informations of motherboard. Used new system info
	 * object of OSHI API.
	 * 
	 * @param _systemInfo
	 * @return informations of motherboard
	 */
	public static Motherboard getMotherboardInfo(SystemInfo _systemInfo) {
		return (Motherboard) DeviceFactory.getHardware(DeviceFactory.HardwareType.MOBO, _systemInfo).buildHardware();
	}

	/**
	 * Method to get builded informations of network.
	 * 
	 * @return informations of network
	 */
	public static Network getNetworkInfo() {
		return (Network) DeviceFactory.getHardware(DeviceFactory.HardwareType.NETWORK).buildHardware();
	}

	/**
	 * Method to get builded informations of network. Used new system info
	 * object of OSHI API.
	 * 
	 * @param _systemInfo
	 * @return informations of network
	 */
	public static Network getNetworkInfo(SystemInfo _systemInfo) {
		return (Network) DeviceFactory.getHardware(DeviceFactory.HardwareType.NETWORK, _systemInfo).buildHardware();
	}

	/**
	 * Method to get builded informations of bios.
	 * 
	 * @return informations of bios
	 */
	public static Bios getBiosInfo() {
		return (Bios) DeviceFactory.getSoftware(DeviceFactory.SoftwareType.BIOS).buildSoftware();
	}

	/**
	 * Method to get builded informations of bios. Used new system info object
	 * of OSHI API.
	 * 
	 * @param _systemInfo
	 * @return informations of bios
	 */
	public static Bios getBiosInfo(SystemInfo _systemInfo) {
		return (Bios) DeviceFactory.getSoftware(DeviceFactory.SoftwareType.BIOS, _systemInfo).buildSoftware();
	}

	/**
	 * Method to get builded informations of operating system.
	 * 
	 * @return informations of operating system
	 */
	public static OperatingSystem getOperatingSystemInfo() {
		return (OperatingSystem) DeviceFactory.getSoftware(DeviceFactory.SoftwareType.OS).buildSoftware();
	}

	/**
	 * Method to get builded informations of operating system. Used new system
	 * info object of OSHI API.
	 * 
	 * @param _systemInfo
	 * @return informations of operating system
	 */
	public static OperatingSystem getOperatingSystemInfo(SystemInfo _systemInfo) {
		return (OperatingSystem) DeviceFactory.getSoftware(DeviceFactory.SoftwareType.OS, _systemInfo).buildSoftware();
	}

	/**
	 * Method to get builded informations of processes.
	 * 
	 * @return informations of processes
	 */
	public static Process getProcessesInfo() {
		return (Process) DeviceFactory.getSoftware(DeviceFactory.SoftwareType.PROCESSES).buildSoftware();
	}

	/**
	 * Method to get builded informations of processes. Used new system info
	 * object of OSHI API.
	 * 
	 * @param _systemInfo
	 * @return informations of processes
	 */
	public static Process getProcessesInfo(SystemInfo _systemInfo) {
		return (Process) DeviceFactory.getSoftware(DeviceFactory.SoftwareType.PROCESSES, _systemInfo).buildSoftware();
	}

	/**
	 * Method to get builded informations of processes.
	 * 
	 * @param processSort
	 *            - type of sorting processes. Could be sorted by e.g. name, cpu
	 *            usage etc. If is null theen there is no sorting.
	 * @param processesCount
	 *            - number of processes to create. If 0 then all processes will
	 *            be created.
	 * @return informations of processes
	 */
	public static Process getProcessesInfo(int _processesCount, ProcessSort _processSort) {
		return (Process) DeviceFactory.getSoftware(DeviceFactory.SoftwareType.PROCESSES, _processSort, _processesCount)
				.buildSoftware();
	}

	/**
	 * Method to get builded informations of processes. Used new system info
	 * object of OSHI API.
	 * 
	 * @param _systemInfo
	 * @param processSort
	 *            - type of sorting processes. Could be sorted by e.g. name, cpu
	 *            usage etc. If is null theen there is no sorting.
	 * @param processesCount
	 *            - number of processes to create. If 0 then all processes will
	 *            be created.
	 * @return informations of processes
	 */
	public static Process getProcessesInfo(SystemInfo _systemInfo, ProcessSort _processSort, int _processesCount) {
		return (Process) DeviceFactory
				.getSoftware(DeviceFactory.SoftwareType.PROCESSES, _systemInfo, _processSort, _processesCount)
				.buildSoftware();
	}

	/**
	 * Method to get builded informations of processes.
	 * 
	 * @param processSort
	 *            type of sorting processes. There are 7 types of sorting in
	 *            String representation which are only valid to use:
	 * 
	 *            <pre>
	 *            "-cpu" - sorting by cpu usage
	 *            "-memory" - sorting by memory usage
	 *            "-name" - sorting by name
	 *            "-new" - sorting by newest
	 *            "-old" - sorting by oldest
	 *            "-parent" - sorting by parent id
	 *            "-id" - sorting by id
	 *            </pre>
	 * 
	 * @param processesCount
	 *            - number of processes to create. If 0 then all processes will
	 *            be created.
	 * @return informations of processes
	 */
	public static Process getProcessesInfo(String _processSort, int _processesCount) {
		switch (_processSort) {
		case "-cpu":
			return (Process) DeviceFactory
					.getSoftware(DeviceFactory.SoftwareType.PROCESSES, ProcessSort.CPU, _processesCount)
					.buildSoftware();
		case "-memory":
			return (Process) DeviceFactory
					.getSoftware(DeviceFactory.SoftwareType.PROCESSES, ProcessSort.MEMORY, _processesCount)
					.buildSoftware();
		case "-name":
			return (Process) DeviceFactory
					.getSoftware(DeviceFactory.SoftwareType.PROCESSES, ProcessSort.NAME, _processesCount)
					.buildSoftware();
		case "-new":
			return (Process) DeviceFactory
					.getSoftware(DeviceFactory.SoftwareType.PROCESSES, ProcessSort.NEWEST, _processesCount)
					.buildSoftware();
		case "-old":
			return (Process) DeviceFactory
					.getSoftware(DeviceFactory.SoftwareType.PROCESSES, ProcessSort.OLDEST, _processesCount)
					.buildSoftware();
		case "-parent":
			return (Process) DeviceFactory
					.getSoftware(DeviceFactory.SoftwareType.PROCESSES, ProcessSort.PARENTPID, _processesCount)
					.buildSoftware();
		case "-id":
			return (Process) DeviceFactory
					.getSoftware(DeviceFactory.SoftwareType.PROCESSES, ProcessSort.PID, _processesCount)
					.buildSoftware();
		default:
			throw new IllegalArgumentException("Wrong sorting type parameter!");
		}
	}

	/**
	 * Method to get builded informations of processes.
	 * 
	 * @param _systemInfo
	 * @param processSort
	 *            type of sorting processes. There are 7 types of sorting in
	 *            String representation which are only valid to use:
	 * 
	 *            <pre>
	 *            "-cpu" - sorting by cpu usage
	 *            "-memory" - sorting by memory usage
	 *            "-name" - sorting by name
	 *            "-new" - sorting by newest
	 *            "-old" - sorting by oldest
	 *            "-parent" - sorting by parent id
	 *            "-id" - sorting by id
	 *            </pre>
	 * 
	 * @param processesCount
	 *            - number of processes to create. If 0 then all processes will
	 *            be created.
	 * @return informations of processes
	 */
	public static Process getProcessesInfo(SystemInfo _systemInfo, String _processSort, int _processesCount) {
		switch (_processSort) {
		case "-cpu":
			return (Process) DeviceFactory
					.getSoftware(DeviceFactory.SoftwareType.PROCESSES, ProcessSort.CPU, _processesCount)
					.buildSoftware();
		case "-memory":
			return (Process) DeviceFactory
					.getSoftware(DeviceFactory.SoftwareType.PROCESSES, ProcessSort.MEMORY, _processesCount)
					.buildSoftware();
		case "-name":
			return (Process) DeviceFactory
					.getSoftware(DeviceFactory.SoftwareType.PROCESSES, ProcessSort.NAME, _processesCount)
					.buildSoftware();
		case "-new":
			return (Process) DeviceFactory
					.getSoftware(DeviceFactory.SoftwareType.PROCESSES, ProcessSort.NEWEST, _processesCount)
					.buildSoftware();
		case "-old":
			return (Process) DeviceFactory
					.getSoftware(DeviceFactory.SoftwareType.PROCESSES, ProcessSort.OLDEST, _processesCount)
					.buildSoftware();
		case "-parent":
			return (Process) DeviceFactory
					.getSoftware(DeviceFactory.SoftwareType.PROCESSES, ProcessSort.PARENTPID, _processesCount)
					.buildSoftware();
		case "-id":
			return (Process) DeviceFactory
					.getSoftware(DeviceFactory.SoftwareType.PROCESSES, ProcessSort.PID, _processesCount)
					.buildSoftware();
		default:
			throw new IllegalArgumentException("Wrong sorting type parameter!");
		}
	}

	/**
	 * Method to get system info object from OSHI API.
	 * 
	 * @return system info object from OSHI API
	 */
	public static SystemInfo getSystemInfo() {
		return new SystemInfo();
	}
}