/*
 * XML Type:  TrainStationSearch
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.TrainStationSearch
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML TrainStationSearch(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class TrainStationSearchImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.TrainStationSearch
{
    
    public TrainStationSearchImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRAINSTATIONCODE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "TrainStationCode");
    
    
    /**
     * Gets the "TrainStationCode" element
     */
    public java.lang.String getTrainStationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRAINSTATIONCODE$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRAINSTATIONCODE$0, 0);
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
            return get_store().count_elements(TRAINSTATIONCODE$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRAINSTATIONCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRAINSTATIONCODE$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRAINSTATIONCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRAINSTATIONCODE$0);
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
            get_store().remove_element(TRAINSTATIONCODE$0, 0);
        }
    }
}
