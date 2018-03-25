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

import pcd.Component;

/**
 * Class representation of BIOS.
 * 
 * @author Mateusz Mucha
 */
public class Bios extends Component {
	private static final long serialVersionUID = -7355550029692532577L;
	private String releaseDate, manufacturer, version, name, vendor, model;

	/**
	 * Default constructor.
	 * 
	 * @param _id
	 * @param _releaseDate
	 * @param _manufacturer
	 * @param _version
	 * @param _name
	 * @param _vendor
	 * @param _model
	 */
	public Bios(String _id, String _releaseDate, String _manufacturer, String _version, String _name, String _vendor,
			String _model) {
		super(_id);
		this.releaseDate = _releaseDate;
		this.manufacturer = _manufacturer;
		this.version = _version;
		this.name = _name;
		this.vendor = _vendor;
		this.model = _model;
	}

	/**
	 * Method to get BIOS release date.
	 * 
	 * @return BIOS release date
	 */
	public String getReleaseDate() {
		return releaseDate;
	}

	/**
	 * Method to set BIOS release date.
	 * 
	 * @param _releaseDate
	 */
	public void setReleaseDate(String _releaseDate) {
		this.releaseDate = _releaseDate;
	}

	/**
	 * Method to get BIOS manufacturer.
	 * 
	 * @return BIOS manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * Method to set BIOS manufacturer.
	 * 
	 * @param _manufacturer
	 */
	public void setManufacturer(String _manufacturer) {
		this.manufacturer = _manufacturer;
	}

	/**
	 * Method to get BIOS version.
	 * 
	 * @return BIOS version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Method to set BIOS version.
	 * 
	 * @param _version
	 */
	public void setVersion(String _version) {
		this.version = _version;
	}

	/**
	 * Method to get BIOS name.
	 * 
	 * @return BIOS name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method to set BIOS name.
	 * 
	 * @param _name
	 */
	public void setName(String _name) {
		this.name = _name;
	}

	/**
	 * Method to get BIOS vendor.
	 * 
	 * @return BIOS vendor
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * Method to set BIOS vendor.
	 * 
	 * @param _vendor
	 */
	public void setVendor(String _vendor) {
		this.vendor = _vendor;
	}

	/**
	 * Method to get BIOS model.
	 * 
	 * @return BIOS model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Method to set BIOS model.
	 * 
	 * @param _model
	 */
	public void setModel(String _model) {
		this.model = _model;
	}

	@Override
	public String componentAsString() {
		StringBuilder sb = new StringBuilder("=== BIOS ===");

		sb.append("\nBIOS ID: ");
		sb.append(getId());
		sb.append("\nBIOS Name: ");
		sb.append(getName());
		sb.append("\nBIOS Model: ");
		sb.append(getModel());
		sb.append("\nBIOS Version: ");
		sb.append(getVersion());
		sb.append("\nBIOS Manufacturer: ");
		sb.append(getManufacturer());
		sb.append("\nBIOS Vendor: ");
		sb.append(getVendor());
		sb.append("\nBIOS Release Date: ");
		sb.append(getReleaseDate());

		return sb.toString();
	}
}