/*
 * XML Type:  GeneralPayee
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.GeneralPayee
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML GeneralPayee(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class GeneralPayeeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GeneralPayee
{
    
    public GeneralPayeeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Name");
    private static final javax.xml.namespace.QName CONSUMERREFERENCE$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "ConsumerReference");
    private static final javax.xml.namespace.QName AMOUNT$4 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Amount");
    private static final javax.xml.namespace.QName PAYMENTRANGE$6 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "PaymentRange");
    private static final javax.xml.namespace.QName CUSTOMER$8 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Customer");
    
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "ConsumerReference" element
     */
    public java.lang.String getConsumerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSUMERREFERENCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConsumerReference" element
     */
    public org.apache.xmlbeans.XmlString xgetConsumerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSUMERREFERENCE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ConsumerReference" element
     */
    public boolean isSetConsumerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSUMERREFERENCE$2) != 0;
        }
    }
    
    /**
     * Sets the "ConsumerReference" element
     */
    public void setConsumerReference(java.lang.String consumerReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSUMERREFERENCE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONSUMERREFERENCE$2);
            }
            target.setStringValue(consumerReference);
        }
    }
    
    /**
     * Sets (as xml) the "ConsumerReference" element
     */
    public void xsetConsumerReference(org.apache.xmlbeans.XmlString consumerReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSUMERREFERENCE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONSUMERREFERENCE$2);
            }
            target.set(consumerReference);
        }
    }
    
    /**
     * Unsets the "ConsumerReference" element
     */
    public void unsetConsumerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSUMERREFERENCE$2, 0);
        }
    }
    
    /**
     * Gets the "Amount" element
     */
    public com.conferma.cpapi.Amount getAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Amount target = null;
            target = (com.conferma.cpapi.Amount)get_store().find_element_user(AMOUNT$4, 0);
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
            return get_store().count_elements(AMOUNT$4) != 0;
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
            target = (com.conferma.cpapi.Amount)get_store().find_element_user(AMOUNT$4, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.Amount)get_store().add_element_user(AMOUNT$4);
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
            target = (com.conferma.cpapi.Amount)get_store().add_element_user(AMOUNT$4);
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
            get_store().remove_element(AMOUNT$4, 0);
        }
    }
    
    /**
     * Gets the "PaymentRange" element
     */
    public com.conferma.cpapi.DateRange getPaymentRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DateRange target = null;
            target = (com.conferma.cpapi.DateRange)get_store().find_element_user(PAYMENTRANGE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PaymentRange" element
     */
    public boolean isSetPaymentRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAYMENTRANGE$6) != 0;
        }
    }
    
    /**
     * Sets the "PaymentRange" element
     */
    public void setPaymentRange(com.conferma.cpapi.DateRange paymentRange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DateRange target = null;
            target = (com.conferma.cpapi.DateRange)get_store().find_element_user(PAYMENTRANGE$6, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.DateRange)get_store().add_element_user(PAYMENTRANGE$6);
            }
            target.set(paymentRange);
        }
    }
    
    /**
     * Appends and returns a new empty "PaymentRange" element
     */
    public com.conferma.cpapi.DateRange addNewPaymentRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DateRange target = null;
            target = (com.conferma.cpapi.DateRange)get_store().add_element_user(PAYMENTRANGE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "PaymentRange" element
     */
    public void unsetPaymentRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAYMENTRANGE$6, 0);
        }
    }
    
    /**
     * Gets the "Customer" element
     */
    public com.conferma.cpapi.Customer getCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Customer target = null;
            target = (com.conferma.cpapi.Customer)get_store().find_element_user(CUSTOMER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Customer" element
     */
    public boolean isSetCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMER$8) != 0;
        }
    }
    
    /**
     * Sets the "Customer" element
     */
    public void setCustomer(com.conferma.cpapi.Customer customer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Customer target = null;
            target = (com.conferma.cpapi.Customer)get_store().find_element_user(CUSTOMER$8, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.Customer)get_store().add_element_user(CUSTOMER$8);
            }
            target.set(customer);
        }
    }
    
    /**
     * Appends and returns a new empty "Customer" element
     */
    public com.conferma.cpapi.Customer addNewCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Customer target = null;
            target = (com.conferma.cpapi.Customer)get_store().add_element_user(CUSTOMER$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Customer" element
     */
    public void unsetCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMER$8, 0);
        }
    }
}
