/*
 * An XML document type.
 * Localname: GetPayeeMessageHistoryResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one GetPayeeMessageHistoryResponse(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class GetPayeeMessageHistoryResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument
{
    
    public GetPayeeMessageHistoryResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPAYEEMESSAGEHISTORYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GetPayeeMessageHistoryResponse");
    
    
    /**
     * Gets the "GetPayeeMessageHistoryResponse" element
     */
    public com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument.GetPayeeMessageHistoryResponse getGetPayeeMessageHistoryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument.GetPayeeMessageHistoryResponse target = null;
            target = (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument.GetPayeeMessageHistoryResponse)get_store().find_element_user(GETPAYEEMESSAGEHISTORYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetPayeeMessageHistoryResponse" element
     */
    public void setGetPayeeMessageHistoryResponse(com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument.GetPayeeMessageHistoryResponse getPayeeMessageHistoryResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument.GetPayeeMessageHistoryResponse target = null;
            target = (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument.GetPayeeMessageHistoryResponse)get_store().find_element_user(GETPAYEEMESSAGEHISTORYRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument.GetPayeeMessageHistoryResponse)get_store().add_element_user(GETPAYEEMESSAGEHISTORYRESPONSE$0);
            }
            target.set(getPayeeMessageHistoryResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetPayeeMessageHistoryResponse" element
     */
    public com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument.GetPayeeMessageHistoryResponse addNewGetPayeeMessageHistoryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument.GetPayeeMessageHistoryResponse target = null;
            target = (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument.GetPayeeMessageHistoryResponse)get_store().add_element_user(GETPAYEEMESSAGEHISTORYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetPayeeMessageHistoryResponse(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class GetPayeeMessageHistoryResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument.GetPayeeMessageHistoryResponse
    {
        
        public GetPayeeMessageHistoryResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETPAYEEMESSAGEHISTORYRESULT$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GetPayeeMessageHistoryResult");
        
        
        /**
         * Gets the "GetPayeeMessageHistoryResult" element
         */
        public com.conferma.cpapi.PayeeMessageHistoryResponse getGetPayeeMessageHistoryResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.PayeeMessageHistoryResponse target = null;
                target = (com.conferma.cpapi.PayeeMessageHistoryResponse)get_store().find_element_user(GETPAYEEMESSAGEHISTORYRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetPayeeMessageHistoryResult" element
         */
        public boolean isSetGetPayeeMessageHistoryResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETPAYEEMESSAGEHISTORYRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetPayeeMessageHistoryResult" element
         */
        public void setGetPayeeMessageHistoryResult(com.conferma.cpapi.PayeeMessageHistoryResponse getPayeeMessageHistoryResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.PayeeMessageHistoryResponse target = null;
                target = (com.conferma.cpapi.PayeeMessageHistoryResponse)get_store().find_element_user(GETPAYEEMESSAGEHISTORYRESULT$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.PayeeMessageHistoryResponse)get_store().add_element_user(GETPAYEEMESSAGEHISTORYRESULT$0);
                }
                target.set(getPayeeMessageHistoryResult);
            }
        }
        
        /**
         * Appends and returns a new empty "GetPayeeMessageHistoryResult" element
         */
        public com.conferma.cpapi.PayeeMessageHistoryResponse addNewGetPayeeMessageHistoryResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.PayeeMessageHistoryResponse target = null;
                target = (com.conferma.cpapi.PayeeMessageHistoryResponse)get_store().add_element_user(GETPAYEEMESSAGEHISTORYRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetPayeeMessageHistoryResult" element
         */
        public void unsetGetPayeeMessageHistoryResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETPAYEEMESSAGEHISTORYRESULT$0, 0);
            }
        }
    }
}
