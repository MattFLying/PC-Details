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
package pcd.hardware.cpu;

import java.util.TreeMap;
import pcd.Component;
import pcd.util.FormatUtil;

/**
 * Class representation of processor with all basic informations.
 * 
 * @author Mateusz Mucha
 */
public final class Cpu extends Component {
	private static final long serialVersionUID = 7599546199620991364L;
	private String cpuName, cpuModel, cpuFamily, cpuIdentifier, cpuBaseClock, cpuStepping, cpuManufacturer,
			cpuSystemUptime, cpuLoadBetweenTicks, cpuL3CacheSize, cpuL2CacheSize, cpuCurrentClock, cpuBusSpeed;
	private int cpuThread, cpuCore;
	private TreeMap<String, String> cpuTicks, cpuLoad;

	/**
	 * Default constructor.
	 * 
	 * @param _id
	 * @param _cpuName
	 * @param _cpuModel
	 * @param _cpuFamily
	 * @param _cpuIdentifier
	 * @param _cpuStepping
	 * @param _cpuManufacturer
	 * @param _cpuSystemUptime
	 * @param _cpuLoadBetweenTicks
	 * @param _cpuL3CacheSize
	 * @param _cpuL2CacheSize
	 * @param _cpuCurrentClock
	 * @param _cpuBusSpeed
	 * @param _cpuThread
	 * @param _cpuCore
	 * @param _cpuBaseClock
	 * @param _cpuTicks
	 * @param _cpuLoad
	 */
	public Cpu(String _id, String _cpuName, String _cpuModel, String _cpuFamily, String _cpuIdentifier,
			String _cpuStepping, String _cpuManufacturer, String _cpuSystemUptime, String _cpuLoadBetweenTicks,
			String _cpuL3CacheSize, String _cpuL2CacheSize, String _cpuCurrentClock, String _cpuBusSpeed,
			int _cpuThread, int _cpuCore, String _cpuBaseClock, TreeMap<String, String> _cpuTicks,
			TreeMap<String, String> _cpuLoad) {
		super(_id);
		this.cpuName = _cpuName;
		this.cpuModel = _cpuModel;
		this.cpuFamily = _cpuFamily;
		this.cpuIdentifier = _cpuIdentifier;
		this.cpuStepping = _cpuStepping;
		this.cpuManufacturer = _cpuManufacturer;
		this.cpuSystemUptime = _cpuSystemUptime;
		this.cpuLoadBetweenTicks = _cpuLoadBetweenTicks;
		this.cpuL3CacheSize = _cpuL3CacheSize;
		this.cpuL2CacheSize = _cpuL2CacheSize;
		this.cpuCurrentClock = _cpuCurrentClock;
		this.cpuBusSpeed = _cpuBusSpeed;
		this.cpuThread = _cpuThread;
		this.cpuCore = _cpuCore;
		this.cpuBaseClock = _cpuBaseClock;
		this.cpuTicks = _cpuTicks;
		this.cpuLoad = _cpuLoad;
	}

	/**
	 * Method to get base clock of processor from manufacturer. If processor is
	 * overclocked, method get basic value.
	 * 
	 * @return cpuBaseClock
	 */
	public String getCpuBaseClock() {
		return cpuBaseClock;
	}

	/**
	 * Method to set base clock of processor from manufacturer. If processor is
	 * overclocked, method set basic value.
	 * 
	 * @param _cpuBaseClock
	 */
	public void setCpuBaseClock(String _cpuBaseClock) {
		this.cpuBaseClock = _cpuBaseClock;
	}

	/**
	 * Method to get system up time in {days, hh:MM:ss} format.
	 * 
	 * @return cpuSystemUptime
	 */
	public String getCpuSystemUptime() {
		return cpuSystemUptime;
	}

	/**
	 * Method to set system up time in {days, hh:MM:ss} format.
	 * 
	 * @param _cpuSystemUptime
	 */
	public void setCpuSystemUptime(String _cpuSystemUptime) {
		this.cpuSystemUptime = _cpuSystemUptime;
	}

	/**
	 * Method to get processor threads count.
	 * 
	 * @return cpuThread
	 */
	public int getCpuThread() {
		return cpuThread;
	}

	/**
	 * Method to set processor threads count.
	 * 
	 * @param _cpuThread
	 */
	public void setCpuThread(int _cpuThread) {
		this.cpuThread = _cpuThread;
	}

