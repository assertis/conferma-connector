/*
 * An XML document type.
 * Localname: SendSchedule
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.SendScheduleDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one SendSchedule(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class SendScheduleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.SendScheduleDocument
{
    
    public SendScheduleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDSCHEDULE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "SendSchedule");
    
    
    /**
     * Gets the "SendSchedule" element
     */
    public com.conferma.cpapi.SendScheduleDocument.SendSchedule getSendSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.SendScheduleDocument.SendSchedule target = null;
            target = (com.conferma.cpapi.SendScheduleDocument.SendSchedule)get_store().find_element_user(SENDSCHEDULE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SendSchedule" element
     */
    public void setSendSchedule(com.conferma.cpapi.SendScheduleDocument.SendSchedule sendSchedule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.SendScheduleDocument.SendSchedule target = null;
            target = (com.conferma.cpapi.SendScheduleDocument.SendSchedule)get_store().find_element_user(SENDSCHEDULE$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.SendScheduleDocument.SendSchedule)get_store().add_element_user(SENDSCHEDULE$0);
            }
            target.set(sendSchedule);
        }
    }
    
    /**
     * Appends and returns a new empty "SendSchedule" element
     */
    public com.conferma.cpapi.SendScheduleDocument.SendSchedule addNewSendSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.SendScheduleDocument.SendSchedule target = null;
            target = (com.conferma.cpapi.SendScheduleDocument.SendSchedule)get_store().add_element_user(SENDSCHEDULE$0);
            return target;
        }
    }
    /**
     * An XML SendSchedule(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class SendScheduleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.SendScheduleDocument.SendSchedule
    {
        
        public SendScheduleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUEST$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Request");
        
        
        /**
         * Gets the "Request" element
         */
        public com.conferma.cpapi.SendScheduleRequest getRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.SendScheduleRequest target = null;
                target = (com.conferma.cpapi.SendScheduleRequest)get_store().find_element_user(REQUEST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Request" element
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
         * Sets the "Request" element
         */
        public void setRequest(com.conferma.cpapi.SendScheduleRequest request)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.SendScheduleRequest target = null;
                target = (com.conferma.cpapi.SendScheduleRequest)get_store().find_element_user(REQUEST$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.SendScheduleRequest)get_store().add_element_user(REQUEST$0);
                }
                target.set(request);
            }
        }
        
        /**
         * Appends and returns a new empty "Request" element
         */
        public com.conferma.cpapi.SendScheduleRequest addNewRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.SendScheduleRequest target = null;
                target = (com.conferma.cpapi.SendScheduleRequest)get_store().add_element_user(REQUEST$0);
                return target;
            }
        }
        
        /**
         * Unsets the "Request" element
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
