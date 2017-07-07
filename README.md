*soaptest -- a documented Switchyard sample application*

This example demonstrates the following Switchyard features

- Exposing a Java method as a webservice, using JAXB to transform between Java and XML automatically
- Using CDI annotations to invoke a Camel route from a Java class
- Specifying a (very simple) Camel route using the XML DSL
- Exposing a JMS message queue as a Switchyard reference

*Preparation*

This example has been tested on JBoss Fuse 6.3, installed on JBoss EAP 6.4. It posts data to a message queue called `TestQueue`, 
which probably needs to be defined in standalone-full.xml:

    <jms-queue name="TestQueue">
      <entry name="java:/TestQueue"/>
      <durable>true</durable>
    </jms-queue>

The configuration file `standalone-full.xml` probably needs to be used rather than standalone.xml, as the latter has no
message broker configuration by default. So run EAP like this:


    bin/standalone.sh --server-config=standalone-full.xml

*Building and deploying*

To build the application:

    mvn clean package
 
 
 To deploy, copy the `.jar` file from the target/ directory to the `standalone/deployments/` directory on EAP.

*Testing the application*

You can run the example from the command line using curl, like this:

    curl -X POST --data @src/test/resources/request.xml http://localhost:8080/soaptest/Test

Or use a web services test utility (Eclipse webservice explorer, SoapUI) to inspect the 
WSDL file src/main/resources/Test.wsdl. The server log should show the progress of the message through the application.



*Further information*

A detailed explanation how the Switchyard application works is provided in the file `docs/soaptest.pdf`.



