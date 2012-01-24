/*
 * An XML document type.
 * Localname: GetMessageQueueResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.GetMessageQueueResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one GetMessageQueueResponse(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class GetMessageQueueResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetMessageQueueResponseDocument
{
    
    public GetMessageQueueResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMESSAGEQUEUERESPONSE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GetMessageQueueResponse");
    
    
    /**
     * Gets the "GetMessageQueueResponse" element
     */
    public com.conferma.cpapi.GetMessageQueueResponseDocument.GetMessageQueueResponse getGetMessageQueueResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetMessageQueueResponseDocument.GetMessageQueueResponse target = null;
            target = (com.conferma.cpapi.GetMessageQueueResponseDocument.GetMessageQueueResponse)get_store().find_element_user(GETMESSAGEQUEUERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetMessageQueueResponse" element
     */
    public void setGetMessageQueueResponse(com.conferma.cpapi.GetMessageQueueResponseDocument.GetMessageQueueResponse getMessageQueueResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetMessageQueueResponseDocument.GetMessageQueueResponse target = null;
            target = (com.conferma.cpapi.GetMessageQueueResponseDocument.GetMessageQueueResponse)get_store().find_element_user(GETMESSAGEQUEUERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.GetMessageQueueResponseDocument.GetMessageQueueResponse)get_store().add_element_user(GETMESSAGEQUEUERESPONSE$0);
            }
            target.set(getMessageQueueResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetMessageQueueResponse" element
     */
    public com.conferma.cpapi.GetMessageQueueResponseDocument.GetMessageQueueResponse addNewGetMessageQueueResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetMessageQueueResponseDocument.GetMessageQueueResponse target = null;
            target = (com.conferma.cpapi.GetMessageQueueResponseDocument.GetMessageQueueResponse)get_store().add_element_user(GETMESSAGEQUEUERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetMessageQueueResponse(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class GetMessageQueueResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetMessageQueueResponseDocument.GetMessageQueueResponse
    {
        
        public GetMessageQueueResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETMESSAGEQUEUERESULT$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GetMessageQueueResult");
        
        
        /**
         * Gets the "GetMessageQueueResult" element
         */
        public com.conferma.cpapi.GetMessageQueueResponse getGetMessageQueueResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.GetMessageQueueResponse target = null;
                target = (com.conferma.cpapi.GetMessageQueueResponse)get_store().find_element_user(GETMESSAGEQUEUERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetMessageQueueResult" element
         */
        public boolean isSetGetMessageQueueResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETMESSAGEQUEUERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetMessageQueueResult" element
         */
        public void setGetMessageQueueResult(com.conferma.cpapi.GetMessageQueueResponse getMessageQueueResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.GetMessageQueueResponse target = null;
                target = (com.conferma.cpapi.GetMessageQueueResponse)get_store().find_element_user(GETMESSAGEQUEUERESULT$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.GetMessageQueueResponse)get_store().add_element_user(GETMESSAGEQUEUERESULT$0);
                }
                target.set(getMessageQueueResult);
            }
        }
        
        /**
         * Appends and returns a new empty "GetMessageQueueResult" element
         */
        public com.conferma.cpapi.GetMessageQueueResponse addNewGetMessageQueueResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.GetMessageQueueResponse target = null;
                target = (com.conferma.cpapi.GetMessageQueueResponse)get_store().add_element_user(GETMESSAGEQUEUERESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetMessageQueueResult" element
         */
        public void unsetGetMessageQueueResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETMESSAGEQUEUERESULT$0, 0);
            }
        }
    }
}
