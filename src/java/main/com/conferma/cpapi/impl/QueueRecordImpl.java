/*
 * XML Type:  QueueRecord
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.QueueRecord
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML QueueRecord(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class QueueRecordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.QueueRecord
{
    
    public QueueRecordImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELIVERYDATE$0 = 
        new javax.xml.namespace.QName("", "DeliveryDate");
    private static final javax.xml.namespace.QName DELIVERYADDRESS$2 = 
        new javax.xml.namespace.QName("", "DeliveryAddress");
    private static final javax.xml.namespace.QName STATUS$4 = 
        new javax.xml.namespace.QName("", "Status");
    
    
    /**
     * Gets the "DeliveryDate" attribute
     */
    public java.util.Calendar getDeliveryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELIVERYDATE$0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeliveryDate" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetDeliveryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DELIVERYDATE$0);
            return target;
        }
    }
    
    /**
     * Sets the "DeliveryDate" attribute
     */
    public void setDeliveryDate(java.util.Calendar deliveryDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELIVERYDATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DELIVERYDATE$0);
            }
            target.setCalendarValue(deliveryDate);
        }
    }
    
    /**
     * Sets (as xml) the "DeliveryDate" attribute
     */
    public void xsetDeliveryDate(org.apache.xmlbeans.XmlDateTime deliveryDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DELIVERYDATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DELIVERYDATE$0);
            }
            target.set(deliveryDate);
        }
    }
    
    /**
     * Gets the "DeliveryAddress" attribute
     */
    public java.lang.String getDeliveryAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELIVERYADDRESS$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeliveryAddress" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDeliveryAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DELIVERYADDRESS$2);
            return target;
        }
    }
    
    /**
     * True if has "DeliveryAddress" attribute
     */
    public boolean isSetDeliveryAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DELIVERYADDRESS$2) != null;
        }
    }
    
    /**
     * Sets the "DeliveryAddress" attribute
     */
    public void setDeliveryAddress(java.lang.String deliveryAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELIVERYADDRESS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DELIVERYADDRESS$2);
            }
            target.setStringValue(deliveryAddress);
        }
    }
    
    /**
     * Sets (as xml) the "DeliveryAddress" attribute
     */
    public void xsetDeliveryAddress(org.apache.xmlbeans.XmlString deliveryAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DELIVERYADDRESS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DELIVERYADDRESS$2);
            }
            target.set(deliveryAddress);
        }
    }
    
    /**
     * Unsets the "DeliveryAddress" attribute
     */
    public void unsetDeliveryAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DELIVERYADDRESS$2);
        }
    }
    
    /**
     * Gets the "Status" attribute
     */
    public com.conferma.cpapi.DeliveryStatus.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$4);
            if (target == null)
            {
                return null;
            }
            return (com.conferma.cpapi.DeliveryStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" attribute
     */
    public com.conferma.cpapi.DeliveryStatus xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DeliveryStatus target = null;
            target = (com.conferma.cpapi.DeliveryStatus)get_store().find_attribute_user(STATUS$4);
            return target;
        }
    }
    
    /**
     * Sets the "Status" attribute
     */
    public void setStatus(com.conferma.cpapi.DeliveryStatus.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$4);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" attribute
     */
    public void xsetStatus(com.conferma.cpapi.DeliveryStatus status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DeliveryStatus target = null;
            target = (com.conferma.cpapi.DeliveryStatus)get_store().find_attribute_user(STATUS$4);
            if (target == null)
            {
                target = (com.conferma.cpapi.DeliveryStatus)get_store().add_attribute_user(STATUS$4);
            }
            target.set(status);
        }
    }
}
