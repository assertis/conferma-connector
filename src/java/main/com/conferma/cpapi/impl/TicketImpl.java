/*
 * XML Type:  Ticket
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.Ticket
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML Ticket(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class TicketImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.Ticket
{
    
    public TicketImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COST$0 = 
        new javax.xml.namespace.QName("", "Cost");
    private static final javax.xml.namespace.QName CLASS1$2 = 
        new javax.xml.namespace.QName("", "Class");
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("", "Description");
    
    
    /**
     * Gets the "Cost" attribute
     */
    public java.lang.String getCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COST$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Cost" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COST$0);
            return target;
        }
    }
    
    /**
     * True if has "Cost" attribute
     */
    public boolean isSetCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COST$0) != null;
        }
    }
    
    /**
     * Sets the "Cost" attribute
     */
    public void setCost(java.lang.String cost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COST$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COST$0);
            }
            target.setStringValue(cost);
        }
    }
    
    /**
     * Sets (as xml) the "Cost" attribute
     */
    public void xsetCost(org.apache.xmlbeans.XmlString cost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COST$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COST$0);
            }
            target.set(cost);
        }
    }
    
    /**
     * Unsets the "Cost" attribute
     */
    public void unsetCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COST$0);
        }
    }
    
    /**
     * Gets the "Class" attribute
     */
    public com.conferma.cpapi.TicketClass.Enum getClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$2);
            if (target == null)
            {
                return null;
            }
            return (com.conferma.cpapi.TicketClass.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Class" attribute
     */
    public com.conferma.cpapi.TicketClass xgetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.TicketClass target = null;
            target = (com.conferma.cpapi.TicketClass)get_store().find_attribute_user(CLASS1$2);
            return target;
        }
    }
    
    /**
     * Sets the "Class" attribute
     */
    public void setClass1(com.conferma.cpapi.TicketClass.Enum class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$2);
            }
            target.setEnumValue(class1);
        }
    }
    
    /**
     * Sets (as xml) the "Class" attribute
     */
    public void xsetClass1(com.conferma.cpapi.TicketClass class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.TicketClass target = null;
            target = (com.conferma.cpapi.TicketClass)get_store().find_attribute_user(CLASS1$2);
            if (target == null)
            {
                target = (com.conferma.cpapi.TicketClass)get_store().add_attribute_user(CLASS1$2);
            }
            target.set(class1);
        }
    }
    
    /**
     * Gets the "Description" attribute
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Description" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$4);
            return target;
        }
    }
    
    /**
     * True if has "Description" attribute
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DESCRIPTION$4) != null;
        }
    }
    
    /**
     * Sets the "Description" attribute
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$4);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "Description" attribute
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$4);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "Description" attribute
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DESCRIPTION$4);
        }
    }
}
