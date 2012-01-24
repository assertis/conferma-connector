/*
 * XML Type:  NearbyLocation
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.NearbyLocation
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML NearbyLocation(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class NearbyLocationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.NearbyLocation
{
    
    public NearbyLocationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONTYPE$0 = 
        new javax.xml.namespace.QName("", "LocationType");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "Name");
    private static final javax.xml.namespace.QName CODE$4 = 
        new javax.xml.namespace.QName("", "Code");
    private static final javax.xml.namespace.QName DISTANCE$6 = 
        new javax.xml.namespace.QName("", "Distance");
    private static final javax.xml.namespace.QName DISTANCETYPE$8 = 
        new javax.xml.namespace.QName("", "DistanceType");
    private static final javax.xml.namespace.QName LATITUDE$10 = 
        new javax.xml.namespace.QName("", "Latitude");
    private static final javax.xml.namespace.QName LONGITUDE$12 = 
        new javax.xml.namespace.QName("", "Longitude");
    
    
    /**
     * Gets the "LocationType" attribute
     */
    public com.conferma.cpapi.LocationType.Enum getLocationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATIONTYPE$0);
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
            target = (com.conferma.cpapi.LocationType)get_store().find_attribute_user(LOCATIONTYPE$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATIONTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATIONTYPE$0);
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
            target = (com.conferma.cpapi.LocationType)get_store().find_attribute_user(LOCATIONTYPE$0);
            if (target == null)
            {
                target = (com.conferma.cpapi.LocationType)get_store().add_attribute_user(LOCATIONTYPE$0);
            }
            target.set(locationType);
        }
    }
    
    /**
     * Gets the "Name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
            return target;
        }
    }
    
    /**
     * True if has "Name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$2) != null;
        }
    }
    
    /**
     * Sets the "Name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$2);
        }
    }
    
    /**
     * Gets the "Code" attribute
     */
    public java.lang.String getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Code" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODE$4);
            return target;
        }
    }
    
    /**
     * True if has "Code" attribute
     */
    public boolean isSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODE$4) != null;
        }
    }
    
    /**
     * Sets the "Code" attribute
     */
    public void setCode(java.lang.String code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$4);
            }
            target.setStringValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "Code" attribute
     */
    public void xsetCode(org.apache.xmlbeans.XmlString code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CODE$4);
            }
            target.set(code);
        }
    }
    
    /**
     * Unsets the "Code" attribute
     */
    public void unsetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODE$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCE$6);
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
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(DISTANCE$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTANCE$6);
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
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(DISTANCE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(DISTANCE$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCETYPE$8);
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
            target = (com.conferma.cpapi.DistanceType)get_store().find_attribute_user(DISTANCETYPE$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCETYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTANCETYPE$8);
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
            target = (com.conferma.cpapi.DistanceType)get_store().find_attribute_user(DISTANCETYPE$8);
            if (target == null)
            {
                target = (com.conferma.cpapi.DistanceType)get_store().add_attribute_user(DISTANCETYPE$8);
            }
            target.set(distanceType);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATITUDE$10);
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
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(LATITUDE$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATITUDE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LATITUDE$10);
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
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(LATITUDE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(LATITUDE$10);
            }
            target.set(latitude);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LONGITUDE$12);
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
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(LONGITUDE$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LONGITUDE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LONGITUDE$12);
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
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(LONGITUDE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(LONGITUDE$12);
            }
            target.set(longitude);
        }
    }
}
