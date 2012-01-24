/*
 * XML Type:  GeocodeSearch
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.GeocodeSearch
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML GeocodeSearch(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class GeocodeSearchImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GeocodeSearch
{
    
    public GeocodeSearchImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LATITUDE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Latitude");
    private static final javax.xml.namespace.QName LONGITUDE$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Longitude");
    
    
    /**
     * Gets the "Latitude" element
     */
    public java.math.BigDecimal getLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Latitude" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LATITUDE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Latitude" element
     */
    public void setLatitude(java.math.BigDecimal latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATITUDE$0);
            }
            target.setBigDecimalValue(latitude);
        }
    }
    
    /**
     * Sets (as xml) the "Latitude" element
     */
    public void xsetLatitude(org.apache.xmlbeans.XmlDecimal latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LATITUDE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(LATITUDE$0);
            }
            target.set(latitude);
        }
    }
    
    /**
     * Gets the "Longitude" element
     */
    public java.math.BigDecimal getLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Longitude" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LONGITUDE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Longitude" element
     */
    public void setLongitude(java.math.BigDecimal longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGITUDE$2);
            }
            target.setBigDecimalValue(longitude);
        }
    }
    
    /**
     * Sets (as xml) the "Longitude" element
     */
    public void xsetLongitude(org.apache.xmlbeans.XmlDecimal longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LONGITUDE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(LONGITUDE$2);
            }
            target.set(longitude);
        }
    }
}
