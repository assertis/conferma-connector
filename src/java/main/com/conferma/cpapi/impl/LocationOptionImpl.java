/*
 * XML Type:  LocationOption
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.LocationOption
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML LocationOption(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class LocationOptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.LocationOption
{
    
    public LocationOptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Name");
    private static final javax.xml.namespace.QName COUNTRYCODE$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "CountryCode");
    private static final javax.xml.namespace.QName LATITUDE$4 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Latitude");
    private static final javax.xml.namespace.QName LONGITUDE$6 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Longitude");
    private static final javax.xml.namespace.QName KEYWORDID$8 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "KeywordID");
    private static final javax.xml.namespace.QName ISGEOSUPPORTED$10 = 
        new javax.xml.namespace.QName("", "IsGeoSupported");
    
    
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
     * Gets the "Latitude" element
     */
    public java.math.BigDecimal getLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Latitude" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LATITUDE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Latitude" element
     */
    public void setLatitude(java.math.BigDecimal latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATITUDE$4);
            }
            target.setBigDecimalValue(latitude);
        }
    }
    
    /**
     * Sets (as xml) the "Latitude" element
     */
    public void xsetLatitude(org.apache.xmlbeans.XmlDecimal latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LATITUDE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(LATITUDE$4);
            }
            target.set(latitude);
        }
    }
    
    /**
     * Gets the "Longitude" element
     */
    public java.math.BigDecimal getLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Longitude" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LONGITUDE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Longitude" element
     */
    public void setLongitude(java.math.BigDecimal longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGITUDE$6);
            }
            target.setBigDecimalValue(longitude);
        }
    }
    
    /**
     * Sets (as xml) the "Longitude" element
     */
    public void xsetLongitude(org.apache.xmlbeans.XmlDecimal longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LONGITUDE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(LONGITUDE$6);
            }
            target.set(longitude);
        }
    }
    
    /**
     * Gets the "KeywordID" element
     */
    public java.lang.String getKeywordID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "KeywordID" element
     */
    public org.apache.xmlbeans.XmlString xgetKeywordID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORDID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "KeywordID" element
     */
    public boolean isSetKeywordID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYWORDID$8) != 0;
        }
    }
    
    /**
     * Sets the "KeywordID" element
     */
    public void setKeywordID(java.lang.String keywordID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEYWORDID$8);
            }
            target.setStringValue(keywordID);
        }
    }
    
    /**
     * Sets (as xml) the "KeywordID" element
     */
    public void xsetKeywordID(org.apache.xmlbeans.XmlString keywordID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORDID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEYWORDID$8);
            }
            target.set(keywordID);
        }
    }
    
    /**
     * Unsets the "KeywordID" element
     */
    public void unsetKeywordID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYWORDID$8, 0);
        }
    }
    
    /**
     * Gets the "IsGeoSupported" attribute
     */
    public boolean getIsGeoSupported()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISGEOSUPPORTED$10);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsGeoSupported" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsGeoSupported()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISGEOSUPPORTED$10);
            return target;
        }
    }
    
    /**
     * Sets the "IsGeoSupported" attribute
     */
    public void setIsGeoSupported(boolean isGeoSupported)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISGEOSUPPORTED$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISGEOSUPPORTED$10);
            }
            target.setBooleanValue(isGeoSupported);
        }
    }
    
    /**
     * Sets (as xml) the "IsGeoSupported" attribute
     */
    public void xsetIsGeoSupported(org.apache.xmlbeans.XmlBoolean isGeoSupported)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISGEOSUPPORTED$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISGEOSUPPORTED$10);
            }
            target.set(isGeoSupported);
        }
    }
}
