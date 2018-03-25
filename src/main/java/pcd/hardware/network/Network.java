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

import java.util.List;

import pcd.Component;

/**
 * Class representation of network.
 * 
 * @author Mateusz Mucha
 */
public final class Network extends Component {
	private static final long serialVersionUID = 2552773150423460545L;
	private List<NetworkInterface> networkInterfacesList;
	private String hostName, domainName, ipv4DefaultGateway, ipv6DefaultGateway;
	private List<String> dnsServers;

	/**
	 * Default constructor.
	 * 
	 * @param _id
	 * @param _networkInterfacesList
	 * @param _hostName
	 * @param _domainName
	 * @param _ipv4DefaultGateway
	 * @param _ipv6DefaultGateway
	 * @param _dnsServers
	 */
	public Network(String _id, List<NetworkInterface> _networkInterfacesList, String _hostName, String _domainName,
			String _ipv4DefaultGateway, String _ipv6DefaultGateway, List<String> _dnsServers) {
		super(_id);
		this.networkInterfacesList = _networkInterfacesList;
		this.hostName = _hostName;
		this.domainName = _domainName;
		this.ipv4DefaultGateway = _ipv4DefaultGateway;
		this.ipv6DefaultGateway = _ipv6DefaultGateway;
		this.dnsServers = _dnsServers;
	}

	/**
	 * Method to get network interfaces.
	 * 
	 * @return network interfaces
	 */
	public List<NetworkInterface> getNetworkInterfacesList() {
		return networkInterfacesList;
	}

	/**
	 * Method to set network interfaces.
	 * 
	 * @param _networkInterfacesList
	 */
	public void setNetworkInterfacesList(List<NetworkInterface> _networkInterfacesList) {
		this.networkInterfacesList = _networkInterfacesList;
	}

	/**
	 * Method to get network host name.
	 * 
	 * @return network host name
	 */
	public String getHostName() {
		return hostName;
	}

	/**
	 * Method to set network host name.
	 * 
	 * @param _hostName
	 */
	public void setHostName(String _hostName) {
		this.hostName = _hostName;
	}

	/**
	 * Method to get network domain name.
	 * 
	 * @return network domain name
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * Method to set network domain name.
	 * 
	 * @param _domainName
	 */
	public void setDomainName(String _domainName) {
		this.domainName = _domainName;
	}

	/**
	 * Method to get network IPv4 default gateway.
	 * 
	 * @return IPv4 default gateway
	 */
	public String getIpv4DefaultGateway() {
		return ipv4DefaultGateway;
	}

	/**
	 * Method to set network IPv4 default gateway.
	 * 
	 * @param _ipv4DefaultGateway
	 */
	public void setIpv4DefaultGateway(String _ipv4DefaultGateway) {
		this.ipv4DefaultGateway = _ipv4DefaultGateway;
	}

	/**
	 * Method to get network IPv6 default gateway.
	 * 
	 * @return IPv6 default gateway
	 */
	public String getIpv6DefaultGateway() {
		return ipv6DefaultGateway;
	}

	/**
	 * Method to set network IPv6 default gateway.
	 * 
	 * @param _ipv6DefaultGateway
	 */
	public void setIpv6DefaultGateway(String _ipv6DefaultGateway) {
		this.ipv6DefaultGateway = _ipv6DefaultGateway;
	}

	/**
	 * Method to get network DNS.
	 * 
	 * @return network DNSs
	 */
	public List<String> getDnsServers() {
		return dnsServers;
	}

	/**
	 * Method to set network DNS.
	 * 
	 * @param _dnsServers
	 */
	public void setDnsServers(List<String> _dnsServers) {
		this.dnsServers = _dnsServers;
	}

	@Override
	public String componentAsString() {
		StringBuilder sb = new StringBuilder("=== NETWORK ===");

		sb.append("\nNETWORK ID: ");
		sb.append(getId());
		sb.append("\nNETWORK Host Name: ");
		sb.append(getHostName());
		sb.append("\nNETWORK Domain Name: ");
		sb.append(getDomainName());
		sb.append("\nNETWORK IPv4: ");
		sb.append(getIpv4DefaultGateway());
		sb.append("\nNETWORK IPv6: ");
		sb.append(getIpv6DefaultGateway());
		sb.append("\nNETWORK DNS: ");
		getDnsServers().forEach(dns -> {
			sb.append("\n");
			sb.append(dns);
		});
		sb.append("\n==== NETWORK Interfaces ====");
		getNetworkInterfacesList().forEach(nInt -> {
			sb.append("\n");
			sb.append(nInt.componentAsString());
		});

		return sb.toString();
	}
}