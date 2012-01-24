/*
 * An XML document type.
 * Localname: CreatePaymentResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.CreatePaymentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one CreatePaymentResponse(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class CreatePaymentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.CreatePaymentResponseDocument
{
    
    public CreatePaymentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEPAYMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "CreatePaymentResponse");
    
    
    /**
     * Gets the "CreatePaymentResponse" element
     */
    public com.conferma.cpapi.CreatePaymentResponseDocument.CreatePaymentResponse getCreatePaymentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CreatePaymentResponseDocument.CreatePaymentResponse target = null;
            target = (com.conferma.cpapi.CreatePaymentResponseDocument.CreatePaymentResponse)get_store().find_element_user(CREATEPAYMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreatePaymentResponse" element
     */
    public void setCreatePaymentResponse(com.conferma.cpapi.CreatePaymentResponseDocument.CreatePaymentResponse createPaymentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CreatePaymentResponseDocument.CreatePaymentResponse target = null;
            target = (com.conferma.cpapi.CreatePaymentResponseDocument.CreatePaymentResponse)get_store().find_element_user(CREATEPAYMENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.CreatePaymentResponseDocument.CreatePaymentResponse)get_store().add_element_user(CREATEPAYMENTRESPONSE$0);
            }
            target.set(createPaymentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreatePaymentResponse" element
     */
    public com.conferma.cpapi.CreatePaymentResponseDocument.CreatePaymentResponse addNewCreatePaymentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CreatePaymentResponseDocument.CreatePaymentResponse target = null;
            target = (com.conferma.cpapi.CreatePaymentResponseDocument.CreatePaymentResponse)get_store().add_element_user(CREATEPAYMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreatePaymentResponse(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class CreatePaymentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.CreatePaymentResponseDocument.CreatePaymentResponse
    {
        
        public CreatePaymentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CREATEPAYMENTRESULT$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "CreatePaymentResult");
        
        
        /**
         * Gets the "CreatePaymentResult" element
         */
        public com.conferma.cpapi.CreatePaymentResponse getCreatePaymentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.CreatePaymentResponse target = null;
                target = (com.conferma.cpapi.CreatePaymentResponse)get_store().find_element_user(CREATEPAYMENTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "CreatePaymentResult" element
         */
        public boolean isSetCreatePaymentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CREATEPAYMENTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "CreatePaymentResult" element
         */
        public void setCreatePaymentResult(com.conferma.cpapi.CreatePaymentResponse createPaymentResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.CreatePaymentResponse target = null;
                target = (com.conferma.cpapi.CreatePaymentResponse)get_store().find_element_user(CREATEPAYMENTRESULT$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.CreatePaymentResponse)get_store().add_element_user(CREATEPAYMENTRESULT$0);
                }
                target.set(createPaymentResult);
            }
        }
        
        /**
         * Appends and returns a new empty "CreatePaymentResult" element
         */
        public com.conferma.cpapi.CreatePaymentResponse addNewCreatePaymentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.CreatePaymentResponse target = null;
                target = (com.conferma.cpapi.CreatePaymentResponse)get_store().add_element_user(CREATEPAYMENTRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "CreatePaymentResult" element
         */
        public void unsetCreatePaymentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CREATEPAYMENTRESULT$0, 0);
            }
        }
    }
}
