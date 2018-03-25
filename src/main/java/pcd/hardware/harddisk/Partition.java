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
package pcd.hardware.harddisk;

import pcd.Component;

/**
 * Class representation of partition.
 * 
 * @author Mateusz Mucha
 */
public final class Partition extends Component {
	private static final long serialVersionUID = -6385229838268812700L;
	private String name, type, uuid, mountPoint, fileSystem, size;
	private int major, minor;
	private long usableSpace, totalSpace;

	/**
	 * Default constructor.
	 * 
	 * @param _id
	 * @param _name
	 * @param _type
	 * @param _uuid
	 * @param _mountPoint
	 * @param _major
	 * @param _minor
	 * @param _size
	 * @param _fileSystem
	 * @param _usableSpace
	 * @param _totalSpace
	 */
	public Partition(String _id, String _name, String _type, String _uuid, String _mountPoint, int _major, int _minor,
			String _size, String _fileSystem, long _usableSpace, long _totalSpace) {
		super(_id);
		this.name = _name;
		this.type = _type;
		this.uuid = _uuid;
		this.mountPoint = _mountPoint;
		this.major = _major;
		this.minor = _minor;
		this.size = _size;
		this.fileSystem = _fileSystem;
		this.usableSpace = _usableSpace;
		this.totalSpace = _totalSpace;
	}

	/**
	 * Method to get partition file system.
	 * 
	 * @return partition file system
	 */
	public String getFileSystem() {
		return fileSystem;
	}

	/**
	 * Method to set partition file system.
	 * 
	 * @param _fileSystem
	 */
	public void setFileSystem(String _fileSystem) {
		this.fileSystem = _fileSystem;
	}

	/**
	 * Method to get partition usable space.
	 * 
	 * @return partition usable space
	 */
	public long getUsableSpace() {
		return usableSpace;
	}

	/**
	 * Method to set partition usable space.
	 * 
	 * @param _usableSpace
	 */
	public void setUsableSpace(long _usableSpace) {
		this.usableSpace = _usableSpace;
	}

	/**
	 * Method to get partition total space.
	 * 
	 * @return partition total space
	 */
	public long getTotalSpace() {
		return totalSpace;
	}

	/**
	 * Method to set partition total space.
	 * 
	 * @param _totalSpace
	 */
	public void setTotalSpace(long _totalSpace) {
		this.totalSpace = _totalSpace;
	}

	/**
	 * Method to get partition name.
	 * 
	 * @return partition UUID
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method to set partition name.
	 * 
	 * @param _name
	 */
	public void setName(String _name) {
		this.name = _name;
	}

	/**
	 * Method to get partition type.
	 * 
	 * @return partition UUID
	 */
	public String getType() {
		return type;
	}

	/**
	 * Method to set partition type.
	 * 
	 * @param _type
	 */
	public void setType(String _type) {
		this.type = _type;
	}

	/**
	 * Method to get partition UUID.
	 * 
	 * @return partition UUID
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * Method to set partition UUID.
	 * 
	 * @param _uuid
	 */
	public void setUuid(String _uuid) {
		this.uuid = _uuid;
	}

	/**
	 * Method to get partition mount point.
	 * 
	 * @return partition mount point
	 */
	public String getMountPoint() {
		return mountPoint;
	}

	/**
	 * Method to set partition mount point.
	 * 
	 * @param _mountPoint
	 */
	public void setMountPoint(String _mountPoint) {
		this.mountPoint = _mountPoint;
	}

	/**
	 * Method to get partition major.
	 * 
	 * @return partition major
	 */
	public int getMajor() {
		return major;
	}

	/**
	 * Method to set partition major.
	 * 
	 * @param _major
	 */
	public void setMajor(int _major) {
		this.major = _major;
	}

	/**
	 * Method to get partition minor.
	 * 
	 * @return partition minor
	 */
	public int getMinor() {
		return minor;
	}

	/**
	 * Method to set partition minor.
	 * 
	 * @param _minor
	 */
	public void setMinor(int _minor) {
		this.minor = _minor;
	}

	/**
	 * Method to get partition size.
	 * 
	 * @return partition size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * Method to set partition size.
	 * 
	 * @param _size
	 */
	public void setSize(String _size) {
		this.size = _size;
	}

	@Override
	public String componentAsString() {
		StringBuilder sb = new StringBuilder("=== Partition ===");

		sb.append("\nPART ID: ");
		sb.append(getId());
		sb.append("\nPART Name: ");
		sb.append(getName());
		sb.append("\nPART UUID: ");
		sb.append(getUuid());
		sb.append("\nPART File System: ");
		sb.append(getFileSystem());
		sb.append("\nPART Type: ");
		sb.append(getType());
		sb.append("\nPART Mount Point: ");
		sb.append(getMountPoint());
		sb.append("\nPART Size: ");
		sb.append(getSize());
		sb.append("\nPART Total Space: ");
		sb.append(getTotalSpace());
		sb.append("\nPART Usable Space: ");
		sb.append(getUsableSpace());
		sb.append("\nPART Major: ");
		sb.append(getMajor());
		sb.append("\nPART Minor: ");
		sb.append(getMinor());

		return sb.toString();
	}
}