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
package pcd.hardware;

import pcd.Component;

/**
 * Main interface to build informations of hardware component. Should be used to
 * create full detailed components e.g. HardwareInfo< Cpu > cpuDetails = new
 * CpuInfo();
 * 
 * @author Mateusz Mucha
 * @param <T>
 *            - component classes which inherit from Component
 */
public interface HardwareInfo<T extends Component> {
	/**
	 * Method to build informations of hardware component which returns right
	 * hardware to read details from. Always should be used to build model
	 * component. e.g. Cpu cpu = cpuDetails.buildHardware();
	 * 
	 * @return full detailed hardware component
	 */
	T buildHardware();
}