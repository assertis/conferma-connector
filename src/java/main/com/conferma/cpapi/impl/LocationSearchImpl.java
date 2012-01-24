/*
 * XML Type:  LocationSearch
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.LocationSearch
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML LocationSearch(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class LocationSearchImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.LocationSearch
{
    
    public LocationSearchImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMELIKE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "NameLike");
    private static final javax.xml.namespace.QName COUNTRYCODE$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "CountryCode");
    private static final javax.xml.namespace.QName ISPOSTALCODE$4 = 
        new javax.xml.namespace.QName("", "IsPostalCode");
    
    
    /**
     * Gets the "NameLike" element
     */
    public java.lang.String getNameLike()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMELIKE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NameLike" element
     */
    public org.apache.xmlbeans.XmlString xgetNameLike()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAMELIKE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "NameLike" element
     */
    public boolean isSetNameLike()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMELIKE$0) != 0;
        }
    }
    
    /**
     * Sets the "NameLike" element
     */
    public void setNameLike(java.lang.String nameLike)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMELIKE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAMELIKE$0);
            }
            target.setStringValue(nameLike);
        }
    }
    
    /**
     * Sets (as xml) the "NameLike" element
     */
    public void xsetNameLike(org.apache.xmlbeans.XmlString nameLike)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAMELIKE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAMELIKE$0);
            }
            target.set(nameLike);
        }
    }
    
    /**
     * Unsets the "NameLike" element
     */
    public void unsetNameLike()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMELIKE$0, 0);
        }
    }
    
    /**
     * Gets the "CountryCode" element
     */
    public java.lang.String getCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CountryCode" element
     */
    public org.apache.xmlbeans.XmlString xgetCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYCODE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "CountryCode" element
     */
    public boolean isSetCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRYCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "CountryCode" element
     */
    public void setCountryCode(java.lang.String countryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYCODE$2);
            }
            target.setStringValue(countryCode);
        }
    }
    
    /**
     * Sets (as xml) the "CountryCode" element
     */
    public void xsetCountryCode(org.apache.xmlbeans.XmlString countryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYCODE$2);
            }
            target.set(countryCode);
        }
    }
    
    /**
     * Unsets the "CountryCode" element
     */
    public void unsetCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRYCODE$2, 0);
        }
    }
    
    /**
     * Gets the "IsPostalCode" attribute
     */
    public boolean getIsPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISPOSTALCODE$4);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsPostalCode" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISPOSTALCODE$4);
            return target;
        }
    }
    
    /**
     * Sets the "IsPostalCode" attribute
     */
    public void setIsPostalCode(boolean isPostalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISPOSTALCODE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISPOSTALCODE$4);
            }
            target.setBooleanValue(isPostalCode);
        }
    }
    
    /**
     * Sets (as xml) the "IsPostalCode" attribute
     */
    public void xsetIsPostalCode(org.apache.xmlbeans.XmlBoolean isPostalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISPOSTALCODE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISPOSTALCODE$4);
            }
            target.set(isPostalCode);
        }
    }
}
