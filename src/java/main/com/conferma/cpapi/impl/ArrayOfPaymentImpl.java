/*
 * XML Type:  ArrayOfPayment
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.ArrayOfPayment
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML ArrayOfPayment(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class ArrayOfPaymentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.ArrayOfPayment
{
    
    public ArrayOfPaymentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAYMENT$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Payment");
    
    
    /**
     * Gets array of all "Payment" elements
     */
    public com.conferma.cpapi.Payment[] getPaymentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PAYMENT$0, targetList);
            com.conferma.cpapi.Payment[] result = new com.conferma.cpapi.Payment[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Payment" element
     */
    public com.conferma.cpapi.Payment getPaymentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Payment target = null;
            target = (com.conferma.cpapi.Payment)get_store().find_element_user(PAYMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Payment" element
     */
    public boolean isNilPaymentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Payment target = null;
            target = (com.conferma.cpapi.Payment)get_store().find_element_user(PAYMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Payment" element
     */
    public int sizeOfPaymentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAYMENT$0);
        }
    }
    
    /**
     * Sets array of all "Payment" element
     */
    public void setPaymentArray(com.conferma.cpapi.Payment[] paymentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(paymentArray, PAYMENT$0);
        }
    }
    
    /**
     * Sets ith "Payment" element
     */
    public void setPaymentArray(int i, com.conferma.cpapi.Payment payment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Payment target = null;
            target = (com.conferma.cpapi.Payment)get_store().find_element_user(PAYMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(payment);
        }
    }
    
    /**
     * Nils the ith "Payment" element
     */
    public void setNilPaymentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Payment target = null;
            target = (com.conferma.cpapi.Payment)get_store().find_element_user(PAYMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Payment" element
     */
    public com.conferma.cpapi.Payment insertNewPayment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Payment target = null;
            target = (com.conferma.cpapi.Payment)get_store().insert_element_user(PAYMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Payment" element
     */
    public com.conferma.cpapi.Payment addNewPayment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Payment target = null;
            target = (com.conferma.cpapi.Payment)get_store().add_element_user(PAYMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Payment" element
     */
    public void removePayment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAYMENT$0, i);
        }
    }
}
