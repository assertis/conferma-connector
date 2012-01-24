/*
 * An XML document type.
 * Localname: CreatePayee
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.CreatePayeeDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one CreatePayee(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class CreatePayeeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.CreatePayeeDocument
{
    
    public CreatePayeeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEPAYEE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "CreatePayee");
    
    
    /**
     * Gets the "CreatePayee" element
     */
    public com.conferma.cpapi.CreatePayeeDocument.CreatePayee getCreatePayee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CreatePayeeDocument.CreatePayee target = null;
            target = (com.conferma.cpapi.CreatePayeeDocument.CreatePayee)get_store().find_element_user(CREATEPAYEE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreatePayee" element
     */
    public void setCreatePayee(com.conferma.cpapi.CreatePayeeDocument.CreatePayee createPayee)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CreatePayeeDocument.CreatePayee target = null;
            target = (com.conferma.cpapi.CreatePayeeDocument.CreatePayee)get_store().find_element_user(CREATEPAYEE$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.CreatePayeeDocument.CreatePayee)get_store().add_element_user(CREATEPAYEE$0);
            }
            target.set(createPayee);
        }
    }
    
    /**
     * Appends and returns a new empty "CreatePayee" element
     */
    public com.conferma.cpapi.CreatePayeeDocument.CreatePayee addNewCreatePayee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CreatePayeeDocument.CreatePayee target = null;
            target = (com.conferma.cpapi.CreatePayeeDocument.CreatePayee)get_store().add_element_user(CREATEPAYEE$0);
            return target;
        }
    }
    /**
     * An XML CreatePayee(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class CreatePayeeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.CreatePayeeDocument.CreatePayee
    {
        
        public CreatePayeeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CREATEPAYEEREQUEST$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "CreatePayeeRequest");
        
        
        /**
         * Gets the "CreatePayeeRequest" element
         */
        public com.conferma.cpapi.CreatePayeeRequest getCreatePayeeRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.CreatePayeeRequest target = null;
                target = (com.conferma.cpapi.CreatePayeeRequest)get_store().find_element_user(CREATEPAYEEREQUEST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "CreatePayeeRequest" element
         */
        public boolean isSetCreatePayeeRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CREATEPAYEEREQUEST$0) != 0;
            }
        }
        
        /**
         * Sets the "CreatePayeeRequest" element
         */
        public void setCreatePayeeRequest(com.conferma.cpapi.CreatePayeeRequest createPayeeRequest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.CreatePayeeRequest target = null;
                target = (com.conferma.cpapi.CreatePayeeRequest)get_store().find_element_user(CREATEPAYEEREQUEST$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.CreatePayeeRequest)get_store().add_element_user(CREATEPAYEEREQUEST$0);
                }
                target.set(createPayeeRequest);
            }
        }
        
        /**
         * Appends and returns a new empty "CreatePayeeRequest" element
         */
        public com.conferma.cpapi.CreatePayeeRequest addNewCreatePayeeRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.CreatePayeeRequest target = null;
                target = (com.conferma.cpapi.CreatePayeeRequest)get_store().add_element_user(CREATEPAYEEREQUEST$0);
                return target;
            }
        }
        
        /**
         * Unsets the "CreatePayeeRequest" element
         */
        public void unsetCreatePayeeRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CREATEPAYEEREQUEST$0, 0);
            }
        }
    }
}
