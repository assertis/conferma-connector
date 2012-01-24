/*
 * An XML document type.
 * Localname: SendFaxResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.SendFaxResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one SendFaxResponse(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class SendFaxResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.SendFaxResponseDocument
{
    
    public SendFaxResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDFAXRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "SendFaxResponse");
    
    
    /**
     * Gets the "SendFaxResponse" element
     */
    public com.conferma.cpapi.SendFaxResponseDocument.SendFaxResponse getSendFaxResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.SendFaxResponseDocument.SendFaxResponse target = null;
            target = (com.conferma.cpapi.SendFaxResponseDocument.SendFaxResponse)get_store().find_element_user(SENDFAXRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SendFaxResponse" element
     */
    public void setSendFaxResponse(com.conferma.cpapi.SendFaxResponseDocument.SendFaxResponse sendFaxResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.SendFaxResponseDocument.SendFaxResponse target = null;
            target = (com.conferma.cpapi.SendFaxResponseDocument.SendFaxResponse)get_store().find_element_user(SENDFAXRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.SendFaxResponseDocument.SendFaxResponse)get_store().add_element_user(SENDFAXRESPONSE$0);
            }
            target.set(sendFaxResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SendFaxResponse" element
     */
    public com.conferma.cpapi.SendFaxResponseDocument.SendFaxResponse addNewSendFaxResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.SendFaxResponseDocument.SendFaxResponse target = null;
            target = (com.conferma.cpapi.SendFaxResponseDocument.SendFaxResponse)get_store().add_element_user(SENDFAXRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML SendFaxResponse(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class SendFaxResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.SendFaxResponseDocument.SendFaxResponse
    {
        
        public SendFaxResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SENDFAXRESULT$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "SendFaxResult");
        
        
        /**
         * Gets the "SendFaxResult" element
         */
        public com.conferma.cpapi.SendFaxResponse getSendFaxResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.SendFaxResponse target = null;
                target = (com.conferma.cpapi.SendFaxResponse)get_store().find_element_user(SENDFAXRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "SendFaxResult" element
         */
        public boolean isSetSendFaxResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SENDFAXRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "SendFaxResult" element
         */
        public void setSendFaxResult(com.conferma.cpapi.SendFaxResponse sendFaxResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.SendFaxResponse target = null;
                target = (com.conferma.cpapi.SendFaxResponse)get_store().find_element_user(SENDFAXRESULT$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.SendFaxResponse)get_store().add_element_user(SENDFAXRESULT$0);
                }
                target.set(sendFaxResult);
            }
        }
        
        /**
         * Appends and returns a new empty "SendFaxResult" element
         */
        public com.conferma.cpapi.SendFaxResponse addNewSendFaxResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.SendFaxResponse target = null;
                target = (com.conferma.cpapi.SendFaxResponse)get_store().add_element_user(SENDFAXRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "SendFaxResult" element
         */
        public void unsetSendFaxResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SENDFAXRESULT$0, 0);
            }
        }
    }
}
