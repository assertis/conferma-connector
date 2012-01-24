/*
 * XML Type:  ExactHotelSearch
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.ExactHotelSearch
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML ExactHotelSearch(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class ExactHotelSearchImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.ExactHotelSearch
{
    
    public ExactHotelSearchImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOTELID$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "HotelID");
    
    
    /**
     * Gets the "HotelID" element
     */
    public int getHotelID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOTELID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "HotelID" element
     */
    public org.apache.xmlbeans.XmlInt xgetHotelID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HOTELID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "HotelID" element
     */
    public void setHotelID(int hotelID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOTELID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOTELID$0);
            }
            target.setIntValue(hotelID);
        }
    }
    
    /**
     * Sets (as xml) the "HotelID" element
     */
    public void xsetHotelID(org.apache.xmlbeans.XmlInt hotelID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HOTELID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(HOTELID$0);
            }
            target.set(hotelID);
        }
    }
}
