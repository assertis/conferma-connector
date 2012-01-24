/*
 * An XML document type.
 * Localname: ConfermaUserStateHeader
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.ConfermaUserStateHeaderDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one ConfermaUserStateHeader(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class ConfermaUserStateHeaderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.ConfermaUserStateHeaderDocument
{
    
    public ConfermaUserStateHeaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFERMAUSERSTATEHEADER$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "ConfermaUserStateHeader");
    
    
    /**
     * Gets the "ConfermaUserStateHeader" element
     */
    public com.conferma.cpapi.ConfermaUserStateHeader getConfermaUserStateHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ConfermaUserStateHeader target = null;
            target = (com.conferma.cpapi.ConfermaUserStateHeader)get_store().find_element_user(CONFERMAUSERSTATEHEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConfermaUserStateHeader" element
     */
    public void setConfermaUserStateHeader(com.conferma.cpapi.ConfermaUserStateHeader confermaUserStateHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ConfermaUserStateHeader target = null;
            target = (com.conferma.cpapi.ConfermaUserStateHeader)get_store().find_element_user(CONFERMAUSERSTATEHEADER$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.ConfermaUserStateHeader)get_store().add_element_user(CONFERMAUSERSTATEHEADER$0);
            }
            target.set(confermaUserStateHeader);
        }
    }
    
    /**
     * Appends and returns a new empty "ConfermaUserStateHeader" element
     */
    public com.conferma.cpapi.ConfermaUserStateHeader addNewConfermaUserStateHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ConfermaUserStateHeader target = null;
            target = (com.conferma.cpapi.ConfermaUserStateHeader)get_store().add_element_user(CONFERMAUSERSTATEHEADER$0);
            return target;
        }
    }
}
