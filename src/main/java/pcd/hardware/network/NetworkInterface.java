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
package pcd.hardware.network;

import pcd.Component;

/**
 * Class representation of network interfaces.
 * 
 * @author Mateusz Mucha
 */
public final class NetworkInterface extends Component {
	private static final long serialVersionUID = -6385229838268812700L;
	private int mtu;
	private String mac, ipv4, ipv6, bytesRecv, bytesSent, speed;
	private long packetsRecv, packetsSent, inErrors, outErrors, timeStamp;

	/**
	 * Default constructor.
	 * 
	 * @param _id
	 * @param _mtu
	 * @param _mac
	 * @param _ipv4
	 * @param _ipv6
	 * @param _bytesRecv
	 * @param _bytesSent
	 * @param _packetsRecv
	 * @param _packetsSent
	 * @param _inErrors
	 * @param _outErrors
	 * @param _speed
	 * @param _timeStamp
	 */
	public NetworkInterface(String _id, int _mtu, String _mac, String _ipv4, String _ipv6, String _bytesRecv,
			String _bytesSent, long _packetsRecv, long _packetsSent, long _inErrors, long _outErrors, String _speed,
			long _timeStamp) {
		super(_id);
		this.mtu = _mtu;
		this.mac = _mac;
		this.ipv4 = _ipv4;
		this.ipv6 = _ipv6;
		this.bytesRecv = _bytesRecv;
		this.bytesSent = _bytesSent;
		this.packetsRecv = _packetsRecv;
		this.packetsSent = _packetsSent;
		this.inErrors = _inErrors;
		this.outErrors = _outErrors;
		this.speed = _speed;
		this.timeStamp = _timeStamp;
	}

	/**
	 * Method to get Maximum Transmission Unit(MTU).
	 * 
	 * @return Maximum Transmission Unit(MTU)
	 */
	public int getMtu() {
		return mtu;
	}

	/**
	 * Method to set Maximum Transmission Unit(MTU).
	 * 
	 * @param _mtu
	 */
	public void setMtu(int _mtu) {
		this.mtu = _mtu;
	}

	/**
	 * Method to get MAC address.
	 * 
	 * @return MAC address
	 */
	public String getMac() {
		return mac;
	}

	/**
	 * Method to set MAC address.
	 * 
	 * @param _mac
	 */
	public void setMac(String _mac) {
		this.mac = _mac;
	}

	/**
	 * Method to get IPv4.
	 * 
	 * @return IPv4
	 */
	public String getIpv4() {
		return ipv4;
	}

	/**
	 * Method to set IPv4.
	 * 
	 * @param _ipv4
	 */
	public void setIpv4(String _ipv4) {
		this.ipv4 = _ipv4;
	}

	/**
	 * Method to get IPv6.
	 * 
	 * @return IPv6
	 */
	public String getIpv6() {
		return ipv6;
	}

	/**
	 * Method to set IPv6.
	 * 
	 * @param _ipv6
	 */
	public void setIpv6(String _ipv6) {
		this.ipv6 = _ipv6;
	}

	/**
	 * Method to get bytes received.
	 * 
	 * @return bytes received
	 */
	public String getBytesRecv() {
		return bytesRecv;
	}

	/**
	 * Method to set bytes received.
	 * 
	 * @param _bytesRecv
	 */
	public void setBytesRecv(String _bytesRecv) {
		this.bytesRecv = _bytesRecv;
	}

	/**
	 * Method to get bytes senting.
	 * 
	 * @return bytes senting
	 */
	public String getBytesSent() {
		return bytesSent;
	}

	/**
	 * Method to set bytes senting.
	 * 
	 * @param _bytesSent
	 */
	public void setBytesSent(String _bytesSent) {
		this.bytesSent = _bytesSent;
	}

	/**
	 * Method to get packets received.
	 * 
	 * @return packets received
	 */
	public long getPacketsRecv() {
		return packetsRecv;
	}

	/**
	 * Method to set packets received.
	 * 
	 * @param _packetsRecv
	 */
	public void setPacketsRecv(long _packetsRecv) {
		this.packetsRecv = _packetsRecv;
	}

	/**
	 * Method to get packets senting.
	 * 
	 * @return packets senting
	 */
	public long getPacketsSent() {
		return packetsSent;
	}

	/**
	 * Method to set packets senting.
	 * 
	 * @param _packetsSent
	 */
	public void setPacketsSent(long _packetsSent) {
		this.packetsSent = _packetsSent;
	}

	/**
	 * Method to get in errors.
	 * 
	 * @return in errors
	 */
	public long getInErrors() {
		return inErrors;
	}

	/**
	 * Method to set in errors.
	 * 
	 * @param _inErrors
	 */
	public void setInErrors(long _inErrors) {
		this.inErrors = _inErrors;
	}

	/**
	 * Method to get out errors.
	 * 
	 * @return out errors
	 */
	public long getOutErrors() {
		return outErrors;
	}

	/**
	 * Method to set out errors.
	 * 
	 * @param _outErrors
	 */
	public void setOutErrors(long _outErrors) {
		this.outErrors = _outErrors;
	}

	/**
	 * Method to get speed.
	 * 
	 * @return speed
	 */
	public String getSpeed() {
		return speed;
	}

	/**
	 * Method to set speed.
	 * 
	 * @param _speed
	 */
	public void setSpeed(String _speed) {
		this.speed = _speed;
	}

	/**
	 * Method to get time stamp.
	 * 
	 * @return time stamp
	 */
	public long getTimeStamp() {
		return timeStamp;
	}

	/**
	 * Method to set time stamp.
	 * 
	 * @param _timeStamp
	 */
	public void setTimeStamp(long _timeStamp) {
		this.timeStamp = _timeStamp;
	}

	@Override
	public String componentAsString() {
		StringBuilder sb = new StringBuilder("=== Network Interface ===");

		sb.append("\nNetInt ID: ");
		sb.append(getId());
		sb.append("\nNetInt MAC: ");
		sb.append(getMac());
		sb.append("\nNetInt IPv4: ");
		sb.append(getIpv4());
		sb.append("\nNetInt IPv4: ");
		sb.append(getIpv6());
		sb.append("\nNetInt Packets Received: ");
		sb.append(getPacketsRecv());
		sb.append("\nNetInt Bytes Received: ");
		sb.append(getBytesRecv());
		sb.append("\nNetInt Packets Senting: ");
		sb.append(getPacketsSent());
		sb.append("\nNetInt Bytes Senting: ");
		sb.append(getBytesSent());
		sb.append("\nNetInt In Errors: ");
		sb.append(getInErrors());
		sb.append("\nNetInt Out Errors: ");
		sb.append(getOutErrors());
		sb.append("\nNetInt Speed: ");
		sb.append(getSpeed());
		sb.append("\nNetInt MTU: ");
		sb.append(getMtu());

		return sb.toString();
	}
}