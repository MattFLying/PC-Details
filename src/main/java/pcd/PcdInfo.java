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
package pcd;

import java.util.Map;
import oshi.SystemInfo;

/**
 * Abstract class to build details of components.
 * 
 * @author Mateusz Mucha
 */
public abstract class PcdInfo {
	private SystemInfo systemInfo = null;
	private Map<String, String> map = null;

	/**
	 * Default constructor.
	 * 
	 * @param _map
	 *            - map of more details of component
	 */
	protected PcdInfo(Map<String, String> _map) {
		this.systemInfo = new SystemInfo();
		this.map = _map;
	}

	/**
	 * Constructor with new SystemInfo object of OSHI API.
	 * 
	 * @param _map
	 *            - map of more details of component
	 */
	protected PcdInfo(SystemInfo _systemInfo, Map<String, String> _map) {
		this.systemInfo = _systemInfo;
		this.map = _map;
	}

	/**
	 * Method to get system information object from OSHI API.
	 * 
	 * @return system information object from OSHI API
	 */
	public SystemInfo getSystemInfo() {
		return systemInfo;
	}

	/**
	 * Method to set system information object from OSHI API.
	 * 
	 * @param systemInfo
	 *            object of OSHI API
	 */
	public void setSystemInfo(SystemInfo systemInfo) {
		this.systemInfo = systemInfo;
	}

	/**
	 * Method to get map of more component details.
	 * 
	 * @return map of more details of component
	 */
	public Map<String, String> dataMap() {
		return map;
	}
}