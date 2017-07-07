/* Kevin Boone, July 2017 */

package com.example.switchyard.soaptest;

/** TestSendMessage is the interface that governs the TestSendMessage service. 
 * The interface has no actual implementation -- the service is obtained by "promoting"
 * a reference on another service, and then providing a binding. 
 * 
 * The name of the single method on this interface is therefore irrelevant, since there is
 * only one thing that that a service of this kind can do, which is to take the data passed
 * and invoke the binding (JMS, in this case). Moreover, since we are calling the
 * TestSendMessage service from a Camel route (test_route.xml), there is no logical need
 * for an interface. Still, SY insists that all services have interfaces and, of course,
 * if the TestSendMessage service were called from Java, it would need an interface.
 */
public interface TestSendMessage {
  public void sendMessage (String message);
}
