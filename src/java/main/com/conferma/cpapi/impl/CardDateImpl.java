/*
 * XML Type:  CardDate
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.CardDate
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML CardDate(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class CardDateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.CardDate
{
    
    public CardDateImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MONTH$0 = 
        new javax.xml.namespace.QName("", "Month");
    private static final javax.xml.namespace.QName YEAR$2 = 
        new javax.xml.namespace.QName("", "Year");
    
    
    /**
     * Gets the "Month" attribute
     */
    public java.lang.String getMonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MONTH$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Month" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MONTH$0);
            return target;
        }
    }
    
    /**
     * True if has "Month" attribute
     */
    public boolean isSetMonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MONTH$0) != null;
        }
    }
    
    /**
     * Sets the "Month" attribute
     */
    public void setMonth(java.lang.String month)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MONTH$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MONTH$0);
            }
            target.setStringValue(month);
        }
    }
    
    /**
     * Sets (as xml) the "Month" attribute
     */
    public void xsetMonth(org.apache.xmlbeans.XmlString month)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MONTH$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MONTH$0);
            }
            target.set(month);
        }
    }
    
    /**
     * Unsets the "Month" attribute
     */
    public void unsetMonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MONTH$0);
        }
    }
    
    /**
     * Gets the "Year" attribute
     */
    public java.lang.String getYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YEAR$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Year" attribute
     */
    public org.apache.xmlbeans.XmlString xgetYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(YEAR$2);
            return target;
        }
    }
    
    /**
     * True if has "Year" attribute
     */
    public boolean isSetYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(YEAR$2) != null;
        }
    }
    
    /**
     * Sets the "Year" attribute
     */
    public void setYear(java.lang.String year)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YEAR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(YEAR$2);
            }
            target.setStringValue(year);
        }
    }
    
    /**
     * Sets (as xml) the "Year" attribute
     */
    public void xsetYear(org.apache.xmlbeans.XmlString year)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(YEAR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(YEAR$2);
            }
            target.set(year);
        }
    }
    
    /**
     * Unsets the "Year" attribute
     */
    public void unsetYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(YEAR$2);
        }
    }
}