	/**
	 * Method to get processor cores count.
	 * 
	 * @return cpuCore
	 */
	public int getCpuCore() {
		return cpuCore;
	}

	/**
	 * Method to set processor cores count.
	 * 
	 * @param _cpuCore
	 */
	public void setCpuCore(int _cpuCore) {
		this.cpuCore = _cpuCore;
	}

	/**
	 * Method to get processor stepping.
	 * 
	 * @return processor stepping
	 */
	public String getCpuStepping() {
		return cpuStepping;
	}

	/**
	 * Method to set processor stepping.
	 * 
	 * @param _cpuStepping
	 */
	public void setCpuStepping(String _cpuStepping) {
		this.cpuStepping = _cpuStepping;
	}

	/**
	 * Method to get processor manufacturer.
	 * 
	 * @return processor manufacturer
	 */
	public String getCpuManufacturer() {
		return cpuManufacturer;
	}

	/**
	 * Method to set processor manifacturer.
	 * 
	 * @param _cpuManufacturer
	 */
	public void setCpuManufacturer(String _cpuManufacturer) {
		this.cpuManufacturer = _cpuManufacturer;
	}

	/**
	 * Method to get processor identifier.
	 * 
	 * @return processor identifier
	 */
	public String getCpuIdentifier() {
		return cpuIdentifier;
	}

	/**
	 * Method to set processor identifier.
	 * 
	 * @param _cpuIdentifier
	 */
	public void setCpuIdentifier(String _cpuIdentifier) {
		this.cpuIdentifier = _cpuIdentifier;
	}

	/**
	 * Method to get processor full name.
	 * 
	 * @return processor full name
	 */
	public String getCpuName() {
		return cpuName;
	}

	/**
	 * Method to set processor full name.
	 * 
	 * @param _cpuName
	 */
	public void setCpuName(String _cpuName) {
		this.cpuName = _cpuName;
	}

	/**
	 * Method to get processor model.
	 * 
	 * @return processor model
	 */
	public String getCpuModel() {
		return cpuModel;
	}

	/**
	 * Method to set processor model.
	 * 
	 * @param _cpuModel
	 */
	public void setCpuModel(String _cpuModel) {
		this.cpuModel = _cpuModel;
	}

	/**
	 * Method to get processor family.
	 * 
	 * @return processor family
	 */
	public String getCpuFamily() {
		return cpuFamily;
	}

	/**
	 * Method to set processor family.
	 * 
	 * @param _cpuFamily
	 */
	public void setCpuFamily(String _cpuFamily) {
		this.cpuFamily = _cpuFamily;
	}

	/**
	 * Method to get processor ticks.
	 * 
	 * @return processor ticks
	 */
	public TreeMap<String, String> getCpuTicks() {
		return cpuTicks;
	}

	/**
	 * Method to set processor ticks.
	 * 
	 * @param _cpuTicks
	 */
	public void setCpuTicks(TreeMap<String, String> _cpuTicks) {
		this.cpuTicks = _cpuTicks;
	}

	/**
	 * Method to get processor usage between ticks.
	 * 
	 * @return usage between ticks
	 */
	public String getCpuLoadBetweenTicks() {
		return cpuLoadBetweenTicks;
	}

	/**
	 * Method to set processor usage between ticks.
	 * 
	 * @param _cpuLoadBetweenTicks
	 */
	public void setCpuLoadBetweenTicks(String _cpuLoadBetweenTicks) {
		this.cpuLoadBetweenTicks = _cpuLoadBetweenTicks;
	}

	/**
	 * Method to get processor cores usage.
	 * 
	 * @return cores usage
	 */
	public TreeMap<String, String> getCpuLoad() {
		return cpuLoad;
	}

	/**
	 * Method to set processor cores usage.
	 * 
	 * @param _cpuLoad
	 */
	public void setCpuLoad(TreeMap<String, String> _cpuLoad) {
		this.cpuLoad = _cpuLoad;
	}

	/**
	 * Method to get processor L3 cache.
	 * 
	 * @return L3 cache
	 */
	public String getCpuL3CacheSize() {
		return FormatUtil.toBytes(FormatUtil.kbToMb(Integer.valueOf(cpuL3CacheSize)));
	}

