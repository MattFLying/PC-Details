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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import oshi.SystemInfo;
import oshi.software.os.NetworkParams;
import oshi.software.os.OperatingSystem;
import pcd.hardware.HardwareAbstract;
import pcd.hardware.HardwareInfo;
import pcd.util.FormatUtil;

/**
 * Class to build network informations. Should be use as command to build model
 * component of network.
 * 
 * @author Mateusz Mucha
 */
public final class NetworkInfo extends HardwareAbstract implements HardwareInfo<Network> {
	/**
	 * Default constructor.
	 */
	public NetworkInfo() {
		super(null);
	}

	/**
	 * Constructor with new SystemInfo object of OSHI API.
	 * 
	 * @param _systemInfo
	 *            - system info object of OSHI API
	 */
	public NetworkInfo(SystemInfo _systemInfo) {
		super(_systemInfo, null);
	}

	public Network buildHardware() {
		List<NetworkInterface> networkList = new ArrayList<NetworkInterface>();

		Arrays.asList(getHardwareAbstractionLayer().getNetworkIFs()).forEach(networkIF -> {
			NetworkInterface network = new NetworkInterface(
					new StringBuilder(networkIF.getName()).append(" ").append(networkIF.getDisplayName()).toString(),
					networkIF.getMTU(), networkIF.getMacaddr(), Arrays.toString(networkIF.getIPv4addr()),
					Arrays.toString(networkIF.getIPv6addr()), FormatUtil.toBytes(networkIF.getBytesRecv()),
					FormatUtil.toBytes(networkIF.getBytesSent()), networkIF.getPacketsRecv(),
					networkIF.getPacketsSent(), networkIF.getInErrors(), networkIF.getOutErrors(),
					FormatUtil.formatValue(networkIF.getSpeed(), "bps"), networkIF.getTimeStamp());
			networkList.add(network);
		});

		OperatingSystem operatingSystem = getSystemInfo().getOperatingSystem();
		NetworkParams networkParams = operatingSystem.getNetworkParams();
		List<String> dnsServers = Arrays.asList(networkParams.getDnsServers());

		return new Network(networkParams.getIpv4DefaultGateway() + " " + networkParams.getHostName(), networkList,
				networkParams.getHostName(), networkParams.getDomainName(), networkParams.getIpv4DefaultGateway(),
				networkParams.getIpv6DefaultGateway(), dnsServers);
	}
}