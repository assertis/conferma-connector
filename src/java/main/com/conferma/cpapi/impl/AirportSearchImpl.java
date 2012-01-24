/*
 * XML Type:  AirportSearch
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.AirportSearch
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML AirportSearch(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class AirportSearchImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.AirportSearch
{
    
    public AirportSearchImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AIRPORTCODE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "AirportCode");
    
    
    /**
     * Gets the "AirportCode" element
     */
    public java.lang.String getAirportCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRPORTCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AirportCode" element
     */
    public org.apache.xmlbeans.XmlString xgetAirportCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AIRPORTCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AirportCode" element
     */
    public boolean isSetAirportCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AIRPORTCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "AirportCode" element
     */
    public void setAirportCode(java.lang.String airportCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRPORTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AIRPORTCODE$0);
            }
            target.setStringValue(airportCode);
        }
    }
    
    /**
     * Sets (as xml) the "AirportCode" element
     */
    public void xsetAirportCode(org.apache.xmlbeans.XmlString airportCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AIRPORTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AIRPORTCODE$0);
            }
            target.set(airportCode);
        }
    }
    
    /**
     * Unsets the "AirportCode" element
     */
    public void unsetAirportCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AIRPORTCODE$0, 0);
        }
    }
}
