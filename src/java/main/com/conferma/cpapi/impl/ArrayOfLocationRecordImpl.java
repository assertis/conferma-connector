/*
 * XML Type:  ArrayOfLocationRecord
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.ArrayOfLocationRecord
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML ArrayOfLocationRecord(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class ArrayOfLocationRecordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.ArrayOfLocationRecord
{
    
    public ArrayOfLocationRecordImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONRECORD$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "LocationRecord");
    
    
    /**
     * Gets array of all "LocationRecord" elements
     */
    public com.conferma.cpapi.LocationRecord[] getLocationRecordArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATIONRECORD$0, targetList);
            com.conferma.cpapi.LocationRecord[] result = new com.conferma.cpapi.LocationRecord[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LocationRecord" element
     */
    public com.conferma.cpapi.LocationRecord getLocationRecordArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationRecord target = null;
            target = (com.conferma.cpapi.LocationRecord)get_store().find_element_user(LOCATIONRECORD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LocationRecord" element
     */
    public boolean isNilLocationRecordArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationRecord target = null;
            target = (com.conferma.cpapi.LocationRecord)get_store().find_element_user(LOCATIONRECORD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LocationRecord" element
     */
    public int sizeOfLocationRecordArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONRECORD$0);
        }
    }
    
    /**
     * Sets array of all "LocationRecord" element
     */
    public void setLocationRecordArray(com.conferma.cpapi.LocationRecord[] locationRecordArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationRecordArray, LOCATIONRECORD$0);
        }
    }
    
    /**
     * Sets ith "LocationRecord" element
     */
    public void setLocationRecordArray(int i, com.conferma.cpapi.LocationRecord locationRecord)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationRecord target = null;
            target = (com.conferma.cpapi.LocationRecord)get_store().find_element_user(LOCATIONRECORD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(locationRecord);
        }
    }
    
    /**
     * Nils the ith "LocationRecord" element
     */
    public void setNilLocationRecordArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationRecord target = null;
            target = (com.conferma.cpapi.LocationRecord)get_store().find_element_user(LOCATIONRECORD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationRecord" element
     */
    public com.conferma.cpapi.LocationRecord insertNewLocationRecord(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationRecord target = null;
            target = (com.conferma.cpapi.LocationRecord)get_store().insert_element_user(LOCATIONRECORD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationRecord" element
     */
    public com.conferma.cpapi.LocationRecord addNewLocationRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.LocationRecord target = null;
            target = (com.conferma.cpapi.LocationRecord)get_store().add_element_user(LOCATIONRECORD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "LocationRecord" element
     */
    public void removeLocationRecord(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONRECORD$0, i);
        }
    }
}
