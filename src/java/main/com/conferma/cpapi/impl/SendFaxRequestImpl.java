/*
 * XML Type:  SendFaxRequest
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.SendFaxRequest
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML SendFaxRequest(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class SendFaxRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.SendFaxRequest
{
    
    public SendFaxRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FAXINSTRUCTION$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "FaxInstruction");
    
    
    /**
     * Gets the "FaxInstruction" element
     */
    public com.conferma.cpapi.FaxInstruction getFaxInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.FaxInstruction target = null;
            target = (com.conferma.cpapi.FaxInstruction)get_store().find_element_user(FAXINSTRUCTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "FaxInstruction" element
     */
    public boolean isSetFaxInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAXINSTRUCTION$0) != 0;
        }
    }
    
    /**
     * Sets the "FaxInstruction" element
     */
    public void setFaxInstruction(com.conferma.cpapi.FaxInstruction faxInstruction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.FaxInstruction target = null;
            target = (com.conferma.cpapi.FaxInstruction)get_store().find_element_user(FAXINSTRUCTION$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.FaxInstruction)get_store().add_element_user(FAXINSTRUCTION$0);
            }
            target.set(faxInstruction);
        }
    }
    
    /**
     * Appends and returns a new empty "FaxInstruction" element
     */
    public com.conferma.cpapi.FaxInstruction addNewFaxInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.FaxInstruction target = null;
            target = (com.conferma.cpapi.FaxInstruction)get_store().add_element_user(FAXINSTRUCTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "FaxInstruction" element
     */
    public void unsetFaxInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAXINSTRUCTION$0, 0);
        }
    }
}
