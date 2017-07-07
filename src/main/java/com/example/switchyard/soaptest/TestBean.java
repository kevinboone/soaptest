/* Kevin Boone, July 2017 */
package com.example.switchyard.soaptest;

import javax.inject.Inject;

import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;

/** TestBean provides a Switchyard service that will be invoked using SOAP. The service takes
 * a Java object TestIn as its input, and provides a TestOut as its output. Note that "Hello World"
 * style services that take simple Java primitives (e.g., String) as input and output don't
 * work well in Switchyard, because Switchyard provides no built-in transformation from primitives
 * to XML. Classes can be used as inputs and outputs, provided they comply with JAXB requirements
 * -- as a minimum they need to be annotated to indicate that they can be transformed to/from
 * XML automatically by JAXB. The TestIn and TestOut classes are annotated with XmlRootElement;
 * all the other conversion will use JAXB defaults.
 * 
 * The actual work done by this class is trivial -- just some pointless manipulation of the
 * data in the TestIn class. It also passes one of the attributes of TestIn to a Camel route,
 * via a SY service reference.
 * 
 * Note that the name of the service method in this class is "testMe". When the Java is transformed
 * to WSDL using JBDS tooling, this name because the name of the SOAP operation. 
 * 
 * Like all SY services, TestBean is governed by an interface, in this case the Java interface
 * "Test"
 */
@Service(Test.class)
public class TestBean implements Test {
	
  
    /* Specify a reference to the Camel route which is defined in the XML file
     * test_route.xml. The @Reference here is to an <sca:reference> entry in 
     * switchyard.xml, which points to an interface "com.example.switchyard.soaptest.TestRoute"
     * That interface is the interface to the <sca:component> whose name is Test_route, 
     * which has a camel:xml implementation in test_route.xml. Note that all SY 
     * services are specified by an interface even though, in this case, nothing implements
     * the interface (presumably some dynamically-generated proxy provides the concrete
     * implementation). The internface has a method "doMessage()" but the name is
     * actually arbitrary, since Camel routes don't take methods. But we have to
     * have _something_ to call as a Java method from this Java class
     */
	
	@Inject
	@Reference("TestRoute")
	private TestRoute _testRoute;
	
	@Override
	public TestOut testMe(TestIn testIn) {
		System.out.println("Method testMe() invoked");
		// Make the response object by manipulating the request object (testIn) in some
		//  completely useless, arbitrary way.
		TestOut t = new TestOut ("Hello " + testIn.getIn1(),
				"World " + testIn.getIn2());

		// Invoke the Camel route "test_route.xml" via its reference
		System.out.println("TestBean invoking Camel route test_route.xml");
		_testRoute.doMessage (testIn.getIn1());
		return t;
	}

}
