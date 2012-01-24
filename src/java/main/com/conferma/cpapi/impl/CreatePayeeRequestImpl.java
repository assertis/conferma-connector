/*
 * XML Type:  CreatePayeeRequest
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.CreatePayeeRequest
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML CreatePayeeRequest(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class CreatePayeeRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.CreatePayeeRequest
{
    
    public CreatePayeeRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERAL$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "General");
    private static final javax.xml.namespace.QName MICE$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "MICE");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "Type");
    
    
    /**
     * Gets the "General" element
     */
    public com.conferma.cpapi.GeneralPayee getGeneral()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GeneralPayee target = null;
            target = (com.conferma.cpapi.GeneralPayee)get_store().find_element_user(GENERAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "General" element
     */
    public boolean isSetGeneral()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GENERAL$0) != 0;
        }
    }
    
    /**
     * Sets the "General" element
     */
    public void setGeneral(com.conferma.cpapi.GeneralPayee general)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GeneralPayee target = null;
            target = (com.conferma.cpapi.GeneralPayee)get_store().find_element_user(GENERAL$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.GeneralPayee)get_store().add_element_user(GENERAL$0);
            }
            target.set(general);
        }
    }
    
    /**
     * Appends and returns a new empty "General" element
     */
    public com.conferma.cpapi.GeneralPayee addNewGeneral()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GeneralPayee target = null;
            target = (com.conferma.cpapi.GeneralPayee)get_store().add_element_user(GENERAL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "General" element
     */
    public void unsetGeneral()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GENERAL$0, 0);
        }
    }
    
    /**
     * Gets the "MICE" element
     */
    public com.conferma.cpapi.MICEPayee getMICE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.MICEPayee target = null;
            target = (com.conferma.cpapi.MICEPayee)get_store().find_element_user(MICE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MICE" element
     */
    public boolean isSetMICE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MICE$2) != 0;
        }
    }
    
    /**
     * Sets the "MICE" element
     */
    public void setMICE(com.conferma.cpapi.MICEPayee mice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.MICEPayee target = null;
            target = (com.conferma.cpapi.MICEPayee)get_store().find_element_user(MICE$2, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.MICEPayee)get_store().add_element_user(MICE$2);
            }
            target.set(mice);
        }
    }
    
    /**
     * Appends and returns a new empty "MICE" element
     */
    public com.conferma.cpapi.MICEPayee addNewMICE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.MICEPayee target = null;
            target = (com.conferma.cpapi.MICEPayee)get_store().add_element_user(MICE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "MICE" element
     */
    public void unsetMICE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MICE$2, 0);
        }
    }
    
    /**
     * Gets the "Type" attribute
     */
    public com.conferma.cpapi.PayeeType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                return null;
            }
            return (com.conferma.cpapi.PayeeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" attribute
     */
    public com.conferma.cpapi.PayeeType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.PayeeType target = null;
            target = (com.conferma.cpapi.PayeeType)get_store().find_attribute_user(TYPE$4);
            return target;
        }
    }
    
    /**
     * Sets the "Type" attribute
     */
    public void setType(com.conferma.cpapi.PayeeType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" attribute
     */
    public void xsetType(com.conferma.cpapi.PayeeType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.PayeeType target = null;
            target = (com.conferma.cpapi.PayeeType)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (com.conferma.cpapi.PayeeType)get_store().add_attribute_user(TYPE$4);
            }
            target.set(type);
        }
    }
}
