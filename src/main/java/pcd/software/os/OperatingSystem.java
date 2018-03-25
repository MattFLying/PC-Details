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

import pcd.Component;

/**
 * Class representation of Operating System.
 * 
 * @author Mateusz Mucha
 */
public class OperatingSystem extends Component {
	private static final long serialVersionUID = 7572316340651091852L;
	private String version, lastBootTime, name, manufacturer, locale, timeZone, codeSet, encryptionLevel, countryCode,
			bootDevice, buildNumber;

	/**
	 * Default constructor.
	 * 
	 * @param _id
	 * @param _version
	 * @param _lastBootTime
	 * @param _name
	 * @param _manufacturer
	 * @param _locale
	 * @param _timeZone
	 * @param _codeSet
	 * @param _encryptionLevel
	 * @param _countryCode
	 * @param _bootDevice
	 * @param _buildNumber
	 */
	public OperatingSystem(String _id, String _version, String _lastBootTime, String _name, String _manufacturer,
			String _locale, String _timeZone, String _codeSet, String _encryptionLevel, String _countryCode,
			String _bootDevice, String _buildNumber) {
		super(_id);
		this.version = _version;
		this.lastBootTime = _lastBootTime;
		this.name = _name;
		this.manufacturer = _manufacturer;
		this.locale = _locale;
		this.timeZone = _timeZone;
		this.codeSet = _codeSet;
		this.encryptionLevel = _encryptionLevel;
		this.countryCode = _countryCode;
		this.bootDevice = _bootDevice;
		this.buildNumber = _buildNumber;
	}

	/**
	 * Method to get version.
	 * 
	 * @return version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Method to set version.
	 * 
	 * @param _version
	 */
	public void setVersion(String _version) {
		this.version = _version;
	}

	/**
	 * Method to get last boot time.
	 * 
	 * @return last boot time
	 */
	public String getLastBootTime() {
		return lastBootTime;
	}

	/**
	 * Method to set last boot time.
	 * 
	 * @param _lastBootTime
	 */
	public void setLastBootTime(String _lastBootTime) {
		this.lastBootTime = _lastBootTime;
	}

	/**
	 * Method to get name.
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method to set name.
	 * 
	 * @param _name
	 */
	public void setName(String _name) {
		this.name = _name;
	}

	/**
	 * Method to get manufacturer.
	 * 
	 * @return manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * Method to set manufacturer.
	 * 
	 * @param _manufacturer
	 */
	public void setManufacturer(String _manufacturer) {
		this.manufacturer = _manufacturer;
	}

	/**
	 * Method to get locale.
	 * 
	 * @return locale
	 */
	public String getLocale() {
		return locale;
	}

	/**
	 * Method to set locale.
	 * 
	 * @param _locale
	 */
	public void setLocale(String _locale) {
		this.locale = _locale;
	}

	/**
	 * Method to get time zone.
	 * 
	 * @return time zone
	 */
	public String getTimeZone() {
		return timeZone;
	}

	/**
	 * Method to set time zone.
	 * 
	 * @param _timeZone
	 */
	public void setTimeZone(String _timeZone) {
		this.timeZone = _timeZone;
	}

	/**
	 * Method to get code set.
	 * 
	 * @return code set
	 */
	public String getCodeSet() {
		return codeSet;
	}

	/**
	 * Method to set code set.
	 * 
	 * @param _codeSet
	 */
	public void setCodeSet(String _codeSet) {
		this.codeSet = _codeSet;
	}

	/**
	 * Method to get encryption level.
	 * 
	 * @return encryption level
	 */
	public String getEncryptionLevel() {
		return encryptionLevel;
	}

	/**
	 * Method to set encryption level.
	 * 
	 * @param _encryptionLevel
	 */
	public void setEncryptionLevel(String _encryptionLevel) {
		this.encryptionLevel = _encryptionLevel;
	}

	/**
	 * Method to get country code.
	 * 
	 * @return country code
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * Method to set country code.
	 * 
	 * @param _countryCode
	 */
	public void setCountryCode(String _countryCode) {
		this.countryCode = _countryCode;
	}

	/**
	 * Method to get boot device.
	 * 
	 * @return boot device
	 */
	public String getBootDevice() {
		return bootDevice;
	}

	/**
	 * Method to set boot device.
	 * 
	 * @param _bootDevice
	 */
	public void setBootDevice(String _bootDevice) {
		this.bootDevice = _bootDevice;
	}

	/**
	 * Method to get build number.
	 * 
	 * @return build number
	 */
	public String getBuildNumber() {
		return buildNumber;
	}

	/**
	 * Method to set build number.
	 * 
	 * @param _buildNumber
	 */
	public void setBuildNumber(String _buildNumber) {
		this.buildNumber = _buildNumber;
	}

	@Override
	public String componentAsString() {
		StringBuilder sb = new StringBuilder("=== Operating System ===");

		sb.append("\nOS ID: ");
		sb.append(getId());
		sb.append("\nOS Name: ");
		sb.append(getName());
		sb.append("\nOS Boot Device: ");
		sb.append(getBootDevice());
		sb.append("\nOS Version: ");
		sb.append(getVersion());
		sb.append("\nOS Manufacturer: ");
		sb.append(getManufacturer());
		sb.append("\nOS Build Number: ");
		sb.append(getBuildNumber());
		sb.append("\nOS Last Boot Time: ");
		sb.append(getLastBootTime());
		sb.append("\nOS Code Set: ");
		sb.append(getCodeSet());
		sb.append("\nOS Country Code: ");
		sb.append(getCountryCode());
		sb.append("\nOS Locale: ");
		sb.append(getLocale());
		sb.append("\nOS Time Zone: ");
		sb.append(getTimeZone());
		sb.append("\nOS Encryption Level: ");
		sb.append(getEncryptionLevel());

		return sb.toString();
	}
}