	/**
	 * Method to set processor L3 cache.
	 * 
	 * @param _cpuL3CacheSize
	 */
	public void setCpuL3CacheSize(String _cpuL3CacheSize) {
		this.cpuL3CacheSize = _cpuL3CacheSize;
	}

	/**
	 * Method to get processor L2 cache.
	 * 
	 * @return L2 cache
	 */
	public String getCpuL2CacheSize() {
		return FormatUtil.toBytes(FormatUtil.kbToMb(Integer.valueOf(cpuL2CacheSize)));
	}

	/**
	 * Method to set processor L2 cache.
	 * 
	 * @param _cpuL2CacheSize
	 */
	public void setCpuL2CacheSize(String _cpuL2CacheSize) {
		this.cpuL2CacheSize = _cpuL2CacheSize;
	}

	/**
	 * Method to get processor actual clock. If processor is overclocked it
	 * return overclocked value.
	 * 
	 * @return current frequency
	 */
	public String getCpuCurrentClock() {
		return FormatUtil.toHertz(FormatUtil.mHzToLong(Integer.valueOf(cpuCurrentClock)));
	}

	/**
	 * Method to set processor actual clock. If processor is overclocked it
	 * should be overclocked value.
	 * 
	 * @param _cpuCurrentClock
	 */
	public void setCpuCurrentClock(String _cpuCurrentClock) {
		this.cpuCurrentClock = _cpuCurrentClock;
	}

	/**
	 * Method to get processor bus speed.
	 * 
	 * @return cpuBusSpeed
	 */
	public String getCpuBusSpeed() {
		return cpuBusSpeed;
	}

	/**
	 * Method to set processor bus speed.
	 * 
	 * @param _cpuBusSpeed
	 */
	public void setCpuBusSpeed(String _cpuBusSpeed) {
		this.cpuBusSpeed = _cpuBusSpeed;
	}

	/**
	 * Method to get processor frequency multiplier.
	 * 
	 * @return frequency multiplier
	 */
	public double getCpuMultiplier() {
		return Double.valueOf(FormatUtil.divide(Double.valueOf(cpuCurrentClock), Double.valueOf(getCpuBusSpeed())));
	}

	@Override
	public String componentAsString() {
		StringBuilder sb = new StringBuilder("=== CPU ===");

		sb.append("\nCPU Name: ");
		sb.append(getCpuName());
		sb.append("\nCPU Identifier: ");
		sb.append(getCpuIdentifier());
		sb.append("\nCPU Processor ID: ");
		sb.append(getId());
		sb.append("\nCPU Manufacturer: ");
		sb.append(getCpuManufacturer());
		sb.append("\nCPU Uptime: ");
		sb.append(getCpuSystemUptime());
		sb.append("\nCPU Family: ");
		sb.append(getCpuFamily());
		sb.append("\nCPU Model: ");
		sb.append(getCpuModel());
		sb.append("\nCPU Stepping: ");
		sb.append(getCpuStepping());
		sb.append("\nCPU Core: ");
		sb.append(getCpuCore());
		sb.append("\nCPU Thread: ");
		sb.append(getCpuThread());
		sb.append("\nCPU Base Clock: ");
		sb.append(getCpuBaseClock());
		sb.append("\nCPU Current Clock: ");
		sb.append(getCpuCurrentClock());
		sb.append("\nCPU L2 Cache: ");
		sb.append(getCpuL2CacheSize());
		sb.append("\nCPU L3 Cache: ");
		sb.append(getCpuL3CacheSize());
		sb.append("\nCPU Bus Speed: ");
		sb.append(getCpuBusSpeed());
		sb.append("\nCPU Multiplier: ");
		sb.append(getCpuMultiplier());
		sb.append("\nCPU Usage: ");
		sb.append(getCpuLoadBetweenTicks());
		sb.append("\nCPU Cores Usage: ");
		getCpuLoad().entrySet().forEach(x -> {
			sb.append("\n  ");
			sb.append(x.getKey());
			sb.append(": ");
			sb.append(x.getValue());
		});
		sb.append("\nCPU Ticks Usage: ");
		getCpuTicks().entrySet().forEach(x -> {
			sb.append("\n  ");
			sb.append(x.getKey());
			sb.append(": ");
			sb.append(x.getValue());
		});

		return sb.toString();
	}
}