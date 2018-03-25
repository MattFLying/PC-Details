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
package pcd.software;

import java.util.Map;

import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;
import pcd.PcdInfo;

/**
 * Abstract class represents software components e.g. Operating System, Bios.
 * 
 * @author Mateusz Mucha
 */
public abstract class SoftwareAbstract extends PcdInfo {
	private OperatingSystem operatingSystem;
	private HardwareAbstractionLayer hardwareAbstractionLayer;

	/**
	 * Default constructor.
	 * 
	 * @param _map
	 *            - map of more details of component
	 */
	protected SoftwareAbstract(Map<String, String> _map) {
		super(_map);
		this.operatingSystem = getSystemInfo().getOperatingSystem();
		this.hardwareAbstractionLayer = getSystemInfo().getHardware();
	}

	/**
	 * Constructor with new SystemInfo object of OSHI API.
	 * 
	 * @param _map
	 *            - map of more details of component
	 * @param _systemInfo
	 *            - system info object of OSHI API
	 */
	protected SoftwareAbstract(SystemInfo _systemInfo, Map<String, String> _map) {
		super(_systemInfo, _map);
		this.operatingSystem = getSystemInfo().getOperatingSystem();
		this.hardwareAbstractionLayer = getSystemInfo().getHardware();
	}

	/**
	 * Method to get Operating System object from OSHI API.
	 * 
	 * @return Operating System object from OSHI API
	 */
	public OperatingSystem getOperatingSystem() {
		return operatingSystem;
	}

	/**
	 * Method to get hardware accessible layer from OSHI API.
	 * 
	 * @return hardware abstraction layer from OSHI API
	 */
	public HardwareAbstractionLayer getHardwareAbstractionLayer() {
		return hardwareAbstractionLayer;
	}
}