/*
 * XML Type:  ArrayOfIdentifier
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.ArrayOfIdentifier
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML ArrayOfIdentifier(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class ArrayOfIdentifierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.ArrayOfIdentifier
{
    
    public ArrayOfIdentifierImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Identifier");
    
    
    /**
     * Gets array of all "Identifier" elements
     */
    public com.conferma.cpapi.Identifier[] getIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFIER$0, targetList);
            com.conferma.cpapi.Identifier[] result = new com.conferma.cpapi.Identifier[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Identifier" element
     */
    public com.conferma.cpapi.Identifier getIdentifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Identifier target = null;
            target = (com.conferma.cpapi.Identifier)get_store().find_element_user(IDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Identifier" element
     */
    public boolean isNilIdentifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Identifier target = null;
            target = (com.conferma.cpapi.Identifier)get_store().find_element_user(IDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Identifier" element
     */
    public int sizeOfIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIER$0);
        }
    }
    
    /**
     * Sets array of all "Identifier" element
     */
    public void setIdentifierArray(com.conferma.cpapi.Identifier[] identifierArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(identifierArray, IDENTIFIER$0);
        }
    }
    
    /**
     * Sets ith "Identifier" element
     */
    public void setIdentifierArray(int i, com.conferma.cpapi.Identifier identifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Identifier target = null;
            target = (com.conferma.cpapi.Identifier)get_store().find_element_user(IDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identifier);
        }
    }
    
    /**
     * Nils the ith "Identifier" element
     */
    public void setNilIdentifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Identifier target = null;
            target = (com.conferma.cpapi.Identifier)get_store().find_element_user(IDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Identifier" element
     */
    public com.conferma.cpapi.Identifier insertNewIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Identifier target = null;
            target = (com.conferma.cpapi.Identifier)get_store().insert_element_user(IDENTIFIER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Identifier" element
     */
    public com.conferma.cpapi.Identifier addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Identifier target = null;
            target = (com.conferma.cpapi.Identifier)get_store().add_element_user(IDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Identifier" element
     */
    public void removeIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIER$0, i);
        }
    }
}
