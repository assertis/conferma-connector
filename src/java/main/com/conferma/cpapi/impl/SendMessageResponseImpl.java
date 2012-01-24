/*
 * XML Type:  SendMessageResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.SendMessageResponse
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML SendMessageResponse(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class SendMessageResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.SendMessageResponse
{
    
    public SendMessageResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUCCESS$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Success");
    private static final javax.xml.namespace.QName FAILUREREASON$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "FailureReason");
    
    
    /**
     * Gets the "Success" element
     */
    public boolean getSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUCCESS$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Success" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUCCESS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Success" element
     */
    public void setSuccess(boolean success)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUCCESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUCCESS$0);
            }
            target.setBooleanValue(success);
        }
    }
    
    /**
     * Sets (as xml) the "Success" element
     */
    public void xsetSuccess(org.apache.xmlbeans.XmlBoolean success)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUCCESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SUCCESS$0);
            }
            target.set(success);
        }
    }
    
    /**
     * Gets the "FailureReason" element
     */
    public java.lang.String getFailureReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAILUREREASON$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FailureReason" element
     */
    public org.apache.xmlbeans.XmlString xgetFailureReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAILUREREASON$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "FailureReason" element
     */
    public boolean isSetFailureReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAILUREREASON$2) != 0;
        }
    }
    
    /**
     * Sets the "FailureReason" element
     */
    public void setFailureReason(java.lang.String failureReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAILUREREASON$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAILUREREASON$2);
            }
            target.setStringValue(failureReason);
        }
    }
    
    /**
     * Sets (as xml) the "FailureReason" element
     */
    public void xsetFailureReason(org.apache.xmlbeans.XmlString failureReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAILUREREASON$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAILUREREASON$2);
            }
            target.set(failureReason);
        }
    }
    
    /**
     * Unsets the "FailureReason" element
     */
    public void unsetFailureReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAILUREREASON$2, 0);
        }
    }
}
