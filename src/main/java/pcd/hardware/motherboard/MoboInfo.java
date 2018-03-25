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
package pcd.hardware.motherboard;

import oshi.SystemInfo;
import pcd.hardware.HardwareAbstract;
import pcd.hardware.HardwareInfo;

/**
 * Class to build motherboard informations. Should be use as command to build
 * model component of motherboard.
 * 
 * @author Mateusz Mucha
 */
public final class MoboInfo extends HardwareAbstract implements HardwareInfo<Motherboard> {
	/**
	 * Default constructor.
	 */
	public MoboInfo() {
		super(org.jutils.jhardware.HardwareInfo.getMotherboardInfo().getFullInfo());
	}

	/**
	 * Constructor with new SystemInfo object of OSHI API.
	 * 
	 * @param _systemInfo
	 *            - system info object of OSHI API
	 */
	public MoboInfo(SystemInfo _systemInfo) {
		super(_systemInfo, org.jutils.jhardware.HardwareInfo.getMotherboardInfo().getFullInfo());
	}

	public Motherboard buildHardware() {
		String name = productName();
		String manufacturer = manufacturer();

		return new Motherboard(new StringBuilder(manufacturer).append(" ").append(name).toString(), name, manufacturer,
				version());

	}

	/**
	 * Method to get motherboard name from map details.
	 * 
	 * @return motherboard name from map details
	 */
	private String productName() {
		return dataMap().get("Product");
	}

	/**
	 * Method to get motherboard manufacturer from map details.
	 * 
	 * @return motherboard manufacturer from map details
	 */
	private String manufacturer() {
		return dataMap().get("Manufacturer");
	}

	/**
	 * Method to get motherboard version from map details.
	 * 
	 * @return motherboard version from map details
	 */
	private String version() {
		return dataMap().get("Version");
	}
}