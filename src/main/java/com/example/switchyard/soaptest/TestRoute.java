/* Kevin Boone, July 2017 */

package com.example.switchyard.soaptest;

/**
 * This is the interface to the Camel component Test_route, which is implemented
 * in the XML DSL file test_route.xml All Switchyard services are controlled by
 * an interface or contract of some kind. Because the implementation is a Camel
 * route, it doesn't matter what the method in this interface is called. The
 * method needs to take an argument of a type that can be converted into a Camel
 * message body. The method can be called by any Java component that has
 * an @Reference to the service that implements this interface.
 */

public interface TestRoute {
	public void doMessage(String body);
}
