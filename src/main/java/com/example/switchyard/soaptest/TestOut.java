/* Kevin Boone, July 2017 */

package com.example.switchyard.soaptest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * TestOut is the Java object that provides the output from the service logic in
 * TestBean. The XmlRootElement annotation indicates to JAXB that there will be
 * an XML element called <testOut> whose content corresponds to this object.
 * There are no other JAXB annotations, so the XML element will have
 * sub-elements called <out1> and <out2>, whose values correspond to the class
 * attributes in1 and in2.
 * 
 * When the TestBean service has been invoked using SOAP, the output object of
 * type testOut is marshelled into an XML element <testOut>, which is included
 * in the SOAP response
 */
@XmlRootElement(name = "testOut")
public class TestOut {

	protected String out1;

	protected String out2;

	/** Note that we need a default constructor to satisfy JAXB, even though the
	 * only explicit constructor call is to the version that takes two String
	 * arguments.
	 */
	public TestOut() {
	}

	/** Convenience constructor, to avoid the need for a couple of extra setXXX 
	 * calls */
	
	public TestOut(String out1, String out2) {
		this.setOut1(out1);
		this.setOut2(out2);
	}

	public String getOut1() {
		return out1;
	}

	public void setOut1(String out1) {
		this.out1 = out1;
	}

	public String getOut2() {
		return out2;
	}

	public void setOut2(String out2) {
		this.out2 = out2;
	}
}
