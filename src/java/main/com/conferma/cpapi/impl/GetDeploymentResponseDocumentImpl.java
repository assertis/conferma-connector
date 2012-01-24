/*
 * An XML document type.
 * Localname: GetDeploymentResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.GetDeploymentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one GetDeploymentResponse(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class GetDeploymentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetDeploymentResponseDocument
{
    
    public GetDeploymentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETDEPLOYMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GetDeploymentResponse");
    
    
    /**
     * Gets the "GetDeploymentResponse" element
     */
    public com.conferma.cpapi.GetDeploymentResponseDocument.GetDeploymentResponse getGetDeploymentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetDeploymentResponseDocument.GetDeploymentResponse target = null;
            target = (com.conferma.cpapi.GetDeploymentResponseDocument.GetDeploymentResponse)get_store().find_element_user(GETDEPLOYMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetDeploymentResponse" element
     */
    public void setGetDeploymentResponse(com.conferma.cpapi.GetDeploymentResponseDocument.GetDeploymentResponse getDeploymentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetDeploymentResponseDocument.GetDeploymentResponse target = null;
            target = (com.conferma.cpapi.GetDeploymentResponseDocument.GetDeploymentResponse)get_store().find_element_user(GETDEPLOYMENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.GetDeploymentResponseDocument.GetDeploymentResponse)get_store().add_element_user(GETDEPLOYMENTRESPONSE$0);
            }
            target.set(getDeploymentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetDeploymentResponse" element
     */
    public com.conferma.cpapi.GetDeploymentResponseDocument.GetDeploymentResponse addNewGetDeploymentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetDeploymentResponseDocument.GetDeploymentResponse target = null;
            target = (com.conferma.cpapi.GetDeploymentResponseDocument.GetDeploymentResponse)get_store().add_element_user(GETDEPLOYMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetDeploymentResponse(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class GetDeploymentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetDeploymentResponseDocument.GetDeploymentResponse
    {
        
        public GetDeploymentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETDEPLOYMENTRESULT$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GetDeploymentResult");
        
        
        /**
         * Gets the "GetDeploymentResult" element
         */
        public com.conferma.cpapi.GetDeploymentResponse getGetDeploymentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.GetDeploymentResponse target = null;
                target = (com.conferma.cpapi.GetDeploymentResponse)get_store().find_element_user(GETDEPLOYMENTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetDeploymentResult" element
         */
        public boolean isSetGetDeploymentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETDEPLOYMENTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetDeploymentResult" element
         */
        public void setGetDeploymentResult(com.conferma.cpapi.GetDeploymentResponse getDeploymentResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.GetDeploymentResponse target = null;
                target = (com.conferma.cpapi.GetDeploymentResponse)get_store().find_element_user(GETDEPLOYMENTRESULT$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.GetDeploymentResponse)get_store().add_element_user(GETDEPLOYMENTRESULT$0);
                }
                target.set(getDeploymentResult);
            }
        }
        
        /**
         * Appends and returns a new empty "GetDeploymentResult" element
         */
        public com.conferma.cpapi.GetDeploymentResponse addNewGetDeploymentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.GetDeploymentResponse target = null;
                target = (com.conferma.cpapi.GetDeploymentResponse)get_store().add_element_user(GETDEPLOYMENTRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetDeploymentResult" element
         */
        public void unsetGetDeploymentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETDEPLOYMENTRESULT$0, 0);
            }
        }
    }
}
