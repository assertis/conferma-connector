/*
 * XML Type:  SendScheduleRequest
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.SendScheduleRequest
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML SendScheduleRequest(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class SendScheduleRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.SendScheduleRequest
{
    
    public SendScheduleRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAYEEID$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "PayeeID");
    private static final javax.xml.namespace.QName CONTACTEMAIL$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "ContactEmail");
    private static final javax.xml.namespace.QName CONTACTFACSIMILE$4 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "ContactFacsimile");
    
    
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
     * Gets the "ContactEmail" element
     */
    public java.lang.String getContactEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTEMAIL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContactEmail" element
     */
    public org.apache.xmlbeans.XmlString xgetContactEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTEMAIL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ContactEmail" element
     */
    public boolean isSetContactEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTEMAIL$2) != 0;
        }
    }
    
    /**
     * Sets the "ContactEmail" element
     */
    public void setContactEmail(java.lang.String contactEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTEMAIL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTEMAIL$2);
            }
            target.setStringValue(contactEmail);
        }
    }
    
    /**
     * Sets (as xml) the "ContactEmail" element
     */
    public void xsetContactEmail(org.apache.xmlbeans.XmlString contactEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTEMAIL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACTEMAIL$2);
            }
            target.set(contactEmail);
        }
    }
    
    /**
     * Unsets the "ContactEmail" element
     */
    public void unsetContactEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTEMAIL$2, 0);
        }
    }
    
    /**
     * Gets the "ContactFacsimile" element
     */
    public java.lang.String getContactFacsimile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTFACSIMILE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContactFacsimile" element
     */
    public org.apache.xmlbeans.XmlString xgetContactFacsimile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTFACSIMILE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ContactFacsimile" element
     */
    public boolean isSetContactFacsimile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTFACSIMILE$4) != 0;
        }
    }
    
    /**
     * Sets the "ContactFacsimile" element
     */
    public void setContactFacsimile(java.lang.String contactFacsimile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTFACSIMILE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTFACSIMILE$4);
            }
            target.setStringValue(contactFacsimile);
        }
    }
    
    /**
     * Sets (as xml) the "ContactFacsimile" element
     */
    public void xsetContactFacsimile(org.apache.xmlbeans.XmlString contactFacsimile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTFACSIMILE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACTFACSIMILE$4);
            }
            target.set(contactFacsimile);
        }
    }
    
    /**
     * Unsets the "ContactFacsimile" element
     */
    public void unsetContactFacsimile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTFACSIMILE$4, 0);
        }
    }
}
