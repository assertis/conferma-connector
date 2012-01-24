/*
 * An XML document type.
 * Localname: CreatePayeeResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.CreatePayeeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one CreatePayeeResponse(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class CreatePayeeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.CreatePayeeResponseDocument
{
    
    public CreatePayeeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEPAYEERESPONSE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "CreatePayeeResponse");
    
    
    /**
     * Gets the "CreatePayeeResponse" element
     */
    public com.conferma.cpapi.CreatePayeeResponseDocument.CreatePayeeResponse getCreatePayeeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CreatePayeeResponseDocument.CreatePayeeResponse target = null;
            target = (com.conferma.cpapi.CreatePayeeResponseDocument.CreatePayeeResponse)get_store().find_element_user(CREATEPAYEERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreatePayeeResponse" element
     */
    public void setCreatePayeeResponse(com.conferma.cpapi.CreatePayeeResponseDocument.CreatePayeeResponse createPayeeResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CreatePayeeResponseDocument.CreatePayeeResponse target = null;
            target = (com.conferma.cpapi.CreatePayeeResponseDocument.CreatePayeeResponse)get_store().find_element_user(CREATEPAYEERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.CreatePayeeResponseDocument.CreatePayeeResponse)get_store().add_element_user(CREATEPAYEERESPONSE$0);
            }
            target.set(createPayeeResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreatePayeeResponse" element
     */
    public com.conferma.cpapi.CreatePayeeResponseDocument.CreatePayeeResponse addNewCreatePayeeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CreatePayeeResponseDocument.CreatePayeeResponse target = null;
            target = (com.conferma.cpapi.CreatePayeeResponseDocument.CreatePayeeResponse)get_store().add_element_user(CREATEPAYEERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreatePayeeResponse(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class CreatePayeeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.CreatePayeeResponseDocument.CreatePayeeResponse
    {
        
        public CreatePayeeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CREATEPAYEERESULT$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "CreatePayeeResult");
        
        
        /**
         * Gets the "CreatePayeeResult" element
         */
        public com.conferma.cpapi.CreatePayeeResponse getCreatePayeeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.CreatePayeeResponse target = null;
                target = (com.conferma.cpapi.CreatePayeeResponse)get_store().find_element_user(CREATEPAYEERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "CreatePayeeResult" element
         */
        public boolean isSetCreatePayeeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CREATEPAYEERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "CreatePayeeResult" element
         */
        public void setCreatePayeeResult(com.conferma.cpapi.CreatePayeeResponse createPayeeResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.CreatePayeeResponse target = null;
                target = (com.conferma.cpapi.CreatePayeeResponse)get_store().find_element_user(CREATEPAYEERESULT$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.CreatePayeeResponse)get_store().add_element_user(CREATEPAYEERESULT$0);
                }
                target.set(createPayeeResult);
            }
        }
        
        /**
         * Appends and returns a new empty "CreatePayeeResult" element
         */
        public com.conferma.cpapi.CreatePayeeResponse addNewCreatePayeeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.CreatePayeeResponse target = null;
                target = (com.conferma.cpapi.CreatePayeeResponse)get_store().add_element_user(CREATEPAYEERESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "CreatePayeeResult" element
         */
        public void unsetCreatePayeeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CREATEPAYEERESULT$0, 0);
            }
        }
    }
}
