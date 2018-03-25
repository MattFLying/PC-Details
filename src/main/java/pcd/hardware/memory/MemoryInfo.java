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
package pcd.hardware.memory;

import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;
import pcd.hardware.HardwareAbstract;
import pcd.hardware.HardwareInfo;
import pcd.util.FormatUtil;

/**
 * Class to build memory informations. Should be use as command to build model
 * component of memory.
 * 
 * @author Mateusz Mucha
 */
public final class MemoryInfo extends HardwareAbstract implements HardwareInfo<Ram> {
	/**
	 * Default constructor.
	 */
	public MemoryInfo() {
		super(org.jutils.jhardware.HardwareInfo.getMemoryInfo().getFullInfo());
	}

	/**
	 * Constructor with new SystemInfo object of OSHI API.
	 * 
	 * @param _systemInfo
	 *            - system info object of OSHI API
	 */
	public MemoryInfo(SystemInfo _systemInfo) {
		super(_systemInfo, org.jutils.jhardware.HardwareInfo.getMemoryInfo().getFullInfo());
	}

	public Ram buildHardware() {
		GlobalMemory _memory = getHardwareAbstractionLayer().getMemory();

		return new Ram(serialNumber(), FormatUtil.toBytes(_memory.getAvailable()),
				FormatUtil.toBytes(_memory.getTotal()), FormatUtil.toBytes(_memory.getSwapTotal()),
				FormatUtil.toBytes(_memory.getSwapUsed()), speed(), totalWidth());
	}

	/**
	 * Method to get total width of memory.
	 * 
	 * @return total width of memory
	 */
	private String totalWidth() {
		return dataMap().get("TotalWidth");
	}

	/**
	 * Method to get speed of memory.
	 * 
	 * @return speed of memory
	 */
	private String speed() {
		return dataMap().get("Speed");
	}

	/**
	 * Method to get serialnumber of memory.
	 * 
	 * @return serialnumber of memory
	 */
	private String serialNumber() {
		return dataMap().get("SerialNumber");
	}
}