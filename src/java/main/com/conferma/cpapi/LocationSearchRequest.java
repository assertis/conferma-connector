/*
 * XML Type:  LocationSearchRequest
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.LocationSearchRequest
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * An XML LocationSearchRequest(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public interface LocationSearchRequest extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LocationSearchRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("locationsearchrequest717btype");
    
    /**
     * Gets the "SearchType" element
     */
    com.conferma.cpapi.SearchType.Enum getSearchType();
    
    /**
     * Gets (as xml) the "SearchType" element
     */
    com.conferma.cpapi.SearchType xgetSearchType();
    
    /**
     * Sets the "SearchType" element
     */
    void setSearchType(com.conferma.cpapi.SearchType.Enum searchType);
    
    /**
     * Sets (as xml) the "SearchType" element
     */
    void xsetSearchType(com.conferma.cpapi.SearchType searchType);
    
    /**
     * Gets the "SearchMethod" element
     */
    com.conferma.cpapi.SearchMethod.Enum getSearchMethod();
    
    /**
     * Gets (as xml) the "SearchMethod" element
     */
    com.conferma.cpapi.SearchMethod xgetSearchMethod();
    
    /**
     * Sets the "SearchMethod" element
     */
    void setSearchMethod(com.conferma.cpapi.SearchMethod.Enum searchMethod);
    
    /**
     * Sets (as xml) the "SearchMethod" element
     */
    void xsetSearchMethod(com.conferma.cpapi.SearchMethod searchMethod);
    
    /**
     * Gets the "Radius" element
     */
    com.conferma.cpapi.Radius getRadius();
    
    /**
     * True if has "Radius" element
     */
    boolean isSetRadius();
    
    /**
     * Sets the "Radius" element
     */
    void setRadius(com.conferma.cpapi.Radius radius);
    
    /**
     * Appends and returns a new empty "Radius" element
     */
    com.conferma.cpapi.Radius addNewRadius();
    
    /**
     * Unsets the "Radius" element
     */
    void unsetRadius();
    
    /**
     * Gets the "Airport" element
     */
    com.conferma.cpapi.AirportSearch getAirport();
    
    /**
     * True if has "Airport" element
     */
    boolean isSetAirport();
    
    /**
     * Sets the "Airport" element
     */
    void setAirport(com.conferma.cpapi.AirportSearch airport);
    
    /**
     * Appends and returns a new empty "Airport" element
     */
    com.conferma.cpapi.AirportSearch addNewAirport();
    
    /**
     * Unsets the "Airport" element
     */
    void unsetAirport();
    
    /**
     * Gets the "ExactHotel" element
     */
    com.conferma.cpapi.ExactHotelSearch getExactHotel();
    
    /**
     * True if has "ExactHotel" element
     */
    boolean isSetExactHotel();
    
    /**
     * Sets the "ExactHotel" element
     */
    void setExactHotel(com.conferma.cpapi.ExactHotelSearch exactHotel);
    
    /**
     * Appends and returns a new empty "ExactHotel" element
     */
    com.conferma.cpapi.ExactHotelSearch addNewExactHotel();
    
    /**
     * Unsets the "ExactHotel" element
     */
    void unsetExactHotel();
    
    /**
     * Gets the "Geo" element
     */
    com.conferma.cpapi.GeocodeSearch getGeo();
    
    /**
     * True if has "Geo" element
     */
    boolean isSetGeo();
    
    /**
     * Sets the "Geo" element
     */
    void setGeo(com.conferma.cpapi.GeocodeSearch geo);
    
    /**
     * Appends and returns a new empty "Geo" element
     */
    com.conferma.cpapi.GeocodeSearch addNewGeo();
    
    /**
     * Unsets the "Geo" element
     */
    void unsetGeo();
    
    /**
     * Gets the "Location" element
     */
    com.conferma.cpapi.LocationSearch getLocation();
    
    /**
     * True if has "Location" element
     */
    boolean isSetLocation();
    
    /**
     * Sets the "Location" element
     */
    void setLocation(com.conferma.cpapi.LocationSearch location);
    
    /**
     * Appends and returns a new empty "Location" element
     */
    com.conferma.cpapi.LocationSearch addNewLocation();
    
    /**
     * Unsets the "Location" element
     */
    void unsetLocation();
    
    /**
     * Gets the "Office" element
     */
    com.conferma.cpapi.OfficeSearch getOffice();
    
    /**
     * True if has "Office" element
     */
    boolean isSetOffice();
    
    /**
     * Sets the "Office" element
     */
    void setOffice(com.conferma.cpapi.OfficeSearch office);
    
    /**
     * Appends and returns a new empty "Office" element
     */
    com.conferma.cpapi.OfficeSearch addNewOffice();
    
    /**
     * Unsets the "Office" element
     */
    void unsetOffice();
    
    /**
     * Gets the "TrainStation" element
     */
    com.conferma.cpapi.TrainStationSearch getTrainStation();
    
    /**
     * True if has "TrainStation" element
     */
    boolean isSetTrainStation();
    
    /**
     * Sets the "TrainStation" element
     */
    void setTrainStation(com.conferma.cpapi.TrainStationSearch trainStation);
    
    /**
     * Appends and returns a new empty "TrainStation" element
     */
    com.conferma.cpapi.TrainStationSearch addNewTrainStation();
    
    /**
     * Unsets the "TrainStation" element
     */
    void unsetTrainStation();
    
    /**
     * Gets the "Keyword" element
     */
    com.conferma.cpapi.KeywordSearch getKeyword();
    
    /**
     * True if has "Keyword" element
     */
    boolean isSetKeyword();
    
    /**
     * Sets the "Keyword" element
     */
    void setKeyword(com.conferma.cpapi.KeywordSearch keyword);
    
    /**
     * Appends and returns a new empty "Keyword" element
     */
    com.conferma.cpapi.KeywordSearch addNewKeyword();
    
    /**
     * Unsets the "Keyword" element
     */
    void unsetKeyword();
    
    /**
     * Gets the "AdvancedSearchOptions" element
     */
    com.conferma.cpapi.AdvancedSearchOptions getAdvancedSearchOptions();
    
    /**
     * True if has "AdvancedSearchOptions" element
     */
    boolean isSetAdvancedSearchOptions();
    
    /**
     * Sets the "AdvancedSearchOptions" element
     */
    void setAdvancedSearchOptions(com.conferma.cpapi.AdvancedSearchOptions advancedSearchOptions);
    
    /**
     * Appends and returns a new empty "AdvancedSearchOptions" element
     */
    com.conferma.cpapi.AdvancedSearchOptions addNewAdvancedSearchOptions();
    
    /**
     * Unsets the "AdvancedSearchOptions" element
     */
    void unsetAdvancedSearchOptions();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.LocationSearchRequest newInstance() {
          return (com.conferma.cpapi.LocationSearchRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.LocationSearchRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.LocationSearchRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.LocationSearchRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.LocationSearchRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.LocationSearchRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.LocationSearchRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.LocationSearchRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationSearchRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.LocationSearchRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationSearchRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.LocationSearchRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationSearchRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.LocationSearchRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationSearchRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.LocationSearchRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationSearchRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.LocationSearchRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationSearchRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.LocationSearchRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationSearchRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.LocationSearchRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationSearchRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.LocationSearchRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.LocationSearchRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.LocationSearchRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.LocationSearchRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.LocationSearchRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.LocationSearchRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.LocationSearchRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.LocationSearchRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.LocationSearchRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.LocationSearchRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.LocationSearchRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.LocationSearchRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
