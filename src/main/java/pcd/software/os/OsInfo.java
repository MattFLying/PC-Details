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
package pcd.software.os;

import oshi.SystemInfo;
import pcd.software.SoftwareAbstract;
import pcd.software.SoftwareInfo;

/**
 * Class to build Operating System informations. Should be use as command to
 * build model component of Operating System.
 * 
 * @author Mateusz Mucha
 */
public final class OsInfo extends SoftwareAbstract implements SoftwareInfo<OperatingSystem> {
	/**
	 * Default constructor.
	 */
	public OsInfo() {
		super(org.jutils.jhardware.HardwareInfo.getOSInfo().getFullInfo());
	}

	/**
	 * Constructor with new SystemInfo object of OSHI API.
	 * 
	 * @param _systemInfo
	 *            - system info object of OSHI API
	 */
	public OsInfo(SystemInfo _systemInfo) {
		super(_systemInfo, org.jutils.jhardware.HardwareInfo.getOSInfo().getFullInfo());
	}

	public OperatingSystem buildSoftware() {
		return new OperatingSystem(
				getOperatingSystem().getManufacturer() + " " + getOperatingSystem().getFamily() + " "
						+ getOperatingSystem().getVersion(),
				getOperatingSystem().getVersion().getVersion() + " " + getOperatingSystem().getVersion().getCodeName(),
				lastBootTime(), name(), getOperatingSystem().getManufacturer(), locale(), currentTimeZone(), codeSet(),
				encryptionLevel(), countryCode(), bootDevice(), buildNumber());
	}

	/**
	 * Method to get last boot time from map details.
	 * 
	 * @return last boot time from map details
	 */
	private String lastBootTime() {
		return dataMap().get("LastBootTime");
	}

	/**
	 * Method to get name from map details.
	 * 
	 * @return name from map details
	 */
	private String name() {
		return dataMap().get("Name");
	}

	/**
	 * Method to get locale from map details.
	 * 
	 * @return locale from map details
	 */
	private String locale() {
		return dataMap().get("Locale");
	}

	/**
	 * Method to get current time zone from map details.
	 * 
	 * @return current time zone from map details
	 */
	private String currentTimeZone() {
		return dataMap().get("CurrentTimeZone");
	}

	/**
	 * Method to get code set from map details.
	 * 
	 * @return code set from map details
	 */
	private String codeSet() {
		return dataMap().get("CodeSet");
	}

	/**
	 * Method to get encryption level from map details.
	 * 
	 * @return encryption level from map details
	 */
	private String encryptionLevel() {
		return dataMap().get("EncryptionLevel");
	}

	/**
	 * Method to get country code from map details.
	 * 
	 * @return country code from map details
	 */
	private String countryCode() {
		return dataMap().get("CountryCode");
	}

	/**
	 * Method to get boot device from map details.
	 * 
	 * @return boot device from map details
	 */
	private String bootDevice() {
		return dataMap().get("BootDevice");
	}

	/**
	 * Method to get build number from map details.
	 * 
	 * @return build number from map details
	 */
	private String buildNumber() {
		return dataMap().get("BuildNumber");
	}
}