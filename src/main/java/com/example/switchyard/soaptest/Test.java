/* Kevin Boone, July 2017 */

package com.example.switchyard.soaptest;

/** This is the interface to the Switchyard service "Test", implemented in the
 * Java class TestBean. The service takes a Java object TestIn as input, and returns
 * a TestOut. These types will be transformed from/to XML using JAXB, and form
 * the data elements in a SOAP XML request and response.
 * 
 * The name of the method "testMe" is arbitrary, at the Java level. However, when
 * the service is transformed to a WSDL specification using JBDS tooling, the
 * name of the method will become the SOAP operation name.
 */
public interface Test {
  public TestOut testMe (TestIn testIn);
}
