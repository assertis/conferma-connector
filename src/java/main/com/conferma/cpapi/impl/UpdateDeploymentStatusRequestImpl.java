/*
 * XML Type:  UpdateDeploymentStatusRequest
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.UpdateDeploymentStatusRequest
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML UpdateDeploymentStatusRequest(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class UpdateDeploymentStatusRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.UpdateDeploymentStatusRequest
{
    
    public UpdateDeploymentStatusRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPLOYMENTID$0 = 
        new javax.xml.namespace.QName("", "DeploymentID");
    private static final javax.xml.namespace.QName DEPLOYMENTSTATUS$2 = 
        new javax.xml.namespace.QName("", "DeploymentStatus");
    
    
    /**
     * Gets the "DeploymentID" attribute
     */
    public int getDeploymentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPLOYMENTID$0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeploymentID" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetDeploymentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(DEPLOYMENTID$0);
            return target;
        }
    }
    
    /**
     * Sets the "DeploymentID" attribute
     */
    public void setDeploymentID(int deploymentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPLOYMENTID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEPLOYMENTID$0);
            }
            target.setIntValue(deploymentID);
        }
    }
    
    /**
     * Sets (as xml) the "DeploymentID" attribute
     */
    public void xsetDeploymentID(org.apache.xmlbeans.XmlInt deploymentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(DEPLOYMENTID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(DEPLOYMENTID$0);
            }
            target.set(deploymentID);
        }
    }
    
    /**
     * Gets the "DeploymentStatus" attribute
     */
    public com.conferma.cpapi.DeploymentStatus.Enum getDeploymentStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPLOYMENTSTATUS$2);
            if (target == null)
            {
                return null;
            }
            return (com.conferma.cpapi.DeploymentStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeploymentStatus" attribute
     */
    public com.conferma.cpapi.DeploymentStatus xgetDeploymentStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DeploymentStatus target = null;
            target = (com.conferma.cpapi.DeploymentStatus)get_store().find_attribute_user(DEPLOYMENTSTATUS$2);
            return target;
        }
    }
    
    /**
     * Sets the "DeploymentStatus" attribute
     */
    public void setDeploymentStatus(com.conferma.cpapi.DeploymentStatus.Enum deploymentStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPLOYMENTSTATUS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEPLOYMENTSTATUS$2);
            }
            target.setEnumValue(deploymentStatus);
        }
    }
    
    /**
     * Sets (as xml) the "DeploymentStatus" attribute
     */
    public void xsetDeploymentStatus(com.conferma.cpapi.DeploymentStatus deploymentStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DeploymentStatus target = null;
            target = (com.conferma.cpapi.DeploymentStatus)get_store().find_attribute_user(DEPLOYMENTSTATUS$2);
            if (target == null)
            {
                target = (com.conferma.cpapi.DeploymentStatus)get_store().add_attribute_user(DEPLOYMENTSTATUS$2);
            }
            target.set(deploymentStatus);
        }
    }
}
