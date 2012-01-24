/*
 * XML Type:  Address
 * Namespace: http://cdts.cbapi.conferma.com/
 * Java type: com.conferma.cbapi.cdts.Address
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cbapi.cdts.impl;
/**
 * An XML Address(@http://cdts.cbapi.conferma.com/).
 *
 * This is a complex type.
 */
public class AddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cbapi.cdts.Address
{
    
    public AddressImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://cdts.cbapi.conferma.com/", "Name");
    private static final javax.xml.namespace.QName ADDRESSLINE1$2 = 
        new javax.xml.namespace.QName("http://cdts.cbapi.conferma.com/", "AddressLine1");
    private static final javax.xml.namespace.QName ADDRESSLINE2$4 = 
        new javax.xml.namespace.QName("http://cdts.cbapi.conferma.com/", "AddressLine2");
    private static final javax.xml.namespace.QName ADDRESSLINE3$6 = 
        new javax.xml.namespace.QName("http://cdts.cbapi.conferma.com/", "AddressLine3");
    private static final javax.xml.namespace.QName POSTALCODEORZIPCODE$8 = 
        new javax.xml.namespace.QName("http://cdts.cbapi.conferma.com/", "PostalCodeOrZipCode");
    private static final javax.xml.namespace.QName CITY$10 = 
        new javax.xml.namespace.QName("http://cdts.cbapi.conferma.com/", "City");
    private static final javax.xml.namespace.QName COUNTRYCODE$12 = 
        new javax.xml.namespace.QName("http://cdts.cbapi.conferma.com/", "CountryCode");
    private static final javax.xml.namespace.QName COUNTRYNAME$14 = 
        new javax.xml.namespace.QName("http://cdts.cbapi.conferma.com/", "CountryName");
    private static final javax.xml.namespace.QName TELEPHONENUMBER$16 = 
        new javax.xml.namespace.QName("http://cdts.cbapi.conferma.com/", "TelephoneNumber");
    private static final javax.xml.namespace.QName FACSIMILENUMBER$18 = 
        new javax.xml.namespace.QName("http://cdts.cbapi.conferma.com/", "FacsimileNumber");
    private static final javax.xml.namespace.QName EMAILADDRESS$20 = 
        new javax.xml.namespace.QName("http://cdts.cbapi.conferma.com/", "EmailAddress");
    private static final javax.xml.namespace.QName STATEPROV$22 = 
        new javax.xml.namespace.QName("http://cdts.cbapi.conferma.com/", "StateProv");
    private static final javax.xml.namespace.QName MOBILENUMBER$24 = 
        new javax.xml.namespace.QName("http://cdts.cbapi.conferma.com/", "MobileNumber");
    
    
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
     * Gets the "AddressLine1" element
     */
    public java.lang.String getAddressLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE1$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSLINE1$2, 0);
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
            return get_store().count_elements(ADDRESSLINE1$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE1$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSLINE1$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSLINE1$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESSLINE1$2);
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
            get_store().remove_element(ADDRESSLINE1$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE2$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSLINE2$4, 0);
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
            return get_store().count_elements(ADDRESSLINE2$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE2$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSLINE2$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSLINE2$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESSLINE2$4);
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
            get_store().remove_element(ADDRESSLINE2$4, 0);
        }
    }
    
    /**
     * Gets the "AddressLine3" element
     */
    public java.lang.String getAddressLine3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE3$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AddressLine3" element
     */
    public org.apache.xmlbeans.XmlString xgetAddressLine3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSLINE3$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "AddressLine3" element
     */
    public boolean isSetAddressLine3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSLINE3$6) != 0;
        }
    }
    
    /**
     * Sets the "AddressLine3" element
     */
    public void setAddressLine3(java.lang.String addressLine3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSLINE3$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSLINE3$6);
            }
            target.setStringValue(addressLine3);
        }
    }
    
    /**
     * Sets (as xml) the "AddressLine3" element
     */
    public void xsetAddressLine3(org.apache.xmlbeans.XmlString addressLine3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSLINE3$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESSLINE3$6);
            }
            target.set(addressLine3);
        }
    }
    
    /**
     * Unsets the "AddressLine3" element
     */
    public void unsetAddressLine3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSLINE3$6, 0);
        }
    }
    
    /**
     * Gets the "PostalCodeOrZipCode" element
     */
    public java.lang.String getPostalCodeOrZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTALCODEORZIPCODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PostalCodeOrZipCode" element
     */
    public org.apache.xmlbeans.XmlString xgetPostalCodeOrZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTALCODEORZIPCODE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "PostalCodeOrZipCode" element
     */
    public boolean isSetPostalCodeOrZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSTALCODEORZIPCODE$8) != 0;
        }
    }
    
    /**
     * Sets the "PostalCodeOrZipCode" element
     */
    public void setPostalCodeOrZipCode(java.lang.String postalCodeOrZipCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTALCODEORZIPCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTALCODEORZIPCODE$8);
            }
            target.setStringValue(postalCodeOrZipCode);
        }
    }
    
    /**
     * Sets (as xml) the "PostalCodeOrZipCode" element
     */
    public void xsetPostalCodeOrZipCode(org.apache.xmlbeans.XmlString postalCodeOrZipCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTALCODEORZIPCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POSTALCODEORZIPCODE$8);
            }
            target.set(postalCodeOrZipCode);
        }
    }
    
    /**
     * Unsets the "PostalCodeOrZipCode" element
     */
    public void unsetPostalCodeOrZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSTALCODEORZIPCODE$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$10, 0);
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
            return get_store().count_elements(CITY$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITY$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITY$10);
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
            get_store().remove_element(CITY$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYCODE$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYCODE$12, 0);
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
            return get_store().count_elements(COUNTRYCODE$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYCODE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYCODE$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYCODE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYCODE$12);
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
            get_store().remove_element(COUNTRYCODE$12, 0);
        }
    }
    
    /**
     * Gets the "CountryName" element
     */
    public java.lang.String getCountryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYNAME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CountryName" element
     */
    public org.apache.xmlbeans.XmlString xgetCountryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYNAME$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "CountryName" element
     */
    public boolean isSetCountryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRYNAME$14) != 0;
        }
    }
    
    /**
     * Sets the "CountryName" element
     */
    public void setCountryName(java.lang.String countryName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYNAME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYNAME$14);
            }
            target.setStringValue(countryName);
        }
    }
    
    /**
     * Sets (as xml) the "CountryName" element
     */
    public void xsetCountryName(org.apache.xmlbeans.XmlString countryName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYNAME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYNAME$14);
            }
            target.set(countryName);
        }
    }
    
    /**
     * Unsets the "CountryName" element
     */
    public void unsetCountryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRYNAME$14, 0);
        }
    }
    
    /**
     * Gets the "TelephoneNumber" element
     */
    public java.lang.String getTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONENUMBER$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TelephoneNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONENUMBER$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "TelephoneNumber" element
     */
    public boolean isSetTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TELEPHONENUMBER$16) != 0;
        }
    }
    
    /**
     * Sets the "TelephoneNumber" element
     */
    public void setTelephoneNumber(java.lang.String telephoneNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONENUMBER$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEPHONENUMBER$16);
            }
            target.setStringValue(telephoneNumber);
        }
    }
    
    /**
     * Sets (as xml) the "TelephoneNumber" element
     */
    public void xsetTelephoneNumber(org.apache.xmlbeans.XmlString telephoneNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONENUMBER$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEPHONENUMBER$16);
            }
            target.set(telephoneNumber);
        }
    }
    
    /**
     * Unsets the "TelephoneNumber" element
     */
    public void unsetTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TELEPHONENUMBER$16, 0);
        }
    }
    
    /**
     * Gets the "FacsimileNumber" element
     */
    public java.lang.String getFacsimileNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FACSIMILENUMBER$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FacsimileNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetFacsimileNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FACSIMILENUMBER$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "FacsimileNumber" element
     */
    public boolean isSetFacsimileNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FACSIMILENUMBER$18) != 0;
        }
    }
    
    /**
     * Sets the "FacsimileNumber" element
     */
    public void setFacsimileNumber(java.lang.String facsimileNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FACSIMILENUMBER$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FACSIMILENUMBER$18);
            }
            target.setStringValue(facsimileNumber);
        }
    }
    
    /**
     * Sets (as xml) the "FacsimileNumber" element
     */
    public void xsetFacsimileNumber(org.apache.xmlbeans.XmlString facsimileNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FACSIMILENUMBER$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FACSIMILENUMBER$18);
            }
            target.set(facsimileNumber);
        }
    }
    
    /**
     * Unsets the "FacsimileNumber" element
     */
    public void unsetFacsimileNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FACSIMILENUMBER$18, 0);
        }
    }
    
    /**
     * Gets the "EmailAddress" element
     */
    public java.lang.String getEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EmailAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "EmailAddress" element
     */
    public boolean isSetEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAILADDRESS$20) != 0;
        }
    }
    
    /**
     * Sets the "EmailAddress" element
     */
    public void setEmailAddress(java.lang.String emailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILADDRESS$20);
            }
            target.setStringValue(emailAddress);
        }
    }
    
    /**
     * Sets (as xml) the "EmailAddress" element
     */
    public void xsetEmailAddress(org.apache.xmlbeans.XmlString emailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILADDRESS$20);
            }
            target.set(emailAddress);
        }
    }
    
    /**
     * Unsets the "EmailAddress" element
     */
    public void unsetEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAILADDRESS$20, 0);
        }
    }
    
    /**
     * Gets the "StateProv" element
     */
    public java.lang.String getStateProv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATEPROV$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "StateProv" element
     */
    public org.apache.xmlbeans.XmlString xgetStateProv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATEPROV$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "StateProv" element
     */
    public boolean isSetStateProv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATEPROV$22) != 0;
        }
    }
    
    /**
     * Sets the "StateProv" element
     */
    public void setStateProv(java.lang.String stateProv)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATEPROV$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATEPROV$22);
            }
            target.setStringValue(stateProv);
        }
    }
    
    /**
     * Sets (as xml) the "StateProv" element
     */
    public void xsetStateProv(org.apache.xmlbeans.XmlString stateProv)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATEPROV$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATEPROV$22);
            }
            target.set(stateProv);
        }
    }
    
    /**
     * Unsets the "StateProv" element
     */
    public void unsetStateProv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATEPROV$22, 0);
        }
    }
    
    /**
     * Gets the "MobileNumber" element
     */
    public java.lang.String getMobileNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILENUMBER$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MobileNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetMobileNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILENUMBER$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "MobileNumber" element
     */
    public boolean isSetMobileNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOBILENUMBER$24) != 0;
        }
    }
    
    /**
     * Sets the "MobileNumber" element
     */
    public void setMobileNumber(java.lang.String mobileNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILENUMBER$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOBILENUMBER$24);
            }
            target.setStringValue(mobileNumber);
        }
    }
    
    /**
     * Sets (as xml) the "MobileNumber" element
     */
    public void xsetMobileNumber(org.apache.xmlbeans.XmlString mobileNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILENUMBER$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOBILENUMBER$24);
            }
            target.set(mobileNumber);
        }
    }
    
    /**
     * Unsets the "MobileNumber" element
     */
    public void unsetMobileNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOBILENUMBER$24, 0);
        }
    }
}
