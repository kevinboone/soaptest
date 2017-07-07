/* Kevin Boone, July 2017 */

package com.example.switchyard.soaptest;

import javax.xml.bind.annotation.XmlRegistry;

/** ObjectFactory is used by JAXB to create new objects of the classes that correspond to XML elements. 
 * These classes will be annotated with @XmlRootElement. This class is (perhaps) necessary because we are
 * specifying JAXB transformation between XML and Java. For reasons that I don't understand, JAXB won't
 * simply instantiate TestOut when sees the XML element <testOut> that it corresponds to. Instead, it
 * looks for a method createXXX() that returns a TestOut. It doesn't seem to matter what the method is
 * called, so long as it begins with "create" and returns the appropriate type.
 * 
 * The Switchyard quickstarts that use JAXB seem to use a more elaborate ObjectFactory than this, and I
 * suspect that in some SY environments this class is not needed at all.
 */

@XmlRegistry
public class ObjectFactory {
	// It seems that we just need something called "createXXX" for each of the Java types that are marshalled
    public TestIn createMe1 () { return new TestIn(); }
    public TestOut createMe2 () { return new TestOut(); }
}
