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
package pcd.example;

import pcd.factory.DeviceFactory;
import pcd.factory.PCDetailsFactory;
import pcd.hardware.HardwareInfo;
import pcd.hardware.cpu.Cpu;
import pcd.hardware.cpu.CpuInfo;

/**
 * Example of getting component informations. In this case shows three ways to
 * gets Processor informations. Exactly the same three ways for other components
 * with use right component object like Gpu, Motherboard etc.
 * 
 * @author Mateusz Mucha
 */
public class PCDetailsExample {
	public static void main(String[] args) {
		HardwareInfo<Cpu> cpuInfo = new CpuInfo();
		Cpu cpu = cpuInfo.buildHardware();
		System.out.println(cpu.componentAsString());

		cpu = (Cpu) DeviceFactory.getHardware(DeviceFactory.HardwareType.CPU).buildHardware();
		System.out.println(cpu.componentAsString());

		cpu = PCDetailsFactory.getProcessorInfo();
		System.out.println(cpu.componentAsString());

	}
}