/*
 * An XML document type.
 * Localname: SendFax
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.SendFaxDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one SendFax(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class SendFaxDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.SendFaxDocument
{
    
    public SendFaxDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDFAX$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "SendFax");
    
    
    /**
     * Gets the "SendFax" element
     */
    public com.conferma.cpapi.SendFaxDocument.SendFax getSendFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.SendFaxDocument.SendFax target = null;
            target = (com.conferma.cpapi.SendFaxDocument.SendFax)get_store().find_element_user(SENDFAX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SendFax" element
     */
    public void setSendFax(com.conferma.cpapi.SendFaxDocument.SendFax sendFax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.SendFaxDocument.SendFax target = null;
            target = (com.conferma.cpapi.SendFaxDocument.SendFax)get_store().find_element_user(SENDFAX$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.SendFaxDocument.SendFax)get_store().add_element_user(SENDFAX$0);
            }
            target.set(sendFax);
        }
    }
    
    /**
     * Appends and returns a new empty "SendFax" element
     */
    public com.conferma.cpapi.SendFaxDocument.SendFax addNewSendFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.SendFaxDocument.SendFax target = null;
            target = (com.conferma.cpapi.SendFaxDocument.SendFax)get_store().add_element_user(SENDFAX$0);
            return target;
        }
    }
    /**
     * An XML SendFax(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class SendFaxImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.SendFaxDocument.SendFax
    {
        
        public SendFaxImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SENDFAXREQUEST$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "SendFaxRequest");
        
        
        /**
         * Gets the "SendFaxRequest" element
         */
        public com.conferma.cpapi.SendFaxRequest getSendFaxRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.SendFaxRequest target = null;
                target = (com.conferma.cpapi.SendFaxRequest)get_store().find_element_user(SENDFAXREQUEST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "SendFaxRequest" element
         */
        public boolean isSetSendFaxRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SENDFAXREQUEST$0) != 0;
            }
        }
        
        /**
         * Sets the "SendFaxRequest" element
         */
        public void setSendFaxRequest(com.conferma.cpapi.SendFaxRequest sendFaxRequest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.SendFaxRequest target = null;
                target = (com.conferma.cpapi.SendFaxRequest)get_store().find_element_user(SENDFAXREQUEST$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.SendFaxRequest)get_store().add_element_user(SENDFAXREQUEST$0);
                }
                target.set(sendFaxRequest);
            }
        }
        
        /**
         * Appends and returns a new empty "SendFaxRequest" element
         */
        public com.conferma.cpapi.SendFaxRequest addNewSendFaxRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.SendFaxRequest target = null;
                target = (com.conferma.cpapi.SendFaxRequest)get_store().add_element_user(SENDFAXREQUEST$0);
                return target;
            }
        }
        
        /**
         * Unsets the "SendFaxRequest" element
         */
        public void unsetSendFaxRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SENDFAXREQUEST$0, 0);
            }
        }
    }
}
