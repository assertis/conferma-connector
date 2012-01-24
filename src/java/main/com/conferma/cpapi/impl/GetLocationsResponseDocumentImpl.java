/*
 * An XML document type.
 * Localname: GetLocationsResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.GetLocationsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one GetLocationsResponse(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class GetLocationsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetLocationsResponseDocument
{
    
    public GetLocationsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLOCATIONSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GetLocationsResponse");
    
    
    /**
     * Gets the "GetLocationsResponse" element
     */
    public com.conferma.cpapi.GetLocationsResponseDocument.GetLocationsResponse getGetLocationsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetLocationsResponseDocument.GetLocationsResponse target = null;
            target = (com.conferma.cpapi.GetLocationsResponseDocument.GetLocationsResponse)get_store().find_element_user(GETLOCATIONSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetLocationsResponse" element
     */
    public void setGetLocationsResponse(com.conferma.cpapi.GetLocationsResponseDocument.GetLocationsResponse getLocationsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetLocationsResponseDocument.GetLocationsResponse target = null;
            target = (com.conferma.cpapi.GetLocationsResponseDocument.GetLocationsResponse)get_store().find_element_user(GETLOCATIONSRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.GetLocationsResponseDocument.GetLocationsResponse)get_store().add_element_user(GETLOCATIONSRESPONSE$0);
            }
            target.set(getLocationsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetLocationsResponse" element
     */
    public com.conferma.cpapi.GetLocationsResponseDocument.GetLocationsResponse addNewGetLocationsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetLocationsResponseDocument.GetLocationsResponse target = null;
            target = (com.conferma.cpapi.GetLocationsResponseDocument.GetLocationsResponse)get_store().add_element_user(GETLOCATIONSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetLocationsResponse(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class GetLocationsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetLocationsResponseDocument.GetLocationsResponse
    {
        
        public GetLocationsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETLOCATIONSRESULT$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GetLocationsResult");
        
        
        /**
         * Gets the "GetLocationsResult" element
         */
        public com.conferma.cpapi.LocationSearchResponse getGetLocationsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.LocationSearchResponse target = null;
                target = (com.conferma.cpapi.LocationSearchResponse)get_store().find_element_user(GETLOCATIONSRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetLocationsResult" element
         */
        public boolean isSetGetLocationsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETLOCATIONSRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetLocationsResult" element
         */
        public void setGetLocationsResult(com.conferma.cpapi.LocationSearchResponse getLocationsResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.LocationSearchResponse target = null;
                target = (com.conferma.cpapi.LocationSearchResponse)get_store().find_element_user(GETLOCATIONSRESULT$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.LocationSearchResponse)get_store().add_element_user(GETLOCATIONSRESULT$0);
                }
                target.set(getLocationsResult);
            }
        }
        
        /**
         * Appends and returns a new empty "GetLocationsResult" element
         */
        public com.conferma.cpapi.LocationSearchResponse addNewGetLocationsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.LocationSearchResponse target = null;
                target = (com.conferma.cpapi.LocationSearchResponse)get_store().add_element_user(GETLOCATIONSRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetLocationsResult" element
         */
        public void unsetGetLocationsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETLOCATIONSRESULT$0, 0);
            }
        }
    }
}
