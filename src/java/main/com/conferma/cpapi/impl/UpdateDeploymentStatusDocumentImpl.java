/*
 * An XML document type.
 * Localname: UpdateDeploymentStatus
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.UpdateDeploymentStatusDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one UpdateDeploymentStatus(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class UpdateDeploymentStatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.UpdateDeploymentStatusDocument
{
    
    public UpdateDeploymentStatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEDEPLOYMENTSTATUS$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "UpdateDeploymentStatus");
    
    
    /**
     * Gets the "UpdateDeploymentStatus" element
     */
    public com.conferma.cpapi.UpdateDeploymentStatusDocument.UpdateDeploymentStatus getUpdateDeploymentStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.UpdateDeploymentStatusDocument.UpdateDeploymentStatus target = null;
            target = (com.conferma.cpapi.UpdateDeploymentStatusDocument.UpdateDeploymentStatus)get_store().find_element_user(UPDATEDEPLOYMENTSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateDeploymentStatus" element
     */
    public void setUpdateDeploymentStatus(com.conferma.cpapi.UpdateDeploymentStatusDocument.UpdateDeploymentStatus updateDeploymentStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.UpdateDeploymentStatusDocument.UpdateDeploymentStatus target = null;
            target = (com.conferma.cpapi.UpdateDeploymentStatusDocument.UpdateDeploymentStatus)get_store().find_element_user(UPDATEDEPLOYMENTSTATUS$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.UpdateDeploymentStatusDocument.UpdateDeploymentStatus)get_store().add_element_user(UPDATEDEPLOYMENTSTATUS$0);
            }
            target.set(updateDeploymentStatus);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateDeploymentStatus" element
     */
    public com.conferma.cpapi.UpdateDeploymentStatusDocument.UpdateDeploymentStatus addNewUpdateDeploymentStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.UpdateDeploymentStatusDocument.UpdateDeploymentStatus target = null;
            target = (com.conferma.cpapi.UpdateDeploymentStatusDocument.UpdateDeploymentStatus)get_store().add_element_user(UPDATEDEPLOYMENTSTATUS$0);
            return target;
        }
    }
    /**
     * An XML UpdateDeploymentStatus(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class UpdateDeploymentStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.UpdateDeploymentStatusDocument.UpdateDeploymentStatus
    {
        
        public UpdateDeploymentStatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UPDATEDEPLOYMENTSTATUSREQUEST$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "UpdateDeploymentStatusRequest");
        
        
        /**
         * Gets the "UpdateDeploymentStatusRequest" element
         */
        public com.conferma.cpapi.UpdateDeploymentStatusRequest getUpdateDeploymentStatusRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.UpdateDeploymentStatusRequest target = null;
                target = (com.conferma.cpapi.UpdateDeploymentStatusRequest)get_store().find_element_user(UPDATEDEPLOYMENTSTATUSREQUEST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "UpdateDeploymentStatusRequest" element
         */
        public boolean isSetUpdateDeploymentStatusRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UPDATEDEPLOYMENTSTATUSREQUEST$0) != 0;
            }
        }
        
        /**
         * Sets the "UpdateDeploymentStatusRequest" element
         */
        public void setUpdateDeploymentStatusRequest(com.conferma.cpapi.UpdateDeploymentStatusRequest updateDeploymentStatusRequest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.UpdateDeploymentStatusRequest target = null;
                target = (com.conferma.cpapi.UpdateDeploymentStatusRequest)get_store().find_element_user(UPDATEDEPLOYMENTSTATUSREQUEST$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.UpdateDeploymentStatusRequest)get_store().add_element_user(UPDATEDEPLOYMENTSTATUSREQUEST$0);
                }
                target.set(updateDeploymentStatusRequest);
            }
        }
        
        /**
         * Appends and returns a new empty "UpdateDeploymentStatusRequest" element
         */
        public com.conferma.cpapi.UpdateDeploymentStatusRequest addNewUpdateDeploymentStatusRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.UpdateDeploymentStatusRequest target = null;
                target = (com.conferma.cpapi.UpdateDeploymentStatusRequest)get_store().add_element_user(UPDATEDEPLOYMENTSTATUSREQUEST$0);
                return target;
            }
        }
        
        /**
         * Unsets the "UpdateDeploymentStatusRequest" element
         */
        public void unsetUpdateDeploymentStatusRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UPDATEDEPLOYMENTSTATUSREQUEST$0, 0);
            }
        }
    }
}
