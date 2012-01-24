/*
 * XML Type:  GetDeploymentResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.GetDeploymentResponse
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML GetDeploymentResponse(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class GetDeploymentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetDeploymentResponse
{
    
    public GetDeploymentResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERAL$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "General");
    private static final javax.xml.namespace.QName CARD$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Card");
    private static final javax.xml.namespace.QName IDENTIFIERS$4 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Identifiers");
    private static final javax.xml.namespace.QName SUPPLIER$6 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Supplier");
    private static final javax.xml.namespace.QName TRAVELLERS$8 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Travellers");
    private static final javax.xml.namespace.QName AIR$10 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Air");
    private static final javax.xml.namespace.QName HOTEL$12 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Hotel");
    private static final javax.xml.namespace.QName RAIL$14 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Rail");
    private static final javax.xml.namespace.QName TYPE$16 = 
        new javax.xml.namespace.QName("", "Type");
    private static final javax.xml.namespace.QName DEPLOYMENTID$18 = 
        new javax.xml.namespace.QName("", "DeploymentID");
    private static final javax.xml.namespace.QName STATUS$20 = 
        new javax.xml.namespace.QName("", "Status");
    private static final javax.xml.namespace.QName CARDPOOLNAME$22 = 
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
     * Gets the "Supplier" element
     */
    public com.conferma.cpapi.Supplier getSupplier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Supplier target = null;
            target = (com.conferma.cpapi.Supplier)get_store().find_element_user(SUPPLIER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Supplier" element
     */
    public boolean isSetSupplier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPLIER$6) != 0;
        }
    }
    
    /**
     * Sets the "Supplier" element
     */
    public void setSupplier(com.conferma.cpapi.Supplier supplier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Supplier target = null;
            target = (com.conferma.cpapi.Supplier)get_store().find_element_user(SUPPLIER$6, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.Supplier)get_store().add_element_user(SUPPLIER$6);
            }
            target.set(supplier);
        }
    }
    
    /**
     * Appends and returns a new empty "Supplier" element
     */
    public com.conferma.cpapi.Supplier addNewSupplier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Supplier target = null;
            target = (com.conferma.cpapi.Supplier)get_store().add_element_user(SUPPLIER$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Supplier" element
     */
    public void unsetSupplier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPLIER$6, 0);
        }
    }
    
    /**
     * Gets the "Travellers" element
     */
    public com.conferma.cpapi.ArrayOfTraveller getTravellers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfTraveller target = null;
            target = (com.conferma.cpapi.ArrayOfTraveller)get_store().find_element_user(TRAVELLERS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Travellers" element
     */
    public boolean isSetTravellers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRAVELLERS$8) != 0;
        }
    }
    
    /**
     * Sets the "Travellers" element
     */
    public void setTravellers(com.conferma.cpapi.ArrayOfTraveller travellers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfTraveller target = null;
            target = (com.conferma.cpapi.ArrayOfTraveller)get_store().find_element_user(TRAVELLERS$8, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.ArrayOfTraveller)get_store().add_element_user(TRAVELLERS$8);
            }
            target.set(travellers);
        }
    }
    
    /**
     * Appends and returns a new empty "Travellers" element
     */
    public com.conferma.cpapi.ArrayOfTraveller addNewTravellers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.ArrayOfTraveller target = null;
            target = (com.conferma.cpapi.ArrayOfTraveller)get_store().add_element_user(TRAVELLERS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Travellers" element
     */
    public void unsetTravellers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRAVELLERS$8, 0);
        }
    }
    
    /**
     * Gets the "Air" element
     */
    public com.conferma.cpapi.Air getAir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Air target = null;
            target = (com.conferma.cpapi.Air)get_store().find_element_user(AIR$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Air" element
     */
    public boolean isSetAir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AIR$10) != 0;
        }
    }
    
    /**
     * Sets the "Air" element
     */
    public void setAir(com.conferma.cpapi.Air air)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Air target = null;
            target = (com.conferma.cpapi.Air)get_store().find_element_user(AIR$10, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.Air)get_store().add_element_user(AIR$10);
            }
            target.set(air);
        }
    }
    
    /**
     * Appends and returns a new empty "Air" element
     */
    public com.conferma.cpapi.Air addNewAir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Air target = null;
            target = (com.conferma.cpapi.Air)get_store().add_element_user(AIR$10);
            return target;
        }
    }
    
    /**
     * Unsets the "Air" element
     */
    public void unsetAir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AIR$10, 0);
        }
    }
    
    /**
     * Gets the "Hotel" element
     */
    public com.conferma.cpapi.Hotel getHotel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Hotel target = null;
            target = (com.conferma.cpapi.Hotel)get_store().find_element_user(HOTEL$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Hotel" element
     */
    public boolean isSetHotel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOTEL$12) != 0;
        }
    }
    
    /**
     * Sets the "Hotel" element
     */
    public void setHotel(com.conferma.cpapi.Hotel hotel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Hotel target = null;
            target = (com.conferma.cpapi.Hotel)get_store().find_element_user(HOTEL$12, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.Hotel)get_store().add_element_user(HOTEL$12);
            }
            target.set(hotel);
        }
    }
    
    /**
     * Appends and returns a new empty "Hotel" element
     */
    public com.conferma.cpapi.Hotel addNewHotel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Hotel target = null;
            target = (com.conferma.cpapi.Hotel)get_store().add_element_user(HOTEL$12);
            return target;
        }
    }
    
    /**
     * Unsets the "Hotel" element
     */
    public void unsetHotel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOTEL$12, 0);
        }
    }
    
    /**
     * Gets the "Rail" element
     */
    public com.conferma.cpapi.Rail getRail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Rail target = null;
            target = (com.conferma.cpapi.Rail)get_store().find_element_user(RAIL$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Rail" element
     */
    public boolean isSetRail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RAIL$14) != 0;
        }
    }
    
    /**
     * Sets the "Rail" element
     */
    public void setRail(com.conferma.cpapi.Rail rail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Rail target = null;
            target = (com.conferma.cpapi.Rail)get_store().find_element_user(RAIL$14, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.Rail)get_store().add_element_user(RAIL$14);
            }
            target.set(rail);
        }
    }
    
    /**
     * Appends and returns a new empty "Rail" element
     */
    public com.conferma.cpapi.Rail addNewRail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.Rail target = null;
            target = (com.conferma.cpapi.Rail)get_store().add_element_user(RAIL$14);
            return target;
        }
    }
    
    /**
     * Unsets the "Rail" element
     */
    public void unsetRail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RAIL$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$16);
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
            target = (com.conferma.cpapi.DeploymentType)get_store().find_attribute_user(TYPE$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$16);
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
            target = (com.conferma.cpapi.DeploymentType)get_store().find_attribute_user(TYPE$16);
            if (target == null)
            {
                target = (com.conferma.cpapi.DeploymentType)get_store().add_attribute_user(TYPE$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPLOYMENTID$18);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(DEPLOYMENTID$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPLOYMENTID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEPLOYMENTID$18);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(DEPLOYMENTID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(DEPLOYMENTID$18);
            }
            target.set(deploymentID);
        }
    }
    
    /**
     * Gets the "Status" attribute
     */
    public com.conferma.cpapi.DeploymentStatus.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$20);
            if (target == null)
            {
                return null;
            }
            return (com.conferma.cpapi.DeploymentStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" attribute
     */
    public com.conferma.cpapi.DeploymentStatus xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DeploymentStatus target = null;
            target = (com.conferma.cpapi.DeploymentStatus)get_store().find_attribute_user(STATUS$20);
            return target;
        }
    }
    
    /**
     * Sets the "Status" attribute
     */
    public void setStatus(com.conferma.cpapi.DeploymentStatus.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$20);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" attribute
     */
    public void xsetStatus(com.conferma.cpapi.DeploymentStatus status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DeploymentStatus target = null;
            target = (com.conferma.cpapi.DeploymentStatus)get_store().find_attribute_user(STATUS$20);
            if (target == null)
            {
                target = (com.conferma.cpapi.DeploymentStatus)get_store().add_attribute_user(STATUS$20);
            }
            target.set(status);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDPOOLNAME$22);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CARDPOOLNAME$22);
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
            return get_store().find_attribute_user(CARDPOOLNAME$22) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDPOOLNAME$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CARDPOOLNAME$22);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CARDPOOLNAME$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CARDPOOLNAME$22);
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
            get_store().remove_attribute(CARDPOOLNAME$22);
        }
    }
}
