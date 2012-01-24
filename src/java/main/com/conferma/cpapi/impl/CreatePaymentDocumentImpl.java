/*
 * An XML document type.
 * Localname: CreatePayment
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.CreatePaymentDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one CreatePayment(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class CreatePaymentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.CreatePaymentDocument
{
    
    public CreatePaymentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEPAYMENT$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "CreatePayment");
    
    
    /**
     * Gets the "CreatePayment" element
     */
    public com.conferma.cpapi.CreatePaymentDocument.CreatePayment getCreatePayment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CreatePaymentDocument.CreatePayment target = null;
            target = (com.conferma.cpapi.CreatePaymentDocument.CreatePayment)get_store().find_element_user(CREATEPAYMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreatePayment" element
     */
    public void setCreatePayment(com.conferma.cpapi.CreatePaymentDocument.CreatePayment createPayment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CreatePaymentDocument.CreatePayment target = null;
            target = (com.conferma.cpapi.CreatePaymentDocument.CreatePayment)get_store().find_element_user(CREATEPAYMENT$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.CreatePaymentDocument.CreatePayment)get_store().add_element_user(CREATEPAYMENT$0);
            }
            target.set(createPayment);
        }
    }
    
    /**
     * Appends and returns a new empty "CreatePayment" element
     */
    public com.conferma.cpapi.CreatePaymentDocument.CreatePayment addNewCreatePayment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CreatePaymentDocument.CreatePayment target = null;
            target = (com.conferma.cpapi.CreatePaymentDocument.CreatePayment)get_store().add_element_user(CREATEPAYMENT$0);
            return target;
        }
    }
    /**
     * An XML CreatePayment(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class CreatePaymentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.CreatePaymentDocument.CreatePayment
    {
        
        public CreatePaymentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CREATEPAYMENTREQUEST$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "CreatePaymentRequest");
        
        
        /**
         * Gets the "CreatePaymentRequest" element
         */
        public com.conferma.cpapi.CreatePaymentRequest getCreatePaymentRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.CreatePaymentRequest target = null;
                target = (com.conferma.cpapi.CreatePaymentRequest)get_store().find_element_user(CREATEPAYMENTREQUEST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "CreatePaymentRequest" element
         */
        public boolean isSetCreatePaymentRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CREATEPAYMENTREQUEST$0) != 0;
            }
        }
        
        /**
         * Sets the "CreatePaymentRequest" element
         */
        public void setCreatePaymentRequest(com.conferma.cpapi.CreatePaymentRequest createPaymentRequest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.CreatePaymentRequest target = null;
                target = (com.conferma.cpapi.CreatePaymentRequest)get_store().find_element_user(CREATEPAYMENTREQUEST$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.CreatePaymentRequest)get_store().add_element_user(CREATEPAYMENTREQUEST$0);
                }
                target.set(createPaymentRequest);
            }
        }
        
        /**
         * Appends and returns a new empty "CreatePaymentRequest" element
         */
        public com.conferma.cpapi.CreatePaymentRequest addNewCreatePaymentRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.CreatePaymentRequest target = null;
                target = (com.conferma.cpapi.CreatePaymentRequest)get_store().add_element_user(CREATEPAYMENTREQUEST$0);
                return target;
            }
        }
        
        /**
         * Unsets the "CreatePaymentRequest" element
         */
        public void unsetCreatePaymentRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CREATEPAYMENTREQUEST$0, 0);
            }
        }
    }
}
