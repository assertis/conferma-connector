/*
 * An XML document type.
 * Localname: AmendPayment
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.AmendPaymentDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one AmendPayment(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class AmendPaymentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.AmendPaymentDocument
{
    
    public AmendPaymentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AMENDPAYMENT$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "AmendPayment");
    
    
    /**
     * Gets the "AmendPayment" element
     */
    public com.conferma.cpapi.AmendPaymentDocument.AmendPayment getAmendPayment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.AmendPaymentDocument.AmendPayment target = null;
            target = (com.conferma.cpapi.AmendPaymentDocument.AmendPayment)get_store().find_element_user(AMENDPAYMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AmendPayment" element
     */
    public void setAmendPayment(com.conferma.cpapi.AmendPaymentDocument.AmendPayment amendPayment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.AmendPaymentDocument.AmendPayment target = null;
            target = (com.conferma.cpapi.AmendPaymentDocument.AmendPayment)get_store().find_element_user(AMENDPAYMENT$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.AmendPaymentDocument.AmendPayment)get_store().add_element_user(AMENDPAYMENT$0);
            }
            target.set(amendPayment);
        }
    }
    
    /**
     * Appends and returns a new empty "AmendPayment" element
     */
    public com.conferma.cpapi.AmendPaymentDocument.AmendPayment addNewAmendPayment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.AmendPaymentDocument.AmendPayment target = null;
            target = (com.conferma.cpapi.AmendPaymentDocument.AmendPayment)get_store().add_element_user(AMENDPAYMENT$0);
            return target;
        }
    }
    /**
     * An XML AmendPayment(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class AmendPaymentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.AmendPaymentDocument.AmendPayment
    {
        
        public AmendPaymentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AMENDPAYMENTREQUEST$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "AmendPaymentRequest");
        
        
        /**
         * Gets the "AmendPaymentRequest" element
         */
        public com.conferma.cpapi.AmendPaymentRequest getAmendPaymentRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.AmendPaymentRequest target = null;
                target = (com.conferma.cpapi.AmendPaymentRequest)get_store().find_element_user(AMENDPAYMENTREQUEST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "AmendPaymentRequest" element
         */
        public boolean isSetAmendPaymentRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AMENDPAYMENTREQUEST$0) != 0;
            }
        }
        
        /**
         * Sets the "AmendPaymentRequest" element
         */
        public void setAmendPaymentRequest(com.conferma.cpapi.AmendPaymentRequest amendPaymentRequest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.AmendPaymentRequest target = null;
                target = (com.conferma.cpapi.AmendPaymentRequest)get_store().find_element_user(AMENDPAYMENTREQUEST$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.AmendPaymentRequest)get_store().add_element_user(AMENDPAYMENTREQUEST$0);
                }
                target.set(amendPaymentRequest);
            }
        }
        
        /**
         * Appends and returns a new empty "AmendPaymentRequest" element
         */
        public com.conferma.cpapi.AmendPaymentRequest addNewAmendPaymentRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.AmendPaymentRequest target = null;
                target = (com.conferma.cpapi.AmendPaymentRequest)get_store().add_element_user(AMENDPAYMENTREQUEST$0);
                return target;
            }
        }
        
        /**
         * Unsets the "AmendPaymentRequest" element
         */
        public void unsetAmendPaymentRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AMENDPAYMENTREQUEST$0, 0);
            }
        }
    }
}
