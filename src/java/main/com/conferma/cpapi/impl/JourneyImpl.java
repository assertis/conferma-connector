/*
 * XML Type:  Journey
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.Journey
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML Journey(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class JourneyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.Journey
{
    
    public JourneyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUPPLIERCODE$0 = 
        new javax.xml.namespace.QName("", "SupplierCode");
    private static final javax.xml.namespace.QName JOURNEYID$2 = 
        new javax.xml.namespace.QName("", "JourneyID");
    private static final javax.xml.namespace.QName STARTLOCATION$4 = 
        new javax.xml.namespace.QName("", "StartLocation");
    private static final javax.xml.namespace.QName STARTDATETIME$6 = 
        new javax.xml.namespace.QName("", "StartDateTime");
    private static final javax.xml.namespace.QName ENDLOCATION$8 = 
        new javax.xml.namespace.QName("", "EndLocation");
    private static final javax.xml.namespace.QName ENDDATETIME$10 = 
        new javax.xml.namespace.QName("", "EndDateTime");
    
    
    /**
     * Gets the "SupplierCode" attribute
     */
    public java.lang.String getSupplierCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPPLIERCODE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SupplierCode" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSupplierCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUPPLIERCODE$0);
            return target;
        }
    }
    
    /**
     * True if has "SupplierCode" attribute
     */
    public boolean isSetSupplierCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUPPLIERCODE$0) != null;
        }
    }
    
    /**
     * Sets the "SupplierCode" attribute
     */
    public void setSupplierCode(java.lang.String supplierCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPPLIERCODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUPPLIERCODE$0);
            }
            target.setStringValue(supplierCode);
        }
    }
    
    /**
     * Sets (as xml) the "SupplierCode" attribute
     */
    public void xsetSupplierCode(org.apache.xmlbeans.XmlString supplierCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUPPLIERCODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SUPPLIERCODE$0);
            }
            target.set(supplierCode);
        }
    }
    
    /**
     * Unsets the "SupplierCode" attribute
     */
    public void unsetSupplierCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUPPLIERCODE$0);
        }
    }
    
    /**
     * Gets the "JourneyID" attribute
     */
    public java.lang.String getJourneyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JOURNEYID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "JourneyID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetJourneyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JOURNEYID$2);
            return target;
        }
    }
    
    /**
     * True if has "JourneyID" attribute
     */
    public boolean isSetJourneyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(JOURNEYID$2) != null;
        }
    }
    
    /**
     * Sets the "JourneyID" attribute
     */
    public void setJourneyID(java.lang.String journeyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JOURNEYID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JOURNEYID$2);
            }
            target.setStringValue(journeyID);
        }
    }
    
    /**
     * Sets (as xml) the "JourneyID" attribute
     */
    public void xsetJourneyID(org.apache.xmlbeans.XmlString journeyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JOURNEYID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(JOURNEYID$2);
            }
            target.set(journeyID);
        }
    }
    
    /**
     * Unsets the "JourneyID" attribute
     */
    public void unsetJourneyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(JOURNEYID$2);
        }
    }
    
    /**
     * Gets the "StartLocation" attribute
     */
    public java.lang.String getStartLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTLOCATION$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "StartLocation" attribute
     */
    public org.apache.xmlbeans.XmlString xgetStartLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STARTLOCATION$4);
            return target;
        }
    }
    
    /**
     * True if has "StartLocation" attribute
     */
    public boolean isSetStartLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STARTLOCATION$4) != null;
        }
    }
    
    /**
     * Sets the "StartLocation" attribute
     */
    public void setStartLocation(java.lang.String startLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTLOCATION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTLOCATION$4);
            }
            target.setStringValue(startLocation);
        }
    }
    
    /**
     * Sets (as xml) the "StartLocation" attribute
     */
    public void xsetStartLocation(org.apache.xmlbeans.XmlString startLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STARTLOCATION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STARTLOCATION$4);
            }
            target.set(startLocation);
        }
    }
    
    /**
     * Unsets the "StartLocation" attribute
     */
    public void unsetStartLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STARTLOCATION$4);
        }
    }
    
    /**
     * Gets the "StartDateTime" attribute
     */
    public java.util.Calendar getStartDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATETIME$6);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "StartDateTime" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetStartDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(STARTDATETIME$6);
            return target;
        }
    }
    
    /**
     * Sets the "StartDateTime" attribute
     */
    public void setStartDateTime(java.util.Calendar startDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATETIME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTDATETIME$6);
            }
            target.setCalendarValue(startDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "StartDateTime" attribute
     */
    public void xsetStartDateTime(org.apache.xmlbeans.XmlDateTime startDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(STARTDATETIME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(STARTDATETIME$6);
            }
            target.set(startDateTime);
        }
    }
    
    /**
     * Gets the "EndLocation" attribute
     */
    public java.lang.String getEndLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDLOCATION$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EndLocation" attribute
     */
    public org.apache.xmlbeans.XmlString xgetEndLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENDLOCATION$8);
            return target;
        }
    }
    
    /**
     * True if has "EndLocation" attribute
     */
    public boolean isSetEndLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENDLOCATION$8) != null;
        }
    }
    
    /**
     * Sets the "EndLocation" attribute
     */
    public void setEndLocation(java.lang.String endLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDLOCATION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDLOCATION$8);
            }
            target.setStringValue(endLocation);
        }
    }
    
    /**
     * Sets (as xml) the "EndLocation" attribute
     */
    public void xsetEndLocation(org.apache.xmlbeans.XmlString endLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENDLOCATION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENDLOCATION$8);
            }
            target.set(endLocation);
        }
    }
    
    /**
     * Unsets the "EndLocation" attribute
     */
    public void unsetEndLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENDLOCATION$8);
        }
    }
    
    /**
     * Gets the "EndDateTime" attribute
     */
    public java.util.Calendar getEndDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATETIME$10);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EndDateTime" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetEndDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(ENDDATETIME$10);
            return target;
        }
    }
    
    /**
     * Sets the "EndDateTime" attribute
     */
    public void setEndDateTime(java.util.Calendar endDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATETIME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDDATETIME$10);
            }
            target.setCalendarValue(endDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "EndDateTime" attribute
     */
    public void xsetEndDateTime(org.apache.xmlbeans.XmlDateTime endDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(ENDDATETIME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(ENDDATETIME$10);
            }
            target.set(endDateTime);
        }
    }
}
