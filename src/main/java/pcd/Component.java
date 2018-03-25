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
package pcd;

import java.io.Serializable;

/**
 * Abstract class represents hardware and software model components e.g.
 * processor, bios, operating system, memory. Required to be inherited by all
 * representations of components also use serialization interface.
 * 
 * @author Mateusz Mucha
 */
public abstract class Component implements Serializable {
	private static final long serialVersionUID = 8580594616663183082L;
	private String id;

	/**
	 * Default constructor.
	 * 
	 * @param _id
	 *            - identificator of component
	 */
	protected Component(String _id) {
		this.id = _id;
	}

	/**
	 * Method to get identificator of component.
	 * 
	 * @return identificator of component
	 */
	public String getId() {
		return id;
	}

	/**
	 * Method to set identificator of component.
	 * 
	 * @param _id
	 *            - identificator of component
	 */
	public void setId(String _id) {
		this.id = _id;
	}

	/**
	 * Method to get all component informations.
	 * 
	 * @return string representation of component
	 */
	public abstract String componentAsString();
}