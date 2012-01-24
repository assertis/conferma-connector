/*
 * XML Type:  MICEPayee
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.MICEPayee
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML MICEPayee(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class MICEPayeeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.MICEPayee
{
    
    public MICEPayeeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOTELID$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "HotelID");
    private static final javax.xml.namespace.QName EVENTRANGE$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "EventRange");
    private static final javax.xml.namespace.QName EVENTREFERENCE$4 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "EventReference");
    private static final javax.xml.namespace.QName CURRENCY$6 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Currency");
    private static final javax.xml.namespace.QName CONTACTNAME$8 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "ContactName");
    private static final javax.xml.namespace.QName CONTACTEMAIL$10 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "ContactEmail");
    private static final javax.xml.namespace.QName CONTACTTELEPHONE$12 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "ContactTelephone");
    private static final javax.xml.namespace.QName CONTACTFACSIMILE$14 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "ContactFacsimile");
    
    
    /**
     * Gets the "HotelID" element
     */
    public int getHotelID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOTELID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "HotelID" element
     */
    public org.apache.xmlbeans.XmlInt xgetHotelID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HOTELID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "HotelID" element
     */
    public void setHotelID(int hotelID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOTELID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOTELID$0);
            }
            target.setIntValue(hotelID);
        }
    }
    
    /**
     * Sets (as xml) the "HotelID" element
     */
    public void xsetHotelID(org.apache.xmlbeans.XmlInt hotelID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HOTELID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(HOTELID$0);
            }
            target.set(hotelID);
        }
    }
    
    /**
     * Gets the "EventRange" element
     */
    public com.conferma.cpapi.DateRange getEventRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DateRange target = null;
            target = (com.conferma.cpapi.DateRange)get_store().find_element_user(EVENTRANGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "EventRange" element
     */
    public boolean isSetEventRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTRANGE$2) != 0;
        }
    }
    
    /**
     * Sets the "EventRange" element
     */
    public void setEventRange(com.conferma.cpapi.DateRange eventRange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DateRange target = null;
            target = (com.conferma.cpapi.DateRange)get_store().find_element_user(EVENTRANGE$2, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.DateRange)get_store().add_element_user(EVENTRANGE$2);
            }
            target.set(eventRange);
        }
    }
    
    /**
     * Appends and returns a new empty "EventRange" element
     */
    public com.conferma.cpapi.DateRange addNewEventRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DateRange target = null;
            target = (com.conferma.cpapi.DateRange)get_store().add_element_user(EVENTRANGE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "EventRange" element
     */
    public void unsetEventRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTRANGE$2, 0);
        }
    }
    
    /**
     * Gets the "EventReference" element
     */
    public java.lang.String getEventReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTREFERENCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EventReference" element
     */
    public org.apache.xmlbeans.XmlString xgetEventReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTREFERENCE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "EventReference" element
     */
    public boolean isSetEventReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTREFERENCE$4) != 0;
        }
    }
    
    /**
     * Sets the "EventReference" element
     */
    public void setEventReference(java.lang.String eventReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTREFERENCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTREFERENCE$4);
            }
            target.setStringValue(eventReference);
        }
    }
    
    /**
     * Sets (as xml) the "EventReference" element
     */
    public void xsetEventReference(org.apache.xmlbeans.XmlString eventReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTREFERENCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTREFERENCE$4);
            }
            target.set(eventReference);
        }
    }
    
    /**
     * Unsets the "EventReference" element
     */
    public void unsetEventReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTREFERENCE$4, 0);
        }
    }
    
    /**
     * Gets the "Currency" element
     */
    public java.lang.String getCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Currency" element
     */
    public org.apache.xmlbeans.XmlString xgetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Currency" element
     */
    public boolean isSetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENCY$6) != 0;
        }
    }
    
    /**
     * Sets the "Currency" element
     */
    public void setCurrency(java.lang.String currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCY$6);
            }
            target.setStringValue(currency);
        }
    }
    
    /**
     * Sets (as xml) the "Currency" element
     */
    public void xsetCurrency(org.apache.xmlbeans.XmlString currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENCY$6);
            }
            target.set(currency);
        }
    }
    
    /**
     * Unsets the "Currency" element
     */
    public void unsetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENCY$6, 0);
        }
    }
    
    /**
     * Gets the "ContactName" element
     */
    public java.lang.String getContactName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTNAME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContactName" element
     */
    public org.apache.xmlbeans.XmlString xgetContactName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTNAME$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ContactName" element
     */
    public boolean isSetContactName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTNAME$8) != 0;
        }
    }
    
    /**
     * Sets the "ContactName" element
     */
    public void setContactName(java.lang.String contactName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTNAME$8);
            }
            target.setStringValue(contactName);
        }
    }
    
    /**
     * Sets (as xml) the "ContactName" element
     */
    public void xsetContactName(org.apache.xmlbeans.XmlString contactName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACTNAME$8);
            }
            target.set(contactName);
        }
    }
    
    /**
     * Unsets the "ContactName" element
     */
    public void unsetContactName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTNAME$8, 0);
        }
    }
    
    /**
     * Gets the "ContactEmail" element
     */
    public java.lang.String getContactEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTEMAIL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContactEmail" element
     */
    public org.apache.xmlbeans.XmlString xgetContactEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTEMAIL$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "ContactEmail" element
     */
    public boolean isSetContactEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTEMAIL$10) != 0;
        }
    }
    
    /**
     * Sets the "ContactEmail" element
     */
    public void setContactEmail(java.lang.String contactEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTEMAIL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTEMAIL$10);
            }
            target.setStringValue(contactEmail);
        }
    }
    
    /**
     * Sets (as xml) the "ContactEmail" element
     */
    public void xsetContactEmail(org.apache.xmlbeans.XmlString contactEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTEMAIL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACTEMAIL$10);
            }
            target.set(contactEmail);
        }
    }
    
    /**
     * Unsets the "ContactEmail" element
     */
    public void unsetContactEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTEMAIL$10, 0);
        }
    }
    
    /**
     * Gets the "ContactTelephone" element
     */
    public java.lang.String getContactTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTTELEPHONE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContactTelephone" element
     */
    public org.apache.xmlbeans.XmlString xgetContactTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTTELEPHONE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "ContactTelephone" element
     */
    public boolean isSetContactTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTTELEPHONE$12) != 0;
        }
    }
    
    /**
     * Sets the "ContactTelephone" element
     */
    public void setContactTelephone(java.lang.String contactTelephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTTELEPHONE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTTELEPHONE$12);
            }
            target.setStringValue(contactTelephone);
        }
    }
    
    /**
     * Sets (as xml) the "ContactTelephone" element
     */
    public void xsetContactTelephone(org.apache.xmlbeans.XmlString contactTelephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTTELEPHONE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACTTELEPHONE$12);
            }
            target.set(contactTelephone);
        }
    }
    
    /**
     * Unsets the "ContactTelephone" element
     */
    public void unsetContactTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTTELEPHONE$12, 0);
        }
    }
    
    /**
     * Gets the "ContactFacsimile" element
     */
    public java.lang.String getContactFacsimile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTFACSIMILE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContactFacsimile" element
     */
    public org.apache.xmlbeans.XmlString xgetContactFacsimile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTFACSIMILE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "ContactFacsimile" element
     */
    public boolean isSetContactFacsimile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTFACSIMILE$14) != 0;
        }
    }
    
    /**
     * Sets the "ContactFacsimile" element
     */
    public void setContactFacsimile(java.lang.String contactFacsimile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTFACSIMILE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTFACSIMILE$14);
            }
            target.setStringValue(contactFacsimile);
        }
    }
    
    /**
     * Sets (as xml) the "ContactFacsimile" element
     */
    public void xsetContactFacsimile(org.apache.xmlbeans.XmlString contactFacsimile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTFACSIMILE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACTFACSIMILE$14);
            }
            target.set(contactFacsimile);
        }
    }
    
    /**
     * Unsets the "ContactFacsimile" element
     */
    public void unsetContactFacsimile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTFACSIMILE$14, 0);
        }
    }
}
