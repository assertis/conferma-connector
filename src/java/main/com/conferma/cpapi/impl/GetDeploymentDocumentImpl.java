/*
 * An XML document type.
 * Localname: GetDeployment
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.GetDeploymentDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one GetDeployment(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class GetDeploymentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetDeploymentDocument
{
    
    public GetDeploymentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETDEPLOYMENT$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GetDeployment");
    
    
    /**
     * Gets the "GetDeployment" element
     */
    public com.conferma.cpapi.GetDeploymentDocument.GetDeployment getGetDeployment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetDeploymentDocument.GetDeployment target = null;
            target = (com.conferma.cpapi.GetDeploymentDocument.GetDeployment)get_store().find_element_user(GETDEPLOYMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetDeployment" element
     */
    public void setGetDeployment(com.conferma.cpapi.GetDeploymentDocument.GetDeployment getDeployment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetDeploymentDocument.GetDeployment target = null;
            target = (com.conferma.cpapi.GetDeploymentDocument.GetDeployment)get_store().find_element_user(GETDEPLOYMENT$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.GetDeploymentDocument.GetDeployment)get_store().add_element_user(GETDEPLOYMENT$0);
            }
            target.set(getDeployment);
        }
    }
    
    /**
     * Appends and returns a new empty "GetDeployment" element
     */
    public com.conferma.cpapi.GetDeploymentDocument.GetDeployment addNewGetDeployment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetDeploymentDocument.GetDeployment target = null;
            target = (com.conferma.cpapi.GetDeploymentDocument.GetDeployment)get_store().add_element_user(GETDEPLOYMENT$0);
            return target;
        }
    }
    /**
     * An XML GetDeployment(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class GetDeploymentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetDeploymentDocument.GetDeployment
    {
        
        public GetDeploymentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETDEPLOYMENTREQUEST$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GetDeploymentRequest");
        
        
        /**
         * Gets the "GetDeploymentRequest" element
         */
        public com.conferma.cpapi.GetDeploymentRequest getGetDeploymentRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.GetDeploymentRequest target = null;
                target = (com.conferma.cpapi.GetDeploymentRequest)get_store().find_element_user(GETDEPLOYMENTREQUEST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetDeploymentRequest" element
         */
        public boolean isSetGetDeploymentRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETDEPLOYMENTREQUEST$0) != 0;
            }
        }
        
        /**
         * Sets the "GetDeploymentRequest" element
         */
        public void setGetDeploymentRequest(com.conferma.cpapi.GetDeploymentRequest getDeploymentRequest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.GetDeploymentRequest target = null;
                target = (com.conferma.cpapi.GetDeploymentRequest)get_store().find_element_user(GETDEPLOYMENTREQUEST$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.GetDeploymentRequest)get_store().add_element_user(GETDEPLOYMENTREQUEST$0);
                }
                target.set(getDeploymentRequest);
            }
        }
        
        /**
         * Appends and returns a new empty "GetDeploymentRequest" element
         */
        public com.conferma.cpapi.GetDeploymentRequest addNewGetDeploymentRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.GetDeploymentRequest target = null;
                target = (com.conferma.cpapi.GetDeploymentRequest)get_store().add_element_user(GETDEPLOYMENTREQUEST$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetDeploymentRequest" element
         */
        public void unsetGetDeploymentRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETDEPLOYMENTREQUEST$0, 0);
            }
        }
    }
}
