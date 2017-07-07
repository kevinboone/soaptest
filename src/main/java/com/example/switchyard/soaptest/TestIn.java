/* Kevin Boone, July 2017 */

package com.example.switchyard.soaptest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/** TestIn is the Java object that provides the input to the service logic in TestBean. 
 * The XmlRootElement annotation indicates to JAXB that there will be an XML element
 * called <testIn> whose content corresponds to this object. There are no other JAXB
 * annotations, so the XML element will have sub-elements called <in1> and <in2>, whose
 * values correspond to the class attributes in1 and in2.
 * 
 * When the TestBean service is invoked using SOAP, the XML elements corresponding to
 * the input argument will be unmarshalled into a TestIn object, which is passed
 * to the testMe() method of TestBean.
 */
@XmlRootElement(name ="testIn")
public class TestIn {
	
	protected String in1;
	
	protected String in2;

	public String getIn1() {
		return in1;
	}

	public void setIn1(String in1) {
		this.in1 = in1;
	}

	public String getIn2() {
		return in2;
	}

	public void setIn2(String in2) {
		this.in2 = in2;
	}


}
