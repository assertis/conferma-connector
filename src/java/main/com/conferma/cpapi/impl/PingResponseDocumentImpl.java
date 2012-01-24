/*
 * An XML document type.
 * Localname: PingResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.PingResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one PingResponse(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class PingResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.PingResponseDocument
{
    
    public PingResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PINGRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "PingResponse");
    
    
    /**
     * Gets the "PingResponse" element
     */
    public com.conferma.cpapi.PingResponseDocument.PingResponse getPingResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.PingResponseDocument.PingResponse target = null;
            target = (com.conferma.cpapi.PingResponseDocument.PingResponse)get_store().find_element_user(PINGRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PingResponse" element
     */
    public void setPingResponse(com.conferma.cpapi.PingResponseDocument.PingResponse pingResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.PingResponseDocument.PingResponse target = null;
            target = (com.conferma.cpapi.PingResponseDocument.PingResponse)get_store().find_element_user(PINGRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.PingResponseDocument.PingResponse)get_store().add_element_user(PINGRESPONSE$0);
            }
            target.set(pingResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "PingResponse" element
     */
    public com.conferma.cpapi.PingResponseDocument.PingResponse addNewPingResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.PingResponseDocument.PingResponse target = null;
            target = (com.conferma.cpapi.PingResponseDocument.PingResponse)get_store().add_element_user(PINGRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML PingResponse(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class PingResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.PingResponseDocument.PingResponse
    {
        
        public PingResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PINGRESULT$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "PingResult");
        
        
        /**
         * Gets the "PingResult" element
         */
        public java.lang.String getPingResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PINGRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PingResult" element
         */
        public org.apache.xmlbeans.XmlString xgetPingResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PINGRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "PingResult" element
         */
        public boolean isSetPingResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PINGRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "PingResult" element
         */
        public void setPingResult(java.lang.String pingResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PINGRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PINGRESULT$0);
                }
                target.setStringValue(pingResult);
            }
        }
        
        /**
         * Sets (as xml) the "PingResult" element
         */
        public void xsetPingResult(org.apache.xmlbeans.XmlString pingResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PINGRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PINGRESULT$0);
                }
                target.set(pingResult);
            }
        }
        
        /**
         * Unsets the "PingResult" element
         */
        public void unsetPingResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PINGRESULT$0, 0);
            }
        }
    }
}
