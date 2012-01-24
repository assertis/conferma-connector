/*
 * An XML document type.
 * Localname: GetPayeeMessageHistory
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.GetPayeeMessageHistoryDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one GetPayeeMessageHistory(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class GetPayeeMessageHistoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetPayeeMessageHistoryDocument
{
    
    public GetPayeeMessageHistoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPAYEEMESSAGEHISTORY$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GetPayeeMessageHistory");
    
    
    /**
     * Gets the "GetPayeeMessageHistory" element
     */
    public com.conferma.cpapi.GetPayeeMessageHistoryDocument.GetPayeeMessageHistory getGetPayeeMessageHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetPayeeMessageHistoryDocument.GetPayeeMessageHistory target = null;
            target = (com.conferma.cpapi.GetPayeeMessageHistoryDocument.GetPayeeMessageHistory)get_store().find_element_user(GETPAYEEMESSAGEHISTORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetPayeeMessageHistory" element
     */
    public void setGetPayeeMessageHistory(com.conferma.cpapi.GetPayeeMessageHistoryDocument.GetPayeeMessageHistory getPayeeMessageHistory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetPayeeMessageHistoryDocument.GetPayeeMessageHistory target = null;
            target = (com.conferma.cpapi.GetPayeeMessageHistoryDocument.GetPayeeMessageHistory)get_store().find_element_user(GETPAYEEMESSAGEHISTORY$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.GetPayeeMessageHistoryDocument.GetPayeeMessageHistory)get_store().add_element_user(GETPAYEEMESSAGEHISTORY$0);
            }
            target.set(getPayeeMessageHistory);
        }
    }
    
    /**
     * Appends and returns a new empty "GetPayeeMessageHistory" element
     */
    public com.conferma.cpapi.GetPayeeMessageHistoryDocument.GetPayeeMessageHistory addNewGetPayeeMessageHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetPayeeMessageHistoryDocument.GetPayeeMessageHistory target = null;
            target = (com.conferma.cpapi.GetPayeeMessageHistoryDocument.GetPayeeMessageHistory)get_store().add_element_user(GETPAYEEMESSAGEHISTORY$0);
            return target;
        }
    }
    /**
     * An XML GetPayeeMessageHistory(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class GetPayeeMessageHistoryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetPayeeMessageHistoryDocument.GetPayeeMessageHistory
    {
        
        public GetPayeeMessageHistoryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETHISTORYREQUEST$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GetHistoryRequest");
        
        
        /**
         * Gets the "GetHistoryRequest" element
         */
        public com.conferma.cpapi.PayeeMessageHistoryRequest getGetHistoryRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.PayeeMessageHistoryRequest target = null;
                target = (com.conferma.cpapi.PayeeMessageHistoryRequest)get_store().find_element_user(GETHISTORYREQUEST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetHistoryRequest" element
         */
        public boolean isSetGetHistoryRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETHISTORYREQUEST$0) != 0;
            }
        }
        
        /**
         * Sets the "GetHistoryRequest" element
         */
        public void setGetHistoryRequest(com.conferma.cpapi.PayeeMessageHistoryRequest getHistoryRequest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.PayeeMessageHistoryRequest target = null;
                target = (com.conferma.cpapi.PayeeMessageHistoryRequest)get_store().find_element_user(GETHISTORYREQUEST$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.PayeeMessageHistoryRequest)get_store().add_element_user(GETHISTORYREQUEST$0);
                }
                target.set(getHistoryRequest);
            }
        }
        
        /**
         * Appends and returns a new empty "GetHistoryRequest" element
         */
        public com.conferma.cpapi.PayeeMessageHistoryRequest addNewGetHistoryRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.PayeeMessageHistoryRequest target = null;
                target = (com.conferma.cpapi.PayeeMessageHistoryRequest)get_store().add_element_user(GETHISTORYREQUEST$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetHistoryRequest" element
         */
        public void unsetGetHistoryRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETHISTORYREQUEST$0, 0);
            }
        }
    }
}
