/*
 * XML Type:  GetCardRequest
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.GetCardRequest
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML GetCardRequest(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class GetCardRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetCardRequest
{
    
    public GetCardRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPLOYMENTID$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "DeploymentID");
    private static final javax.xml.namespace.QName GENERAL$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "General");
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
    private static final javax.xml.namespace.QName RETURNCVV$18 = 
        new javax.xml.namespace.QName("", "ReturnCVV");
    private static final javax.xml.namespace.QName USEEMERGENCYCARD$20 = 
        new javax.xml.namespace.QName("", "UseEmergencyCard");
    
    
    /**
     * Gets the "DeploymentID" element
     */
    public java.lang.String getDeploymentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPLOYMENTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeploymentID" element
     */
    public org.apache.xmlbeans.XmlString xgetDeploymentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPLOYMENTID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "DeploymentID" element
     */
    public boolean isSetDeploymentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPLOYMENTID$0) != 0;
        }
    }
    
    /**
     * Sets the "DeploymentID" element
     */
    public void setDeploymentID(java.lang.String deploymentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPLOYMENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPLOYMENTID$0);
            }
            target.setStringValue(deploymentID);
        }
    }
    
    /**
     * Sets (as xml) the "DeploymentID" element
     */
    public void xsetDeploymentID(org.apache.xmlbeans.XmlString deploymentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPLOYMENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEPLOYMENTID$0);
            }
            target.set(deploymentID);
        }
    }
    
    /**
     * Unsets the "DeploymentID" element
     */
    public void unsetDeploymentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPLOYMENTID$0, 0);
        }
    }
    
    /**
     * Gets the "General" element
     */
    public com.conferma.cpapi.GeneralPayee getGeneral()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GeneralPayee target = null;
            target = (com.conferma.cpapi.GeneralPayee)get_store().find_element_user(GENERAL$2, 0);
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
            return get_store().count_elements(GENERAL$2) != 0;
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
            target = (com.conferma.cpapi.GeneralPayee)get_store().find_element_user(GENERAL$2, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.GeneralPayee)get_store().add_element_user(GENERAL$2);
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
            target = (com.conferma.cpapi.GeneralPayee)get_store().add_element_user(GENERAL$2);
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
            get_store().remove_element(GENERAL$2, 0);
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
    public com.conferma.cpapi.PayeeType.Enum getType()
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
            target = (com.conferma.cpapi.PayeeType)get_store().find_attribute_user(TYPE$16);
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
    public void xsetType(com.conferma.cpapi.PayeeType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.PayeeType target = null;
            target = (com.conferma.cpapi.PayeeType)get_store().find_attribute_user(TYPE$16);
            if (target == null)
            {
                target = (com.conferma.cpapi.PayeeType)get_store().add_attribute_user(TYPE$16);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "ReturnCVV" attribute
     */
    public boolean getReturnCVV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETURNCVV$18);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReturnCVV" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetReturnCVV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RETURNCVV$18);
            return target;
        }
    }
    
    /**
     * Sets the "ReturnCVV" attribute
     */
    public void setReturnCVV(boolean returnCVV)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETURNCVV$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RETURNCVV$18);
            }
            target.setBooleanValue(returnCVV);
        }
    }
    
    /**
     * Sets (as xml) the "ReturnCVV" attribute
     */
    public void xsetReturnCVV(org.apache.xmlbeans.XmlBoolean returnCVV)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RETURNCVV$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RETURNCVV$18);
            }
            target.set(returnCVV);
        }
    }
    
    /**
     * Gets the "UseEmergencyCard" attribute
     */
    public boolean getUseEmergencyCard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEEMERGENCYCARD$20);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "UseEmergencyCard" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUseEmergencyCard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEEMERGENCYCARD$20);
            return target;
        }
    }
    
    /**
     * Sets the "UseEmergencyCard" attribute
     */
    public void setUseEmergencyCard(boolean useEmergencyCard)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEEMERGENCYCARD$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEEMERGENCYCARD$20);
            }
            target.setBooleanValue(useEmergencyCard);
        }
    }
    
    /**
     * Sets (as xml) the "UseEmergencyCard" attribute
     */
    public void xsetUseEmergencyCard(org.apache.xmlbeans.XmlBoolean useEmergencyCard)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEEMERGENCYCARD$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USEEMERGENCYCARD$20);
            }
            target.set(useEmergencyCard);
        }
    }
}
