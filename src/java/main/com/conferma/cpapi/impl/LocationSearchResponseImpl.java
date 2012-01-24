/*
 * XML Type:  LocationSearchResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.LocationSearchResponse
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML LocationSearchResponse(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class LocationSearchResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.LocationSearchResponse
{
    
    public LocationSearchResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HASRESULTS$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "HasResults");
    private static final javax.xml.namespace.QName HASLOCATIONOPTIONS$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "HasLocationOptions");
    private static final javax.xml.namespace.QName ISGEOSUPPORTED$4 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "IsGeoSupported");
    private static final javax.xml.namespace.QName LOCATIONFOCUS$6 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "LocationFocus");
    private static final javax.xml.namespace.QName LOCATIONOPTIONS$8 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "LocationOptions");
    private static final javax.xml.namespace.QName LOCATIONS$10 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Locations");
    
    
    /**
     * Gets the "HasResults" element
     */
    public boolean getHasResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASRESULTS$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "HasResults" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASRESULTS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "HasResults" element
     */
    public void setHasResults(boolean hasResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASRESULTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASRESULTS$0);
            }
            target.setBooleanValue(hasResults);
        }
    }
    
    /**
     * Sets (as xml) the "HasResults" element
     */
    public void xsetHasResults(org.apache.xmlbeans.XmlBoolean hasResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASRESULTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASRESULTS$0);
            }
            target.set(hasResults);
        }
    }
    
    /**
     * Gets the "HasLocationOptions" element
     */
    public boolean getHasLocationOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASLOCATIONOPTIONS$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "HasLocationOptions" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasLocationOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASLOCATIONOPTIONS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "HasLocationOptions" element
     */
    public void setHasLocationOptions(boolean hasLocationOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASLOCATIONOPTIONS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASLOCATIONOPTIONS$2);
            }
            target.setBooleanValue(hasLocationOptions);
        }
    }
    
    /**
     * Sets (as xml) the "HasLocationOptions" element
     */
    public void xsetHasLocationOptions(org.apache.xmlbeans.XmlBoolean hasLocationOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASLOCATIONOPTIONS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASLOCATIONOPTIONS$2);
            }
            target.set(hasLocationOptions);
        }
    }
    
    /**
     * Gets the "IsGeoSupported" element
     */
    public boolean getIsGeoSupported()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISGEOSUPPORTED$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsGeoSupported" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsGeoSupported()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISGEOSUPPORTED$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IsGeoSupported" element
     */
    public void setIsGeoSupported(boolean isGeoSupported)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISGEOSUPPORTED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISGEOSUPPORTED$4);
            }
            target.setBooleanValue(isGeoSupported);
        }
    }
    
    /**
     * Sets (as xml) the "IsGeoSupported" element
     */
    public void xsetIsGeoSupported(org.apache.xmlbeans.XmlBoolean isGeoSupported)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISGEOSUPPORTED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISGEOSUPPORTED$4);
            }
            target.set(isGeoSupported);
        }
    }
    
    /**
     * Gets the "LocationFocus" element
     */
    public com.conferma.cpapi.LocationOption getLocationFocus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationOption target = null;
            target = (com.conferma.cpapi.LocationOption)get_store().find_element_user(LOCATIONFOCUS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LocationFocus" element
     */
    public boolean isSetLocationFocus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONFOCUS$6) != 0;
        }
    }
    
    /**
     * Sets the "LocationFocus" element
     */
    public void setLocationFocus(com.conferma.cpapi.LocationOption locationFocus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationOption target = null;
            target = (com.conferma.cpapi.LocationOption)get_store().find_element_user(LOCATIONFOCUS$6, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.LocationOption)get_store().add_element_user(LOCATIONFOCUS$6);
            }
            target.set(locationFocus);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationFocus" element
     */
    public com.conferma.cpapi.LocationOption addNewLocationFocus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationOption target = null;
            target = (com.conferma.cpapi.LocationOption)get_store().add_element_user(LOCATIONFOCUS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "LocationFocus" element
     */
    public void unsetLocationFocus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONFOCUS$6, 0);
        }
    }
    
    /**
     * Gets the "LocationOptions" element
     */
    public com.conferma.cpapi.ArrayOfLocationOption getLocationOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfLocationOption target = null;
            target = (com.conferma.cpapi.ArrayOfLocationOption)get_store().find_element_user(LOCATIONOPTIONS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LocationOptions" element
     */
    public boolean isSetLocationOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONOPTIONS$8) != 0;
        }
    }
    
    /**
     * Sets the "LocationOptions" element
     */
    public void setLocationOptions(com.conferma.cpapi.ArrayOfLocationOption locationOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfLocationOption target = null;
            target = (com.conferma.cpapi.ArrayOfLocationOption)get_store().find_element_user(LOCATIONOPTIONS$8, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.ArrayOfLocationOption)get_store().add_element_user(LOCATIONOPTIONS$8);
            }
            target.set(locationOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationOptions" element
     */
    public com.conferma.cpapi.ArrayOfLocationOption addNewLocationOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfLocationOption target = null;
            target = (com.conferma.cpapi.ArrayOfLocationOption)get_store().add_element_user(LOCATIONOPTIONS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "LocationOptions" element
     */
    public void unsetLocationOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONOPTIONS$8, 0);
        }
    }
    
    /**
     * Gets the "Locations" element
     */
    public com.conferma.cpapi.ArrayOfLocationRecord getLocations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfLocationRecord target = null;
            target = (com.conferma.cpapi.ArrayOfLocationRecord)get_store().find_element_user(LOCATIONS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Locations" element
     */
    public boolean isSetLocations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONS$10) != 0;
        }
    }
    
    /**
     * Sets the "Locations" element
     */
    public void setLocations(com.conferma.cpapi.ArrayOfLocationRecord locations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfLocationRecord target = null;
            target = (com.conferma.cpapi.ArrayOfLocationRecord)get_store().find_element_user(LOCATIONS$10, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.ArrayOfLocationRecord)get_store().add_element_user(LOCATIONS$10);
            }
            target.set(locations);
        }
    }
    
    /**
     * Appends and returns a new empty "Locations" element
     */
    public com.conferma.cpapi.ArrayOfLocationRecord addNewLocations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfLocationRecord target = null;
            target = (com.conferma.cpapi.ArrayOfLocationRecord)get_store().add_element_user(LOCATIONS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "Locations" element
     */
    public void unsetLocations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONS$10, 0);
        }
    }
}
