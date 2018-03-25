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

import pcd.Component;

/**
 * Class representation of motherboard.
 * 
 * @author Mateusz Mucha
 */
public final class Motherboard extends Component {
	private static final long serialVersionUID = 3300688204682907970L;
	private String moboName, moboManufacturer, moboVersion;

	/**
	 * Default constructor.
	 * 
	 * @param _id
	 * @param _moboName
	 * @param _moboManufacturer
	 * @param _moboVersion
	 */
	public Motherboard(String _id, String _moboName, String _moboManufacturer, String _moboVersion) {
		super(_id);
		this.moboName = _moboName;
		this.moboManufacturer = _moboManufacturer;
		this.moboVersion = _moboVersion;
	}

	/**
	 * Method to get motherboard name.
	 * 
	 * @return motherboard name
	 */
	public String getMoboName() {
		return moboName;
	}

	/**
	 * Method to set motherboard name.
	 * 
	 * @param _moboName
	 */
	public void setMoboName(String _moboName) {
		this.moboName = _moboName;
	}

	/**
	 * Method to get motherboard manufacturer.
	 * 
	 * @return motherboard manufacturer
	 */
	public String getMoboManufacturer() {
		return moboManufacturer;
	}

	/**
	 * Method to set motherboard manufacturer.
	 * 
	 * @param _moboManufacturer
	 */
	public void setMoboManufacturer(String _moboManufacturer) {
		this.moboManufacturer = _moboManufacturer;
	}

	/**
	 * Method to get motherboard version.
	 * 
	 * @return motherboard version
	 */
	public String getMoboVersion() {
		return moboVersion;
	}

	/**
	 * Method to set motherboard version.
	 * 
	 * @param _moboVersion
	 */
	public void setMoboVersion(String _moboVersion) {
		this.moboVersion = _moboVersion;
	}

	@Override
	public String componentAsString() {
		StringBuilder sb = new StringBuilder("=== MOBO ===");

		sb.append("\nMOBO ID: ");
		sb.append(getId());
		sb.append("\nMOBO Name: ");
		sb.append(getMoboName());
		sb.append("\nMOBO Manufacturer: ");
		sb.append(getMoboManufacturer());
		sb.append("\nMOBO Version: ");
		sb.append(getMoboVersion());

		return sb.toString();
	}
}