/*
 * XML Type:  PriceRange
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.PriceRange
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML PriceRange(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class PriceRangeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.PriceRange
{
    
    public PriceRangeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName START$0 = 
        new javax.xml.namespace.QName("", "Start");
    private static final javax.xml.namespace.QName END$2 = 
        new javax.xml.namespace.QName("", "End");
    
    
    /**
     * Gets the "Start" attribute
     */
    public float getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "Start" attribute
     */
    public org.apache.xmlbeans.XmlFloat xgetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(START$0);
            return target;
        }
    }
    
    /**
     * Sets the "Start" attribute
     */
    public void setStart(float start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(START$0);
            }
            target.setFloatValue(start);
        }
    }
    
    /**
     * Sets (as xml) the "Start" attribute
     */
    public void xsetStart(org.apache.xmlbeans.XmlFloat start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(START$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_attribute_user(START$0);
            }
            target.set(start);
        }
    }
    
    /**
     * Gets the "End" attribute
     */
    public float getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(END$2);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "End" attribute
     */
    public org.apache.xmlbeans.XmlFloat xgetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(END$2);
            return target;
        }
    }
    
    /**
     * Sets the "End" attribute
     */
    public void setEnd(float end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(END$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(END$2);
            }
            target.setFloatValue(end);
        }
    }
    
    /**
     * Sets (as xml) the "End" attribute
     */
    public void xsetEnd(org.apache.xmlbeans.XmlFloat end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(END$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_attribute_user(END$2);
            }
            target.set(end);
        }
    }
}
