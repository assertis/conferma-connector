/*
 * XML Type:  ConfermaUserStateHeader
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.ConfermaUserStateHeader
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML ConfermaUserStateHeader(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class ConfermaUserStateHeaderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.ConfermaUserStateHeader
{
    
    public ConfermaUserStateHeaderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENTID$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "AgentID");
    private static final javax.xml.namespace.QName CLIENTID$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "ClientID");
    private static final javax.xml.namespace.QName BOOKERID$4 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "BookerID");
    private static final javax.xml.namespace.QName GUESTIDS$6 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GuestIDs");
    private static final javax.xml.namespace.QName CONSUMERACCOUNTCODE$8 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "ConsumerAccountCode");
    
    
    /**
     * Gets the "AgentID" element
     */
    public java.lang.String getAgentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AgentID" element
     */
    public org.apache.xmlbeans.XmlString xgetAgentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGENTID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AgentID" element
     */
    public boolean isSetAgentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGENTID$0) != 0;
        }
    }
    
    /**
     * Sets the "AgentID" element
     */
    public void setAgentID(java.lang.String agentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGENTID$0);
            }
            target.setStringValue(agentID);
        }
    }
    
    /**
     * Sets (as xml) the "AgentID" element
     */
    public void xsetAgentID(org.apache.xmlbeans.XmlString agentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AGENTID$0);
            }
            target.set(agentID);
        }
    }
    
    /**
     * Unsets the "AgentID" element
     */
    public void unsetAgentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGENTID$0, 0);
        }
    }
    
    /**
     * Gets the "ClientID" element
     */
    public java.lang.String getClientID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ClientID" element
     */
    public org.apache.xmlbeans.XmlString xgetClientID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENTID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ClientID" element
     */
    public boolean isSetClientID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLIENTID$2) != 0;
        }
    }
    
    /**
     * Sets the "ClientID" element
     */
    public void setClientID(java.lang.String clientID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIENTID$2);
            }
            target.setStringValue(clientID);
        }
    }
    
    /**
     * Sets (as xml) the "ClientID" element
     */
    public void xsetClientID(org.apache.xmlbeans.XmlString clientID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLIENTID$2);
            }
            target.set(clientID);
        }
    }
    
    /**
     * Unsets the "ClientID" element
     */
    public void unsetClientID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLIENTID$2, 0);
        }
    }
    
    /**
     * Gets the "BookerID" element
     */
    public java.lang.String getBookerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOKERID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BookerID" element
     */
    public org.apache.xmlbeans.XmlString xgetBookerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOOKERID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "BookerID" element
     */
    public boolean isSetBookerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOKERID$4) != 0;
        }
    }
    
    /**
     * Sets the "BookerID" element
     */
    public void setBookerID(java.lang.String bookerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOKERID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOKERID$4);
            }
            target.setStringValue(bookerID);
        }
    }
    
    /**
     * Sets (as xml) the "BookerID" element
     */
    public void xsetBookerID(org.apache.xmlbeans.XmlString bookerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOOKERID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BOOKERID$4);
            }
            target.set(bookerID);
        }
    }
    
    /**
     * Unsets the "BookerID" element
     */
    public void unsetBookerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOKERID$4, 0);
        }
    }
    
    /**
     * Gets the "GuestIDs" element
     */
    public com.conferma.cpapi.ArrayOfString getGuestIDs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfString target = null;
            target = (com.conferma.cpapi.ArrayOfString)get_store().find_element_user(GUESTIDS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GuestIDs" element
     */
    public boolean isSetGuestIDs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GUESTIDS$6) != 0;
        }
    }
    
    /**
     * Sets the "GuestIDs" element
     */
    public void setGuestIDs(com.conferma.cpapi.ArrayOfString guestIDs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfString target = null;
            target = (com.conferma.cpapi.ArrayOfString)get_store().find_element_user(GUESTIDS$6, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.ArrayOfString)get_store().add_element_user(GUESTIDS$6);
            }
            target.set(guestIDs);
        }
    }
    
    /**
     * Appends and returns a new empty "GuestIDs" element
     */
    public com.conferma.cpapi.ArrayOfString addNewGuestIDs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfString target = null;
            target = (com.conferma.cpapi.ArrayOfString)get_store().add_element_user(GUESTIDS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "GuestIDs" element
     */
    public void unsetGuestIDs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GUESTIDS$6, 0);
        }
    }
    
    /**
     * Gets the "ConsumerAccountCode" element
     */
    public com.conferma.cpapi.ConsumerAccountCode getConsumerAccountCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ConsumerAccountCode target = null;
            target = (com.conferma.cpapi.ConsumerAccountCode)get_store().find_element_user(CONSUMERACCOUNTCODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ConsumerAccountCode" element
     */
    public boolean isSetConsumerAccountCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSUMERACCOUNTCODE$8) != 0;
        }
    }
    
    /**
     * Sets the "ConsumerAccountCode" element
     */
    public void setConsumerAccountCode(com.conferma.cpapi.ConsumerAccountCode consumerAccountCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ConsumerAccountCode target = null;
            target = (com.conferma.cpapi.ConsumerAccountCode)get_store().find_element_user(CONSUMERACCOUNTCODE$8, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.ConsumerAccountCode)get_store().add_element_user(CONSUMERACCOUNTCODE$8);
            }
            target.set(consumerAccountCode);
        }
    }
    
    /**
     * Appends and returns a new empty "ConsumerAccountCode" element
     */
    public com.conferma.cpapi.ConsumerAccountCode addNewConsumerAccountCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ConsumerAccountCode target = null;
            target = (com.conferma.cpapi.ConsumerAccountCode)get_store().add_element_user(CONSUMERACCOUNTCODE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "ConsumerAccountCode" element
     */
    public void unsetConsumerAccountCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSUMERACCOUNTCODE$8, 0);
        }
    }
}
