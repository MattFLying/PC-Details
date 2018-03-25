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
package pcd.software.processes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import oshi.SystemInfo;
import oshi.software.os.OperatingSystem.ProcessSort;
import pcd.software.SoftwareAbstract;
import pcd.software.SoftwareInfo;

/**
 * Class to build Process informations. Should be use as command to build model
 * component of Process.
 * 
 * @author Mateusz Mucha
 */
public final class ProcessInfo extends SoftwareAbstract implements SoftwareInfo<Process> {
	private ProcessSort processSort;
	private Integer processesCount;

	/**
	 * Default constructor.
	 * 
	 * @param processSort
	 *            - type of sorting processes. Could be sorted by e.g. name, cpu
	 *            usage etc. If is null theen there is no sorting.
	 * @param processesCount
	 *            - number of processes to create. If 0 then all processes will
	 *            be created.
	 */
	public ProcessInfo(ProcessSort _processSort, int _processesCount) {
		super(null);
		this.processSort = _processSort;
		this.processesCount = _processesCount;
	}

	/**
	 * Constructor with new SystemInfo object of OSHI API.
	 * 
	 * @param _systemInfo
	 *            - system info object of OSHI API
	 * @param processSort
	 *            - type of sorting processes. Could be sorted by e.g. name, cpu
	 *            usage etc. If is null theen there is no sorting.
	 * @param processesCount
	 *            - number of processes to create. If 0 then all processes will
	 *            be created.
	 */
	public ProcessInfo(SystemInfo _systemInfo, ProcessSort _processSort, int _processesCount) {
		super(_systemInfo, null);
		this.processSort = _processSort;
		this.processesCount = _processesCount;
	}

	public Process buildSoftware() {
		List<Process.OSProcess> processList = new ArrayList<Process.OSProcess>();

		Arrays.asList(getOperatingSystem().getProcesses(processesCount, processSort)).forEach(osProcess -> {
			Process.OSProcess process = new Process.OSProcess(String.valueOf(osProcess.getProcessID()),
					osProcess.getName(), osProcess.getPath(), osProcess.getCommandLine(),
					osProcess.getCurrentWorkingDirectory(), osProcess.getUser(), osProcess.getUserID(),
					osProcess.getGroup(), osProcess.getGroupID(), osProcess.getState().name(),
					osProcess.getParentProcessID(), osProcess.getThreadCount(), osProcess.getPriority(),
					osProcess.getVirtualSize(), osProcess.getResidentSetSize(), osProcess.getKernelTime(),
					osProcess.getUserTime(), osProcess.getStartTime(), osProcess.getUpTime(), osProcess.getBytesRead(),
					osProcess.getBytesWritten());

			processList.add(process);
		});

		return new Process(processList);
	}
}