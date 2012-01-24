/*
 * XML Type:  UpdateDeploymentRequest
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.UpdateDeploymentRequest
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML UpdateDeploymentRequest(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class UpdateDeploymentRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.UpdateDeploymentRequest
{
    
    public UpdateDeploymentRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPLOYMENTID$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "DeploymentID");
    private static final javax.xml.namespace.QName STATUS$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Status");
    private static final javax.xml.namespace.QName GENERAL$4 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "General");
    private static final javax.xml.namespace.QName IDENTIFIERS$6 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Identifiers");
    private static final javax.xml.namespace.QName SUPPLIER$8 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Supplier");
    private static final javax.xml.namespace.QName TRAVELLERS$10 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Travellers");
    private static final javax.xml.namespace.QName AIR$12 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Air");
    private static final javax.xml.namespace.QName HOTEL$14 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Hotel");
    private static final javax.xml.namespace.QName RAIL$16 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Rail");
    
    
    /**
     * Gets the "DeploymentID" element
     */
    public int getDeploymentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPLOYMENTID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeploymentID" element
     */
    public org.apache.xmlbeans.XmlInt xgetDeploymentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPLOYMENTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DeploymentID" element
     */
    public void setDeploymentID(int deploymentID)
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
            target.setIntValue(deploymentID);
        }
    }
    
    /**
     * Sets (as xml) the "DeploymentID" element
     */
    public void xsetDeploymentID(org.apache.xmlbeans.XmlInt deploymentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPLOYMENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DEPLOYMENTID$0);
            }
            target.set(deploymentID);
        }
    }
    
    /**
     * Gets the "Status" element
     */
    public com.conferma.cpapi.DeploymentStatus.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.conferma.cpapi.DeploymentStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" element
     */
    public com.conferma.cpapi.DeploymentStatus xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DeploymentStatus target = null;
            target = (com.conferma.cpapi.DeploymentStatus)get_store().find_element_user(STATUS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(com.conferma.cpapi.DeploymentStatus.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$2);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" element
     */
    public void xsetStatus(com.conferma.cpapi.DeploymentStatus status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DeploymentStatus target = null;
            target = (com.conferma.cpapi.DeploymentStatus)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.DeploymentStatus)get_store().add_element_user(STATUS$2);
            }
            target.set(status);
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
            target = (com.conferma.cpapi.GeneralPayee)get_store().find_element_user(GENERAL$4, 0);
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
            return get_store().count_elements(GENERAL$4) != 0;
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
            target = (com.conferma.cpapi.GeneralPayee)get_store().find_element_user(GENERAL$4, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.GeneralPayee)get_store().add_element_user(GENERAL$4);
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
            target = (com.conferma.cpapi.GeneralPayee)get_store().add_element_user(GENERAL$4);
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
            get_store().remove_element(GENERAL$4, 0);
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
            target = (com.conferma.cpapi.ArrayOfIdentifier)get_store().find_element_user(IDENTIFIERS$6, 0);
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
            return get_store().count_elements(IDENTIFIERS$6) != 0;
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
            target = (com.conferma.cpapi.ArrayOfIdentifier)get_store().find_element_user(IDENTIFIERS$6, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.ArrayOfIdentifier)get_store().add_element_user(IDENTIFIERS$6);
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
            target = (com.conferma.cpapi.ArrayOfIdentifier)get_store().add_element_user(IDENTIFIERS$6);
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
            get_store().remove_element(IDENTIFIERS$6, 0);
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
            target = (com.conferma.cpapi.Supplier)get_store().find_element_user(SUPPLIER$8, 0);
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
            return get_store().count_elements(SUPPLIER$8) != 0;
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
            target = (com.conferma.cpapi.Supplier)get_store().find_element_user(SUPPLIER$8, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.Supplier)get_store().add_element_user(SUPPLIER$8);
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
            target = (com.conferma.cpapi.Supplier)get_store().add_element_user(SUPPLIER$8);
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
            get_store().remove_element(SUPPLIER$8, 0);
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
            target = (com.conferma.cpapi.ArrayOfTraveller)get_store().find_element_user(TRAVELLERS$10, 0);
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
            return get_store().count_elements(TRAVELLERS$10) != 0;
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
            target = (com.conferma.cpapi.ArrayOfTraveller)get_store().find_element_user(TRAVELLERS$10, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.ArrayOfTraveller)get_store().add_element_user(TRAVELLERS$10);
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
            target = (com.conferma.cpapi.ArrayOfTraveller)get_store().add_element_user(TRAVELLERS$10);
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
            get_store().remove_element(TRAVELLERS$10, 0);
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
            target = (com.conferma.cpapi.Air)get_store().find_element_user(AIR$12, 0);
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
            return get_store().count_elements(AIR$12) != 0;
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
            target = (com.conferma.cpapi.Air)get_store().find_element_user(AIR$12, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.Air)get_store().add_element_user(AIR$12);
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
            target = (com.conferma.cpapi.Air)get_store().add_element_user(AIR$12);
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
            get_store().remove_element(AIR$12, 0);
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
            target = (com.conferma.cpapi.Hotel)get_store().find_element_user(HOTEL$14, 0);
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
            return get_store().count_elements(HOTEL$14) != 0;
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
            target = (com.conferma.cpapi.Hotel)get_store().find_element_user(HOTEL$14, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.Hotel)get_store().add_element_user(HOTEL$14);
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
            target = (com.conferma.cpapi.Hotel)get_store().add_element_user(HOTEL$14);
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
            get_store().remove_element(HOTEL$14, 0);
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
            target = (com.conferma.cpapi.Rail)get_store().find_element_user(RAIL$16, 0);
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
            return get_store().count_elements(RAIL$16) != 0;
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
            target = (com.conferma.cpapi.Rail)get_store().find_element_user(RAIL$16, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.Rail)get_store().add_element_user(RAIL$16);
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
            target = (com.conferma.cpapi.Rail)get_store().add_element_user(RAIL$16);
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
            get_store().remove_element(RAIL$16, 0);
        }
    }
}
