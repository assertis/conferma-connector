/*
 * XML Type:  UpdateDeploymentStatusResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.UpdateDeploymentStatusResponse
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML UpdateDeploymentStatusResponse(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class UpdateDeploymentStatusResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.UpdateDeploymentStatusResponse
{
    
    public UpdateDeploymentStatusResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUCCESS$0 = 
        new javax.xml.namespace.QName("", "Success");
    
    
    /**
     * Gets the "Success" attribute
     */
    public boolean getSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUCCESS$0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Success" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUCCESS$0);
            return target;
        }
    }
    
    /**
     * Sets the "Success" attribute
     */
    public void setSuccess(boolean success)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUCCESS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUCCESS$0);
            }
            target.setBooleanValue(success);
        }
    }
    
    /**
     * Sets (as xml) the "Success" attribute
     */
    public void xsetSuccess(org.apache.xmlbeans.XmlBoolean success)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUCCESS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SUCCESS$0);
            }
            target.set(success);
        }
    }
}
