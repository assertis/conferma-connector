/*
 * An XML document type.
 * Localname: SendScheduleResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.SendScheduleResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one SendScheduleResponse(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class SendScheduleResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.SendScheduleResponseDocument
{
    
    public SendScheduleResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDSCHEDULERESPONSE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "SendScheduleResponse");
    
    
    /**
     * Gets the "SendScheduleResponse" element
     */
    public com.conferma.cpapi.SendScheduleResponseDocument.SendScheduleResponse getSendScheduleResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.SendScheduleResponseDocument.SendScheduleResponse target = null;
            target = (com.conferma.cpapi.SendScheduleResponseDocument.SendScheduleResponse)get_store().find_element_user(SENDSCHEDULERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SendScheduleResponse" element
     */
    public void setSendScheduleResponse(com.conferma.cpapi.SendScheduleResponseDocument.SendScheduleResponse sendScheduleResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.SendScheduleResponseDocument.SendScheduleResponse target = null;
            target = (com.conferma.cpapi.SendScheduleResponseDocument.SendScheduleResponse)get_store().find_element_user(SENDSCHEDULERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.SendScheduleResponseDocument.SendScheduleResponse)get_store().add_element_user(SENDSCHEDULERESPONSE$0);
            }
            target.set(sendScheduleResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SendScheduleResponse" element
     */
    public com.conferma.cpapi.SendScheduleResponseDocument.SendScheduleResponse addNewSendScheduleResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.SendScheduleResponseDocument.SendScheduleResponse target = null;
            target = (com.conferma.cpapi.SendScheduleResponseDocument.SendScheduleResponse)get_store().add_element_user(SENDSCHEDULERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML SendScheduleResponse(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class SendScheduleResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.SendScheduleResponseDocument.SendScheduleResponse
    {
        
        public SendScheduleResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SENDSCHEDULERESULT$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "SendScheduleResult");
        
        
        /**
         * Gets the "SendScheduleResult" element
         */
        public com.conferma.cpapi.SendMessageResponse getSendScheduleResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.SendMessageResponse target = null;
                target = (com.conferma.cpapi.SendMessageResponse)get_store().find_element_user(SENDSCHEDULERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "SendScheduleResult" element
         */
        public boolean isSetSendScheduleResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SENDSCHEDULERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "SendScheduleResult" element
         */
        public void setSendScheduleResult(com.conferma.cpapi.SendMessageResponse sendScheduleResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.SendMessageResponse target = null;
                target = (com.conferma.cpapi.SendMessageResponse)get_store().find_element_user(SENDSCHEDULERESULT$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.SendMessageResponse)get_store().add_element_user(SENDSCHEDULERESULT$0);
                }
                target.set(sendScheduleResult);
            }
        }
        
        /**
         * Appends and returns a new empty "SendScheduleResult" element
         */
        public com.conferma.cpapi.SendMessageResponse addNewSendScheduleResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.SendMessageResponse target = null;
                target = (com.conferma.cpapi.SendMessageResponse)get_store().add_element_user(SENDSCHEDULERESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "SendScheduleResult" element
         */
        public void unsetSendScheduleResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SENDSCHEDULERESULT$0, 0);
            }
        }
    }
}
