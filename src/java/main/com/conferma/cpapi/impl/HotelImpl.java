/*
 * XML Type:  Hotel
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.Hotel
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML Hotel(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class HotelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.Hotel
{
    
    public HotelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RATE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Rate");
    private static final javax.xml.namespace.QName CAREOFNAME$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "CareOfName");
    private static final javax.xml.namespace.QName CONTACTNAME$4 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "ContactName");
    private static final javax.xml.namespace.QName PAYMENTINSTRUCTION$6 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "PaymentInstruction");
    private static final javax.xml.namespace.QName COMMENTS$8 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Comments");
    
    
    /**
     * Gets the "Rate" element
     */
    public com.conferma.cpapi.HotelRate getRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.HotelRate target = null;
            target = (com.conferma.cpapi.HotelRate)get_store().find_element_user(RATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Rate" element
     */
    public boolean isSetRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RATE$0) != 0;
        }
    }
    
    /**
     * Sets the "Rate" element
     */
    public void setRate(com.conferma.cpapi.HotelRate rate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.HotelRate target = null;
            target = (com.conferma.cpapi.HotelRate)get_store().find_element_user(RATE$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.HotelRate)get_store().add_element_user(RATE$0);
            }
            target.set(rate);
        }
    }
    
    /**
     * Appends and returns a new empty "Rate" element
     */
    public com.conferma.cpapi.HotelRate addNewRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.HotelRate target = null;
            target = (com.conferma.cpapi.HotelRate)get_store().add_element_user(RATE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Rate" element
     */
    public void unsetRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RATE$0, 0);
        }
    }
    
    /**
     * Gets the "CareOfName" element
     */
    public java.lang.String getCareOfName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAREOFNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CareOfName" element
     */
    public org.apache.xmlbeans.XmlString xgetCareOfName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAREOFNAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "CareOfName" element
     */
    public boolean isSetCareOfName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAREOFNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "CareOfName" element
     */
    public void setCareOfName(java.lang.String careOfName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAREOFNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAREOFNAME$2);
            }
            target.setStringValue(careOfName);
        }
    }
    
    /**
     * Sets (as xml) the "CareOfName" element
     */
    public void xsetCareOfName(org.apache.xmlbeans.XmlString careOfName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAREOFNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CAREOFNAME$2);
            }
            target.set(careOfName);
        }
    }
    
    /**
     * Unsets the "CareOfName" element
     */
    public void unsetCareOfName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAREOFNAME$2, 0);
        }
    }
    
    /**
     * Gets the "ContactName" element
     */
    public java.lang.String getContactName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContactName" element
     */
    public org.apache.xmlbeans.XmlString xgetContactName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTNAME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ContactName" element
     */
    public boolean isSetContactName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "ContactName" element
     */
    public void setContactName(java.lang.String contactName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTNAME$4);
            }
            target.setStringValue(contactName);
        }
    }
    
    /**
     * Sets (as xml) the "ContactName" element
     */
    public void xsetContactName(org.apache.xmlbeans.XmlString contactName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACTNAME$4);
            }
            target.set(contactName);
        }
    }
    
    /**
     * Unsets the "ContactName" element
     */
    public void unsetContactName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTNAME$4, 0);
        }
    }
    
    /**
     * Gets the "PaymentInstruction" element
     */
    public java.lang.String getPaymentInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTINSTRUCTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PaymentInstruction" element
     */
    public org.apache.xmlbeans.XmlString xgetPaymentInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAYMENTINSTRUCTION$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "PaymentInstruction" element
     */
    public boolean isSetPaymentInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAYMENTINSTRUCTION$6) != 0;
        }
    }
    
    /**
     * Sets the "PaymentInstruction" element
     */
    public void setPaymentInstruction(java.lang.String paymentInstruction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTINSTRUCTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYMENTINSTRUCTION$6);
            }
            target.setStringValue(paymentInstruction);
        }
    }
    
    /**
     * Sets (as xml) the "PaymentInstruction" element
     */
    public void xsetPaymentInstruction(org.apache.xmlbeans.XmlString paymentInstruction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAYMENTINSTRUCTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PAYMENTINSTRUCTION$6);
            }
            target.set(paymentInstruction);
        }
    }
    
    /**
     * Unsets the "PaymentInstruction" element
     */
    public void unsetPaymentInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAYMENTINSTRUCTION$6, 0);
        }
    }
    
    /**
     * Gets the "Comments" element
     */
    public java.lang.String getComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENTS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Comments" element
     */
    public org.apache.xmlbeans.XmlString xgetComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTS$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "Comments" element
     */
    public boolean isSetComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENTS$8) != 0;
        }
    }
    
    /**
     * Sets the "Comments" element
     */
    public void setComments(java.lang.String comments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENTS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENTS$8);
            }
            target.setStringValue(comments);
        }
    }
    
    /**
     * Sets (as xml) the "Comments" element
     */
    public void xsetComments(org.apache.xmlbeans.XmlString comments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMENTS$8);
            }
            target.set(comments);
        }
    }
    
    /**
     * Unsets the "Comments" element
     */
    public void unsetComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENTS$8, 0);
        }
    }
}
