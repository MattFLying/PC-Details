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

import java.util.List;
import pcd.Component;
import pcd.util.FormatUtil;

/**
 * Class representation of Processes.
 * 
 * @author Mateusz Mucha
 */
public class Process extends Component {
	private static final long serialVersionUID = -6636354895297597247L;
	private List<OSProcess> processList;

	/**
	 * Default constructor.
	 * 
	 * @param _processList
	 */
	public Process(List<OSProcess> _processList) {
		super(null);
		this.processList = _processList;
	}

	/**
	 * Method to get list of processes.
	 * 
	 * @return list of processes
	 */
	public List<OSProcess> getProcessList() {
		return processList;
	}

	/**
	 * Method to set list of processes.
	 * 
	 * @param _processList
	 */
	public void setProcessList(List<OSProcess> _processList) {
		this.processList = _processList;
	}

	@Override
	public String componentAsString() {
		StringBuilder sb = new StringBuilder("==== Processes List ====");

		getProcessList().forEach(process -> {
			sb.append("\n");
			sb.append(process.componentAsString());
		});

		return sb.toString();
	}

	/**
	 * Class representation of OS Process.
	 * 
	 * @author Mateusz Mucha
	 */
	public static final class OSProcess extends Component {
		private static final long serialVersionUID = -6636354895297597247L;
		private String name, path, commandLine, currentWorkingDirectory, user, userID, group, groupID, state;
		private int parentProcessID, threadCount, priority;
		private long virtualSize, residentSetSize, kernelTime, userTime, startTime, upTime, bytesRead, bytesWritten;

		/**
		 * Default constructor.
		 * 
		 * @param _id
		 * @param _name
		 * @param _path
		 * @param _commandLine
		 * @param _currentWorkingDirectory
		 * @param _user
		 * @param _userID
		 * @param _group
		 * @param _groupID
		 * @param _state
		 * @param _parentProcessID
		 * @param _threadCount
		 * @param _priority
		 * @param _virtualSize
		 * @param _residentSetSize
		 * @param _kernelTime
		 * @param _userTime
		 * @param _startTime
		 * @param _upTime
		 * @param _bytesRead
		 * @param _bytesWritten
		 */
		public OSProcess(String _id, String _name, String _path, String _commandLine, String _currentWorkingDirectory,
				String _user, String _userID, String _group, String _groupID, String _state, int _parentProcessID,
				int _threadCount, int _priority, long _virtualSize, long _residentSetSize, long _kernelTime,
				long _userTime, long _startTime, long _upTime, long _bytesRead, long _bytesWritten) {
			super(_id);
			this.name = _name;
			this.path = _path;
			this.commandLine = _commandLine;
			this.currentWorkingDirectory = _currentWorkingDirectory;
			this.user = _user;
			this.userID = _userID;
			this.group = _group;
			this.groupID = _groupID;
			this.state = _state;
			this.parentProcessID = _parentProcessID;
			this.threadCount = _threadCount;
			this.priority = _priority;
			this.virtualSize = _virtualSize;
			this.residentSetSize = _residentSetSize;
			this.kernelTime = _kernelTime;
			this.userTime = _userTime;
			this.startTime = _startTime;
			this.upTime = _upTime;
			this.bytesRead = _bytesRead;
			this.bytesWritten = _bytesWritten;
		}

		/**
		 * Method to get name.
		 * 
		 * @return name
		 */
		public String getName() {
			return name;
		}

		/**
		 * Method to set name.
		 * 
		 * @param _name
		 */
		public void setName(String _name) {
			this.name = _name;
		}

		/**
		 * Method to get path.
		 * 
		 * @return path
		 */
		public String getPath() {
			return path;
		}

		/**
		 * Method to set path.
		 * 
		 * @param _path
		 */
		public void setPath(String _path) {
			this.path = _path;
		}

		/**
		 * Method to get command line.
		 * 
		 * @return command line
		 */
		public String getCommandLine() {
			return commandLine;
		}

		/**
		 * Method to set command line.
		 * 
		 * @param _commandLine
		 */
		public void setCommandLine(String _commandLine) {
			this.commandLine = _commandLine;
		}

		/**
		 * Method to get current working directory.
		 * 
		 * @return current working directory
		 */
		public String getCurrentWorkingDirectory() {
			return currentWorkingDirectory;
		}

		/**
		 * Method to set current working directory.
		 * 
		 * @param _currentWorkingDirectory
		 */
		public void setCurrentWorkingDirectory(String _currentWorkingDirectory) {
			this.currentWorkingDirectory = _currentWorkingDirectory;
		}

		/**
		 * Method to get user.
		 * 
		 * @return user
		 */
		public String getUser() {
			return user;
		}

		/**
		 * Method to set user.
		 * 
		 * @param _user
		 */
		public void setUser(String _user) {
			this.user = _user;
		}

		/**
		 * Method to get user id.
		 * 
		 * @return user id
		 */
		public String getUserID() {
			return userID;
		}

		/**
		 * Method to set user id.
		 * 
		 * @param _userID
		 */
		public void setUserID(String _userID) {
			this.userID = _userID;
		}

		/**
		 * Method to get group.
		 * 
		 * @return group
		 */
		public String getGroup() {
			return group;
		}

		/**
		 * Method to set group.
		 * 
		 * @param _group
		 */
		public void setGroup(String _group) {
			this.group = _group;
		}

		/**
		 * Method to get group id.
		 * 
		 * @return group id
		 */
		public String getGroupID() {
			return groupID;
		}

		/**
		 * Method to set group id.
		 * 
		 * @param _groupID
		 */
		public void setGroupID(String _groupID) {
			this.groupID = _groupID;
		}

