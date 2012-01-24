/*
 * XML Type:  Supplier
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.Supplier
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML Supplier(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class SupplierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.Supplier
{
    
    public SupplierImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Address");
    private static final javax.xml.namespace.QName REFERENCE$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Reference");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("", "Name");
    
    
    /**
     * Gets the "Address" element
     */
    public com.conferma.cpapi.Address getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Address target = null;
            target = (com.conferma.cpapi.Address)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Address" element
     */
    public boolean isSetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$0) != 0;
        }
    }
    
    /**
     * Sets the "Address" element
     */
    public void setAddress(com.conferma.cpapi.Address address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Address target = null;
            target = (com.conferma.cpapi.Address)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.Address)get_store().add_element_user(ADDRESS$0);
            }
            target.set(address);
        }
    }
    
    /**
     * Appends and returns a new empty "Address" element
     */
    public com.conferma.cpapi.Address addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Address target = null;
            target = (com.conferma.cpapi.Address)get_store().add_element_user(ADDRESS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Address" element
     */
    public void unsetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$0, 0);
        }
    }
    
    /**
     * Gets the "Reference" element
     */
    public java.lang.String getReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Reference" element
     */
    public org.apache.xmlbeans.XmlString xgetReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Reference" element
     */
    public boolean isSetReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCE$2) != 0;
        }
    }
    
    /**
     * Sets the "Reference" element
     */
    public void setReference(java.lang.String reference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCE$2);
            }
            target.setStringValue(reference);
        }
    }
    
    /**
     * Sets (as xml) the "Reference" element
     */
    public void xsetReference(org.apache.xmlbeans.XmlString reference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCE$2);
            }
            target.set(reference);
        }
    }
    
    /**
     * Unsets the "Reference" element
     */
    public void unsetReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCE$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$4);
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
            return get_store().find_attribute_user(ID$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$4);
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
            get_store().remove_attribute(ID$4);
        }
    }
    
    /**
     * Gets the "Name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
            return target;
        }
    }
    
    /**
     * True if has "Name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$6) != null;
        }
    }
    
    /**
     * Sets the "Name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$6);
        }
    }
}
