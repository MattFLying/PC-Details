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
package pcd.util;

/**
 * Class with formating methods.
 * 
 * @author Mateusz Mucha
 */
public class FormatUtil {
	private final static String ROUND_DIGIT_PATTERN = "%.2f";
	private final static String ROUND_DIGIT_WITH_PERCENTAGE_PATTERN = "%.2f%%";
	private final static String ROUND_THREE_DIGIT_WITH_PERCENTAGE_PATTERN = "%.3f%%";

	/**
	 * Method to formating double value to percentage e.g. 5.12%.
	 * 
	 * @param _value
	 * @return formated percentage value
	 */
	public static String toPercentage(double _value) {
		return String.format(ROUND_DIGIT_WITH_PERCENTAGE_PATTERN, _value * 100);
	}

	/**
	 * Method to formating double value to percentage e.g. 5.122%.
	 * 
	 * @param _value
	 * @return formated percentage value
	 */
	public static String toPercentage3Digits(double _value) {
		return String.format(ROUND_THREE_DIGIT_WITH_PERCENTAGE_PATTERN, _value * 100);
	}

	/**
	 * Method to formating elapsed time in {days, hh:mm:ss} format e.g. 2 days,
	 * 01:23:11
	 * 
	 * @param _seconds
	 * @return formated elapsed time
	 */
	public static String elapsedTime(long _seconds) {
		return oshi.util.FormatUtil.formatElapsedSecs(_seconds);
	}

	/**
	 * Method to format bytes as long value to right bytes e.g. 56KB, 198MB etc.
	 * 
	 * @param _bytes
	 * @return formated bytes
	 */
	public static String toBytes(long _bytes) {
		return oshi.util.FormatUtil.formatBytes(_bytes).replace("i", "");
	}

	/**
	 * Method to divide two long values
	 * 
	 * @param _first
	 * @param _second
	 * @return divided two long values as double type
	 */
	public static double divideLong(long _first, long _second) {
		return 1.0 * _first / _second;
	}

	/**
	 * Method to divide two double values rounded to two digits
	 * 
	 * @param _first
	 * @param _second
	 * @return divideed two double values rounded to two digits
	 */
	public static String divide(double _first, double _second) {
		return String.format(ROUND_DIGIT_PATTERN, _first / _second).replace(",", ".");
	}

	/**
	 * Method to formating heartz as long value to string representation e.g.
	 * 2400MHz
	 * 
	 * @param _hertz
	 * @return formated heartz
	 */
	public static String toHertz(long _hertz) {
		return oshi.util.FormatUtil.formatHertz(_hertz);
	}

	/**
	 * Method to format megahertz as integer value to long value
	 * 
	 * @param _mhz
	 * @return megahertz value
	 */
	public static long mHzToLong(int _mhz) {
		return _mhz * 1000000l;
	}

	/**
	 * Method to format kilobytes as integer value to long value
	 * 
	 * @param _kb
	 * @return kilobytes
	 */
	public static long kbToMb(int _kb) {
		return _kb * 1000l;
	}

	/**
	 * Method to format small integer value to megabytes value e.g. 64MB
	 * 
	 * @param _smallInt
	 * @return megabytes
	 */
	public static String intToMb(int _smallInt) {
		return toBytes(_smallInt * 1000000000l);
	}

	/**
	 * Method to format small integer value to megahertz.
	 * 
	 * @param _mhz
	 * @return megahertz
	 */
	public static String intToMhz(int _smallInt) {
		return toHertz(_smallInt * 100000l).replace(" ", "0 ");
	}

	/**
	 * Method to format value with specific unit type e.g. 566MB
	 * 
	 * @param value
	 * @param unit
	 * @return value with unity type
	 */
	public static String formatValue(long _value, String _unit) {
		return oshi.util.FormatUtil.formatValue(_value, _unit);
	}

	/**
	 * Method to format bytes as long value to decimal value
	 * 
	 * @param bytes
	 * @return bytes as decimal
	 */
	public static String formatBytesDecimal(long _bytes) {
		return oshi.util.FormatUtil.formatBytesDecimal(_bytes);
	}
}