		/**
		 * Method to get state.
		 * 
		 * @return state
		 */
		public String getState() {
			return state;
		}

		/**
		 * Method to set state.
		 * 
		 * @param _state
		 */
		public void setState(String _state) {
			this.state = _state;
		}

		/**
		 * Method to get parent process id.
		 * 
		 * @return parent process id
		 */
		public int getParentProcessID() {
			return parentProcessID;
		}

		/**
		 * Method to set parent process id.
		 * 
		 * @param _parentProcessID
		 */
		public void setParentProcessID(int _parentProcessID) {
			this.parentProcessID = _parentProcessID;
		}

		/**
		 * Method to get thread count.
		 * 
		 * @return thread count
		 */
		public int getThreadCount() {
			return threadCount;
		}

		/**
		 * Method to set thread count.
		 * 
		 * @param _threadCount
		 */
		public void setThreadCount(int _threadCount) {
			this.threadCount = _threadCount;
		}

		/**
		 * Method to get priority.
		 * 
		 * @return priority
		 */
		public int getPriority() {
			return priority;
		}

		/**
		 * Method to set priority.
		 * 
		 * @param _priority
		 */
		public void setPriority(int _priority) {
			this.priority = _priority;
		}

		/**
		 * Method to get virtual size.
		 * 
		 * @return virtual size
		 */
		public long getVirtualSize() {
			return virtualSize;
		}

		/**
		 * Method to set virtual size.
		 * 
		 * @param _virtualSize
		 */
		public void setVirtualSize(long _virtualSize) {
			this.virtualSize = _virtualSize;
		}

		/**
		 * Method to get resident set size.
		 * 
		 * @return resident set size
		 */
		public long getResidentSetSize() {
			return residentSetSize;
		}

		/**
		 * Method to set resident set size.
		 * 
		 * @param _residentSetSize
		 */
		public void setResidentSetSize(long _residentSetSize) {
			this.residentSetSize = _residentSetSize;
		}

		/**
		 * Method to get kernel time.
		 * 
		 * @return kernel time
		 */
		public long getKernelTime() {
			return kernelTime;
		}

		/**
		 * Method to set kernel time.
		 * 
		 * @param _kernelTime
		 */
		public void setKernelTime(long _kernelTime) {
			this.kernelTime = _kernelTime;
		}

		/**
		 * Method to get user time.
		 * 
		 * @return user time
		 */
		public long getUserTime() {
			return userTime;
		}

		/**
		 * Method to set user time.
		 * 
		 * @param _userTime
		 */
		public void setUserTime(long _userTime) {
			this.userTime = _userTime;
		}

		/**
		 * Method to get start time.
		 * 
		 * @return start time
		 */
		public long getStartTime() {
			return startTime;
		}

		/**
		 * Method to set start time.
		 * 
		 * @param _startTime
		 */
		public void setStartTime(long _startTime) {
			this.startTime = _startTime;
		}

		/**
		 * Method to get up time.
		 * 
		 * @return up time
		 */
		public long getUpTime() {
			return upTime;
		}

		/**
		 * Method to set up time.
		 * 
		 * @param _upTime
		 */
		public void setUpTime(long _upTime) {
			this.upTime = _upTime;
		}

		/**
		 * Method to get bytes read.
		 * 
		 * @return bytes read
		 */
		public long getBytesRead() {
			return bytesRead;
		}

		/**
		 * Method to set bytes read.
		 * 
		 * @param _bytesRead
		 */
		public void setBytesRead(long _bytesRead) {
			this.bytesRead = _bytesRead;
		}

		/**
		 * Method to get bytes written.
		 * 
		 * @return bytes written
		 */
		public long getBytesWritten() {
			return bytesWritten;
		}

		/**
		 * Method to set bytes written.
		 * 
		 * @param _bytesWritten
		 */
		public void setBytesWritten(long _bytesWritten) {
			this.bytesWritten = _bytesWritten;
		}

		/**
		 * Method to get CPU % usage.
		 * 
		 * @return CPU % usage
		 */
		public double getCpuUsage() {
			return 100d * (getKernelTime() + getUserTime()) / getUpTime();
		}

		/**
		 * Method to get RAM % usage.
		 * 
		 * @return RAM % usage
		 */
		public double getRamUsage(long ramTotal) {
			return 100d * getResidentSetSize() / ramTotal;
		}

		/**
		 * Method to get Virtual Memory Size.
		 * 
		 * @return Virtual Memory Size
		 */
		public String getVirtualMemorySize() {
			return FormatUtil.toBytes(getVirtualSize());
		}

		/**
		 * Method to get physical memory.
		 * 
		 * @return physical memory
		 */
		public String getPhysicalMemory() {
			return FormatUtil.toBytes(getResidentSetSize());
		}

		@Override
		public String componentAsString() {
			StringBuilder sb = new StringBuilder("=== Process ===");

			sb.append("\nPID: ");
			sb.append(getId());
			sb.append(", Name: ");
			sb.append(getName());
			sb.append(", %CPU: ");
			sb.append(FormatUtil.toPercentage3Digits((getKernelTime() + getUserTime()) / getUpTime()));
			sb.append(", VSZ: ");
			sb.append(FormatUtil.toBytes(getVirtualSize()));
			sb.append(", RSS: ");
			sb.append(FormatUtil.toBytes(getResidentSetSize()));
			sb.append(", User: ");
			sb.append(getUser());
			sb.append(", State: ");
			sb.append(getState());
			sb.append(", Path: ");
			sb.append(getPath());

			return sb.toString();
		}
	}
}