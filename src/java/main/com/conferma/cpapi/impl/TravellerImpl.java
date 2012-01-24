/*
 * XML Type:  Traveller
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.Traveller
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML Traveller(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class TravellerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.Traveller
{
    
    public TravellerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SALUTATION$0 = 
        new javax.xml.namespace.QName("", "Salutation");
    private static final javax.xml.namespace.QName FORENAME$2 = 
        new javax.xml.namespace.QName("", "Forename");
    private static final javax.xml.namespace.QName SURNAME$4 = 
        new javax.xml.namespace.QName("", "Surname");
    
    
    /**
     * Gets the "Salutation" attribute
     */
    public java.lang.String getSalutation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SALUTATION$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Salutation" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSalutation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SALUTATION$0);
            return target;
        }
    }
    
    /**
     * True if has "Salutation" attribute
     */
    public boolean isSetSalutation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SALUTATION$0) != null;
        }
    }
    
    /**
     * Sets the "Salutation" attribute
     */
    public void setSalutation(java.lang.String salutation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SALUTATION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SALUTATION$0);
            }
            target.setStringValue(salutation);
        }
    }
    
    /**
     * Sets (as xml) the "Salutation" attribute
     */
    public void xsetSalutation(org.apache.xmlbeans.XmlString salutation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SALUTATION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SALUTATION$0);
            }
            target.set(salutation);
        }
    }
    
    /**
     * Unsets the "Salutation" attribute
     */
    public void unsetSalutation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SALUTATION$0);
        }
    }
    
    /**
     * Gets the "Forename" attribute
     */
    public java.lang.String getForename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORENAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Forename" attribute
     */
    public org.apache.xmlbeans.XmlString xgetForename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORENAME$2);
            return target;
        }
    }
    
    /**
     * True if has "Forename" attribute
     */
    public boolean isSetForename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORENAME$2) != null;
        }
    }
    
    /**
     * Sets the "Forename" attribute
     */
    public void setForename(java.lang.String forename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORENAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORENAME$2);
            }
            target.setStringValue(forename);
        }
    }
    
    /**
     * Sets (as xml) the "Forename" attribute
     */
    public void xsetForename(org.apache.xmlbeans.XmlString forename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORENAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FORENAME$2);
            }
            target.set(forename);
        }
    }
    
    /**
     * Unsets the "Forename" attribute
     */
    public void unsetForename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORENAME$2);
        }
    }
    
    /**
     * Gets the "Surname" attribute
     */
    public java.lang.String getSurname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURNAME$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Surname" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSurname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SURNAME$4);
            return target;
        }
    }
    
    /**
     * True if has "Surname" attribute
     */
    public boolean isSetSurname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SURNAME$4) != null;
        }
    }
    
    /**
     * Sets the "Surname" attribute
     */
    public void setSurname(java.lang.String surname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SURNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SURNAME$4);
            }
            target.setStringValue(surname);
        }
    }
    
    /**
     * Sets (as xml) the "Surname" attribute
     */
    public void xsetSurname(org.apache.xmlbeans.XmlString surname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SURNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SURNAME$4);
            }
            target.set(surname);
        }
    }
    
    /**
     * Unsets the "Surname" attribute
     */
    public void unsetSurname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SURNAME$4);
        }
    }
}
