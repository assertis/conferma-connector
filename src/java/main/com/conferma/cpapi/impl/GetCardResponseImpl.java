/*
 * XML Type:  GetCardResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.GetCardResponse
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML GetCardResponse(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class GetCardResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetCardResponse
{
    
    public GetCardResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERAL$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "General");
    private static final javax.xml.namespace.QName CARD$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Card");
    private static final javax.xml.namespace.QName IDENTIFIERS$4 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Identifiers");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("", "Type");
    private static final javax.xml.namespace.QName DEPLOYMENTID$8 = 
        new javax.xml.namespace.QName("", "DeploymentID");
    private static final javax.xml.namespace.QName CARDPOOLNAME$10 = 
        new javax.xml.namespace.QName("", "CardPoolName");
    
    
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
     * Gets the "Card" element
     */
    public com.conferma.cpapi.Card getCard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Card target = null;
            target = (com.conferma.cpapi.Card)get_store().find_element_user(CARD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Card" element
     */
    public boolean isSetCard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARD$2) != 0;
        }
    }
    
    /**
     * Sets the "Card" element
     */
    public void setCard(com.conferma.cpapi.Card card)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Card target = null;
            target = (com.conferma.cpapi.Card)get_store().find_element_user(CARD$2, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.Card)get_store().add_element_user(CARD$2);
            }
            target.set(card);
        }
    }
    
    /**
     * Appends and returns a new empty "Card" element
     */
    public com.conferma.cpapi.Card addNewCard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Card target = null;
            target = (com.conferma.cpapi.Card)get_store().add_element_user(CARD$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Card" element
     */
    public void unsetCard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARD$2, 0);
        }
    }
    
    /**
     * Gets the "Identifiers" element
     */
    public com.conferma.cpapi.ArrayOfIdentifier getIdentifiers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfIdentifier target = null;
            target = (com.conferma.cpapi.ArrayOfIdentifier)get_store().find_element_user(IDENTIFIERS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Identifiers" element
     */
    public boolean isSetIdentifiers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIERS$4) != 0;
        }
    }
    
    /**
     * Sets the "Identifiers" element
     */
    public void setIdentifiers(com.conferma.cpapi.ArrayOfIdentifier identifiers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfIdentifier target = null;
            target = (com.conferma.cpapi.ArrayOfIdentifier)get_store().find_element_user(IDENTIFIERS$4, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.ArrayOfIdentifier)get_store().add_element_user(IDENTIFIERS$4);
            }
            target.set(identifiers);
        }
    }
    
    /**
     * Appends and returns a new empty "Identifiers" element
     */
    public com.conferma.cpapi.ArrayOfIdentifier addNewIdentifiers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfIdentifier target = null;
            target = (com.conferma.cpapi.ArrayOfIdentifier)get_store().add_element_user(IDENTIFIERS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Identifiers" element
     */
    public void unsetIdentifiers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIERS$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
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
            target = (com.conferma.cpapi.DeploymentType)get_store().find_attribute_user(TYPE$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
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
            target = (com.conferma.cpapi.DeploymentType)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (com.conferma.cpapi.DeploymentType)get_store().add_attribute_user(TYPE$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPLOYMENTID$8);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(DEPLOYMENTID$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPLOYMENTID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEPLOYMENTID$8);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(DEPLOYMENTID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(DEPLOYMENTID$8);
            }
            target.set(deploymentID);
        }
    }
    
    /**
     * Gets the "CardPoolName" attribute
     */
    public java.lang.String getCardPoolName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDPOOLNAME$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CardPoolName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCardPoolName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CARDPOOLNAME$10);
            return target;
        }
    }
    
    /**
     * True if has "CardPoolName" attribute
     */
    public boolean isSetCardPoolName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CARDPOOLNAME$10) != null;
        }
    }
    
    /**
     * Sets the "CardPoolName" attribute
     */
    public void setCardPoolName(java.lang.String cardPoolName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDPOOLNAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CARDPOOLNAME$10);
            }
            target.setStringValue(cardPoolName);
        }
    }
    
    /**
     * Sets (as xml) the "CardPoolName" attribute
     */
    public void xsetCardPoolName(org.apache.xmlbeans.XmlString cardPoolName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CARDPOOLNAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CARDPOOLNAME$10);
            }
            target.set(cardPoolName);
        }
    }
    
    /**
     * Unsets the "CardPoolName" attribute
     */
    public void unsetCardPoolName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CARDPOOLNAME$10);
        }
    }
}
