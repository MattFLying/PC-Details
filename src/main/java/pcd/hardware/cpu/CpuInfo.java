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

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.CentralProcessor.TickType;
import oshi.util.Util;
import pcd.hardware.HardwareAbstract;
import pcd.hardware.HardwareInfo;
import pcd.util.FormatUtil;

/**
 * Class to build processor informations. Should be use as command to build
 * model component of processor.
 * 
 * @author Mateusz Mucha
 */
public final class CpuInfo extends HardwareAbstract implements HardwareInfo<Cpu> {
	/**
	 * Default constructor.
	 */
	public CpuInfo() {
		super(org.jutils.jhardware.HardwareInfo.getProcessorInfo().getFullInfo());
	}

	/**
	 * Constructor with new SystemInfo object of OSHI API.
	 * 
	 * @param _systemInfo
	 *            - system info object of OSHI API
	 */
	public CpuInfo(SystemInfo _systemInfo) {
		super(_systemInfo, org.jutils.jhardware.HardwareInfo.getProcessorInfo().getFullInfo());
	}

	public Cpu buildHardware() {
		CentralProcessor _cpu = getHardwareAbstractionLayer().getProcessor();

		return new Cpu(_cpu.getProcessorID(), _cpu.getName(), _cpu.getModel(), _cpu.getFamily(), _cpu.getIdentifier(),
				_cpu.getStepping(), _cpu.getVendor(), FormatUtil.elapsedTime(_cpu.getSystemUptime()),
				cpuLoadBetweenTicks(_cpu), l3CacheSize(), l2CacheSize(), maxClockSpeed(), busSpeed(),
				_cpu.getLogicalProcessorCount(), _cpu.getPhysicalProcessorCount(),
				FormatUtil.toHertz(_cpu.getVendorFreq()), tickProcessor(_cpu), cpuLoad(_cpu));
	}

	/**
	 * Method to count ticks between start and end tick value for specific type
	 * of ticks.
	 * 
	 * @param _startTicks
	 * @param _endTicks
	 * @param _tickType
	 * @return difference between start and end ticks
	 */
	private long countTicks(long[] _startTicks, long[] _endTicks, TickType _tickType) {
		return _endTicks[_tickType.getIndex()] - _startTicks[_tickType.getIndex()];
	}

	/**
	 * Method to add tick to sorted map.
	 * 
	 * @param _ticksMap
	 * @param _tickType
	 * @param _tickValue
	 */
	private void buildTicksSortedMap(TreeMap<String, String> _ticksMap, TickType _tickType, double _tickValue) {
		_ticksMap.put(_tickType.name(), FormatUtil.toPercentage(_tickValue));
	}

	/**
	 * Method to format processor usage.
	 * 
	 * @param _centralProcessor
	 * @return formated processor usage
	 */
	private String cpuLoadBetweenTicks(CentralProcessor _centralProcessor) {
		return FormatUtil.toPercentage(_centralProcessor.getSystemCpuLoadBetweenTicks());
	}

	/**
	 * Method to initialize all processor ticks.
	 * 
	 * @param _centralProcessor
	 * @return map of processor ticks
	 */
	private TreeMap<String, String> tickProcessor(CentralProcessor _centralProcessor) {
		TreeMap<String, String> ticks = new TreeMap<String, String>();

		long[] startTicks = _centralProcessor.getSystemCpuLoadTicks();
		Util.sleep(1000);
		long[] endTicks = _centralProcessor.getSystemCpuLoadTicks();

		long user = countTicks(startTicks, endTicks, TickType.USER);
		long nice = countTicks(startTicks, endTicks, TickType.NICE);
		long system = countTicks(startTicks, endTicks, TickType.SYSTEM);
		long idle = countTicks(startTicks, endTicks, TickType.IDLE);
		long iowait = countTicks(startTicks, endTicks, TickType.IOWAIT);
		long irq = countTicks(startTicks, endTicks, TickType.IRQ);
		long softirq = countTicks(startTicks, endTicks, TickType.SOFTIRQ);
		long steal = countTicks(startTicks, endTicks, TickType.STEAL);
		long totalCpu = user + nice + system + idle + iowait + irq + softirq + steal;

		buildTicksSortedMap(ticks, TickType.USER, FormatUtil.divideLong(user, totalCpu));
		buildTicksSortedMap(ticks, TickType.NICE, FormatUtil.divideLong(nice, totalCpu));
		buildTicksSortedMap(ticks, TickType.SYSTEM, FormatUtil.divideLong(system, totalCpu));
		buildTicksSortedMap(ticks, TickType.IDLE, FormatUtil.divideLong(idle, totalCpu));
		buildTicksSortedMap(ticks, TickType.IOWAIT, FormatUtil.divideLong(iowait, totalCpu));
		buildTicksSortedMap(ticks, TickType.IRQ, FormatUtil.divideLong(irq, totalCpu));
		buildTicksSortedMap(ticks, TickType.SOFTIRQ, FormatUtil.divideLong(softirq, totalCpu));
		buildTicksSortedMap(ticks, TickType.STEAL, FormatUtil.divideLong(steal, totalCpu));

		return ticks;
	}

	/**
	 * Method to create map of cores usage.
	 * 
	 * @param _centralProcessor
	 * @return map of cores usage
	 */
	private TreeMap<String, String> cpuLoad(CentralProcessor _centralProcessor) {
		TreeMap<String, String> loadedCpus = new TreeMap<String, String>();
		double[] cpuLoad = _centralProcessor.getProcessorCpuLoadBetweenTicks();

		for (int i = 0; i < cpuLoad.length; i++) {
			loadedCpus.put("Core#" + (i + 1), FormatUtil.toPercentage(cpuLoad[i]));
		}

		return loadedCpus;
	}

	/**
	 * Method to get L3 cache of processor.
	 * 
	 * @return L3 cache of processor
	 */
	private String l3CacheSize() {
		return dataMap().get("L3CacheSize");
	}

	/**
	 * Method to get L2 cache of processor.
	 * 
	 * @return L2 cache of processor
	 */
	private String l2CacheSize() {
		return dataMap().get("L2CacheSize");
	}

	/**
	 * Method to get max frequency of processor e.g. if is overclocked.
	 * 
	 * @return max frequency of processor
	 */
	private String maxClockSpeed() {
		return dataMap().get("MaxClockSpeed");
	}

	/**
	 * Method to get bus speed of processor.
	 * 
	 * @return bus speed of processor
	 */
	private String busSpeed() {
		return dataMap().get("ExtClock");
	}
}