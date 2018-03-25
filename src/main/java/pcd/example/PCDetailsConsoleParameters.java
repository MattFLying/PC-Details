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
package pcd.example;

import pcd.factory.PCDetailsFactory;
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
 * Runnable class with console parameters to show details of components.
 * 
 * @author Mateusz Mucha
 */
public class PCDetailsConsoleParameters {
	public static void main(String[] args) {
		if (args.length == 1) {
			justOneParameter(args);
		} else if (args.length > 1) {
			moreThanOneParameter(args);
		} else {
			throw new IllegalArgumentException("Required just one parameter. If you don't know which one use /help. Only processes can use more parameters.");
		}
	}

	/**
	 * Method to handling one parameter.
	 * 
	 * @param args
	 */
	private static void justOneParameter(String[] args) {
		if (args[0].equals("-cpu")) {
			processor();
		} else if (args[0].equals("-gpu")) {
			graphicCards();
		} else if (args[0].equals("-ram")) {
			memory();
		} else if (args[0].equals("-mobo")) {
			motherboard();
		} else if (args[0].equals("-hdd")) {
			disk();
		} else if (args[0].equals("-net")) {
			network();
		} else if (args[0].equals("-bios")) {
			bios();
		} else if (args[0].equals("-os")) {
			operatingSystem();
		} else if (args[0].equals("-process")) {
			processes();
		} else if (args[0].equals("/help")) {
			help();
		} else {
			help();
		}
	}

	/**
	 * Method to handling more than one parameter. Only 2 or 3 parameters are
	 * accessible.
	 * 
	 * @param args
	 */
	private static void moreThanOneParameter(String[] args) {
		if (args.length == 2) {
			try {
				int value = Integer.valueOf(args[1]);
				processes(Integer.valueOf(value));
			} catch (NumberFormatException e) {
				String value = String.valueOf(args[1]);
				processes(String.valueOf(value));
			}
		} else if (args.length == 3) {
			int processesCount = 0;
			String sortingType = "";
			try {
				processesCount = Integer.valueOf(args[1]);
			} catch (NumberFormatException e) {
				sortingType = String.valueOf(args[1]);
			}
			try {
				processesCount = Integer.valueOf(args[2]);
			} catch (NumberFormatException e) {
				sortingType = String.valueOf(args[2]);
			}
			processes(processesCount, sortingType);
		} else if (args.length > 3) {
			throw new IllegalArgumentException("Required just one parameter. If you don't know which one use /help. Only processes can use more parameters.");
		}
	}

	/**
	 * Method to get processor details.
	 */
	private static void processor() {
		Cpu cpu = PCDetailsFactory.getProcessorInfo();
		System.out.println(cpu.componentAsString());
	}

	/**
	 * Method to get graphic cards details.
	 */
	private static void graphicCards() {
		Gpu gpu = PCDetailsFactory.getGraphicCardsInfo();
		System.out.println(gpu.componentAsString());
	}

	/**
	 * Method to get memory details.
	 */
	private static void memory() {
		Ram ram = PCDetailsFactory.getMemoryInfo();
		System.out.println(ram.componentAsString());
	}

	/**
	 * Method to get motherboard details.
	 */
	private static void motherboard() {
		Motherboard mobo = PCDetailsFactory.getMotherboardInfo();
		System.out.println(mobo.componentAsString());
	}

	/**
	 * Method to get disk details.
	 */
	private static void disk() {
		Disk hdd = PCDetailsFactory.getHardDiskInfo();
		System.out.println(hdd.componentAsString());
	}

	/**
	 * Method to get network details.
	 */
	private static void network() {
		Network network = PCDetailsFactory.getNetworkInfo();
		System.out.println(network.componentAsString());
	}

	/**
	 * Method to get bios details.
	 */
	private static void bios() {
		Bios bios = PCDetailsFactory.getBiosInfo();
		System.out.println(bios.componentAsString());
	}

	/**
	 * Method to get operating system details.
	 */
	private static void operatingSystem() {
		OperatingSystem os = PCDetailsFactory.getOperatingSystemInfo();
		System.out.println(os.componentAsString());
	}

	/**
	 * Method to get processes details.
	 */
	private static void processes() {
		Process process = PCDetailsFactory.getProcessesInfo();
		System.out.println(process.componentAsString());
	}

	/**
	 * Method to get processes details. Show only limited list of processes
	 * declared as parameter.
	 * 
	 * @param _processesCount
	 */
	private static void processes(int _processesCount) {
		Process process = PCDetailsFactory.getProcessesInfo(_processesCount, null);
		System.out.println(process.componentAsString());
	}

	/**
	 * Method to get processes details. Show sorted list of processes declared
	 * as parameter. There are 7 types of sorting in String representation which
	 * are only valid to use:
	 * 
	 * <pre>
	 *            "-cpu" - sorting by cpu usage
	 *            "-memory" - sorting by memory usage
	 *            "-name" - sorting by name
	 *            "-new" - sorting by newest
	 *            "-old" - sorting by oldest
	 *            "-parent" - sorting by parent id
	 *            "-id" - sorting by id
	 * </pre>
	 * 
	 * @param _sortingType
	 */
	private static void processes(String _sortingType) {
		Process process = PCDetailsFactory.getProcessesInfo(_sortingType, 0);
		System.out.println(process.componentAsString());
	}

	/**
	 * Method to get processes details. Show sorted limited list of processes
	 * declared as parameter. There are 7 types of sorting in String
	 * representation which are only valid to use:
	 * 
	 * <pre>
	 *            "-cpu" - sorting by cpu usage
	 *            "-memory" - sorting by memory usage
	 *            "-name" - sorting by name
	 *            "-new" - sorting by newest
	 *            "-old" - sorting by oldest
	 *            "-parent" - sorting by parent id
	 *            "-id" - sorting by id
	 * </pre>
	 * 
	 * @param _processesCount
	 * @param _sortingType
	 */
	private static void processes(int _processesCount, String _sortingType) {
		Process process = PCDetailsFactory.getProcessesInfo(_sortingType, _processesCount);
		System.out.println(process.componentAsString());
	}

	/**
	 * Method to get help informations.
	 */
	private static void help() {
		System.out.println("======================  HELP  ======================");
		System.out.println("To show system details you can use these parameters");
		System.out.println("====================================================");
		System.out.println("[-cpu] - to show processor informations,");
		System.out.println("[-gpu] - to show graphic cards informations,");
		System.out.println("[-ram] - to show memory informations,");
		System.out.println("[-mobo] - to show motherboard informations,");
		System.out.println("[-hdd] - to show hard disk informations,");
		System.out.println("[-net] - to show network informations,");
		System.out.println("[-bios] - to show bios informations,");
		System.out.println("[-os] - to show operating system informations,");
		System.out.println("[-process] - to show processes informations,");
		System.out.println("           [processesCount] - limited processes e.g. {-process 5},");
		System.out.println(
				"           [sortingType] - sorted processes e.g. {-process -cpu}, there are 7 types of sorting in String representation which are only valid to use: -cpu, -memory, -name, -new, -old, -parent, -id");
		System.out.println(
				"           [processesCount] [sortingType] - sorted limited processes e.g. {-process 5 -cpu} or {-process -cpu 5},");
	}
}