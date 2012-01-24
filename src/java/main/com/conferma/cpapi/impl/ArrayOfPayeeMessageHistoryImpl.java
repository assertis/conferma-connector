/*
 * XML Type:  ArrayOfPayeeMessageHistory
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.ArrayOfPayeeMessageHistory
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML ArrayOfPayeeMessageHistory(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class ArrayOfPayeeMessageHistoryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.ArrayOfPayeeMessageHistory
{
    
    public ArrayOfPayeeMessageHistoryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAYEEMESSAGEHISTORY$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "PayeeMessageHistory");
    
    
    /**
     * Gets array of all "PayeeMessageHistory" elements
     */
    public com.conferma.cpapi.PayeeMessageHistory[] getPayeeMessageHistoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PAYEEMESSAGEHISTORY$0, targetList);
            com.conferma.cpapi.PayeeMessageHistory[] result = new com.conferma.cpapi.PayeeMessageHistory[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PayeeMessageHistory" element
     */
    public com.conferma.cpapi.PayeeMessageHistory getPayeeMessageHistoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.PayeeMessageHistory target = null;
            target = (com.conferma.cpapi.PayeeMessageHistory)get_store().find_element_user(PAYEEMESSAGEHISTORY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "PayeeMessageHistory" element
     */
    public boolean isNilPayeeMessageHistoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.PayeeMessageHistory target = null;
            target = (com.conferma.cpapi.PayeeMessageHistory)get_store().find_element_user(PAYEEMESSAGEHISTORY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "PayeeMessageHistory" element
     */
    public int sizeOfPayeeMessageHistoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAYEEMESSAGEHISTORY$0);
        }
    }
    
    /**
     * Sets array of all "PayeeMessageHistory" element
     */
    public void setPayeeMessageHistoryArray(com.conferma.cpapi.PayeeMessageHistory[] payeeMessageHistoryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(payeeMessageHistoryArray, PAYEEMESSAGEHISTORY$0);
        }
    }
    
    /**
     * Sets ith "PayeeMessageHistory" element
     */
    public void setPayeeMessageHistoryArray(int i, com.conferma.cpapi.PayeeMessageHistory payeeMessageHistory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.PayeeMessageHistory target = null;
            target = (com.conferma.cpapi.PayeeMessageHistory)get_store().find_element_user(PAYEEMESSAGEHISTORY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(payeeMessageHistory);
        }
    }
    
    /**
     * Nils the ith "PayeeMessageHistory" element
     */
    public void setNilPayeeMessageHistoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.PayeeMessageHistory target = null;
            target = (com.conferma.cpapi.PayeeMessageHistory)get_store().find_element_user(PAYEEMESSAGEHISTORY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PayeeMessageHistory" element
     */
    public com.conferma.cpapi.PayeeMessageHistory insertNewPayeeMessageHistory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.PayeeMessageHistory target = null;
            target = (com.conferma.cpapi.PayeeMessageHistory)get_store().insert_element_user(PAYEEMESSAGEHISTORY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PayeeMessageHistory" element
     */
    public com.conferma.cpapi.PayeeMessageHistory addNewPayeeMessageHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.PayeeMessageHistory target = null;
            target = (com.conferma.cpapi.PayeeMessageHistory)get_store().add_element_user(PAYEEMESSAGEHISTORY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "PayeeMessageHistory" element
     */
    public void removePayeeMessageHistory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAYEEMESSAGEHISTORY$0, i);
        }
    }
}
