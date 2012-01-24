/*
 * XML Type:  PayeeMessageHistoryRequest
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.PayeeMessageHistoryRequest
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML PayeeMessageHistoryRequest(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class PayeeMessageHistoryRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.PayeeMessageHistoryRequest
{
    
    public PayeeMessageHistoryRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAYEEID$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "PayeeID");
    
    
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
}
