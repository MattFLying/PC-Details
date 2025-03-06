
<p align="center">
<img width="50%" src="https://github.com/Vallendir/PC-Details/blob/master/header.png" alt="PC-Details"/>
</p>
  
[![Build Status](https://travis-ci.org/Vallendir/PC-Details.svg?branch=master)](https://travis-ci.org/Vallendir/PC-Details)
![Build Version](https://img.shields.io/badge/version-1.0.7-blue.svg)
![Build Language](https://img.shields.io/badge/language-Java%201.8-orange.svg)
![Build Release](https://img.shields.io/badge/release%20jar%27s-%2Fmvn--repo%2F-yellowgreen.svg)
![Build License](https://img.shields.io/badge/license-Apache%20License%20Version%202.0-red.svg)


PC-Details is a free [OSHI](https://github.com/oshi/oshi) & [jHardware](https://github.com/profesorfalken/jHardware) based library for Java to retrieve Hardware and Software informations.
With PC-Details possible is to retrieve informations of software such as Operating System, Bios or System Processes, and informations of hardware such as processor details, hard disk free space, graphic cards mounted in PC and more.


## Supported platforms 
Windows • Linux • Mac OS X • Unix

## Requirements
 - Java 1.8+

## Supported features 
 - [x] Operating System details (version, build etc.)
 - [x] BIOS details (version, manufacturer etc.)
 - [x] Processes details (cores&threads, model etc.)
 - [x] Graphic cards details (model, manufacturer etc.)
 - [x] Memory details (used memory, total memory etc.)
 - [x] Hard disks and partitions details (free space, partitions name&total space etc.)
 - [x] Network details (network interfaces, IPs etc.)
 - [x] Motherboard details (manufacturer, version etc.)
 
## Downloads
| Version | Download from GitHub /mvn-repo/ catalog | Description | 
| ------------- | ------------- | ------------- |
| 1.0.7 | [pc-details-1.0.7-SNAPSHOT.jar](https://github.com/MattFLying/PC-Details/raw/master/mvn-repo/pc-details-1.0.7-SNAPSHOT.jar) | Newest stable release version
| 1.0.7r | [pc-details-1.0.7-SNAPSHOT-runnable.jar](https://github.com/MattFLying/PC-Details/raw/master/mvn-repo/pc-details-1.0.7-SNAPSHOT-runnable.jar) | Newest stable release version with runnable class

## Usage
There are three ways to retrieve component information:
```
1)
HardwareInfo<Cpu> cpuInfo = new CpuInfo();
Cpu cpu = cpuInfo.buildHardware();
System.out.println(cpu.componentAsString());

2)
Cpu cpu = (Cpu) DeviceFactory.getHardware(DeviceFactory.HardwareType.CPU).buildHardware();
System.out.println(cpu.componentAsString());

3)
Cpu cpu = PCDetailsFactory.getProcessorInfo();
System.out.println(cpu.componentAsString());
```
- Sample code with main you can find [here PCDetailsExample.java](https://github.com/MattFLying/PC-Details/blob/master/src/main/java/pcd/example/PCDetailsExample.java).
- Runnable version of code you can find [here PCDetailsConsoleParameters.java](https://github.com/MattFLying/PC-Details/blob/master/src/main/java/pcd/example/PCDetailsConsoleParameters.java). 

## Author
 - Mateusz Mucha aka [MattFLying](https://github.com/MattFLying) 
 - Email: mateusz.marek.mucha@gmail.com

## License
PC-Details project library is licensed under the Apache License Version 2.0. See the [License](https://github.com/MattFLying/PC-Details/blob/master/LICENSE) file for more informations.
