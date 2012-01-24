/*
 * An XML document type.
 * Localname: UpdateDeploymentResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.UpdateDeploymentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one UpdateDeploymentResponse(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class UpdateDeploymentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.UpdateDeploymentResponseDocument
{
    
    public UpdateDeploymentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEDEPLOYMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "UpdateDeploymentResponse");
    
    
    /**
     * Gets the "UpdateDeploymentResponse" element
     */
    public com.conferma.cpapi.UpdateDeploymentResponseDocument.UpdateDeploymentResponse getUpdateDeploymentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.UpdateDeploymentResponseDocument.UpdateDeploymentResponse target = null;
            target = (com.conferma.cpapi.UpdateDeploymentResponseDocument.UpdateDeploymentResponse)get_store().find_element_user(UPDATEDEPLOYMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateDeploymentResponse" element
     */
    public void setUpdateDeploymentResponse(com.conferma.cpapi.UpdateDeploymentResponseDocument.UpdateDeploymentResponse updateDeploymentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.UpdateDeploymentResponseDocument.UpdateDeploymentResponse target = null;
            target = (com.conferma.cpapi.UpdateDeploymentResponseDocument.UpdateDeploymentResponse)get_store().find_element_user(UPDATEDEPLOYMENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.UpdateDeploymentResponseDocument.UpdateDeploymentResponse)get_store().add_element_user(UPDATEDEPLOYMENTRESPONSE$0);
            }
            target.set(updateDeploymentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateDeploymentResponse" element
     */
    public com.conferma.cpapi.UpdateDeploymentResponseDocument.UpdateDeploymentResponse addNewUpdateDeploymentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.UpdateDeploymentResponseDocument.UpdateDeploymentResponse target = null;
            target = (com.conferma.cpapi.UpdateDeploymentResponseDocument.UpdateDeploymentResponse)get_store().add_element_user(UPDATEDEPLOYMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateDeploymentResponse(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class UpdateDeploymentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.UpdateDeploymentResponseDocument.UpdateDeploymentResponse
    {
        
        public UpdateDeploymentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UPDATEDEPLOYMENTRESULT$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "UpdateDeploymentResult");
        
        
        /**
         * Gets the "UpdateDeploymentResult" element
         */
        public com.conferma.cpapi.UpdateDeploymentResponse getUpdateDeploymentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.UpdateDeploymentResponse target = null;
                target = (com.conferma.cpapi.UpdateDeploymentResponse)get_store().find_element_user(UPDATEDEPLOYMENTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "UpdateDeploymentResult" element
         */
        public boolean isSetUpdateDeploymentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UPDATEDEPLOYMENTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "UpdateDeploymentResult" element
         */
        public void setUpdateDeploymentResult(com.conferma.cpapi.UpdateDeploymentResponse updateDeploymentResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.UpdateDeploymentResponse target = null;
                target = (com.conferma.cpapi.UpdateDeploymentResponse)get_store().find_element_user(UPDATEDEPLOYMENTRESULT$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.UpdateDeploymentResponse)get_store().add_element_user(UPDATEDEPLOYMENTRESULT$0);
                }
                target.set(updateDeploymentResult);
            }
        }
        
        /**
         * Appends and returns a new empty "UpdateDeploymentResult" element
         */
        public com.conferma.cpapi.UpdateDeploymentResponse addNewUpdateDeploymentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.UpdateDeploymentResponse target = null;
                target = (com.conferma.cpapi.UpdateDeploymentResponse)get_store().add_element_user(UPDATEDEPLOYMENTRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "UpdateDeploymentResult" element
         */
        public void unsetUpdateDeploymentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UPDATEDEPLOYMENTRESULT$0, 0);
            }
        }
    }
}
