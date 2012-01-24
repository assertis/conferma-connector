/*
 * An XML document type.
 * Localname: Ping
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.PingDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one Ping(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class PingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.PingDocument
{
    
    public PingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PING$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Ping");
    
    
    /**
     * Gets the "Ping" element
     */
    public com.conferma.cpapi.PingDocument.Ping getPing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.PingDocument.Ping target = null;
            target = (com.conferma.cpapi.PingDocument.Ping)get_store().find_element_user(PING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Ping" element
     */
    public void setPing(com.conferma.cpapi.PingDocument.Ping ping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.PingDocument.Ping target = null;
            target = (com.conferma.cpapi.PingDocument.Ping)get_store().find_element_user(PING$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.PingDocument.Ping)get_store().add_element_user(PING$0);
            }
            target.set(ping);
        }
    }
    
    /**
     * Appends and returns a new empty "Ping" element
     */
    public com.conferma.cpapi.PingDocument.Ping addNewPing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.PingDocument.Ping target = null;
            target = (com.conferma.cpapi.PingDocument.Ping)get_store().add_element_user(PING$0);
            return target;
        }
    }
    /**
     * An XML Ping(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class PingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.PingDocument.Ping
    {
        
        public PingImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MESSAGE$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Message");
        
        
        /**
         * Gets the "Message" element
         */
        public java.lang.String getMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Message" element
         */
        public org.apache.xmlbeans.XmlString xgetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "Message" element
         */
        public boolean isSetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MESSAGE$0) != 0;
            }
        }
        
        /**
         * Sets the "Message" element
         */
        public void setMessage(java.lang.String message)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$0);
                }
                target.setStringValue(message);
            }
        }
        
        /**
         * Sets (as xml) the "Message" element
         */
        public void xsetMessage(org.apache.xmlbeans.XmlString message)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$0);
                }
                target.set(message);
            }
        }
        
        /**
         * Unsets the "Message" element
         */
        public void unsetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MESSAGE$0, 0);
            }
        }
    }
}
