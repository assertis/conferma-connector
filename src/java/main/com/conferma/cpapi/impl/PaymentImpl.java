/*
 * XML Type:  Payment
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.Payment
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML Payment(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class PaymentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.Payment
{
    
    public PaymentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AMOUNT$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Amount");
    private static final javax.xml.namespace.QName DETAIL$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Detail");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName DELIVERYTIME$6 = 
        new javax.xml.namespace.QName("", "DeliveryTime");
    private static final javax.xml.namespace.QName STATUS$8 = 
        new javax.xml.namespace.QName("", "Status");
    
    
    /**
     * Gets the "Amount" element
     */
    public com.conferma.cpapi.Amount getAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Amount target = null;
            target = (com.conferma.cpapi.Amount)get_store().find_element_user(AMOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Amount" element
     */
    public boolean isSetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AMOUNT$0) != 0;
        }
    }
    
    /**
     * Sets the "Amount" element
     */
    public void setAmount(com.conferma.cpapi.Amount amount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Amount target = null;
            target = (com.conferma.cpapi.Amount)get_store().find_element_user(AMOUNT$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.Amount)get_store().add_element_user(AMOUNT$0);
            }
            target.set(amount);
        }
    }
    
    /**
     * Appends and returns a new empty "Amount" element
     */
    public com.conferma.cpapi.Amount addNewAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Amount target = null;
            target = (com.conferma.cpapi.Amount)get_store().add_element_user(AMOUNT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Amount" element
     */
    public void unsetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AMOUNT$0, 0);
        }
    }
    
    /**
     * Gets the "Detail" element
     */
    public java.lang.String getDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETAIL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Detail" element
     */
    public org.apache.xmlbeans.XmlString xgetDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETAIL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Detail" element
     */
    public boolean isSetDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETAIL$2) != 0;
        }
    }
    
    /**
     * Sets the "Detail" element
     */
    public void setDetail(java.lang.String detail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETAIL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DETAIL$2);
            }
            target.setStringValue(detail);
        }
    }
    
    /**
     * Sets (as xml) the "Detail" element
     */
    public void xsetDetail(org.apache.xmlbeans.XmlString detail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETAIL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DETAIL$2);
            }
            target.set(detail);
        }
    }
    
    /**
     * Unsets the "Detail" element
     */
    public void unsetDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETAIL$2, 0);
        }
    }
    
    /**
     * Gets the "ID" attribute
     */
    public int getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(ID$4);
            return target;
        }
    }
    
    /**
     * Sets the "ID" attribute
     */
    public void setID(int id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
            }
            target.setIntValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    public void xsetID(org.apache.xmlbeans.XmlInt id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(ID$4);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "DeliveryTime" attribute
     */
    public java.util.Calendar getDeliveryTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELIVERYTIME$6);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeliveryTime" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetDeliveryTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DELIVERYTIME$6);
            return target;
        }
    }
    
    /**
     * Sets the "DeliveryTime" attribute
     */
    public void setDeliveryTime(java.util.Calendar deliveryTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELIVERYTIME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DELIVERYTIME$6);
            }
            target.setCalendarValue(deliveryTime);
        }
    }
    
    /**
     * Sets (as xml) the "DeliveryTime" attribute
     */
    public void xsetDeliveryTime(org.apache.xmlbeans.XmlDateTime deliveryTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DELIVERYTIME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DELIVERYTIME$6);
            }
            target.set(deliveryTime);
        }
    }
    
    /**
     * Gets the "Status" attribute
     */
    public com.conferma.cpapi.Status.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$8);
            if (target == null)
            {
                return null;
            }
            return (com.conferma.cpapi.Status.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" attribute
     */
    public com.conferma.cpapi.Status xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Status target = null;
            target = (com.conferma.cpapi.Status)get_store().find_attribute_user(STATUS$8);
            return target;
        }
    }
    
    /**
     * Sets the "Status" attribute
     */
    public void setStatus(com.conferma.cpapi.Status.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$8);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" attribute
     */
    public void xsetStatus(com.conferma.cpapi.Status status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Status target = null;
            target = (com.conferma.cpapi.Status)get_store().find_attribute_user(STATUS$8);
            if (target == null)
            {
                target = (com.conferma.cpapi.Status)get_store().add_attribute_user(STATUS$8);
            }
            target.set(status);
        }
    }
}
