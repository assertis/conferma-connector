/*
 * An XML document type.
 * Localname: UpdateDeploymentStatusResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.UpdateDeploymentStatusResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one UpdateDeploymentStatusResponse(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class UpdateDeploymentStatusResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.UpdateDeploymentStatusResponseDocument
{
    
    public UpdateDeploymentStatusResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEDEPLOYMENTSTATUSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "UpdateDeploymentStatusResponse");
    
    
    /**
     * Gets the "UpdateDeploymentStatusResponse" element
     */
    public com.conferma.cpapi.UpdateDeploymentStatusResponseDocument.UpdateDeploymentStatusResponse getUpdateDeploymentStatusResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.UpdateDeploymentStatusResponseDocument.UpdateDeploymentStatusResponse target = null;
            target = (com.conferma.cpapi.UpdateDeploymentStatusResponseDocument.UpdateDeploymentStatusResponse)get_store().find_element_user(UPDATEDEPLOYMENTSTATUSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateDeploymentStatusResponse" element
     */
    public void setUpdateDeploymentStatusResponse(com.conferma.cpapi.UpdateDeploymentStatusResponseDocument.UpdateDeploymentStatusResponse updateDeploymentStatusResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.UpdateDeploymentStatusResponseDocument.UpdateDeploymentStatusResponse target = null;
            target = (com.conferma.cpapi.UpdateDeploymentStatusResponseDocument.UpdateDeploymentStatusResponse)get_store().find_element_user(UPDATEDEPLOYMENTSTATUSRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.UpdateDeploymentStatusResponseDocument.UpdateDeploymentStatusResponse)get_store().add_element_user(UPDATEDEPLOYMENTSTATUSRESPONSE$0);
            }
            target.set(updateDeploymentStatusResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateDeploymentStatusResponse" element
     */
    public com.conferma.cpapi.UpdateDeploymentStatusResponseDocument.UpdateDeploymentStatusResponse addNewUpdateDeploymentStatusResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.UpdateDeploymentStatusResponseDocument.UpdateDeploymentStatusResponse target = null;
            target = (com.conferma.cpapi.UpdateDeploymentStatusResponseDocument.UpdateDeploymentStatusResponse)get_store().add_element_user(UPDATEDEPLOYMENTSTATUSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateDeploymentStatusResponse(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class UpdateDeploymentStatusResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.UpdateDeploymentStatusResponseDocument.UpdateDeploymentStatusResponse
    {
        
        public UpdateDeploymentStatusResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UPDATEDEPLOYMENTSTATUSRESULT$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "UpdateDeploymentStatusResult");
        
        
        /**
         * Gets the "UpdateDeploymentStatusResult" element
         */
        public com.conferma.cpapi.UpdateDeploymentStatusResponse getUpdateDeploymentStatusResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.UpdateDeploymentStatusResponse target = null;
                target = (com.conferma.cpapi.UpdateDeploymentStatusResponse)get_store().find_element_user(UPDATEDEPLOYMENTSTATUSRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "UpdateDeploymentStatusResult" element
         */
        public boolean isSetUpdateDeploymentStatusResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UPDATEDEPLOYMENTSTATUSRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "UpdateDeploymentStatusResult" element
         */
        public void setUpdateDeploymentStatusResult(com.conferma.cpapi.UpdateDeploymentStatusResponse updateDeploymentStatusResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.UpdateDeploymentStatusResponse target = null;
                target = (com.conferma.cpapi.UpdateDeploymentStatusResponse)get_store().find_element_user(UPDATEDEPLOYMENTSTATUSRESULT$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.UpdateDeploymentStatusResponse)get_store().add_element_user(UPDATEDEPLOYMENTSTATUSRESULT$0);
                }
                target.set(updateDeploymentStatusResult);
            }
        }
        
        /**
         * Appends and returns a new empty "UpdateDeploymentStatusResult" element
         */
        public com.conferma.cpapi.UpdateDeploymentStatusResponse addNewUpdateDeploymentStatusResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.UpdateDeploymentStatusResponse target = null;
                target = (com.conferma.cpapi.UpdateDeploymentStatusResponse)get_store().add_element_user(UPDATEDEPLOYMENTSTATUSRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "UpdateDeploymentStatusResult" element
         */
        public void unsetUpdateDeploymentStatusResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UPDATEDEPLOYMENTSTATUSRESULT$0, 0);
            }
        }
    }
}
