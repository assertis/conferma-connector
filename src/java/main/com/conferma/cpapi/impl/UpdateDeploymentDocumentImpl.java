/*
 * An XML document type.
 * Localname: UpdateDeployment
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.UpdateDeploymentDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one UpdateDeployment(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class UpdateDeploymentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.UpdateDeploymentDocument
{
    
    public UpdateDeploymentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEDEPLOYMENT$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "UpdateDeployment");
    
    
    /**
     * Gets the "UpdateDeployment" element
     */
    public com.conferma.cpapi.UpdateDeploymentDocument.UpdateDeployment getUpdateDeployment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.UpdateDeploymentDocument.UpdateDeployment target = null;
            target = (com.conferma.cpapi.UpdateDeploymentDocument.UpdateDeployment)get_store().find_element_user(UPDATEDEPLOYMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateDeployment" element
     */
    public void setUpdateDeployment(com.conferma.cpapi.UpdateDeploymentDocument.UpdateDeployment updateDeployment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.UpdateDeploymentDocument.UpdateDeployment target = null;
            target = (com.conferma.cpapi.UpdateDeploymentDocument.UpdateDeployment)get_store().find_element_user(UPDATEDEPLOYMENT$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.UpdateDeploymentDocument.UpdateDeployment)get_store().add_element_user(UPDATEDEPLOYMENT$0);
            }
            target.set(updateDeployment);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateDeployment" element
     */
    public com.conferma.cpapi.UpdateDeploymentDocument.UpdateDeployment addNewUpdateDeployment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.UpdateDeploymentDocument.UpdateDeployment target = null;
            target = (com.conferma.cpapi.UpdateDeploymentDocument.UpdateDeployment)get_store().add_element_user(UPDATEDEPLOYMENT$0);
            return target;
        }
    }
    /**
     * An XML UpdateDeployment(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class UpdateDeploymentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.UpdateDeploymentDocument.UpdateDeployment
    {
        
        public UpdateDeploymentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UPDATEDEPLOYMENTREQUEST$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "UpdateDeploymentRequest");
        
        
        /**
         * Gets the "UpdateDeploymentRequest" element
         */
        public com.conferma.cpapi.UpdateDeploymentRequest getUpdateDeploymentRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.UpdateDeploymentRequest target = null;
                target = (com.conferma.cpapi.UpdateDeploymentRequest)get_store().find_element_user(UPDATEDEPLOYMENTREQUEST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "UpdateDeploymentRequest" element
         */
        public boolean isSetUpdateDeploymentRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UPDATEDEPLOYMENTREQUEST$0) != 0;
            }
        }
        
        /**
         * Sets the "UpdateDeploymentRequest" element
         */
        public void setUpdateDeploymentRequest(com.conferma.cpapi.UpdateDeploymentRequest updateDeploymentRequest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.UpdateDeploymentRequest target = null;
                target = (com.conferma.cpapi.UpdateDeploymentRequest)get_store().find_element_user(UPDATEDEPLOYMENTREQUEST$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.UpdateDeploymentRequest)get_store().add_element_user(UPDATEDEPLOYMENTREQUEST$0);
                }
                target.set(updateDeploymentRequest);
            }
        }
        
        /**
         * Appends and returns a new empty "UpdateDeploymentRequest" element
         */
        public com.conferma.cpapi.UpdateDeploymentRequest addNewUpdateDeploymentRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.UpdateDeploymentRequest target = null;
                target = (com.conferma.cpapi.UpdateDeploymentRequest)get_store().add_element_user(UPDATEDEPLOYMENTREQUEST$0);
                return target;
            }
        }
        
        /**
         * Unsets the "UpdateDeploymentRequest" element
         */
        public void unsetUpdateDeploymentRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UPDATEDEPLOYMENTREQUEST$0, 0);
            }
        }
    }
}
