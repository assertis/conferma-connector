/*
 * XML Type:  HotelRate
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.HotelRate
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML HotelRate(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class HotelRateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.HotelRate
{
    
    public HotelRateImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOOKINGPLATFORM$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "BookingPlatform");
    private static final javax.xml.namespace.QName STAY$2 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "Stay");
    private static final javax.xml.namespace.QName ROOMTYPE$4 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "RoomType");
    private static final javax.xml.namespace.QName RATEINFORMATION$6 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "RateInformation");
    private static final javax.xml.namespace.QName CANCELLATIONPOLICY$8 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "CancellationPolicy");
    private static final javax.xml.namespace.QName CANCELLATIONREFERENCE$10 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "CancellationReference");
    
    
    /**
     * Gets the "BookingPlatform" element
     */
    public java.lang.String getBookingPlatform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOKINGPLATFORM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BookingPlatform" element
     */
    public org.apache.xmlbeans.XmlString xgetBookingPlatform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOOKINGPLATFORM$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "BookingPlatform" element
     */
    public boolean isSetBookingPlatform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOKINGPLATFORM$0) != 0;
        }
    }
    
    /**
     * Sets the "BookingPlatform" element
     */
    public void setBookingPlatform(java.lang.String bookingPlatform)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOKINGPLATFORM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOKINGPLATFORM$0);
            }
            target.setStringValue(bookingPlatform);
        }
    }
    
    /**
     * Sets (as xml) the "BookingPlatform" element
     */
    public void xsetBookingPlatform(org.apache.xmlbeans.XmlString bookingPlatform)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOOKINGPLATFORM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BOOKINGPLATFORM$0);
            }
            target.set(bookingPlatform);
        }
    }
    
    /**
     * Unsets the "BookingPlatform" element
     */
    public void unsetBookingPlatform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOKINGPLATFORM$0, 0);
        }
    }
    
    /**
     * Gets the "Stay" element
     */
    public com.conferma.cpapi.DateRange getStay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DateRange target = null;
            target = (com.conferma.cpapi.DateRange)get_store().find_element_user(STAY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Stay" element
     */
    public boolean isSetStay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STAY$2) != 0;
        }
    }
    
    /**
     * Sets the "Stay" element
     */
    public void setStay(com.conferma.cpapi.DateRange stay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DateRange target = null;
            target = (com.conferma.cpapi.DateRange)get_store().find_element_user(STAY$2, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.DateRange)get_store().add_element_user(STAY$2);
            }
            target.set(stay);
        }
    }
    
    /**
     * Appends and returns a new empty "Stay" element
     */
    public com.conferma.cpapi.DateRange addNewStay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.DateRange target = null;
            target = (com.conferma.cpapi.DateRange)get_store().add_element_user(STAY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Stay" element
     */
    public void unsetStay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STAY$2, 0);
        }
    }
    
    /**
     * Gets the "RoomType" element
     */
    public java.lang.String getRoomType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROOMTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RoomType" element
     */
    public org.apache.xmlbeans.XmlString xgetRoomType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROOMTYPE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "RoomType" element
     */
    public boolean isSetRoomType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROOMTYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "RoomType" element
     */
    public void setRoomType(java.lang.String roomType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROOMTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROOMTYPE$4);
            }
            target.setStringValue(roomType);
        }
    }
    
    /**
     * Sets (as xml) the "RoomType" element
     */
    public void xsetRoomType(org.apache.xmlbeans.XmlString roomType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROOMTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ROOMTYPE$4);
            }
            target.set(roomType);
        }
    }
    
    /**
     * Unsets the "RoomType" element
     */
    public void unsetRoomType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROOMTYPE$4, 0);
        }
    }
    
    /**
     * Gets the "RateInformation" element
     */
    public java.lang.String getRateInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RATEINFORMATION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RateInformation" element
     */
    public org.apache.xmlbeans.XmlString xgetRateInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RATEINFORMATION$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "RateInformation" element
     */
    public boolean isSetRateInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RATEINFORMATION$6) != 0;
        }
    }
    
    /**
     * Sets the "RateInformation" element
     */
    public void setRateInformation(java.lang.String rateInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RATEINFORMATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RATEINFORMATION$6);
            }
            target.setStringValue(rateInformation);
        }
    }
    
    /**
     * Sets (as xml) the "RateInformation" element
     */
    public void xsetRateInformation(org.apache.xmlbeans.XmlString rateInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RATEINFORMATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RATEINFORMATION$6);
            }
            target.set(rateInformation);
        }
    }
    
    /**
     * Unsets the "RateInformation" element
     */
    public void unsetRateInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RATEINFORMATION$6, 0);
        }
    }
    
    /**
     * Gets the "CancellationPolicy" element
     */
    public java.lang.String getCancellationPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANCELLATIONPOLICY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CancellationPolicy" element
     */
    public org.apache.xmlbeans.XmlString xgetCancellationPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CANCELLATIONPOLICY$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "CancellationPolicy" element
     */
    public boolean isSetCancellationPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANCELLATIONPOLICY$8) != 0;
        }
    }
    
    /**
     * Sets the "CancellationPolicy" element
     */
    public void setCancellationPolicy(java.lang.String cancellationPolicy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANCELLATIONPOLICY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CANCELLATIONPOLICY$8);
            }
            target.setStringValue(cancellationPolicy);
        }
    }
    
    /**
     * Sets (as xml) the "CancellationPolicy" element
     */
    public void xsetCancellationPolicy(org.apache.xmlbeans.XmlString cancellationPolicy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CANCELLATIONPOLICY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CANCELLATIONPOLICY$8);
            }
            target.set(cancellationPolicy);
        }
    }
    
    /**
     * Unsets the "CancellationPolicy" element
     */
    public void unsetCancellationPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANCELLATIONPOLICY$8, 0);
        }
    }
    
    /**
     * Gets the "CancellationReference" element
     */
    public java.lang.String getCancellationReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANCELLATIONREFERENCE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CancellationReference" element
     */
    public org.apache.xmlbeans.XmlString xgetCancellationReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CANCELLATIONREFERENCE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "CancellationReference" element
     */
    public boolean isSetCancellationReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANCELLATIONREFERENCE$10) != 0;
        }
    }
    
    /**
     * Sets the "CancellationReference" element
     */
    public void setCancellationReference(java.lang.String cancellationReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANCELLATIONREFERENCE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CANCELLATIONREFERENCE$10);
            }
            target.setStringValue(cancellationReference);
        }
    }
    
    /**
     * Sets (as xml) the "CancellationReference" element
     */
    public void xsetCancellationReference(org.apache.xmlbeans.XmlString cancellationReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CANCELLATIONREFERENCE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CANCELLATIONREFERENCE$10);
            }
            target.set(cancellationReference);
        }
    }
    
    /**
     * Unsets the "CancellationReference" element
     */
    public void unsetCancellationReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANCELLATIONREFERENCE$10, 0);
        }
    }
}
