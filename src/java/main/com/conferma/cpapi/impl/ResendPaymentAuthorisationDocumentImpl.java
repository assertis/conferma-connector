/*
 * An XML document type.
 * Localname: ResendPaymentAuthorisation
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.ResendPaymentAuthorisationDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one ResendPaymentAuthorisation(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class ResendPaymentAuthorisationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.ResendPaymentAuthorisationDocument
{
    
    public ResendPaymentAuthorisationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESENDPAYMENTAUTHORISATION$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "ResendPaymentAuthorisation");
    
    
    /**
     * Gets the "ResendPaymentAuthorisation" element
     */
    public com.conferma.cpapi.ResendPaymentAuthorisationDocument.ResendPaymentAuthorisation getResendPaymentAuthorisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ResendPaymentAuthorisationDocument.ResendPaymentAuthorisation target = null;
            target = (com.conferma.cpapi.ResendPaymentAuthorisationDocument.ResendPaymentAuthorisation)get_store().find_element_user(RESENDPAYMENTAUTHORISATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ResendPaymentAuthorisation" element
     */
    public void setResendPaymentAuthorisation(com.conferma.cpapi.ResendPaymentAuthorisationDocument.ResendPaymentAuthorisation resendPaymentAuthorisation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ResendPaymentAuthorisationDocument.ResendPaymentAuthorisation target = null;
            target = (com.conferma.cpapi.ResendPaymentAuthorisationDocument.ResendPaymentAuthorisation)get_store().find_element_user(RESENDPAYMENTAUTHORISATION$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.ResendPaymentAuthorisationDocument.ResendPaymentAuthorisation)get_store().add_element_user(RESENDPAYMENTAUTHORISATION$0);
            }
            target.set(resendPaymentAuthorisation);
        }
    }
    
    /**
     * Appends and returns a new empty "ResendPaymentAuthorisation" element
     */
    public com.conferma.cpapi.ResendPaymentAuthorisationDocument.ResendPaymentAuthorisation addNewResendPaymentAuthorisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ResendPaymentAuthorisationDocument.ResendPaymentAuthorisation target = null;
            target = (com.conferma.cpapi.ResendPaymentAuthorisationDocument.ResendPaymentAuthorisation)get_store().add_element_user(RESENDPAYMENTAUTHORISATION$0);
            return target;
        }
    }
    /**
     * An XML ResendPaymentAuthorisation(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class ResendPaymentAuthorisationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.ResendPaymentAuthorisationDocument.ResendPaymentAuthorisation
    {
        
        public ResendPaymentAuthorisationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUEST$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "request");
        
        
        /**
         * Gets the "request" element
         */
        public com.conferma.cpapi.ResendPaymentAuthorisationRequest getRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.ResendPaymentAuthorisationRequest target = null;
                target = (com.conferma.cpapi.ResendPaymentAuthorisationRequest)get_store().find_element_user(REQUEST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "request" element
         */
        public boolean isSetRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUEST$0) != 0;
            }
        }
        
        /**
         * Sets the "request" element
         */
        public void setRequest(com.conferma.cpapi.ResendPaymentAuthorisationRequest request)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.ResendPaymentAuthorisationRequest target = null;
                target = (com.conferma.cpapi.ResendPaymentAuthorisationRequest)get_store().find_element_user(REQUEST$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.ResendPaymentAuthorisationRequest)get_store().add_element_user(REQUEST$0);
                }
                target.set(request);
            }
        }
        
        /**
         * Appends and returns a new empty "request" element
         */
        public com.conferma.cpapi.ResendPaymentAuthorisationRequest addNewRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.ResendPaymentAuthorisationRequest target = null;
                target = (com.conferma.cpapi.ResendPaymentAuthorisationRequest)get_store().add_element_user(REQUEST$0);
                return target;
            }
        }
        
        /**
         * Unsets the "request" element
         */
        public void unsetRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUEST$0, 0);
            }
        }
    }
}
