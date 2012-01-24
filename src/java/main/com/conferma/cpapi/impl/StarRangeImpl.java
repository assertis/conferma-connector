/*
 * XML Type:  StarRange
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.StarRange
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML StarRange(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class StarRangeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.StarRange
{
    
    public StarRangeImpl(org.apache.xmlbeans.SchemaType sType)
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
    public int getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Start" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(START$0);
            return target;
        }
    }
    
    /**
     * Sets the "Start" attribute
     */
    public void setStart(int start)
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
            target.setIntValue(start);
        }
    }
    
    /**
     * Sets (as xml) the "Start" attribute
     */
    public void xsetStart(org.apache.xmlbeans.XmlInt start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(START$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(START$0);
            }
            target.set(start);
        }
    }
    
    /**
     * Gets the "End" attribute
     */
    public int getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(END$2);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "End" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(END$2);
            return target;
        }
    }
    
    /**
     * Sets the "End" attribute
     */
    public void setEnd(int end)
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
            target.setIntValue(end);
        }
    }
    
    /**
     * Sets (as xml) the "End" attribute
     */
    public void xsetEnd(org.apache.xmlbeans.XmlInt end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(END$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(END$2);
            }
            target.set(end);
        }
    }
}
