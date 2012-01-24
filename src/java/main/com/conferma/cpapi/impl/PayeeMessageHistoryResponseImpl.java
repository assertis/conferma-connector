/*
 * XML Type:  PayeeMessageHistoryResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.PayeeMessageHistoryResponse
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML PayeeMessageHistoryResponse(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class PayeeMessageHistoryResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.PayeeMessageHistoryResponse
{
    
    public PayeeMessageHistoryResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAYEEID$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "PayeeID");
    private static final javax.xml.namespace.QName MESSAGES$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Messages");
    
    
    /**
     * Gets the "PayeeID" element
     */
    public int getPayeeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYEEID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "PayeeID" element
     */
    public org.apache.xmlbeans.XmlInt xgetPayeeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAYEEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PayeeID" element
     */
    public void setPayeeID(int payeeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYEEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYEEID$0);
            }
            target.setIntValue(payeeID);
        }
    }
    
    /**
     * Sets (as xml) the "PayeeID" element
     */
    public void xsetPayeeID(org.apache.xmlbeans.XmlInt payeeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAYEEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PAYEEID$0);
            }
            target.set(payeeID);
        }
    }
    
    /**
     * Gets the "Messages" element
     */
    public com.conferma.cpapi.ArrayOfPayeeMessageHistory getMessages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfPayeeMessageHistory target = null;
            target = (com.conferma.cpapi.ArrayOfPayeeMessageHistory)get_store().find_element_user(MESSAGES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Messages" element
     */
    public boolean isSetMessages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGES$2) != 0;
        }
    }
    
    /**
     * Sets the "Messages" element
     */
    public void setMessages(com.conferma.cpapi.ArrayOfPayeeMessageHistory messages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfPayeeMessageHistory target = null;
            target = (com.conferma.cpapi.ArrayOfPayeeMessageHistory)get_store().find_element_user(MESSAGES$2, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.ArrayOfPayeeMessageHistory)get_store().add_element_user(MESSAGES$2);
            }
            target.set(messages);
        }
    }
    
    /**
     * Appends and returns a new empty "Messages" element
     */
    public com.conferma.cpapi.ArrayOfPayeeMessageHistory addNewMessages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfPayeeMessageHistory target = null;
            target = (com.conferma.cpapi.ArrayOfPayeeMessageHistory)get_store().add_element_user(MESSAGES$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Messages" element
     */
    public void unsetMessages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGES$2, 0);
        }
    }
}
