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
package pcd.software.bios;

import oshi.SystemInfo;
import oshi.util.FormatUtil;
import pcd.software.SoftwareAbstract;
import pcd.software.SoftwareInfo;

/**
 * Class to build BIOS informations. Should be use as command to build model
 * component of BIOS.
 * 
 * @author Mateusz Mucha
 */
public final class BiosInfo extends SoftwareAbstract implements SoftwareInfo<Bios> {
	/**
	 * Default constructor.
	 */
	public BiosInfo() {
		super(org.jutils.jhardware.HardwareInfo.getBiosInfo().getFullInfo());
	}

	/**
	 * Constructor with new SystemInfo object of OSHI API.
	 * 
	 * @param _systemInfo
	 *            - system info object of OSHI API
	 */
	public BiosInfo(SystemInfo _systemInfo) {
		super(_systemInfo, org.jutils.jhardware.HardwareInfo.getBiosInfo().getFullInfo());
	}

	public Bios buildSoftware() {
		String manufacturer = getHardwareAbstractionLayer().getComputerSystem().getManufacturer();
		String model = getHardwareAbstractionLayer().getComputerSystem().getModel();

		return new Bios(new StringBuilder(manufacturer).append(" ").append(model).append(" ").append(name()).toString(),
				FormatUtil.formatDate(getHardwareAbstractionLayer().getComputerSystem().getFirmware().getReleaseDate()),
				getHardwareAbstractionLayer().getComputerSystem().getManufacturer(), version(), name(), vendor(),
				getHardwareAbstractionLayer().getComputerSystem().getModel());
	}

	/**
	 * Method to get vendor from map details.
	 * 
	 * @return vendor from map details
	 */
	private String vendor() {
		return dataMap().get("Vendor");
	}

	/**
	 * Method to get version from map details.
	 * 
	 * @return version from map details
	 */
	private String version() {
		return dataMap().get("Version");
	}

	/**
	 * Method to get name from map details.
	 * 
	 * @return name from map details
	 */
	private String name() {
		return dataMap().get("Name");
	}
}