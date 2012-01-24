/*
 * XML Type:  Air
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.Air
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML Air(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class AirImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.Air
{
    
    public AirImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OUTBOUNDJOURNEY$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "OutboundJourney");
    private static final javax.xml.namespace.QName RETURNJOURNEY$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "ReturnJourney");
    
    
    /**
     * Gets the "OutboundJourney" element
     */
    public com.conferma.cpapi.Journey getOutboundJourney()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Journey target = null;
            target = (com.conferma.cpapi.Journey)get_store().find_element_user(OUTBOUNDJOURNEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OutboundJourney" element
     */
    public boolean isSetOutboundJourney()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTBOUNDJOURNEY$0) != 0;
        }
    }
    
    /**
     * Sets the "OutboundJourney" element
     */
    public void setOutboundJourney(com.conferma.cpapi.Journey outboundJourney)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Journey target = null;
            target = (com.conferma.cpapi.Journey)get_store().find_element_user(OUTBOUNDJOURNEY$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.Journey)get_store().add_element_user(OUTBOUNDJOURNEY$0);
            }
            target.set(outboundJourney);
        }
    }
    
    /**
     * Appends and returns a new empty "OutboundJourney" element
     */
    public com.conferma.cpapi.Journey addNewOutboundJourney()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Journey target = null;
            target = (com.conferma.cpapi.Journey)get_store().add_element_user(OUTBOUNDJOURNEY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "OutboundJourney" element
     */
    public void unsetOutboundJourney()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTBOUNDJOURNEY$0, 0);
        }
    }
    
    /**
     * Gets the "ReturnJourney" element
     */
    public com.conferma.cpapi.Journey getReturnJourney()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Journey target = null;
            target = (com.conferma.cpapi.Journey)get_store().find_element_user(RETURNJOURNEY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReturnJourney" element
     */
    public boolean isSetReturnJourney()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RETURNJOURNEY$2) != 0;
        }
    }
    
    /**
     * Sets the "ReturnJourney" element
     */
    public void setReturnJourney(com.conferma.cpapi.Journey returnJourney)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Journey target = null;
            target = (com.conferma.cpapi.Journey)get_store().find_element_user(RETURNJOURNEY$2, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.Journey)get_store().add_element_user(RETURNJOURNEY$2);
            }
            target.set(returnJourney);
        }
    }
    
    /**
     * Appends and returns a new empty "ReturnJourney" element
     */
    public com.conferma.cpapi.Journey addNewReturnJourney()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Journey target = null;
            target = (com.conferma.cpapi.Journey)get_store().add_element_user(RETURNJOURNEY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ReturnJourney" element
     */
    public void unsetReturnJourney()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RETURNJOURNEY$2, 0);
        }
    }
}
