/*
 * XML Type:  Card
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.Card
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML Card(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class CardImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.Card
{
    
    public CardImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Name");
    private static final javax.xml.namespace.QName NUMBER$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Number");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Type");
    private static final javax.xml.namespace.QName STARTDATE$6 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "StartDate");
    private static final javax.xml.namespace.QName EXPIRYDATE$8 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "ExpiryDate");
    private static final javax.xml.namespace.QName CVV$10 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "CVV");
    private static final javax.xml.namespace.QName PROVIDER$12 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Provider");
    
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "Number" element
     */
    public java.lang.String getNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Number" element
     */
    public org.apache.xmlbeans.XmlString xgetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Number" element
     */
    public boolean isSetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBER$2) != 0;
        }
    }
    
    /**
     * Sets the "Number" element
     */
    public void setNumber(java.lang.String number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$2);
            }
            target.setStringValue(number);
        }
    }
    
    /**
     * Sets (as xml) the "Number" element
     */
    public void xsetNumber(org.apache.xmlbeans.XmlString number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMBER$2);
            }
            target.set(number);
        }
    }
    
    /**
     * Unsets the "Number" element
     */
    public void unsetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBER$2, 0);
        }
    }
    
    /**
     * Gets the "Type" element
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" element
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "Type" element
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$4);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$4);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "Type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$4, 0);
        }
    }
    
    /**
     * Gets the "StartDate" element
     */
    public com.conferma.cpapi.CardDate getStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CardDate target = null;
            target = (com.conferma.cpapi.CardDate)get_store().find_element_user(STARTDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "StartDate" element
     */
    public boolean isSetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "StartDate" element
     */
    public void setStartDate(com.conferma.cpapi.CardDate startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CardDate target = null;
            target = (com.conferma.cpapi.CardDate)get_store().find_element_user(STARTDATE$6, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.CardDate)get_store().add_element_user(STARTDATE$6);
            }
            target.set(startDate);
        }
    }
    
    /**
     * Appends and returns a new empty "StartDate" element
     */
    public com.conferma.cpapi.CardDate addNewStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CardDate target = null;
            target = (com.conferma.cpapi.CardDate)get_store().add_element_user(STARTDATE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "StartDate" element
     */
    public void unsetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTDATE$6, 0);
        }
    }
    
    /**
     * Gets the "ExpiryDate" element
     */
    public com.conferma.cpapi.CardDate getExpiryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CardDate target = null;
            target = (com.conferma.cpapi.CardDate)get_store().find_element_user(EXPIRYDATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ExpiryDate" element
     */
    public boolean isSetExpiryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPIRYDATE$8) != 0;
        }
    }
    
    /**
     * Sets the "ExpiryDate" element
     */
    public void setExpiryDate(com.conferma.cpapi.CardDate expiryDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CardDate target = null;
            target = (com.conferma.cpapi.CardDate)get_store().find_element_user(EXPIRYDATE$8, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.CardDate)get_store().add_element_user(EXPIRYDATE$8);
            }
            target.set(expiryDate);
        }
    }
    
    /**
     * Appends and returns a new empty "ExpiryDate" element
     */
    public com.conferma.cpapi.CardDate addNewExpiryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CardDate target = null;
            target = (com.conferma.cpapi.CardDate)get_store().add_element_user(EXPIRYDATE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "ExpiryDate" element
     */
    public void unsetExpiryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPIRYDATE$8, 0);
        }
    }
    
    /**
     * Gets the "CVV" element
     */
    public java.lang.String getCVV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CVV$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CVV" element
     */
    public org.apache.xmlbeans.XmlString xgetCVV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CVV$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "CVV" element
     */
    public boolean isSetCVV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CVV$10) != 0;
        }
    }
    
    /**
     * Sets the "CVV" element
     */
    public void setCVV(java.lang.String cvv)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CVV$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CVV$10);
            }
            target.setStringValue(cvv);
        }
    }
    
    /**
     * Sets (as xml) the "CVV" element
     */
    public void xsetCVV(org.apache.xmlbeans.XmlString cvv)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CVV$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CVV$10);
            }
            target.set(cvv);
        }
    }
    
    /**
     * Unsets the "CVV" element
     */
    public void unsetCVV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CVV$10, 0);
        }
    }
    
    /**
     * Gets the "Provider" element
     */
    public com.conferma.cpapi.CardProvider getProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CardProvider target = null;
            target = (com.conferma.cpapi.CardProvider)get_store().find_element_user(PROVIDER$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Provider" element
     */
    public boolean isSetProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVIDER$12) != 0;
        }
    }
    
    /**
     * Sets the "Provider" element
     */
    public void setProvider(com.conferma.cpapi.CardProvider provider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CardProvider target = null;
            target = (com.conferma.cpapi.CardProvider)get_store().find_element_user(PROVIDER$12, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.CardProvider)get_store().add_element_user(PROVIDER$12);
            }
            target.set(provider);
        }
    }
    
    /**
     * Appends and returns a new empty "Provider" element
     */
    public com.conferma.cpapi.CardProvider addNewProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CardProvider target = null;
            target = (com.conferma.cpapi.CardProvider)get_store().add_element_user(PROVIDER$12);
            return target;
        }
    }
    
    /**
     * Unsets the "Provider" element
     */
    public void unsetProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVIDER$12, 0);
        }
    }
}
