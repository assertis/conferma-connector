/*
 * XML Type:  AdvancedJourney
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.AdvancedJourney
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML AdvancedJourney(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class AdvancedJourneyImpl extends com.conferma.cpapi.impl.JourneyImpl implements com.conferma.cpapi.AdvancedJourney
{
    
    public AdvancedJourneyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATOR$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Operator");
    private static final javax.xml.namespace.QName TICKET$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Ticket");
    
    
    /**
     * Gets the "Operator" element
     */
    public com.conferma.cpapi.Operator getOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Operator target = null;
            target = (com.conferma.cpapi.Operator)get_store().find_element_user(OPERATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Operator" element
     */
    public boolean isSetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATOR$0) != 0;
        }
    }
    
    /**
     * Sets the "Operator" element
     */
    public void setOperator(com.conferma.cpapi.Operator operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Operator target = null;
            target = (com.conferma.cpapi.Operator)get_store().find_element_user(OPERATOR$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.Operator)get_store().add_element_user(OPERATOR$0);
            }
            target.set(operator);
        }
    }
    
    /**
     * Appends and returns a new empty "Operator" element
     */
    public com.conferma.cpapi.Operator addNewOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Operator target = null;
            target = (com.conferma.cpapi.Operator)get_store().add_element_user(OPERATOR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Operator" element
     */
    public void unsetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATOR$0, 0);
        }
    }
    
    /**
     * Gets the "Ticket" element
     */
    public com.conferma.cpapi.Ticket getTicket()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Ticket target = null;
            target = (com.conferma.cpapi.Ticket)get_store().find_element_user(TICKET$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Ticket" element
     */
    public boolean isSetTicket()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TICKET$2) != 0;
        }
    }
    
    /**
     * Sets the "Ticket" element
     */
    public void setTicket(com.conferma.cpapi.Ticket ticket)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Ticket target = null;
            target = (com.conferma.cpapi.Ticket)get_store().find_element_user(TICKET$2, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.Ticket)get_store().add_element_user(TICKET$2);
            }
            target.set(ticket);
        }
    }
    
    /**
     * Appends and returns a new empty "Ticket" element
     */
    public com.conferma.cpapi.Ticket addNewTicket()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Ticket target = null;
            target = (com.conferma.cpapi.Ticket)get_store().add_element_user(TICKET$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Ticket" element
     */
    public void unsetTicket()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TICKET$2, 0);
        }
    }
}
