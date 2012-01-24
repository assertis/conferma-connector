/*
 * XML Type:  CreatePaymentResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.CreatePaymentResponse
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML CreatePaymentResponse(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class CreatePaymentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.CreatePaymentResponse
{
    
    public CreatePaymentResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAYMENTS$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Payments");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("", "Type");
    private static final javax.xml.namespace.QName DEPLOYMENTID$4 = 
        new javax.xml.namespace.QName("", "DeploymentID");
    
    
    /**
     * Gets the "Payments" element
     */
    public com.conferma.cpapi.ArrayOfPayment getPayments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfPayment target = null;
            target = (com.conferma.cpapi.ArrayOfPayment)get_store().find_element_user(PAYMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Payments" element
     */
    public boolean isSetPayments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAYMENTS$0) != 0;
        }
    }
    
    /**
     * Sets the "Payments" element
     */
    public void setPayments(com.conferma.cpapi.ArrayOfPayment payments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfPayment target = null;
            target = (com.conferma.cpapi.ArrayOfPayment)get_store().find_element_user(PAYMENTS$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.ArrayOfPayment)get_store().add_element_user(PAYMENTS$0);
            }
            target.set(payments);
        }
    }
    
    /**
     * Appends and returns a new empty "Payments" element
     */
    public com.conferma.cpapi.ArrayOfPayment addNewPayments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfPayment target = null;
            target = (com.conferma.cpapi.ArrayOfPayment)get_store().add_element_user(PAYMENTS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Payments" element
     */
    public void unsetPayments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAYMENTS$0, 0);
        }
    }
    
    /**
     * Gets the "Type" attribute
     */
    public com.conferma.cpapi.DeploymentType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                return null;
            }
            return (com.conferma.cpapi.DeploymentType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" attribute
     */
    public com.conferma.cpapi.DeploymentType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DeploymentType target = null;
            target = (com.conferma.cpapi.DeploymentType)get_store().find_attribute_user(TYPE$2);
            return target;
        }
    }
    
    /**
     * Sets the "Type" attribute
     */
    public void setType(com.conferma.cpapi.DeploymentType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" attribute
     */
    public void xsetType(com.conferma.cpapi.DeploymentType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DeploymentType target = null;
            target = (com.conferma.cpapi.DeploymentType)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (com.conferma.cpapi.DeploymentType)get_store().add_attribute_user(TYPE$2);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "DeploymentID" attribute
     */
    public int getDeploymentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPLOYMENTID$4);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeploymentID" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetDeploymentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(DEPLOYMENTID$4);
            return target;
        }
    }
    
    /**
     * Sets the "DeploymentID" attribute
     */
    public void setDeploymentID(int deploymentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPLOYMENTID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEPLOYMENTID$4);
            }
            target.setIntValue(deploymentID);
        }
    }
    
    /**
     * Sets (as xml) the "DeploymentID" attribute
     */
    public void xsetDeploymentID(org.apache.xmlbeans.XmlInt deploymentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(DEPLOYMENTID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(DEPLOYMENTID$4);
            }
            target.set(deploymentID);
        }
    }
}
