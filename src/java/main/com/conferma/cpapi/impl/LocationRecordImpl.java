/*
 * XML Type:  LocationRecord
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.LocationRecord
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML LocationRecord(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class LocationRecordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.LocationRecord
{
    
    public LocationRecordImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOTEL$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Hotel");
    private static final javax.xml.namespace.QName TRAINSTATION$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "TrainStation");
    private static final javax.xml.namespace.QName METROSTATION$4 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "MetroStation");
    private static final javax.xml.namespace.QName AIRPORT$6 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Airport");
    private static final javax.xml.namespace.QName LOCATIONTYPE$8 = 
        new javax.xml.namespace.QName("", "LocationType");
    private static final javax.xml.namespace.QName DISTANCE$10 = 
        new javax.xml.namespace.QName("", "Distance");
    private static final javax.xml.namespace.QName DISTANCETYPE$12 = 
        new javax.xml.namespace.QName("", "DistanceType");
    private static final javax.xml.namespace.QName LONGITUDE$14 = 
        new javax.xml.namespace.QName("", "Longitude");
    private static final javax.xml.namespace.QName LATITUDE$16 = 
        new javax.xml.namespace.QName("", "Latitude");
    
    
    /**
     * Gets the "Hotel" element
     */
    public com.conferma.cpapi.LocationHotelResult getHotel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationHotelResult target = null;
            target = (com.conferma.cpapi.LocationHotelResult)get_store().find_element_user(HOTEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Hotel" element
     */
    public boolean isSetHotel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOTEL$0) != 0;
        }
    }
    
    /**
     * Sets the "Hotel" element
     */
    public void setHotel(com.conferma.cpapi.LocationHotelResult hotel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationHotelResult target = null;
            target = (com.conferma.cpapi.LocationHotelResult)get_store().find_element_user(HOTEL$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.LocationHotelResult)get_store().add_element_user(HOTEL$0);
            }
            target.set(hotel);
        }
    }
    
    /**
     * Appends and returns a new empty "Hotel" element
     */
    public com.conferma.cpapi.LocationHotelResult addNewHotel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationHotelResult target = null;
            target = (com.conferma.cpapi.LocationHotelResult)get_store().add_element_user(HOTEL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Hotel" element
     */
    public void unsetHotel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOTEL$0, 0);
        }
    }
    
    /**
     * Gets the "TrainStation" element
     */
    public com.conferma.cpapi.LocationTrainStationResult getTrainStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationTrainStationResult target = null;
            target = (com.conferma.cpapi.LocationTrainStationResult)get_store().find_element_user(TRAINSTATION$2, 0);
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
            return get_store().count_elements(TRAINSTATION$2) != 0;
        }
    }
    
    /**
     * Sets the "TrainStation" element
     */
    public void setTrainStation(com.conferma.cpapi.LocationTrainStationResult trainStation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationTrainStationResult target = null;
            target = (com.conferma.cpapi.LocationTrainStationResult)get_store().find_element_user(TRAINSTATION$2, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.LocationTrainStationResult)get_store().add_element_user(TRAINSTATION$2);
            }
            target.set(trainStation);
        }
    }
    
    /**
     * Appends and returns a new empty "TrainStation" element
     */
    public com.conferma.cpapi.LocationTrainStationResult addNewTrainStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationTrainStationResult target = null;
            target = (com.conferma.cpapi.LocationTrainStationResult)get_store().add_element_user(TRAINSTATION$2);
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
            get_store().remove_element(TRAINSTATION$2, 0);
        }
    }
    
    /**
     * Gets the "MetroStation" element
     */
    public com.conferma.cpapi.LocationMetroStationResult getMetroStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationMetroStationResult target = null;
            target = (com.conferma.cpapi.LocationMetroStationResult)get_store().find_element_user(METROSTATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MetroStation" element
     */
    public boolean isSetMetroStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METROSTATION$4) != 0;
        }
    }
    
    /**
     * Sets the "MetroStation" element
     */
    public void setMetroStation(com.conferma.cpapi.LocationMetroStationResult metroStation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationMetroStationResult target = null;
            target = (com.conferma.cpapi.LocationMetroStationResult)get_store().find_element_user(METROSTATION$4, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.LocationMetroStationResult)get_store().add_element_user(METROSTATION$4);
            }
            target.set(metroStation);
        }
    }
    
    /**
     * Appends and returns a new empty "MetroStation" element
     */
    public com.conferma.cpapi.LocationMetroStationResult addNewMetroStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationMetroStationResult target = null;
            target = (com.conferma.cpapi.LocationMetroStationResult)get_store().add_element_user(METROSTATION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "MetroStation" element
     */
    public void unsetMetroStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METROSTATION$4, 0);
        }
    }
    
    /**
     * Gets the "Airport" element
     */
    public com.conferma.cpapi.LocationAirportResult getAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationAirportResult target = null;
            target = (com.conferma.cpapi.LocationAirportResult)get_store().find_element_user(AIRPORT$6, 0);
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
    public void setAirport(com.conferma.cpapi.LocationAirportResult airport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationAirportResult target = null;
            target = (com.conferma.cpapi.LocationAirportResult)get_store().find_element_user(AIRPORT$6, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.LocationAirportResult)get_store().add_element_user(AIRPORT$6);
            }
            target.set(airport);
        }
    }
    
    /**
     * Appends and returns a new empty "Airport" element
     */
    public com.conferma.cpapi.LocationAirportResult addNewAirport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationAirportResult target = null;
            target = (com.conferma.cpapi.LocationAirportResult)get_store().add_element_user(AIRPORT$6);
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
     * Gets the "LocationType" attribute
     */
    public com.conferma.cpapi.LocationType.Enum getLocationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATIONTYPE$8);
            if (target == null)
            {
                return null;
            }
            return (com.conferma.cpapi.LocationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "LocationType" attribute
     */
    public com.conferma.cpapi.LocationType xgetLocationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationType target = null;
            target = (com.conferma.cpapi.LocationType)get_store().find_attribute_user(LOCATIONTYPE$8);
            return target;
        }
    }
    
    /**
     * Sets the "LocationType" attribute
     */
    public void setLocationType(com.conferma.cpapi.LocationType.Enum locationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATIONTYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATIONTYPE$8);
            }
            target.setEnumValue(locationType);
        }
    }
    
    /**
     * Sets (as xml) the "LocationType" attribute
     */
    public void xsetLocationType(com.conferma.cpapi.LocationType locationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationType target = null;
            target = (com.conferma.cpapi.LocationType)get_store().find_attribute_user(LOCATIONTYPE$8);
            if (target == null)
            {
                target = (com.conferma.cpapi.LocationType)get_store().add_attribute_user(LOCATIONTYPE$8);
            }
            target.set(locationType);
        }
    }
    
    /**
     * Gets the "Distance" attribute
     */
    public java.math.BigDecimal getDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCE$10);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Distance" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(DISTANCE$10);
            return target;
        }
    }
    
    /**
     * Sets the "Distance" attribute
     */
    public void setDistance(java.math.BigDecimal distance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTANCE$10);
            }
            target.setBigDecimalValue(distance);
        }
    }
    
    /**
     * Sets (as xml) the "Distance" attribute
     */
    public void xsetDistance(org.apache.xmlbeans.XmlDecimal distance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(DISTANCE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(DISTANCE$10);
            }
            target.set(distance);
        }
    }
    
    /**
     * Gets the "DistanceType" attribute
     */
    public com.conferma.cpapi.DistanceType.Enum getDistanceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCETYPE$12);
            if (target == null)
            {
                return null;
            }
            return (com.conferma.cpapi.DistanceType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DistanceType" attribute
     */
    public com.conferma.cpapi.DistanceType xgetDistanceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DistanceType target = null;
            target = (com.conferma.cpapi.DistanceType)get_store().find_attribute_user(DISTANCETYPE$12);
            return target;
        }
    }
    
    /**
     * Sets the "DistanceType" attribute
     */
    public void setDistanceType(com.conferma.cpapi.DistanceType.Enum distanceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCETYPE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTANCETYPE$12);
            }
            target.setEnumValue(distanceType);
        }
    }
    
    /**
     * Sets (as xml) the "DistanceType" attribute
     */
    public void xsetDistanceType(com.conferma.cpapi.DistanceType distanceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DistanceType target = null;
            target = (com.conferma.cpapi.DistanceType)get_store().find_attribute_user(DISTANCETYPE$12);
            if (target == null)
            {
                target = (com.conferma.cpapi.DistanceType)get_store().add_attribute_user(DISTANCETYPE$12);
            }
            target.set(distanceType);
        }
    }
    
    /**
     * Gets the "Longitude" attribute
     */
    public java.math.BigDecimal getLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LONGITUDE$14);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Longitude" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(LONGITUDE$14);
            return target;
        }
    }
    
    /**
     * Sets the "Longitude" attribute
     */
    public void setLongitude(java.math.BigDecimal longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LONGITUDE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LONGITUDE$14);
            }
            target.setBigDecimalValue(longitude);
        }
    }
    
    /**
     * Sets (as xml) the "Longitude" attribute
     */
    public void xsetLongitude(org.apache.xmlbeans.XmlDecimal longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(LONGITUDE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(LONGITUDE$14);
            }
            target.set(longitude);
        }
    }
    
    /**
     * Gets the "Latitude" attribute
     */
    public java.math.BigDecimal getLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATITUDE$16);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Latitude" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(LATITUDE$16);
            return target;
        }
    }
    
    /**
     * Sets the "Latitude" attribute
     */
    public void setLatitude(java.math.BigDecimal latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATITUDE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LATITUDE$16);
            }
            target.setBigDecimalValue(latitude);
        }
    }
    
    /**
     * Sets (as xml) the "Latitude" attribute
     */
    public void xsetLatitude(org.apache.xmlbeans.XmlDecimal latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(LATITUDE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(LATITUDE$16);
            }
            target.set(latitude);
        }
    }
}
