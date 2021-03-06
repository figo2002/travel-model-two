/*
 * JPPF.
 * Copyright (C) 2005-2010 JPPF Team.
 * http://www.jppf.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jppf.node.policy;

import java.util.*;

/**
 * Intermediary data structure generated by the xml parser that makes the actual building
 * of an execution policy easier.
 * @author Laurent Cohen
 */
public class PolicyDescriptor
{
	/**
	 * The type of rule, eg AND, NOT, OneOf, Equal, etc.
	 */
	public String type = null;
	/**
	 * Type of value used for some rules (currently Equal and OneOf).
	 */
	public String valueType = null;
	/**
	 * Determines whether case should be ignored in string comparisons.
	 */
	public String ignoreCase = null;
	/**
	 * The fullyqualified class name of a custom policy class.
	 */
	public String className = null;
	/**
	 * The operands for this element, applies to non-logical rules (ie not AND, OR, XOR, NOT).
	 * The first operand is always a property name.
	 */
	public List<String> operands = new ArrayList<String>();
	/**
	 * List of arguments used in a custom (user-defined policy).
	 */
	public List<String> arguments = new ArrayList<String>();
	/**
	 * The children of this element, if any.
	 */
	public List<PolicyDescriptor> children = new ArrayList<PolicyDescriptor>();
}
