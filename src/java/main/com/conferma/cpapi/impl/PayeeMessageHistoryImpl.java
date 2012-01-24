/*
 * XML Type:  PayeeMessageHistory
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.PayeeMessageHistory
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML PayeeMessageHistory(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class PayeeMessageHistoryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.PayeeMessageHistory
{
    
    public PayeeMessageHistoryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAYMENTID$0 = 
        new javax.xml.namespace.QName("", "PaymentID");
    private static final javax.xml.namespace.QName MESSAGETYPE$2 = 
        new javax.xml.namespace.QName("", "MessageType");
    private static final javax.xml.namespace.QName ADDRESS$4 = 
        new javax.xml.namespace.QName("", "Address");
    private static final javax.xml.namespace.QName ISSUETIME$6 = 
        new javax.xml.namespace.QName("", "IssueTime");
    private static final javax.xml.namespace.QName STATUS$8 = 
        new javax.xml.namespace.QName("", "Status");
    private static final javax.xml.namespace.QName DOCUMENTNAME$10 = 
        new javax.xml.namespace.QName("", "DocumentName");
    
    
    /**
     * Gets the "PaymentID" attribute
     */
    public int getPaymentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAYMENTID$0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "PaymentID" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetPaymentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PAYMENTID$0);
            return target;
        }
    }
    
    /**
     * Sets the "PaymentID" attribute
     */
    public void setPaymentID(int paymentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAYMENTID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAYMENTID$0);
            }
            target.setIntValue(paymentID);
        }
    }
    
    /**
     * Sets (as xml) the "PaymentID" attribute
     */
    public void xsetPaymentID(org.apache.xmlbeans.XmlInt paymentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PAYMENTID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PAYMENTID$0);
            }
            target.set(paymentID);
        }
    }
    
    /**
     * Gets the "MessageType" attribute
     */
    public com.conferma.cpapi.MessageType.Enum getMessageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGETYPE$2);
            if (target == null)
            {
                return null;
            }
            return (com.conferma.cpapi.MessageType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "MessageType" attribute
     */
    public com.conferma.cpapi.MessageType xgetMessageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.MessageType target = null;
            target = (com.conferma.cpapi.MessageType)get_store().find_attribute_user(MESSAGETYPE$2);
            return target;
        }
    }
    
    /**
     * Sets the "MessageType" attribute
     */
    public void setMessageType(com.conferma.cpapi.MessageType.Enum messageType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGETYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MESSAGETYPE$2);
            }
            target.setEnumValue(messageType);
        }
    }
    
    /**
     * Sets (as xml) the "MessageType" attribute
     */
    public void xsetMessageType(com.conferma.cpapi.MessageType messageType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.MessageType target = null;
            target = (com.conferma.cpapi.MessageType)get_store().find_attribute_user(MESSAGETYPE$2);
            if (target == null)
            {
                target = (com.conferma.cpapi.MessageType)get_store().add_attribute_user(MESSAGETYPE$2);
            }
            target.set(messageType);
        }
    }
    
    /**
     * Gets the "Address" attribute
     */
    public java.lang.String getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESS$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Address" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADDRESS$4);
            return target;
        }
    }
    
    /**
     * True if has "Address" attribute
     */
    public boolean isSetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADDRESS$4) != null;
        }
    }
    
    /**
     * Sets the "Address" attribute
     */
    public void setAddress(java.lang.String address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDRESS$4);
            }
            target.setStringValue(address);
        }
    }
    
    /**
     * Sets (as xml) the "Address" attribute
     */
    public void xsetAddress(org.apache.xmlbeans.XmlString address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADDRESS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADDRESS$4);
            }
            target.set(address);
        }
    }
    
    /**
     * Unsets the "Address" attribute
     */
    public void unsetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADDRESS$4);
        }
    }
    
    /**
     * Gets the "IssueTime" attribute
     */
    public java.util.Calendar getIssueTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISSUETIME$6);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "IssueTime" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetIssueTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(ISSUETIME$6);
            return target;
        }
    }
    
    /**
     * Sets the "IssueTime" attribute
     */
    public void setIssueTime(java.util.Calendar issueTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISSUETIME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISSUETIME$6);
            }
            target.setCalendarValue(issueTime);
        }
    }
    
    /**
     * Sets (as xml) the "IssueTime" attribute
     */
    public void xsetIssueTime(org.apache.xmlbeans.XmlDateTime issueTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(ISSUETIME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(ISSUETIME$6);
            }
            target.set(issueTime);
        }
    }
    
    /**
     * Gets the "Status" attribute
     */
    public java.lang.String getStatus()
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
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" attribute
     */
    public org.apache.xmlbeans.XmlString xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUS$8);
            return target;
        }
    }
    
    /**
     * True if has "Status" attribute
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STATUS$8) != null;
        }
    }
    
    /**
     * Sets the "Status" attribute
     */
    public void setStatus(java.lang.String status)
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
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" attribute
     */
    public void xsetStatus(org.apache.xmlbeans.XmlString status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STATUS$8);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "Status" attribute
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STATUS$8);
        }
    }
    
    /**
     * Gets the "DocumentName" attribute
     */
    public java.lang.String getDocumentName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOCUMENTNAME$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DocumentName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDocumentName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOCUMENTNAME$10);
            return target;
        }
    }
    
    /**
     * True if has "DocumentName" attribute
     */
    public boolean isSetDocumentName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DOCUMENTNAME$10) != null;
        }
    }
    
    /**
     * Sets the "DocumentName" attribute
     */
    public void setDocumentName(java.lang.String documentName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOCUMENTNAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOCUMENTNAME$10);
            }
            target.setStringValue(documentName);
        }
    }
    
    /**
     * Sets (as xml) the "DocumentName" attribute
     */
    public void xsetDocumentName(org.apache.xmlbeans.XmlString documentName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOCUMENTNAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DOCUMENTNAME$10);
            }
            target.set(documentName);
        }
    }
    
    /**
     * Unsets the "DocumentName" attribute
     */
    public void unsetDocumentName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DOCUMENTNAME$10);
        }
    }
}
