/*
 * XML Type:  LocationTrainStationResult
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.LocationTrainStationResult
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML LocationTrainStationResult(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class LocationTrainStationResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.LocationTrainStationResult
{
    
    public LocationTrainStationResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Name");
    private static final javax.xml.namespace.QName TRAINSTATIONCODE$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "TrainStationCode");
    private static final javax.xml.namespace.QName ADDRESS$4 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Address");
    
    
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
     * Gets the "TrainStationCode" element
     */
    public java.lang.String getTrainStationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRAINSTATIONCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TrainStationCode" element
     */
    public org.apache.xmlbeans.XmlString xgetTrainStationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRAINSTATIONCODE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "TrainStationCode" element
     */
    public boolean isSetTrainStationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRAINSTATIONCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "TrainStationCode" element
     */
    public void setTrainStationCode(java.lang.String trainStationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRAINSTATIONCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRAINSTATIONCODE$2);
            }
            target.setStringValue(trainStationCode);
        }
    }
    
    /**
     * Sets (as xml) the "TrainStationCode" element
     */
    public void xsetTrainStationCode(org.apache.xmlbeans.XmlString trainStationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRAINSTATIONCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRAINSTATIONCODE$2);
            }
            target.set(trainStationCode);
        }
    }
    
    /**
     * Unsets the "TrainStationCode" element
     */
    public void unsetTrainStationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRAINSTATIONCODE$2, 0);
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
            target = (com.conferma.cbapi.cdts.Address)get_store().find_element_user(ADDRESS$4, 0);
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
            return get_store().count_elements(ADDRESS$4) != 0;
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
            target = (com.conferma.cbapi.cdts.Address)get_store().find_element_user(ADDRESS$4, 0);
            if (target == null)
            {
                target = (com.conferma.cbapi.cdts.Address)get_store().add_element_user(ADDRESS$4);
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
            target = (com.conferma.cbapi.cdts.Address)get_store().add_element_user(ADDRESS$4);
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
            get_store().remove_element(ADDRESS$4, 0);
        }
    }
}
