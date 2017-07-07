/* Kevin Boone, July 2017 */

/* This file is used by JAXB to find the object factory that corresponds to the XML namespace
 * "urn:com.example.switchyard:soaptest:1.0". Essentially it links this namespace to a Java
 * package name. In that package is a class called ObjectFactory, which is implements the
 * @XmlRegistry interface. 
 * 
 * Note that Eclipse/JBDS will not allow us to create a Java class called package-info, since
 * it has a minus sign in its name. We have to create a _file_ called package-info.java. It
 * still compiles OK, despite the odd naming.
 */
@javax.xml.bind.annotation.XmlSchema(namespace = "urn:com.example.switchyard:soaptest:1.0")
package com.example.switchyard.soaptest;

