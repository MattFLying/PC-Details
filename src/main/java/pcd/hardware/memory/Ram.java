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
package pcd.hardware.memory;

import pcd.Component;
import pcd.util.FormatUtil;

/**
 * Class representation of physical memory.
 * 
 * @author Mateusz Mucha
 */
public final class Ram extends Component {
	private static final long serialVersionUID = 2499144104224339886L;
	private String ramAvailable, ramTotal, swapTotal, swapUsed, ramSpeed, maxRam;

	/**
	 * Default constructor.
	 * 
	 * @param _id
	 * @param _ramAvailable
	 * @param _ramTotal
	 * @param _swapTotal
	 * @param _swapUsed
	 * @param _ramSpeed
	 * @param _maxRam
	 */
	public Ram(String _id, String _ramAvailable, String _ramTotal, String _swapTotal, String _swapUsed,
			String _ramSpeed, String _maxRam) {
		super(_id);
		this.ramAvailable = _ramAvailable;
		this.ramTotal = _ramTotal;
		this.swapTotal = _swapTotal;
		this.swapUsed = _swapUsed;
		this.ramSpeed = _ramSpeed;
		this.maxRam = _maxRam;
	}

	/**
	 * Method to get available memory.
	 * 
	 * @return available memory
	 */
	public String getRamAvailable() {
		return ramAvailable;
	}

	/**
	 * Method to set available memory.
	 * 
	 * @param _ramAvailable
	 */
	public void setRamAvailable(String _ramAvailable) {
		this.ramAvailable = _ramAvailable;
	}

	/**
	 * Method to get total memory.
	 * 
	 * @return total memory
	 */
	public String getRamTotal() {
		return ramTotal;
	}

	/**
	 * Method to set total memory.
	 * 
	 * @param _ramTotal
	 */
	public void setRamTotal(String _ramTotal) {
		this.ramTotal = _ramTotal;
	}

	/**
	 * Method to get total swaping.
	 * 
	 * @return total swaping
	 */
	public String getSwapTotal() {
		return swapTotal;
	}

	/**
	 * Method to set total swaping.
	 * 
	 * @param _swapTotal
	 */
	public void setSwapTotal(String _swapTotal) {
		this.swapTotal = _swapTotal;
	}

	/**
	 * Method to get used swaping.
	 * 
	 * @return used swaping
	 */
	public String getSwapUsed() {
		return swapUsed;
	}

	/**
	 * Method to set used swaping.
	 * 
	 * @param _swapUsed
	 */
	public void setSwapUsed(String _swapUsed) {
		this.swapUsed = _swapUsed;
	}

	/**
	 * Method to get speed of memory.
	 * 
	 * @return speed of memory
	 */
	public String getRamSpeed() {
		return FormatUtil.intToMhz(Integer.valueOf(ramSpeed));
	}

	/**
	 * Method to set speed of memory.
	 * 
	 * @param _ramSpeed
	 */
	public void setRamSpeed(String _ramSpeed) {
		this.ramSpeed = _ramSpeed;
	}

	/**
	 * Method to get maximum memory size to use on baseboard.
	 * 
	 * @return maximum memory size to use on baseboard
	 */
	public String getMaxRam() {
		return FormatUtil.intToMb(Integer.valueOf(maxRam));
	}

	/**
	 * Method to set maximum memory size to use on baseboard
	 * 
	 * @param _maxRam
	 */
	public void setMaxRam(String _maxRam) {
		this.maxRam = _maxRam;
	}

	@Override
	public String componentAsString() {
		StringBuilder sb = new StringBuilder("=== RAM ===");

		sb.append("\nRAM ID: ");
		sb.append(getId());
		sb.append("\nRAM Max on baseboard: ");
		sb.append(getMaxRam());
		sb.append("\nRAM Available: ");
		sb.append(getRamAvailable());
		sb.append("\nRAM Total in PC: ");
		sb.append(getRamTotal());
		sb.append("\nRAM Speed: ");
		sb.append(getRamSpeed());
		sb.append("\nRAM Swap Total: ");
		sb.append(getSwapTotal());
		sb.append("\nRAM Swap Used: ");
		sb.append(getSwapUsed());

		return sb.toString();
	}
}