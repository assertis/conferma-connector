/*
 * XML Type:  GetMessageQueueResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.GetMessageQueueResponse
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML GetMessageQueueResponse(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class GetMessageQueueResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetMessageQueueResponse
{
    
    public GetMessageQueueResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPLOYMENTID$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "DeploymentID");
    private static final javax.xml.namespace.QName QUEUERECORDS$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "QueueRecords");
    
    
    /**
     * Gets the "DeploymentID" element
     */
    public int getDeploymentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPLOYMENTID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeploymentID" element
     */
    public org.apache.xmlbeans.XmlInt xgetDeploymentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPLOYMENTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DeploymentID" element
     */
    public void setDeploymentID(int deploymentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPLOYMENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPLOYMENTID$0);
            }
            target.setIntValue(deploymentID);
        }
    }
    
    /**
     * Sets (as xml) the "DeploymentID" element
     */
    public void xsetDeploymentID(org.apache.xmlbeans.XmlInt deploymentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPLOYMENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DEPLOYMENTID$0);
            }
            target.set(deploymentID);
        }
    }
    
    /**
     * Gets the "QueueRecords" element
     */
    public com.conferma.cpapi.ArrayOfQueueRecord getQueueRecords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfQueueRecord target = null;
            target = (com.conferma.cpapi.ArrayOfQueueRecord)get_store().find_element_user(QUEUERECORDS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "QueueRecords" element
     */
    public boolean isSetQueueRecords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUEUERECORDS$2) != 0;
        }
    }
    
    /**
     * Sets the "QueueRecords" element
     */
    public void setQueueRecords(com.conferma.cpapi.ArrayOfQueueRecord queueRecords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfQueueRecord target = null;
            target = (com.conferma.cpapi.ArrayOfQueueRecord)get_store().find_element_user(QUEUERECORDS$2, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.ArrayOfQueueRecord)get_store().add_element_user(QUEUERECORDS$2);
            }
            target.set(queueRecords);
        }
    }
    
    /**
     * Appends and returns a new empty "QueueRecords" element
     */
    public com.conferma.cpapi.ArrayOfQueueRecord addNewQueueRecords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfQueueRecord target = null;
            target = (com.conferma.cpapi.ArrayOfQueueRecord)get_store().add_element_user(QUEUERECORDS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "QueueRecords" element
     */
    public void unsetQueueRecords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUEUERECORDS$2, 0);
        }
    }
}
