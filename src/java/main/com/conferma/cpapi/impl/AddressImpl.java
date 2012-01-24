/*
 * XML Type:  Address
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.Address
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML Address(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class AddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.Address
{
    
    public AddressImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESSLINE1$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "AddressLine1");
    private static final javax.xml.namespace.QName ADDRESSLINE2$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "AddressLine2");
    private static final javax.xml.namespace.QName CITY$4 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "City");
    private static final javax.xml.namespace.QName POSTALORZIPCODE$6 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "PostalOrZipCode");
    private static final javax.xml.namespace.QName COUNTRYCODE$8 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "CountryCode");
    private static final javax.xml.namespace.QName TELEPHONE$10 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Telephone");
    private static final javax.xml.namespace.QName FAX$12 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Fax");
    private static final javax.xml.namespace.QName EMAIL$14 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Email");
    
    
    /**
     * Gets the "AddressLine1" element
     */
    public java.lang.String getAddressLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AddressLine1" element
     */
    public org.apache.xmlbeans.XmlString xgetAddressLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSLINE1$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AddressLine1" element
     */
    public boolean isSetAddressLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSLINE1$0) != 0;
        }
    }
    
    /**
     * Sets the "AddressLine1" element
     */
    public void setAddressLine1(java.lang.String addressLine1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSLINE1$0);
            }
            target.setStringValue(addressLine1);
        }
    }
    
    /**
     * Sets (as xml) the "AddressLine1" element
     */
    public void xsetAddressLine1(org.apache.xmlbeans.XmlString addressLine1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSLINE1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESSLINE1$0);
            }
            target.set(addressLine1);
        }
    }
    
    /**
     * Unsets the "AddressLine1" element
     */
    public void unsetAddressLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSLINE1$0, 0);
        }
    }
    
    /**
     * Gets the "AddressLine2" element
     */
    public java.lang.String getAddressLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE2$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AddressLine2" element
     */
    public org.apache.xmlbeans.XmlString xgetAddressLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSLINE2$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "AddressLine2" element
     */
    public boolean isSetAddressLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSLINE2$2) != 0;
        }
    }
    
    /**
     * Sets the "AddressLine2" element
     */
    public void setAddressLine2(java.lang.String addressLine2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE2$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSLINE2$2);
            }
            target.setStringValue(addressLine2);
        }
    }
    
    /**
     * Sets (as xml) the "AddressLine2" element
     */
    public void xsetAddressLine2(org.apache.xmlbeans.XmlString addressLine2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSLINE2$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESSLINE2$2);
            }
            target.set(addressLine2);
        }
    }
    
    /**
     * Unsets the "AddressLine2" element
     */
    public void unsetAddressLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSLINE2$2, 0);
        }
    }
    
    /**
     * Gets the "City" element
     */
    public java.lang.String getCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "City" element
     */
    public org.apache.xmlbeans.XmlString xgetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "City" element
     */
    public boolean isSetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITY$4) != 0;
        }
    }
    
    /**
     * Sets the "City" element
     */
    public void setCity(java.lang.String city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITY$4);
            }
            target.setStringValue(city);
        }
    }
    
    /**
     * Sets (as xml) the "City" element
     */
    public void xsetCity(org.apache.xmlbeans.XmlString city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITY$4);
            }
            target.set(city);
        }
    }
    
    /**
     * Unsets the "City" element
     */
    public void unsetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITY$4, 0);
        }
    }
    
    /**
     * Gets the "PostalOrZipCode" element
     */
    public java.lang.String getPostalOrZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTALORZIPCODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PostalOrZipCode" element
     */
    public org.apache.xmlbeans.XmlString xgetPostalOrZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTALORZIPCODE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "PostalOrZipCode" element
     */
    public boolean isSetPostalOrZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSTALORZIPCODE$6) != 0;
        }
    }
    
    /**
     * Sets the "PostalOrZipCode" element
     */
    public void setPostalOrZipCode(java.lang.String postalOrZipCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTALORZIPCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTALORZIPCODE$6);
            }
            target.setStringValue(postalOrZipCode);
        }
    }
    
    /**
     * Sets (as xml) the "PostalOrZipCode" element
     */
    public void xsetPostalOrZipCode(org.apache.xmlbeans.XmlString postalOrZipCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTALORZIPCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POSTALORZIPCODE$6);
            }
            target.set(postalOrZipCode);
        }
    }
    
    /**
     * Unsets the "PostalOrZipCode" element
     */
    public void unsetPostalOrZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSTALORZIPCODE$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYCODE$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYCODE$8, 0);
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
            return get_store().count_elements(COUNTRYCODE$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYCODE$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYCODE$8);
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
            get_store().remove_element(COUNTRYCODE$8, 0);
        }
    }
    
    /**
     * Gets the "Telephone" element
     */
    public java.lang.String getTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Telephone" element
     */
    public org.apache.xmlbeans.XmlString xgetTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "Telephone" element
     */
    public boolean isSetTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TELEPHONE$10) != 0;
        }
    }
    
    /**
     * Sets the "Telephone" element
     */
    public void setTelephone(java.lang.String telephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEPHONE$10);
            }
            target.setStringValue(telephone);
        }
    }
    
    /**
     * Sets (as xml) the "Telephone" element
     */
    public void xsetTelephone(org.apache.xmlbeans.XmlString telephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEPHONE$10);
            }
            target.set(telephone);
        }
    }
    
    /**
     * Unsets the "Telephone" element
     */
    public void unsetTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TELEPHONE$10, 0);
        }
    }
    
    /**
     * Gets the "Fax" element
     */
    public java.lang.String getFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Fax" element
     */
    public org.apache.xmlbeans.XmlString xgetFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "Fax" element
     */
    public boolean isSetFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAX$12) != 0;
        }
    }
    
    /**
     * Sets the "Fax" element
     */
    public void setFax(java.lang.String fax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAX$12);
            }
            target.setStringValue(fax);
        }
    }
    
    /**
     * Sets (as xml) the "Fax" element
     */
    public void xsetFax(org.apache.xmlbeans.XmlString fax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAX$12);
            }
            target.set(fax);
        }
    }
    
    /**
     * Unsets the "Fax" element
     */
    public void unsetFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAX$12, 0);
        }
    }
    
    /**
     * Gets the "Email" element
     */
    public java.lang.String getEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Email" element
     */
    public org.apache.xmlbeans.XmlString xgetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "Email" element
     */
    public boolean isSetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAIL$14) != 0;
        }
    }
    
    /**
     * Sets the "Email" element
     */
    public void setEmail(java.lang.String email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$14);
            }
            target.setStringValue(email);
        }
    }
    
    /**
     * Sets (as xml) the "Email" element
     */
    public void xsetEmail(org.apache.xmlbeans.XmlString email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$14);
            }
            target.set(email);
        }
    }
    
    /**
     * Unsets the "Email" element
     */
    public void unsetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAIL$14, 0);
        }
    }
}
