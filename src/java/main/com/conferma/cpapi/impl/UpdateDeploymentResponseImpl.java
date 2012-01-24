/*
 * XML Type:  UpdateDeploymentResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.UpdateDeploymentResponse
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML UpdateDeploymentResponse(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class UpdateDeploymentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.UpdateDeploymentResponse
{
    
    public UpdateDeploymentResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATED$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Updated");
    
    
    /**
     * Gets the "Updated" element
     */
    public boolean getUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATED$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Updated" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(UPDATED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Updated" element
     */
    public void setUpdated(boolean updated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATED$0);
            }
            target.setBooleanValue(updated);
        }
    }
    
    /**
     * Sets (as xml) the "Updated" element
     */
    public void xsetUpdated(org.apache.xmlbeans.XmlBoolean updated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(UPDATED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(UPDATED$0);
            }
            target.set(updated);
        }
    }
}
