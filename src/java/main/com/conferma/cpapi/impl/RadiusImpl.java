/*
 * XML Type:  Radius
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.Radius
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML Radius(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class RadiusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.Radius
{
    
    public RadiusImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISTANCE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Distance");
    private static final javax.xml.namespace.QName DISTANCETYPE$2 = 
        new javax.xml.namespace.QName("", "DistanceType");
    private static final javax.xml.namespace.QName AUTOINCREASE$4 = 
        new javax.xml.namespace.QName("", "AutoIncrease");
    
    
    /**
     * Gets the "Distance" element
     */
    public int getDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Distance" element
     */
    public org.apache.xmlbeans.XmlInt xgetDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DISTANCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Distance" element
     */
    public void setDistance(int distance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCE$0);
            }
            target.setIntValue(distance);
        }
    }
    
    /**
     * Sets (as xml) the "Distance" element
     */
    public void xsetDistance(org.apache.xmlbeans.XmlInt distance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DISTANCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DISTANCE$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCETYPE$2);
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
            target = (com.conferma.cpapi.DistanceType)get_store().find_attribute_user(DISTANCETYPE$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCETYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTANCETYPE$2);
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
            target = (com.conferma.cpapi.DistanceType)get_store().find_attribute_user(DISTANCETYPE$2);
            if (target == null)
            {
                target = (com.conferma.cpapi.DistanceType)get_store().add_attribute_user(DISTANCETYPE$2);
            }
            target.set(distanceType);
        }
    }
    
    /**
     * Gets the "AutoIncrease" attribute
     */
    public boolean getAutoIncrease()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOINCREASE$4);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "AutoIncrease" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAutoIncrease()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOINCREASE$4);
            return target;
        }
    }
    
    /**
     * Sets the "AutoIncrease" attribute
     */
    public void setAutoIncrease(boolean autoIncrease)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOINCREASE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOINCREASE$4);
            }
            target.setBooleanValue(autoIncrease);
        }
    }
    
    /**
     * Sets (as xml) the "AutoIncrease" attribute
     */
    public void xsetAutoIncrease(org.apache.xmlbeans.XmlBoolean autoIncrease)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOINCREASE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTOINCREASE$4);
            }
            target.set(autoIncrease);
        }
    }
}
