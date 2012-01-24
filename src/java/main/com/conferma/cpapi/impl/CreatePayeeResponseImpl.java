/*
 * XML Type:  CreatePayeeResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.CreatePayeeResponse
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML CreatePayeeResponse(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class CreatePayeeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.CreatePayeeResponse
{
    
    public CreatePayeeResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPLOYMENT$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Deployment");
    
    
    /**
     * Gets the "Deployment" element
     */
    public com.conferma.cpapi.Deployment getDeployment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Deployment target = null;
            target = (com.conferma.cpapi.Deployment)get_store().find_element_user(DEPLOYMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Deployment" element
     */
    public boolean isSetDeployment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPLOYMENT$0) != 0;
        }
    }
    
    /**
     * Sets the "Deployment" element
     */
    public void setDeployment(com.conferma.cpapi.Deployment deployment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Deployment target = null;
            target = (com.conferma.cpapi.Deployment)get_store().find_element_user(DEPLOYMENT$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.Deployment)get_store().add_element_user(DEPLOYMENT$0);
            }
            target.set(deployment);
        }
    }
    
    /**
     * Appends and returns a new empty "Deployment" element
     */
    public com.conferma.cpapi.Deployment addNewDeployment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Deployment target = null;
            target = (com.conferma.cpapi.Deployment)get_store().add_element_user(DEPLOYMENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Deployment" element
     */
    public void unsetDeployment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPLOYMENT$0, 0);
        }
    }
}
