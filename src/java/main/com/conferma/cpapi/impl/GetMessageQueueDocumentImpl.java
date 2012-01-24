/*
 * An XML document type.
 * Localname: GetMessageQueue
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.GetMessageQueueDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one GetMessageQueue(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class GetMessageQueueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetMessageQueueDocument
{
    
    public GetMessageQueueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMESSAGEQUEUE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GetMessageQueue");
    
    
    /**
     * Gets the "GetMessageQueue" element
     */
    public com.conferma.cpapi.GetMessageQueueDocument.GetMessageQueue getGetMessageQueue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetMessageQueueDocument.GetMessageQueue target = null;
            target = (com.conferma.cpapi.GetMessageQueueDocument.GetMessageQueue)get_store().find_element_user(GETMESSAGEQUEUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetMessageQueue" element
     */
    public void setGetMessageQueue(com.conferma.cpapi.GetMessageQueueDocument.GetMessageQueue getMessageQueue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetMessageQueueDocument.GetMessageQueue target = null;
            target = (com.conferma.cpapi.GetMessageQueueDocument.GetMessageQueue)get_store().find_element_user(GETMESSAGEQUEUE$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.GetMessageQueueDocument.GetMessageQueue)get_store().add_element_user(GETMESSAGEQUEUE$0);
            }
            target.set(getMessageQueue);
        }
    }
    
    /**
     * Appends and returns a new empty "GetMessageQueue" element
     */
    public com.conferma.cpapi.GetMessageQueueDocument.GetMessageQueue addNewGetMessageQueue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetMessageQueueDocument.GetMessageQueue target = null;
            target = (com.conferma.cpapi.GetMessageQueueDocument.GetMessageQueue)get_store().add_element_user(GETMESSAGEQUEUE$0);
            return target;
        }
    }
    /**
     * An XML GetMessageQueue(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class GetMessageQueueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetMessageQueueDocument.GetMessageQueue
    {
        
        public GetMessageQueueImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETMESSAGEQUEUEREQUEST$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GetMessageQueueRequest");
        
        
        /**
         * Gets the "GetMessageQueueRequest" element
         */
        public com.conferma.cpapi.GetMessageQueueRequest getGetMessageQueueRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.GetMessageQueueRequest target = null;
                target = (com.conferma.cpapi.GetMessageQueueRequest)get_store().find_element_user(GETMESSAGEQUEUEREQUEST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetMessageQueueRequest" element
         */
        public boolean isSetGetMessageQueueRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETMESSAGEQUEUEREQUEST$0) != 0;
            }
        }
        
        /**
         * Sets the "GetMessageQueueRequest" element
         */
        public void setGetMessageQueueRequest(com.conferma.cpapi.GetMessageQueueRequest getMessageQueueRequest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.GetMessageQueueRequest target = null;
                target = (com.conferma.cpapi.GetMessageQueueRequest)get_store().find_element_user(GETMESSAGEQUEUEREQUEST$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.GetMessageQueueRequest)get_store().add_element_user(GETMESSAGEQUEUEREQUEST$0);
                }
                target.set(getMessageQueueRequest);
            }
        }
        
        /**
         * Appends and returns a new empty "GetMessageQueueRequest" element
         */
        public com.conferma.cpapi.GetMessageQueueRequest addNewGetMessageQueueRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.GetMessageQueueRequest target = null;
                target = (com.conferma.cpapi.GetMessageQueueRequest)get_store().add_element_user(GETMESSAGEQUEUEREQUEST$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetMessageQueueRequest" element
         */
        public void unsetGetMessageQueueRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETMESSAGEQUEUEREQUEST$0, 0);
            }
        }
    }
}
