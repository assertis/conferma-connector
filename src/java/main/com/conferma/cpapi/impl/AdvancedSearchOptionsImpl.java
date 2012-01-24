/*
 * XML Type:  AdvancedSearchOptions
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.AdvancedSearchOptions
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML AdvancedSearchOptions(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class AdvancedSearchOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.AdvancedSearchOptions
{
    
    public AdvancedSearchOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONVERTTOCURRENCYCODE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "ConvertToCurrencyCode");
    private static final javax.xml.namespace.QName MAXRESULTS$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "MaxResults");
    private static final javax.xml.namespace.QName STARRANGE$4 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "StarRange");
    private static final javax.xml.namespace.QName HOTELNAMELIKE$6 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "HotelNameLike");
    private static final javax.xml.namespace.QName GROUPNAMELIKE$8 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GroupNameLike");
    private static final javax.xml.namespace.QName PREFERREDFILTER$10 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "PreferredFilter");
    private static final javax.xml.namespace.QName POIDISPLAY$12 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "POIDisplay");
    private static final javax.xml.namespace.QName PRICERANGE$14 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "PriceRange");
    private static final javax.xml.namespace.QName HOTELCLOSESTAIRPORTS$16 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "HotelClosestAirports");
    private static final javax.xml.namespace.QName HOTELCLOSESTMETROSTATIONS$18 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "HotelClosestMetroStations");
    private static final javax.xml.namespace.QName HOTELCLOSESTTRAINSTATIONS$20 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "HotelClosestTrainStations");
    private static final javax.xml.namespace.QName ORDERBY$22 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "OrderBy");
    
    
    /**
     * Gets the "ConvertToCurrencyCode" element
     */
    public java.lang.String getConvertToCurrencyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONVERTTOCURRENCYCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConvertToCurrencyCode" element
     */
    public org.apache.xmlbeans.XmlString xgetConvertToCurrencyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONVERTTOCURRENCYCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ConvertToCurrencyCode" element
     */
    public boolean isSetConvertToCurrencyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONVERTTOCURRENCYCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "ConvertToCurrencyCode" element
     */
    public void setConvertToCurrencyCode(java.lang.String convertToCurrencyCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONVERTTOCURRENCYCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONVERTTOCURRENCYCODE$0);
            }
            target.setStringValue(convertToCurrencyCode);
        }
    }
    
    /**
     * Sets (as xml) the "ConvertToCurrencyCode" element
     */
    public void xsetConvertToCurrencyCode(org.apache.xmlbeans.XmlString convertToCurrencyCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONVERTTOCURRENCYCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONVERTTOCURRENCYCODE$0);
            }
            target.set(convertToCurrencyCode);
        }
    }
    
    /**
     * Unsets the "ConvertToCurrencyCode" element
     */
    public void unsetConvertToCurrencyCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONVERTTOCURRENCYCODE$0, 0);
        }
    }
    
    /**
     * Gets the "MaxResults" element
     */
    public int getMaxResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXRESULTS$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxResults" element
     */
    public org.apache.xmlbeans.XmlInt xgetMaxResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXRESULTS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MaxResults" element
     */
    public void setMaxResults(int maxResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXRESULTS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXRESULTS$2);
            }
            target.setIntValue(maxResults);
        }
    }
    
    /**
     * Sets (as xml) the "MaxResults" element
     */
    public void xsetMaxResults(org.apache.xmlbeans.XmlInt maxResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXRESULTS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXRESULTS$2);
            }
            target.set(maxResults);
        }
    }
    
    /**
     * Gets the "StarRange" element
     */
    public com.conferma.cpapi.StarRange getStarRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.StarRange target = null;
            target = (com.conferma.cpapi.StarRange)get_store().find_element_user(STARRANGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "StarRange" element
     */
    public boolean isSetStarRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARRANGE$4) != 0;
        }
    }
    
    /**
     * Sets the "StarRange" element
     */
    public void setStarRange(com.conferma.cpapi.StarRange starRange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.StarRange target = null;
            target = (com.conferma.cpapi.StarRange)get_store().find_element_user(STARRANGE$4, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.StarRange)get_store().add_element_user(STARRANGE$4);
            }
            target.set(starRange);
        }
    }
    
    /**
     * Appends and returns a new empty "StarRange" element
     */
    public com.conferma.cpapi.StarRange addNewStarRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.StarRange target = null;
            target = (com.conferma.cpapi.StarRange)get_store().add_element_user(STARRANGE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "StarRange" element
     */
    public void unsetStarRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARRANGE$4, 0);
        }
    }
    
    /**
     * Gets the "HotelNameLike" element
     */
    public java.lang.String getHotelNameLike()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOTELNAMELIKE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "HotelNameLike" element
     */
    public org.apache.xmlbeans.XmlString xgetHotelNameLike()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOTELNAMELIKE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "HotelNameLike" element
     */
    public boolean isSetHotelNameLike()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOTELNAMELIKE$6) != 0;
        }
    }
    
    /**
     * Sets the "HotelNameLike" element
     */
    public void setHotelNameLike(java.lang.String hotelNameLike)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOTELNAMELIKE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOTELNAMELIKE$6);
            }
            target.setStringValue(hotelNameLike);
        }
    }
    
    /**
     * Sets (as xml) the "HotelNameLike" element
     */
    public void xsetHotelNameLike(org.apache.xmlbeans.XmlString hotelNameLike)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOTELNAMELIKE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOTELNAMELIKE$6);
            }
            target.set(hotelNameLike);
        }
    }
    
    /**
     * Unsets the "HotelNameLike" element
     */
    public void unsetHotelNameLike()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOTELNAMELIKE$6, 0);
        }
    }
    
    /**
     * Gets the "GroupNameLike" element
     */
    public java.lang.String getGroupNameLike()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPNAMELIKE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "GroupNameLike" element
     */
    public org.apache.xmlbeans.XmlString xgetGroupNameLike()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPNAMELIKE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "GroupNameLike" element
     */
    public boolean isSetGroupNameLike()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPNAMELIKE$8) != 0;
        }
    }
    
    /**
     * Sets the "GroupNameLike" element
     */
    public void setGroupNameLike(java.lang.String groupNameLike)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPNAMELIKE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUPNAMELIKE$8);
            }
            target.setStringValue(groupNameLike);
        }
    }
    
    /**
     * Sets (as xml) the "GroupNameLike" element
     */
    public void xsetGroupNameLike(org.apache.xmlbeans.XmlString groupNameLike)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPNAMELIKE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROUPNAMELIKE$8);
            }
            target.set(groupNameLike);
        }
    }
    
    /**
     * Unsets the "GroupNameLike" element
     */
    public void unsetGroupNameLike()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPNAMELIKE$8, 0);
        }
    }
    
    /**
     * Gets the "PreferredFilter" element
     */
    public com.conferma.cpapi.FilterOption.Enum getPreferredFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFERREDFILTER$10, 0);
            if (target == null)
            {
                return null;
            }
            return (com.conferma.cpapi.FilterOption.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PreferredFilter" element
     */
    public com.conferma.cpapi.FilterOption xgetPreferredFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.FilterOption target = null;
            target = (com.conferma.cpapi.FilterOption)get_store().find_element_user(PREFERREDFILTER$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PreferredFilter" element
     */
    public void setPreferredFilter(com.conferma.cpapi.FilterOption.Enum preferredFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFERREDFILTER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREFERREDFILTER$10);
            }
            target.setEnumValue(preferredFilter);
        }
    }
    
    /**
     * Sets (as xml) the "PreferredFilter" element
     */
    public void xsetPreferredFilter(com.conferma.cpapi.FilterOption preferredFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.FilterOption target = null;
            target = (com.conferma.cpapi.FilterOption)get_store().find_element_user(PREFERREDFILTER$10, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.FilterOption)get_store().add_element_user(PREFERREDFILTER$10);
            }
            target.set(preferredFilter);
        }
    }
    
    /**
     * Gets the "POIDisplay" element
     */
    public com.conferma.cpapi.DisplayOption.Enum getPOIDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POIDISPLAY$12, 0);
            if (target == null)
            {
                return null;
            }
            return (com.conferma.cpapi.DisplayOption.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "POIDisplay" element
     */
    public com.conferma.cpapi.DisplayOption xgetPOIDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DisplayOption target = null;
            target = (com.conferma.cpapi.DisplayOption)get_store().find_element_user(POIDISPLAY$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "POIDisplay" element
     */
    public void setPOIDisplay(com.conferma.cpapi.DisplayOption.Enum poiDisplay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POIDISPLAY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POIDISPLAY$12);
            }
            target.setEnumValue(poiDisplay);
        }
    }
    
    /**
     * Sets (as xml) the "POIDisplay" element
     */
    public void xsetPOIDisplay(com.conferma.cpapi.DisplayOption poiDisplay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DisplayOption target = null;
            target = (com.conferma.cpapi.DisplayOption)get_store().find_element_user(POIDISPLAY$12, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.DisplayOption)get_store().add_element_user(POIDISPLAY$12);
            }
            target.set(poiDisplay);
        }
    }
    
    /**
     * Gets the "PriceRange" element
     */
    public com.conferma.cpapi.PriceRange getPriceRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.PriceRange target = null;
            target = (com.conferma.cpapi.PriceRange)get_store().find_element_user(PRICERANGE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PriceRange" element
     */
    public boolean isSetPriceRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRICERANGE$14) != 0;
        }
    }
    
    /**
     * Sets the "PriceRange" element
     */
    public void setPriceRange(com.conferma.cpapi.PriceRange priceRange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.PriceRange target = null;
            target = (com.conferma.cpapi.PriceRange)get_store().find_element_user(PRICERANGE$14, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.PriceRange)get_store().add_element_user(PRICERANGE$14);
            }
            target.set(priceRange);
        }
    }
    
    /**
     * Appends and returns a new empty "PriceRange" element
     */
    public com.conferma.cpapi.PriceRange addNewPriceRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.PriceRange target = null;
            target = (com.conferma.cpapi.PriceRange)get_store().add_element_user(PRICERANGE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "PriceRange" element
     */
    public void unsetPriceRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRICERANGE$14, 0);
        }
    }
    
    /**
     * Gets the "HotelClosestAirports" element
     */
    public com.conferma.cpapi.DisplayOption.Enum getHotelClosestAirports()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOTELCLOSESTAIRPORTS$16, 0);
            if (target == null)
            {
                return null;
            }
            return (com.conferma.cpapi.DisplayOption.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "HotelClosestAirports" element
     */
    public com.conferma.cpapi.DisplayOption xgetHotelClosestAirports()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DisplayOption target = null;
            target = (com.conferma.cpapi.DisplayOption)get_store().find_element_user(HOTELCLOSESTAIRPORTS$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "HotelClosestAirports" element
     */
    public void setHotelClosestAirports(com.conferma.cpapi.DisplayOption.Enum hotelClosestAirports)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOTELCLOSESTAIRPORTS$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOTELCLOSESTAIRPORTS$16);
            }
            target.setEnumValue(hotelClosestAirports);
        }
    }
    
    /**
     * Sets (as xml) the "HotelClosestAirports" element
     */
    public void xsetHotelClosestAirports(com.conferma.cpapi.DisplayOption hotelClosestAirports)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DisplayOption target = null;
            target = (com.conferma.cpapi.DisplayOption)get_store().find_element_user(HOTELCLOSESTAIRPORTS$16, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.DisplayOption)get_store().add_element_user(HOTELCLOSESTAIRPORTS$16);
            }
            target.set(hotelClosestAirports);
        }
    }
    
    /**
     * Gets the "HotelClosestMetroStations" element
     */
    public com.conferma.cpapi.DisplayOption.Enum getHotelClosestMetroStations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOTELCLOSESTMETROSTATIONS$18, 0);
            if (target == null)
            {
                return null;
            }
            return (com.conferma.cpapi.DisplayOption.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "HotelClosestMetroStations" element
     */
    public com.conferma.cpapi.DisplayOption xgetHotelClosestMetroStations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DisplayOption target = null;
            target = (com.conferma.cpapi.DisplayOption)get_store().find_element_user(HOTELCLOSESTMETROSTATIONS$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "HotelClosestMetroStations" element
     */
    public void setHotelClosestMetroStations(com.conferma.cpapi.DisplayOption.Enum hotelClosestMetroStations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOTELCLOSESTMETROSTATIONS$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOTELCLOSESTMETROSTATIONS$18);
            }
            target.setEnumValue(hotelClosestMetroStations);
        }
    }
    
    /**
     * Sets (as xml) the "HotelClosestMetroStations" element
     */
    public void xsetHotelClosestMetroStations(com.conferma.cpapi.DisplayOption hotelClosestMetroStations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DisplayOption target = null;
            target = (com.conferma.cpapi.DisplayOption)get_store().find_element_user(HOTELCLOSESTMETROSTATIONS$18, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.DisplayOption)get_store().add_element_user(HOTELCLOSESTMETROSTATIONS$18);
            }
            target.set(hotelClosestMetroStations);
        }
    }
    
    /**
     * Gets the "HotelClosestTrainStations" element
     */
    public com.conferma.cpapi.DisplayOption.Enum getHotelClosestTrainStations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOTELCLOSESTTRAINSTATIONS$20, 0);
            if (target == null)
            {
                return null;
            }
            return (com.conferma.cpapi.DisplayOption.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "HotelClosestTrainStations" element
     */
    public com.conferma.cpapi.DisplayOption xgetHotelClosestTrainStations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DisplayOption target = null;
            target = (com.conferma.cpapi.DisplayOption)get_store().find_element_user(HOTELCLOSESTTRAINSTATIONS$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "HotelClosestTrainStations" element
     */
    public void setHotelClosestTrainStations(com.conferma.cpapi.DisplayOption.Enum hotelClosestTrainStations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOTELCLOSESTTRAINSTATIONS$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOTELCLOSESTTRAINSTATIONS$20);
            }
            target.setEnumValue(hotelClosestTrainStations);
        }
    }
    
    /**
     * Sets (as xml) the "HotelClosestTrainStations" element
     */
    public void xsetHotelClosestTrainStations(com.conferma.cpapi.DisplayOption hotelClosestTrainStations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DisplayOption target = null;
            target = (com.conferma.cpapi.DisplayOption)get_store().find_element_user(HOTELCLOSESTTRAINSTATIONS$20, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.DisplayOption)get_store().add_element_user(HOTELCLOSESTTRAINSTATIONS$20);
            }
            target.set(hotelClosestTrainStations);
        }
    }
    
    /**
     * Gets the "OrderBy" element
     */
    public com.conferma.cpapi.LocationResultsOrder.Enum getOrderBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERBY$22, 0);
            if (target == null)
            {
                return null;
            }
            return (com.conferma.cpapi.LocationResultsOrder.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderBy" element
     */
    public com.conferma.cpapi.LocationResultsOrder xgetOrderBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationResultsOrder target = null;
            target = (com.conferma.cpapi.LocationResultsOrder)get_store().find_element_user(ORDERBY$22, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrderBy" element
     */
    public void setOrderBy(com.conferma.cpapi.LocationResultsOrder.Enum orderBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERBY$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERBY$22);
            }
            target.setEnumValue(orderBy);
        }
    }
    
    /**
     * Sets (as xml) the "OrderBy" element
     */
    public void xsetOrderBy(com.conferma.cpapi.LocationResultsOrder orderBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationResultsOrder target = null;
            target = (com.conferma.cpapi.LocationResultsOrder)get_store().find_element_user(ORDERBY$22, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.LocationResultsOrder)get_store().add_element_user(ORDERBY$22);
            }
            target.set(orderBy);
        }
    }
}
