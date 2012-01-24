/*
 * XML Type:  OfficeSearch
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.OfficeSearch
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML OfficeSearch(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class OfficeSearchImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.OfficeSearch
{
    
    public OfficeSearchImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFICEID$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "OfficeID");
    
    
    /**
     * Gets the "OfficeID" element
     */
    public int getOfficeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFICEID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "OfficeID" element
     */
    public org.apache.xmlbeans.XmlInt xgetOfficeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OFFICEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OfficeID" element
     */
    public void setOfficeID(int officeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFICEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFICEID$0);
            }
            target.setIntValue(officeID);
        }
    }
    
    /**
     * Sets (as xml) the "OfficeID" element
     */
    public void xsetOfficeID(org.apache.xmlbeans.XmlInt officeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OFFICEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(OFFICEID$0);
            }
            target.set(officeID);
        }
    }
}
