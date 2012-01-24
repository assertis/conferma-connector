/*
 * XML Type:  Deployment
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.Deployment
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML Deployment(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class DeploymentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.Deployment
{
    
    public DeploymentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "Type");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName CREATEDDATE$4 = 
        new javax.xml.namespace.QName("", "CreatedDate");
    private static final javax.xml.namespace.QName AMENDEDDATE$6 = 
        new javax.xml.namespace.QName("", "AmendedDate");
    
    
    /**
     * Gets the "Type" attribute
     */
    public com.conferma.cpapi.DeploymentType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
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
            target = (com.conferma.cpapi.DeploymentType)get_store().find_attribute_user(TYPE$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
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
            target = (com.conferma.cpapi.DeploymentType)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (com.conferma.cpapi.DeploymentType)get_store().add_attribute_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "ID" attribute
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$2);
            return target;
        }
    }
    
    /**
     * True if has "ID" attribute
     */
    public boolean isSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$2) != null;
        }
    }
    
    /**
     * Sets the "ID" attribute
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    public void xsetID(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$2);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "ID" attribute
     */
    public void unsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$2);
        }
    }
    
    /**
     * Gets the "CreatedDate" attribute
     */
    public java.util.Calendar getCreatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEDDATE$4);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CreatedDate" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetCreatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(CREATEDDATE$4);
            return target;
        }
    }
    
    /**
     * Sets the "CreatedDate" attribute
     */
    public void setCreatedDate(java.util.Calendar createdDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEDDATE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CREATEDDATE$4);
            }
            target.setCalendarValue(createdDate);
        }
    }
    
    /**
     * Sets (as xml) the "CreatedDate" attribute
     */
    public void xsetCreatedDate(org.apache.xmlbeans.XmlDateTime createdDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(CREATEDDATE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(CREATEDDATE$4);
            }
            target.set(createdDate);
        }
    }
    
    /**
     * Gets the "AmendedDate" attribute
     */
    public java.util.Calendar getAmendedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMENDEDDATE$6);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "AmendedDate" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetAmendedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(AMENDEDDATE$6);
            return target;
        }
    }
    
    /**
     * Sets the "AmendedDate" attribute
     */
    public void setAmendedDate(java.util.Calendar amendedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMENDEDDATE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AMENDEDDATE$6);
            }
            target.setCalendarValue(amendedDate);
        }
    }
    
    /**
     * Sets (as xml) the "AmendedDate" attribute
     */
    public void xsetAmendedDate(org.apache.xmlbeans.XmlDateTime amendedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(AMENDEDDATE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(AMENDEDDATE$6);
            }
            target.set(amendedDate);
        }
    }
}
