package com.in28minutes.spring.basics.springin5steps.xml;

/**
 * @Project spring-in5-steps
 * Created by @Author Parinit on 3/9/2020
 * at 5:45 PM
 */
public class XmlPersonDAO {

    XmlJdbcConnection xmlJdbcConnection;

    public XmlJdbcConnection getXmlJdbcConnection() {
        return xmlJdbcConnection;
    }

    public void setXmlJdbcConnection(XmlJdbcConnection jdbcConnection) {
        this.xmlJdbcConnection = jdbcConnection;
    }
}
