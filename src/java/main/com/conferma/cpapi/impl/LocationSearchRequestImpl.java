/*
 * XML Type:  LocationSearchRequest
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.LocationSearchRequest
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML LocationSearchRequest(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class LocationSearchRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.LocationSearchRequest
{
    
    public LocationSearchRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHTYPE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "SearchType");
    private static final javax.xml.namespace.QName SEARCHMETHOD$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "SearchMethod");
    private static final javax.xml.namespace.QName RADIUS$4 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Radius");
    private static final javax.xml.namespace.QName AIRPORT$6 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Airport");
    private static final javax.xml.namespace.QName EXACTHOTEL$8 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "ExactHotel");
    private static final javax.xml.namespace.QName GEO$10 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Geo");
    private static final javax.xml.namespace.QName LOCATION$12 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Location");
    private static final javax.xml.namespace.QName OFFICE$14 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Office");
    private static final javax.xml.namespace.QName TRAINSTATION$16 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "TrainStation");
    private static final javax.xml.namespace.QName KEYWORD$18 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Keyword");
    private static final javax.xml.namespace.QName ADVANCEDSEARCHOPTIONS$20 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "AdvancedSearchOptions");
    
    
    /**
     * Gets the "SearchType" element
     */
    public com.conferma.cpapi.SearchType.Enum getSearchType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.conferma.cpapi.SearchType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SearchType" element
     */
    public com.conferma.cpapi.SearchType xgetSearchType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.SearchType target = null;
            target = (com.conferma.cpapi.SearchType)get_store().find_element_user(SEARCHTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SearchType" element
     */
    public void setSearchType(com.conferma.cpapi.SearchType.Enum searchType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHTYPE$0);
            }
            target.setEnumValue(searchType);
        }
    }
    
    /**
     * Sets (as xml) the "SearchType" element
     */
    public void xsetSearchType(com.conferma.cpapi.SearchType searchType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.SearchType target = null;
            target = (com.conferma.cpapi.SearchType)get_store().find_element_user(SEARCHTYPE$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.SearchType)get_store().add_element_user(SEARCHTYPE$0);
            }
            target.set(searchType);
        }
    }
    
    /**
     * Gets the "SearchMethod" element
     */
    public com.conferma.cpapi.SearchMethod.Enum getSearchMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHMETHOD$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.conferma.cpapi.SearchMethod.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SearchMethod" element
     */
    public com.conferma.cpapi.SearchMethod xgetSearchMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.SearchMethod target = null;
            target = (com.conferma.cpapi.SearchMethod)get_store().find_element_user(SEARCHMETHOD$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SearchMethod" element
     */
    public void setSearchMethod(com.conferma.cpapi.SearchMethod.Enum searchMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHMETHOD$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHMETHOD$2);
            }
            target.setEnumValue(searchMethod);
        }
    }
    
    /**
     * Sets (as xml) the "SearchMethod" element
     */
    public void xsetSearchMethod(com.conferma.cpapi.SearchMethod searchMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.SearchMethod target = null;
            target = (com.conferma.cpapi.SearchMethod)get_store().find_element_user(SEARCHMETHOD$2, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.SearchMethod)get_store().add_element_user(SEARCHMETHOD$2);
            }
            target.set(searchMethod);
        }
    }
    
    /**
     * Gets the "Radius" element
     */
    public com.conferma.cpapi.Radius getRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Radius target = null;
            target = (com.conferma.cpapi.Radius)get_store().find_element_user(RADIUS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Radius" element
     */
    public boolean isSetRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RADIUS$4) != 0;
        }
    }
    
    /**
     * Sets the "Radius" element
     */
    public void setRadius(com.conferma.cpapi.Radius radius)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Radius target = null;
            target = (com.conferma.cpapi.Radius)get_store().find_element_user(RADIUS$4, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.Radius)get_store().add_element_user(RADIUS$4);
            }
            target.set(radius);
        }
    }
    
    /**
     * Appends and returns a new empty "Radius" element
     */
    public com.conferma.cpapi.Radius addNewRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Radius target = null;
            target = (com.conferma.cpapi.Radius)get_store().add_element_user(RADIUS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Radius" element
     */
    public void unsetRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RADIUS$4, 0);
        }
    }
    
    /**
     * Gets the "Airport" element
     */
    public com.conferma.cpapi.AirportSearch getAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.AirportSearch target = null;
            target = (com.conferma.cpapi.AirportSearch)get_store().find_element_user(AIRPORT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Airport" element
     */
    public boolean isSetAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AIRPORT$6) != 0;
        }
    }
    
    /**
     * Sets the "Airport" element
     */
    public void setAirport(com.conferma.cpapi.AirportSearch airport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.AirportSearch target = null;
            target = (com.conferma.cpapi.AirportSearch)get_store().find_element_user(AIRPORT$6, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.AirportSearch)get_store().add_element_user(AIRPORT$6);
            }
            target.set(airport);
        }
    }
    
    /**
     * Appends and returns a new empty "Airport" element
     */
    public com.conferma.cpapi.AirportSearch addNewAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.AirportSearch target = null;
            target = (com.conferma.cpapi.AirportSearch)get_store().add_element_user(AIRPORT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Airport" element
     */
    public void unsetAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AIRPORT$6, 0);
        }
    }
    
    /**
     * Gets the "ExactHotel" element
     */
    public com.conferma.cpapi.ExactHotelSearch getExactHotel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ExactHotelSearch target = null;
            target = (com.conferma.cpapi.ExactHotelSearch)get_store().find_element_user(EXACTHOTEL$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ExactHotel" element
     */
    public boolean isSetExactHotel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXACTHOTEL$8) != 0;
        }
    }
    
    /**
     * Sets the "ExactHotel" element
     */
    public void setExactHotel(com.conferma.cpapi.ExactHotelSearch exactHotel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ExactHotelSearch target = null;
            target = (com.conferma.cpapi.ExactHotelSearch)get_store().find_element_user(EXACTHOTEL$8, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.ExactHotelSearch)get_store().add_element_user(EXACTHOTEL$8);
            }
            target.set(exactHotel);
        }
    }
    
    /**
     * Appends and returns a new empty "ExactHotel" element
     */
    public com.conferma.cpapi.ExactHotelSearch addNewExactHotel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ExactHotelSearch target = null;
            target = (com.conferma.cpapi.ExactHotelSearch)get_store().add_element_user(EXACTHOTEL$8);
            return target;
        }
    }
    
    /**
     * Unsets the "ExactHotel" element
     */
    public void unsetExactHotel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXACTHOTEL$8, 0);
        }
    }
    
    /**
     * Gets the "Geo" element
     */
    public com.conferma.cpapi.GeocodeSearch getGeo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GeocodeSearch target = null;
            target = (com.conferma.cpapi.GeocodeSearch)get_store().find_element_user(GEO$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Geo" element
     */
    public boolean isSetGeo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEO$10) != 0;
        }
    }
    
    /**
     * Sets the "Geo" element
     */
    public void setGeo(com.conferma.cpapi.GeocodeSearch geo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GeocodeSearch target = null;
            target = (com.conferma.cpapi.GeocodeSearch)get_store().find_element_user(GEO$10, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.GeocodeSearch)get_store().add_element_user(GEO$10);
            }
            target.set(geo);
        }
    }
    
    /**
     * Appends and returns a new empty "Geo" element
     */
    public com.conferma.cpapi.GeocodeSearch addNewGeo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GeocodeSearch target = null;
            target = (com.conferma.cpapi.GeocodeSearch)get_store().add_element_user(GEO$10);
            return target;
        }
    }
    
    /**
     * Unsets the "Geo" element
     */
    public void unsetGeo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEO$10, 0);
        }
    }
    
    /**
     * Gets the "Location" element
     */
    public com.conferma.cpapi.LocationSearch getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationSearch target = null;
            target = (com.conferma.cpapi.LocationSearch)get_store().find_element_user(LOCATION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Location" element
     */
    public boolean isSetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATION$12) != 0;
        }
    }
    
    /**
     * Sets the "Location" element
     */
    public void setLocation(com.conferma.cpapi.LocationSearch location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationSearch target = null;
            target = (com.conferma.cpapi.LocationSearch)get_store().find_element_user(LOCATION$12, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.LocationSearch)get_store().add_element_user(LOCATION$12);
            }
            target.set(location);
        }
    }
    
    /**
     * Appends and returns a new empty "Location" element
     */
    public com.conferma.cpapi.LocationSearch addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationSearch target = null;
            target = (com.conferma.cpapi.LocationSearch)get_store().add_element_user(LOCATION$12);
            return target;
        }
    }
    
    /**
     * Unsets the "Location" element
     */
    public void unsetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATION$12, 0);
        }
    }
    
    /**
     * Gets the "Office" element
     */
    public com.conferma.cpapi.OfficeSearch getOffice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.OfficeSearch target = null;
            target = (com.conferma.cpapi.OfficeSearch)get_store().find_element_user(OFFICE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Office" element
     */
    public boolean isSetOffice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFICE$14) != 0;
        }
    }
    
    /**
     * Sets the "Office" element
     */
    public void setOffice(com.conferma.cpapi.OfficeSearch office)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.OfficeSearch target = null;
            target = (com.conferma.cpapi.OfficeSearch)get_store().find_element_user(OFFICE$14, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.OfficeSearch)get_store().add_element_user(OFFICE$14);
            }
            target.set(office);
        }
    }
    
    /**
     * Appends and returns a new empty "Office" element
     */
    public com.conferma.cpapi.OfficeSearch addNewOffice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.OfficeSearch target = null;
            target = (com.conferma.cpapi.OfficeSearch)get_store().add_element_user(OFFICE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "Office" element
     */
    public void unsetOffice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFICE$14, 0);
        }
    }
    
    /**
     * Gets the "TrainStation" element
     */
    public com.conferma.cpapi.TrainStationSearch getTrainStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.TrainStationSearch target = null;
            target = (com.conferma.cpapi.TrainStationSearch)get_store().find_element_user(TRAINSTATION$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TrainStation" element
     */
    public boolean isSetTrainStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRAINSTATION$16) != 0;
        }
    }
    
    /**
     * Sets the "TrainStation" element
     */
    public void setTrainStation(com.conferma.cpapi.TrainStationSearch trainStation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.TrainStationSearch target = null;
            target = (com.conferma.cpapi.TrainStationSearch)get_store().find_element_user(TRAINSTATION$16, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.TrainStationSearch)get_store().add_element_user(TRAINSTATION$16);
            }
            target.set(trainStation);
        }
    }
    
    /**
     * Appends and returns a new empty "TrainStation" element
     */
    public com.conferma.cpapi.TrainStationSearch addNewTrainStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.TrainStationSearch target = null;
            target = (com.conferma.cpapi.TrainStationSearch)get_store().add_element_user(TRAINSTATION$16);
            return target;
        }
    }
    
    /**
     * Unsets the "TrainStation" element
     */
    public void unsetTrainStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRAINSTATION$16, 0);
        }
    }
    
    /**
     * Gets the "Keyword" element
     */
    public com.conferma.cpapi.KeywordSearch getKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.KeywordSearch target = null;
            target = (com.conferma.cpapi.KeywordSearch)get_store().find_element_user(KEYWORD$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Keyword" element
     */
    public boolean isSetKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYWORD$18) != 0;
        }
    }
    
    /**
     * Sets the "Keyword" element
     */
    public void setKeyword(com.conferma.cpapi.KeywordSearch keyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.KeywordSearch target = null;
            target = (com.conferma.cpapi.KeywordSearch)get_store().find_element_user(KEYWORD$18, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.KeywordSearch)get_store().add_element_user(KEYWORD$18);
            }
            target.set(keyword);
        }
    }
    
    /**
     * Appends and returns a new empty "Keyword" element
     */
    public com.conferma.cpapi.KeywordSearch addNewKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.KeywordSearch target = null;
            target = (com.conferma.cpapi.KeywordSearch)get_store().add_element_user(KEYWORD$18);
            return target;
        }
    }
    
    /**
     * Unsets the "Keyword" element
     */
    public void unsetKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYWORD$18, 0);
        }
    }
    
    /**
     * Gets the "AdvancedSearchOptions" element
     */
    public com.conferma.cpapi.AdvancedSearchOptions getAdvancedSearchOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.AdvancedSearchOptions target = null;
            target = (com.conferma.cpapi.AdvancedSearchOptions)get_store().find_element_user(ADVANCEDSEARCHOPTIONS$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AdvancedSearchOptions" element
     */
    public boolean isSetAdvancedSearchOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADVANCEDSEARCHOPTIONS$20) != 0;
        }
    }
    
    /**
     * Sets the "AdvancedSearchOptions" element
     */
    public void setAdvancedSearchOptions(com.conferma.cpapi.AdvancedSearchOptions advancedSearchOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.AdvancedSearchOptions target = null;
            target = (com.conferma.cpapi.AdvancedSearchOptions)get_store().find_element_user(ADVANCEDSEARCHOPTIONS$20, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.AdvancedSearchOptions)get_store().add_element_user(ADVANCEDSEARCHOPTIONS$20);
            }
            target.set(advancedSearchOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "AdvancedSearchOptions" element
     */
    public com.conferma.cpapi.AdvancedSearchOptions addNewAdvancedSearchOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.AdvancedSearchOptions target = null;
            target = (com.conferma.cpapi.AdvancedSearchOptions)get_store().add_element_user(ADVANCEDSEARCHOPTIONS$20);
            return target;
        }
    }
    
    /**
     * Unsets the "AdvancedSearchOptions" element
     */
    public void unsetAdvancedSearchOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADVANCEDSEARCHOPTIONS$20, 0);
        }
    }
}
