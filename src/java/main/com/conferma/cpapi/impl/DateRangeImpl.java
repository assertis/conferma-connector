/*
 * XML Type:  DateRange
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.DateRange
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML DateRange(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class DateRangeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.DateRange
{
    
    public DateRangeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARTDATE$0 = 
        new javax.xml.namespace.QName("", "StartDate");
    private static final javax.xml.namespace.QName ENDDATE$2 = 
        new javax.xml.namespace.QName("", "EndDate");
    
    
    /**
     * Gets the "StartDate" attribute
     */
    public java.util.Calendar getStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATE$0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "StartDate" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(STARTDATE$0);
            return target;
        }
    }
    
    /**
     * Sets the "StartDate" attribute
     */
    public void setStartDate(java.util.Calendar startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTDATE$0);
            }
            target.setCalendarValue(startDate);
        }
    }
    
    /**
     * Sets (as xml) the "StartDate" attribute
     */
    public void xsetStartDate(org.apache.xmlbeans.XmlDateTime startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(STARTDATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(STARTDATE$0);
            }
            target.set(startDate);
        }
    }
    
    /**
     * Gets the "EndDate" attribute
     */
    public java.util.Calendar getEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATE$2);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EndDate" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(ENDDATE$2);
            return target;
        }
    }
    
    /**
     * Sets the "EndDate" attribute
     */
    public void setEndDate(java.util.Calendar endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDDATE$2);
            }
            target.setCalendarValue(endDate);
        }
    }
    
    /**
     * Sets (as xml) the "EndDate" attribute
     */
    public void xsetEndDate(org.apache.xmlbeans.XmlDateTime endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(ENDDATE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(ENDDATE$2);
            }
            target.set(endDate);
        }
    }
}
