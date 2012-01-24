/*
 * XML Type:  ArrayOfLocationOption
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.ArrayOfLocationOption
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML ArrayOfLocationOption(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class ArrayOfLocationOptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.ArrayOfLocationOption
{
    
    public ArrayOfLocationOptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONOPTION$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "LocationOption");
    
    
    /**
     * Gets array of all "LocationOption" elements
     */
    public com.conferma.cpapi.LocationOption[] getLocationOptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATIONOPTION$0, targetList);
            com.conferma.cpapi.LocationOption[] result = new com.conferma.cpapi.LocationOption[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LocationOption" element
     */
    public com.conferma.cpapi.LocationOption getLocationOptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationOption target = null;
            target = (com.conferma.cpapi.LocationOption)get_store().find_element_user(LOCATIONOPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LocationOption" element
     */
    public boolean isNilLocationOptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationOption target = null;
            target = (com.conferma.cpapi.LocationOption)get_store().find_element_user(LOCATIONOPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LocationOption" element
     */
    public int sizeOfLocationOptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONOPTION$0);
        }
    }
    
    /**
     * Sets array of all "LocationOption" element
     */
    public void setLocationOptionArray(com.conferma.cpapi.LocationOption[] locationOptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationOptionArray, LOCATIONOPTION$0);
        }
    }
    
    /**
     * Sets ith "LocationOption" element
     */
    public void setLocationOptionArray(int i, com.conferma.cpapi.LocationOption locationOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationOption target = null;
            target = (com.conferma.cpapi.LocationOption)get_store().find_element_user(LOCATIONOPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(locationOption);
        }
    }
    
    /**
     * Nils the ith "LocationOption" element
     */
    public void setNilLocationOptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationOption target = null;
            target = (com.conferma.cpapi.LocationOption)get_store().find_element_user(LOCATIONOPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationOption" element
     */
    public com.conferma.cpapi.LocationOption insertNewLocationOption(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationOption target = null;
            target = (com.conferma.cpapi.LocationOption)get_store().insert_element_user(LOCATIONOPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationOption" element
     */
    public com.conferma.cpapi.LocationOption addNewLocationOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationOption target = null;
            target = (com.conferma.cpapi.LocationOption)get_store().add_element_user(LOCATIONOPTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "LocationOption" element
     */
    public void removeLocationOption(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONOPTION$0, i);
        }
    }
}
