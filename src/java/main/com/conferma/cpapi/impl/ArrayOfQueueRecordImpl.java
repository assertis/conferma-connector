/*
 * XML Type:  ArrayOfQueueRecord
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.ArrayOfQueueRecord
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML ArrayOfQueueRecord(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class ArrayOfQueueRecordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.ArrayOfQueueRecord
{
    
    public ArrayOfQueueRecordImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUEUERECORD$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "QueueRecord");
    
    
    /**
     * Gets array of all "QueueRecord" elements
     */
    public com.conferma.cpapi.QueueRecord[] getQueueRecordArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUEUERECORD$0, targetList);
            com.conferma.cpapi.QueueRecord[] result = new com.conferma.cpapi.QueueRecord[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "QueueRecord" element
     */
    public com.conferma.cpapi.QueueRecord getQueueRecordArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.QueueRecord target = null;
            target = (com.conferma.cpapi.QueueRecord)get_store().find_element_user(QUEUERECORD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "QueueRecord" element
     */
    public boolean isNilQueueRecordArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.QueueRecord target = null;
            target = (com.conferma.cpapi.QueueRecord)get_store().find_element_user(QUEUERECORD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "QueueRecord" element
     */
    public int sizeOfQueueRecordArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUEUERECORD$0);
        }
    }
    
    /**
     * Sets array of all "QueueRecord" element
     */
    public void setQueueRecordArray(com.conferma.cpapi.QueueRecord[] queueRecordArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(queueRecordArray, QUEUERECORD$0);
        }
    }
    
    /**
     * Sets ith "QueueRecord" element
     */
    public void setQueueRecordArray(int i, com.conferma.cpapi.QueueRecord queueRecord)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.QueueRecord target = null;
            target = (com.conferma.cpapi.QueueRecord)get_store().find_element_user(QUEUERECORD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(queueRecord);
        }
    }
    
    /**
     * Nils the ith "QueueRecord" element
     */
    public void setNilQueueRecordArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.QueueRecord target = null;
            target = (com.conferma.cpapi.QueueRecord)get_store().find_element_user(QUEUERECORD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QueueRecord" element
     */
    public com.conferma.cpapi.QueueRecord insertNewQueueRecord(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.QueueRecord target = null;
            target = (com.conferma.cpapi.QueueRecord)get_store().insert_element_user(QUEUERECORD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QueueRecord" element
     */
    public com.conferma.cpapi.QueueRecord addNewQueueRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.QueueRecord target = null;
            target = (com.conferma.cpapi.QueueRecord)get_store().add_element_user(QUEUERECORD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "QueueRecord" element
     */
    public void removeQueueRecord(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUEUERECORD$0, i);
        }
    }
}
