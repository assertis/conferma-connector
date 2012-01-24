/*
 * An XML document type.
 * Localname: ResendPaymentAuthorisationResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one ResendPaymentAuthorisationResponse(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class ResendPaymentAuthorisationResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument
{
    
    public ResendPaymentAuthorisationResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESENDPAYMENTAUTHORISATIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "ResendPaymentAuthorisationResponse");
    
    
    /**
     * Gets the "ResendPaymentAuthorisationResponse" element
     */
    public com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument.ResendPaymentAuthorisationResponse getResendPaymentAuthorisationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument.ResendPaymentAuthorisationResponse target = null;
            target = (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument.ResendPaymentAuthorisationResponse)get_store().find_element_user(RESENDPAYMENTAUTHORISATIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ResendPaymentAuthorisationResponse" element
     */
    public void setResendPaymentAuthorisationResponse(com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument.ResendPaymentAuthorisationResponse resendPaymentAuthorisationResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument.ResendPaymentAuthorisationResponse target = null;
            target = (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument.ResendPaymentAuthorisationResponse)get_store().find_element_user(RESENDPAYMENTAUTHORISATIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument.ResendPaymentAuthorisationResponse)get_store().add_element_user(RESENDPAYMENTAUTHORISATIONRESPONSE$0);
            }
            target.set(resendPaymentAuthorisationResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ResendPaymentAuthorisationResponse" element
     */
    public com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument.ResendPaymentAuthorisationResponse addNewResendPaymentAuthorisationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument.ResendPaymentAuthorisationResponse target = null;
            target = (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument.ResendPaymentAuthorisationResponse)get_store().add_element_user(RESENDPAYMENTAUTHORISATIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ResendPaymentAuthorisationResponse(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class ResendPaymentAuthorisationResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument.ResendPaymentAuthorisationResponse
    {
        
        public ResendPaymentAuthorisationResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESENDPAYMENTAUTHORISATIONRESULT$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "ResendPaymentAuthorisationResult");
        
        
        /**
         * Gets the "ResendPaymentAuthorisationResult" element
         */
        public com.conferma.cpapi.SendMessageResponse getResendPaymentAuthorisationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.SendMessageResponse target = null;
                target = (com.conferma.cpapi.SendMessageResponse)get_store().find_element_user(RESENDPAYMENTAUTHORISATIONRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ResendPaymentAuthorisationResult" element
         */
        public boolean isSetResendPaymentAuthorisationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESENDPAYMENTAUTHORISATIONRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "ResendPaymentAuthorisationResult" element
         */
        public void setResendPaymentAuthorisationResult(com.conferma.cpapi.SendMessageResponse resendPaymentAuthorisationResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.SendMessageResponse target = null;
                target = (com.conferma.cpapi.SendMessageResponse)get_store().find_element_user(RESENDPAYMENTAUTHORISATIONRESULT$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.SendMessageResponse)get_store().add_element_user(RESENDPAYMENTAUTHORISATIONRESULT$0);
                }
                target.set(resendPaymentAuthorisationResult);
            }
        }
        
        /**
         * Appends and returns a new empty "ResendPaymentAuthorisationResult" element
         */
        public com.conferma.cpapi.SendMessageResponse addNewResendPaymentAuthorisationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.SendMessageResponse target = null;
                target = (com.conferma.cpapi.SendMessageResponse)get_store().add_element_user(RESENDPAYMENTAUTHORISATIONRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "ResendPaymentAuthorisationResult" element
         */
        public void unsetResendPaymentAuthorisationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESENDPAYMENTAUTHORISATIONRESULT$0, 0);
            }
        }
    }
}
