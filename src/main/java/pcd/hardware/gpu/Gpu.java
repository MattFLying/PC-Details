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

import java.util.List;
import pcd.Component;

/**
 * Class representation of graphic cards list.
 * 
 * @author Mateusz Mucha
 */
public final class Gpu extends Component {
	private static final long serialVersionUID = 2552773150423460545L;
	private List<GraphicCard> gpuList;

	/**
	 * Default constructor.
	 * 
	 * @param gpuList
	 */
	public Gpu(List<GraphicCard> _gpuList) {
		super(null);
		this.gpuList = _gpuList;
	}

	/**
	 * Method to get list of graphic cards.
	 * 
	 * @return list of graphic cards
	 */
	public List<GraphicCard> getGpuList() {
		return gpuList;
	}

	@Override
	public String componentAsString() {
		StringBuilder sb = new StringBuilder("===== GPUs List =====");

		getGpuList().forEach(gpu -> {
			sb.append("\n");
			sb.append(gpu.componentAsString());
		});

		return sb.toString();
	}

	/**
	 * Class representation of graphic card with all basic informations.
	 * 
	 * @author Mateusz Mucha
	 */
	public static final class GraphicCard extends Component {
		private static final long serialVersionUID = 2552773150423460545L;
		private String gpuName, gpuManufacturer, gpuDac;

		/**
		 * Default constructor.
		 * 
		 * @param _id
		 * @param gpuName
		 * @param gpuManufacturer
		 * @param gpuDac
		 */
		public GraphicCard(String _id, String _gpuName, String _gpuManufacturer, String _gpuDac) {
			super(_id);
			this.gpuName = _gpuName;
			this.gpuManufacturer = _gpuManufacturer;
			this.gpuDac = _gpuDac;
		}

		/**
		 * Method to get name of graphic card.
		 * 
		 * @return gpuName
		 */
		public String getGpuName() {
			return gpuName;
		}

		/**
		 * Method to set name of graphic card.
		 * 
		 * @param _gpuName
		 */
		public void setGpuName(String _gpuName) {
			this.gpuName = _gpuName;
		}

		/**
		 * Method to get manufacturer of graphic card.
		 * 
		 * @return gpuManufacturer
		 */
		public String getGpuManufacturer() {
			return gpuManufacturer;
		}

		/**
		 * Method to set manufacturer of graphic card.
		 * 
		 * @param _gpuManufacturer
		 */
		public void setGpuManufacturer(String _gpuManufacturer) {
			this.gpuManufacturer = _gpuManufacturer;
		}

		/**
		 * Method to get DAC(Digital Analog Converter).
		 * 
		 * @return gpuDac
		 */
		public String getGpuDac() {
			return gpuDac;
		}

		/**
		 * Method to set DAC(Digital Analog Converter).
		 * 
		 * @param _gpuDac
		 */
		public void setGpuDac(String _gpuDac) {
			this.gpuDac = _gpuDac;
		}

		@Override
		public String componentAsString() {
			StringBuilder sb = new StringBuilder("=== GPU ===");

			sb.append("\nGPU ID: ");
			sb.append(getId());
			sb.append("\nGPU Name: ");
			sb.append(getGpuName());
			sb.append("\nGPU Manufacturer: ");
			sb.append(getGpuManufacturer());
			sb.append("\nGPU DAC: ");
			sb.append(getGpuDac());

			return sb.toString();
		}
	}
}