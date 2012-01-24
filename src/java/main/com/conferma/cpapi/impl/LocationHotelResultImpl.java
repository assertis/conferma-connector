/*
 * XML Type:  LocationHotelResult
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.LocationHotelResult
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML LocationHotelResult(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class LocationHotelResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.LocationHotelResult
{
    
    public LocationHotelResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Name");
    private static final javax.xml.namespace.QName HOTELID$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "HotelID");
    private static final javax.xml.namespace.QName GROUPID$4 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GroupID");
    private static final javax.xml.namespace.QName GROUPNAME$6 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GroupName");
    private static final javax.xml.namespace.QName ADDRESS$8 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Address");
    private static final javax.xml.namespace.QName GUIDERATETYPE$10 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GuideRateType");
    private static final javax.xml.namespace.QName GUIDERATEAGE$12 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GuideRateAge");
    private static final javax.xml.namespace.QName GUIDERATE$14 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GuideRate");
    private static final javax.xml.namespace.QName CURRENCY$16 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Currency");
    private static final javax.xml.namespace.QName ISCLIENTPREFERRED$18 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "IsClientPreferred");
    private static final javax.xml.namespace.QName ISCONSUMERPREFERRED$20 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "IsConsumerPreferred");
    private static final javax.xml.namespace.QName STARRATING$22 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "StarRating");
    private static final javax.xml.namespace.QName STARRATINGPROVIDER$24 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "StarRatingProvider");
    private static final javax.xml.namespace.QName USERSTARRATING$26 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "UserStarRating");
    private static final javax.xml.namespace.QName HASREVIEWS$28 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "HasReviews");
    private static final javax.xml.namespace.QName CLOSESTAIRPORT$30 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "ClosestAirport");
    private static final javax.xml.namespace.QName CLOSESTTRAINSTATION$32 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "ClosestTrainStation");
    private static final javax.xml.namespace.QName CLOSESTMETROSTATION$34 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "ClosestMetroStation");
    private static final javax.xml.namespace.QName CURRENCYCONVERSION$36 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "CurrencyConversion");
    
    
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
     * Gets the "HotelID" element
     */
    public int getHotelID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOTELID$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "HotelID" element
     */
    public org.apache.xmlbeans.XmlInt xgetHotelID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HOTELID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "HotelID" element
     */
    public void setHotelID(int hotelID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOTELID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOTELID$2);
            }
            target.setIntValue(hotelID);
        }
    }
    
    /**
     * Sets (as xml) the "HotelID" element
     */
    public void xsetHotelID(org.apache.xmlbeans.XmlInt hotelID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HOTELID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(HOTELID$2);
            }
            target.set(hotelID);
        }
    }
    
    /**
     * Gets the "GroupID" element
     */
    public int getGroupID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPID$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "GroupID" element
     */
    public org.apache.xmlbeans.XmlInt xgetGroupID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(GROUPID$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GroupID" element
     */
    public void setGroupID(int groupID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUPID$4);
            }
            target.setIntValue(groupID);
        }
    }
    
    /**
     * Sets (as xml) the "GroupID" element
     */
    public void xsetGroupID(org.apache.xmlbeans.XmlInt groupID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(GROUPID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(GROUPID$4);
            }
            target.set(groupID);
        }
    }
    
    /**
     * Gets the "GroupName" element
     */
    public java.lang.String getGroupName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "GroupName" element
     */
    public org.apache.xmlbeans.XmlString xgetGroupName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPNAME$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "GroupName" element
     */
    public boolean isSetGroupName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPNAME$6) != 0;
        }
    }
    
    /**
     * Sets the "GroupName" element
     */
    public void setGroupName(java.lang.String groupName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUPNAME$6);
            }
            target.setStringValue(groupName);
        }
    }
    
    /**
     * Sets (as xml) the "GroupName" element
     */
    public void xsetGroupName(org.apache.xmlbeans.XmlString groupName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROUPNAME$6);
            }
            target.set(groupName);
        }
    }
    
    /**
     * Unsets the "GroupName" element
     */
    public void unsetGroupName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPNAME$6, 0);
        }
    }
    
    /**
     * Gets the "Address" element
     */
    public com.conferma.cbapi.cdts.Address getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cbapi.cdts.Address target = null;
            target = (com.conferma.cbapi.cdts.Address)get_store().find_element_user(ADDRESS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Address" element
     */
    public boolean isSetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$8) != 0;
        }
    }
    
    /**
     * Sets the "Address" element
     */
    public void setAddress(com.conferma.cbapi.cdts.Address address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cbapi.cdts.Address target = null;
            target = (com.conferma.cbapi.cdts.Address)get_store().find_element_user(ADDRESS$8, 0);
            if (target == null)
            {
                target = (com.conferma.cbapi.cdts.Address)get_store().add_element_user(ADDRESS$8);
            }
            target.set(address);
        }
    }
    
    /**
     * Appends and returns a new empty "Address" element
     */
    public com.conferma.cbapi.cdts.Address addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cbapi.cdts.Address target = null;
            target = (com.conferma.cbapi.cdts.Address)get_store().add_element_user(ADDRESS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Address" element
     */
    public void unsetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$8, 0);
        }
    }
    
    /**
     * Gets the "GuideRateType" element
     */
    public com.conferma.cpapi.HotelGuideRateType.Enum getGuideRateType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GUIDERATETYPE$10, 0);
            if (target == null)
            {
                return null;
            }
            return (com.conferma.cpapi.HotelGuideRateType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "GuideRateType" element
     */
    public com.conferma.cpapi.HotelGuideRateType xgetGuideRateType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.HotelGuideRateType target = null;
            target = (com.conferma.cpapi.HotelGuideRateType)get_store().find_element_user(GUIDERATETYPE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GuideRateType" element
     */
    public void setGuideRateType(com.conferma.cpapi.HotelGuideRateType.Enum guideRateType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GUIDERATETYPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GUIDERATETYPE$10);
            }
            target.setEnumValue(guideRateType);
        }
    }
    
    /**
     * Sets (as xml) the "GuideRateType" element
     */
    public void xsetGuideRateType(com.conferma.cpapi.HotelGuideRateType guideRateType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.HotelGuideRateType target = null;
            target = (com.conferma.cpapi.HotelGuideRateType)get_store().find_element_user(GUIDERATETYPE$10, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.HotelGuideRateType)get_store().add_element_user(GUIDERATETYPE$10);
            }
            target.set(guideRateType);
        }
    }
    
    /**
     * Gets the "GuideRateAge" element
     */
    public com.conferma.cpapi.HotelGuideRateAge.Enum getGuideRateAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GUIDERATEAGE$12, 0);
            if (target == null)
            {
                return null;
            }
            return (com.conferma.cpapi.HotelGuideRateAge.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "GuideRateAge" element
     */
    public com.conferma.cpapi.HotelGuideRateAge xgetGuideRateAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.HotelGuideRateAge target = null;
            target = (com.conferma.cpapi.HotelGuideRateAge)get_store().find_element_user(GUIDERATEAGE$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GuideRateAge" element
     */
    public void setGuideRateAge(com.conferma.cpapi.HotelGuideRateAge.Enum guideRateAge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GUIDERATEAGE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GUIDERATEAGE$12);
            }
            target.setEnumValue(guideRateAge);
        }
    }
    
    /**
     * Sets (as xml) the "GuideRateAge" element
     */
    public void xsetGuideRateAge(com.conferma.cpapi.HotelGuideRateAge guideRateAge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.HotelGuideRateAge target = null;
            target = (com.conferma.cpapi.HotelGuideRateAge)get_store().find_element_user(GUIDERATEAGE$12, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.HotelGuideRateAge)get_store().add_element_user(GUIDERATEAGE$12);
            }
            target.set(guideRateAge);
        }
    }
    
    /**
     * Gets the "GuideRate" element
     */
    public java.math.BigDecimal getGuideRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GUIDERATE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "GuideRate" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetGuideRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(GUIDERATE$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GuideRate" element
     */
    public void setGuideRate(java.math.BigDecimal guideRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GUIDERATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GUIDERATE$14);
            }
            target.setBigDecimalValue(guideRate);
        }
    }
    
    /**
     * Sets (as xml) the "GuideRate" element
     */
    public void xsetGuideRate(org.apache.xmlbeans.XmlDecimal guideRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(GUIDERATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(GUIDERATE$14);
            }
            target.set(guideRate);
        }
    }
    
    /**
     * Gets the "Currency" element
     */
    public java.lang.String getCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Currency" element
     */
    public org.apache.xmlbeans.XmlString xgetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "Currency" element
     */
    public boolean isSetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENCY$16) != 0;
        }
    }
    
    /**
     * Sets the "Currency" element
     */
    public void setCurrency(java.lang.String currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCY$16);
            }
            target.setStringValue(currency);
        }
    }
    
    /**
     * Sets (as xml) the "Currency" element
     */
    public void xsetCurrency(org.apache.xmlbeans.XmlString currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENCY$16);
            }
            target.set(currency);
        }
    }
    
    /**
     * Unsets the "Currency" element
     */
    public void unsetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENCY$16, 0);
        }
    }
    
    /**
     * Gets the "IsClientPreferred" element
     */
    public boolean getIsClientPreferred()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCLIENTPREFERRED$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsClientPreferred" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsClientPreferred()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCLIENTPREFERRED$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IsClientPreferred" element
     */
    public void setIsClientPreferred(boolean isClientPreferred)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCLIENTPREFERRED$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISCLIENTPREFERRED$18);
            }
            target.setBooleanValue(isClientPreferred);
        }
    }
    
    /**
     * Sets (as xml) the "IsClientPreferred" element
     */
    public void xsetIsClientPreferred(org.apache.xmlbeans.XmlBoolean isClientPreferred)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCLIENTPREFERRED$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISCLIENTPREFERRED$18);
            }
            target.set(isClientPreferred);
        }
    }
    
    /**
     * Gets the "IsConsumerPreferred" element
     */
    public boolean getIsConsumerPreferred()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCONSUMERPREFERRED$20, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsConsumerPreferred" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsConsumerPreferred()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCONSUMERPREFERRED$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IsConsumerPreferred" element
     */
    public void setIsConsumerPreferred(boolean isConsumerPreferred)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCONSUMERPREFERRED$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISCONSUMERPREFERRED$20);
            }
            target.setBooleanValue(isConsumerPreferred);
        }
    }
    
    /**
     * Sets (as xml) the "IsConsumerPreferred" element
     */
    public void xsetIsConsumerPreferred(org.apache.xmlbeans.XmlBoolean isConsumerPreferred)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCONSUMERPREFERRED$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISCONSUMERPREFERRED$20);
            }
            target.set(isConsumerPreferred);
        }
    }
    
    /**
     * Gets the "StarRating" element
     */
    public java.math.BigDecimal getStarRating()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARRATING$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "StarRating" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetStarRating()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(STARRATING$22, 0);
            return target;
        }
    }
    
    /**
     * Sets the "StarRating" element
     */
    public void setStarRating(java.math.BigDecimal starRating)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARRATING$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARRATING$22);
            }
            target.setBigDecimalValue(starRating);
        }
    }
    
    /**
     * Sets (as xml) the "StarRating" element
     */
    public void xsetStarRating(org.apache.xmlbeans.XmlDecimal starRating)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(STARRATING$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(STARRATING$22);
            }
            target.set(starRating);
        }
    }
    
    /**
     * Gets the "StarRatingProvider" element
     */
    public java.lang.String getStarRatingProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARRATINGPROVIDER$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "StarRatingProvider" element
     */
    public org.apache.xmlbeans.XmlString xgetStarRatingProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARRATINGPROVIDER$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "StarRatingProvider" element
     */
    public boolean isSetStarRatingProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARRATINGPROVIDER$24) != 0;
        }
    }
    
    /**
     * Sets the "StarRatingProvider" element
     */
    public void setStarRatingProvider(java.lang.String starRatingProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARRATINGPROVIDER$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARRATINGPROVIDER$24);
            }
            target.setStringValue(starRatingProvider);
        }
    }
    
    /**
     * Sets (as xml) the "StarRatingProvider" element
     */
    public void xsetStarRatingProvider(org.apache.xmlbeans.XmlString starRatingProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARRATINGPROVIDER$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STARRATINGPROVIDER$24);
            }
            target.set(starRatingProvider);
        }
    }
    
    /**
     * Unsets the "StarRatingProvider" element
     */
    public void unsetStarRatingProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARRATINGPROVIDER$24, 0);
        }
    }
    
    /**
     * Gets the "UserStarRating" element
     */
    public java.math.BigDecimal getUserStarRating()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERSTARRATING$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "UserStarRating" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetUserStarRating()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(USERSTARRATING$26, 0);
            return target;
        }
    }
    
    /**
     * Sets the "UserStarRating" element
     */
    public void setUserStarRating(java.math.BigDecimal userStarRating)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERSTARRATING$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERSTARRATING$26);
            }
            target.setBigDecimalValue(userStarRating);
        }
    }
    
    /**
     * Sets (as xml) the "UserStarRating" element
     */
    public void xsetUserStarRating(org.apache.xmlbeans.XmlDecimal userStarRating)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(USERSTARRATING$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(USERSTARRATING$26);
            }
            target.set(userStarRating);
        }
    }
    
    /**
     * Gets the "HasReviews" element
     */
    public boolean getHasReviews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASREVIEWS$28, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "HasReviews" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasReviews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASREVIEWS$28, 0);
            return target;
        }
    }
    
    /**
     * Sets the "HasReviews" element
     */
    public void setHasReviews(boolean hasReviews)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASREVIEWS$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASREVIEWS$28);
            }
            target.setBooleanValue(hasReviews);
        }
    }
    
    /**
     * Sets (as xml) the "HasReviews" element
     */
    public void xsetHasReviews(org.apache.xmlbeans.XmlBoolean hasReviews)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASREVIEWS$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASREVIEWS$28);
            }
            target.set(hasReviews);
        }
    }
    
    /**
     * Gets the "ClosestAirport" element
     */
    public com.conferma.cpapi.NearbyLocation getClosestAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.NearbyLocation target = null;
            target = (com.conferma.cpapi.NearbyLocation)get_store().find_element_user(CLOSESTAIRPORT$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ClosestAirport" element
     */
    public boolean isSetClosestAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLOSESTAIRPORT$30) != 0;
        }
    }
    
    /**
     * Sets the "ClosestAirport" element
     */
    public void setClosestAirport(com.conferma.cpapi.NearbyLocation closestAirport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.NearbyLocation target = null;
            target = (com.conferma.cpapi.NearbyLocation)get_store().find_element_user(CLOSESTAIRPORT$30, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.NearbyLocation)get_store().add_element_user(CLOSESTAIRPORT$30);
            }
            target.set(closestAirport);
        }
    }
    
    /**
     * Appends and returns a new empty "ClosestAirport" element
     */
    public com.conferma.cpapi.NearbyLocation addNewClosestAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.NearbyLocation target = null;
            target = (com.conferma.cpapi.NearbyLocation)get_store().add_element_user(CLOSESTAIRPORT$30);
            return target;
        }
    }
    
    /**
     * Unsets the "ClosestAirport" element
     */
    public void unsetClosestAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLOSESTAIRPORT$30, 0);
        }
    }
    
    /**
     * Gets the "ClosestTrainStation" element
     */
    public com.conferma.cpapi.NearbyLocation getClosestTrainStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.NearbyLocation target = null;
            target = (com.conferma.cpapi.NearbyLocation)get_store().find_element_user(CLOSESTTRAINSTATION$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ClosestTrainStation" element
     */
    public boolean isSetClosestTrainStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLOSESTTRAINSTATION$32) != 0;
        }
    }
    
    /**
     * Sets the "ClosestTrainStation" element
     */
    public void setClosestTrainStation(com.conferma.cpapi.NearbyLocation closestTrainStation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.NearbyLocation target = null;
            target = (com.conferma.cpapi.NearbyLocation)get_store().find_element_user(CLOSESTTRAINSTATION$32, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.NearbyLocation)get_store().add_element_user(CLOSESTTRAINSTATION$32);
            }
            target.set(closestTrainStation);
        }
    }
    
    /**
     * Appends and returns a new empty "ClosestTrainStation" element
     */
    public com.conferma.cpapi.NearbyLocation addNewClosestTrainStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.NearbyLocation target = null;
            target = (com.conferma.cpapi.NearbyLocation)get_store().add_element_user(CLOSESTTRAINSTATION$32);
            return target;
        }
    }
    
    /**
     * Unsets the "ClosestTrainStation" element
     */
    public void unsetClosestTrainStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLOSESTTRAINSTATION$32, 0);
        }
    }
    
    /**
     * Gets the "ClosestMetroStation" element
     */
    public com.conferma.cpapi.NearbyLocation getClosestMetroStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.NearbyLocation target = null;
            target = (com.conferma.cpapi.NearbyLocation)get_store().find_element_user(CLOSESTMETROSTATION$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ClosestMetroStation" element
     */
    public boolean isSetClosestMetroStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLOSESTMETROSTATION$34) != 0;
        }
    }
    
    /**
     * Sets the "ClosestMetroStation" element
     */
    public void setClosestMetroStation(com.conferma.cpapi.NearbyLocation closestMetroStation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.NearbyLocation target = null;
            target = (com.conferma.cpapi.NearbyLocation)get_store().find_element_user(CLOSESTMETROSTATION$34, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.NearbyLocation)get_store().add_element_user(CLOSESTMETROSTATION$34);
            }
            target.set(closestMetroStation);
        }
    }
    
    /**
     * Appends and returns a new empty "ClosestMetroStation" element
     */
    public com.conferma.cpapi.NearbyLocation addNewClosestMetroStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.NearbyLocation target = null;
            target = (com.conferma.cpapi.NearbyLocation)get_store().add_element_user(CLOSESTMETROSTATION$34);
            return target;
        }
    }
    
    /**
     * Unsets the "ClosestMetroStation" element
     */
    public void unsetClosestMetroStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLOSESTMETROSTATION$34, 0);
        }
    }
    
    /**
     * Gets the "CurrencyConversion" element
     */
    public com.conferma.cpapi.CurrencyConversion getCurrencyConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CurrencyConversion target = null;
            target = (com.conferma.cpapi.CurrencyConversion)get_store().find_element_user(CURRENCYCONVERSION$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CurrencyConversion" element
     */
    public boolean isSetCurrencyConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENCYCONVERSION$36) != 0;
        }
    }
    
    /**
     * Sets the "CurrencyConversion" element
     */
    public void setCurrencyConversion(com.conferma.cpapi.CurrencyConversion currencyConversion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CurrencyConversion target = null;
            target = (com.conferma.cpapi.CurrencyConversion)get_store().find_element_user(CURRENCYCONVERSION$36, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.CurrencyConversion)get_store().add_element_user(CURRENCYCONVERSION$36);
            }
            target.set(currencyConversion);
        }
    }
    
    /**
     * Appends and returns a new empty "CurrencyConversion" element
     */
    public com.conferma.cpapi.CurrencyConversion addNewCurrencyConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.CurrencyConversion target = null;
            target = (com.conferma.cpapi.CurrencyConversion)get_store().add_element_user(CURRENCYCONVERSION$36);
            return target;
        }
    }
    
    /**
     * Unsets the "CurrencyConversion" element
     */
    public void unsetCurrencyConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENCYCONVERSION$36, 0);
        }
    }
}
