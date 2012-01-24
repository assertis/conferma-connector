/*
 * An XML document type.
 * Localname: GetLocations
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.GetLocationsDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one GetLocations(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class GetLocationsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetLocationsDocument
{
    
    public GetLocationsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLOCATIONS$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GetLocations");
    
    
    /**
     * Gets the "GetLocations" element
     */
    public com.conferma.cpapi.GetLocationsDocument.GetLocations getGetLocations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetLocationsDocument.GetLocations target = null;
            target = (com.conferma.cpapi.GetLocationsDocument.GetLocations)get_store().find_element_user(GETLOCATIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetLocations" element
     */
    public void setGetLocations(com.conferma.cpapi.GetLocationsDocument.GetLocations getLocations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetLocationsDocument.GetLocations target = null;
            target = (com.conferma.cpapi.GetLocationsDocument.GetLocations)get_store().find_element_user(GETLOCATIONS$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.GetLocationsDocument.GetLocations)get_store().add_element_user(GETLOCATIONS$0);
            }
            target.set(getLocations);
        }
    }
    
    /**
     * Appends and returns a new empty "GetLocations" element
     */
    public com.conferma.cpapi.GetLocationsDocument.GetLocations addNewGetLocations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetLocationsDocument.GetLocations target = null;
            target = (com.conferma.cpapi.GetLocationsDocument.GetLocations)get_store().add_element_user(GETLOCATIONS$0);
            return target;
        }
    }
    /**
     * An XML GetLocations(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class GetLocationsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetLocationsDocument.GetLocations
    {
        
        public GetLocationsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCATIONSEARCHREQUEST$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "LocationSearchRequest");
        
        
        /**
         * Gets the "LocationSearchRequest" element
         */
        public com.conferma.cpapi.LocationSearchRequest getLocationSearchRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.LocationSearchRequest target = null;
                target = (com.conferma.cpapi.LocationSearchRequest)get_store().find_element_user(LOCATIONSEARCHREQUEST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "LocationSearchRequest" element
         */
        public boolean isSetLocationSearchRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCATIONSEARCHREQUEST$0) != 0;
            }
        }
        
        /**
         * Sets the "LocationSearchRequest" element
         */
        public void setLocationSearchRequest(com.conferma.cpapi.LocationSearchRequest locationSearchRequest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.LocationSearchRequest target = null;
                target = (com.conferma.cpapi.LocationSearchRequest)get_store().find_element_user(LOCATIONSEARCHREQUEST$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.LocationSearchRequest)get_store().add_element_user(LOCATIONSEARCHREQUEST$0);
                }
                target.set(locationSearchRequest);
            }
        }
        
        /**
         * Appends and returns a new empty "LocationSearchRequest" element
         */
        public com.conferma.cpapi.LocationSearchRequest addNewLocationSearchRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.LocationSearchRequest target = null;
                target = (com.conferma.cpapi.LocationSearchRequest)get_store().add_element_user(LOCATIONSEARCHREQUEST$0);
                return target;
            }
        }
        
        /**
         * Unsets the "LocationSearchRequest" element
         */
        public void unsetLocationSearchRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCATIONSEARCHREQUEST$0, 0);
            }
        }
    }
}
