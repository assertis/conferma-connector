/*
 * An XML document type.
 * Localname: AmendPaymentResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.AmendPaymentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one AmendPaymentResponse(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class AmendPaymentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.AmendPaymentResponseDocument
{
    
    public AmendPaymentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AMENDPAYMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "AmendPaymentResponse");
    
    
    /**
     * Gets the "AmendPaymentResponse" element
     */
    public com.conferma.cpapi.AmendPaymentResponseDocument.AmendPaymentResponse getAmendPaymentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.AmendPaymentResponseDocument.AmendPaymentResponse target = null;
            target = (com.conferma.cpapi.AmendPaymentResponseDocument.AmendPaymentResponse)get_store().find_element_user(AMENDPAYMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AmendPaymentResponse" element
     */
    public void setAmendPaymentResponse(com.conferma.cpapi.AmendPaymentResponseDocument.AmendPaymentResponse amendPaymentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.AmendPaymentResponseDocument.AmendPaymentResponse target = null;
            target = (com.conferma.cpapi.AmendPaymentResponseDocument.AmendPaymentResponse)get_store().find_element_user(AMENDPAYMENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.AmendPaymentResponseDocument.AmendPaymentResponse)get_store().add_element_user(AMENDPAYMENTRESPONSE$0);
            }
            target.set(amendPaymentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "AmendPaymentResponse" element
     */
    public com.conferma.cpapi.AmendPaymentResponseDocument.AmendPaymentResponse addNewAmendPaymentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.AmendPaymentResponseDocument.AmendPaymentResponse target = null;
            target = (com.conferma.cpapi.AmendPaymentResponseDocument.AmendPaymentResponse)get_store().add_element_user(AMENDPAYMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AmendPaymentResponse(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class AmendPaymentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.AmendPaymentResponseDocument.AmendPaymentResponse
    {
        
        public AmendPaymentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AMENDPAYMENTRESULT$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "AmendPaymentResult");
        
        
        /**
         * Gets the "AmendPaymentResult" element
         */
        public com.conferma.cpapi.AmendPaymentResponse getAmendPaymentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.AmendPaymentResponse target = null;
                target = (com.conferma.cpapi.AmendPaymentResponse)get_store().find_element_user(AMENDPAYMENTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "AmendPaymentResult" element
         */
        public boolean isSetAmendPaymentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AMENDPAYMENTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "AmendPaymentResult" element
         */
        public void setAmendPaymentResult(com.conferma.cpapi.AmendPaymentResponse amendPaymentResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.AmendPaymentResponse target = null;
                target = (com.conferma.cpapi.AmendPaymentResponse)get_store().find_element_user(AMENDPAYMENTRESULT$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.AmendPaymentResponse)get_store().add_element_user(AMENDPAYMENTRESULT$0);
                }
                target.set(amendPaymentResult);
            }
        }
        
        /**
         * Appends and returns a new empty "AmendPaymentResult" element
         */
        public com.conferma.cpapi.AmendPaymentResponse addNewAmendPaymentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.AmendPaymentResponse target = null;
                target = (com.conferma.cpapi.AmendPaymentResponse)get_store().add_element_user(AMENDPAYMENTRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "AmendPaymentResult" element
         */
        public void unsetAmendPaymentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AMENDPAYMENTRESULT$0, 0);
            }
        }
    }
}
