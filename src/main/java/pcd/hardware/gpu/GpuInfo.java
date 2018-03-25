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
package pcd.hardware.gpu;

import java.util.ArrayList;
import java.util.List;
import org.jutils.jhardware.model.GraphicsCardInfo;

import oshi.SystemInfo;
import pcd.hardware.HardwareAbstract;
import pcd.hardware.HardwareInfo;

/**
 * Class to build graphic cards informations. Should be use as command to build
 * model component of graphic card.
 * 
 * @author Mateusz Mucha
 */
public final class GpuInfo extends HardwareAbstract implements HardwareInfo<Gpu> {
	/**
	 * Default constructor.
	 */
	public GpuInfo() {
		super(null);
	}

	/**
	 * Constructor with new SystemInfo object of OSHI API.
	 * 
	 * @param _systemInfo
	 *            - system info object of OSHI API
	 */
	public GpuInfo(SystemInfo _systemInfo) {
		super(_systemInfo, null);
	}

	public Gpu buildHardware() {
		GraphicsCardInfo info = org.jutils.jhardware.HardwareInfo.getGraphicsCardInfo();
		List<Gpu.GraphicCard> gpuList = new ArrayList<Gpu.GraphicCard>();

		info.getGraphicsCards().forEach(graphicCard -> {
			Gpu.GraphicCard gpu = new Gpu.GraphicCard(graphicCard.getName(), graphicCard.getChipType(),
					graphicCard.getManufacturer(), graphicCard.getDacType());

			gpuList.add(gpu);
		});

		return new Gpu(gpuList);
	}
}