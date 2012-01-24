/*
 * XML Type:  ArrayOfTraveller
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.ArrayOfTraveller
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML ArrayOfTraveller(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class ArrayOfTravellerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.ArrayOfTraveller
{
    
    public ArrayOfTravellerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRAVELLER$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Traveller");
    
    
    /**
     * Gets array of all "Traveller" elements
     */
    public com.conferma.cpapi.Traveller[] getTravellerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TRAVELLER$0, targetList);
            com.conferma.cpapi.Traveller[] result = new com.conferma.cpapi.Traveller[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Traveller" element
     */
    public com.conferma.cpapi.Traveller getTravellerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Traveller target = null;
            target = (com.conferma.cpapi.Traveller)get_store().find_element_user(TRAVELLER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Traveller" element
     */
    public boolean isNilTravellerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Traveller target = null;
            target = (com.conferma.cpapi.Traveller)get_store().find_element_user(TRAVELLER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Traveller" element
     */
    public int sizeOfTravellerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRAVELLER$0);
        }
    }
    
    /**
     * Sets array of all "Traveller" element
     */
    public void setTravellerArray(com.conferma.cpapi.Traveller[] travellerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(travellerArray, TRAVELLER$0);
        }
    }
    
    /**
     * Sets ith "Traveller" element
     */
    public void setTravellerArray(int i, com.conferma.cpapi.Traveller traveller)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Traveller target = null;
            target = (com.conferma.cpapi.Traveller)get_store().find_element_user(TRAVELLER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(traveller);
        }
    }
    
    /**
     * Nils the ith "Traveller" element
     */
    public void setNilTravellerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Traveller target = null;
            target = (com.conferma.cpapi.Traveller)get_store().find_element_user(TRAVELLER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Traveller" element
     */
    public com.conferma.cpapi.Traveller insertNewTraveller(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Traveller target = null;
            target = (com.conferma.cpapi.Traveller)get_store().insert_element_user(TRAVELLER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Traveller" element
     */
    public com.conferma.cpapi.Traveller addNewTraveller()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Traveller target = null;
            target = (com.conferma.cpapi.Traveller)get_store().add_element_user(TRAVELLER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Traveller" element
     */
    public void removeTraveller(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRAVELLER$0, i);
        }
    }
}
