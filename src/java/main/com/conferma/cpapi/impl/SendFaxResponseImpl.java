/*
 * XML Type:  SendFaxResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.SendFaxResponse
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML SendFaxResponse(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class SendFaxResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.SendFaxResponse
{
    
    public SendFaxResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUEUED$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Queued");
    
    
    /**
     * Gets the "Queued" element
     */
    public boolean getQueued()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUEUED$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Queued" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetQueued()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(QUEUED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Queued" element
     */
    public void setQueued(boolean queued)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUEUED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUEUED$0);
            }
            target.setBooleanValue(queued);
        }
    }
    
    /**
     * Sets (as xml) the "Queued" element
     */
    public void xsetQueued(org.apache.xmlbeans.XmlBoolean queued)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(QUEUED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(QUEUED$0);
            }
            target.set(queued);
        }
    }
}
