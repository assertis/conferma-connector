/*
 * XML Type:  LocationSearchResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.LocationSearchResponse
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * An XML LocationSearchResponse(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public interface LocationSearchResponse extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LocationSearchResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("locationsearchresponse7efdtype");
    
    /**
     * Gets the "HasResults" element
     */
    boolean getHasResults();
    
    /**
     * Gets (as xml) the "HasResults" element
     */
    org.apache.xmlbeans.XmlBoolean xgetHasResults();
    
    /**
     * Sets the "HasResults" element
     */
    void setHasResults(boolean hasResults);
    
    /**
     * Sets (as xml) the "HasResults" element
     */
    void xsetHasResults(org.apache.xmlbeans.XmlBoolean hasResults);
    
    /**
     * Gets the "HasLocationOptions" element
     */
    boolean getHasLocationOptions();
    
    /**
     * Gets (as xml) the "HasLocationOptions" element
     */
    org.apache.xmlbeans.XmlBoolean xgetHasLocationOptions();
    
    /**
     * Sets the "HasLocationOptions" element
     */
    void setHasLocationOptions(boolean hasLocationOptions);
    
    /**
     * Sets (as xml) the "HasLocationOptions" element
     */
    void xsetHasLocationOptions(org.apache.xmlbeans.XmlBoolean hasLocationOptions);
    
    /**
     * Gets the "IsGeoSupported" element
     */
    boolean getIsGeoSupported();
    
    /**
     * Gets (as xml) the "IsGeoSupported" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsGeoSupported();
    
    /**
     * Sets the "IsGeoSupported" element
     */
    void setIsGeoSupported(boolean isGeoSupported);
    
    /**
     * Sets (as xml) the "IsGeoSupported" element
     */
    void xsetIsGeoSupported(org.apache.xmlbeans.XmlBoolean isGeoSupported);
    
    /**
     * Gets the "LocationFocus" element
     */
    com.conferma.cpapi.LocationOption getLocationFocus();
    
    /**
     * True if has "LocationFocus" element
     */
    boolean isSetLocationFocus();
    
    /**
     * Sets the "LocationFocus" element
     */
    void setLocationFocus(com.conferma.cpapi.LocationOption locationFocus);
    
    /**
     * Appends and returns a new empty "LocationFocus" element
     */
    com.conferma.cpapi.LocationOption addNewLocationFocus();
    
    /**
     * Unsets the "LocationFocus" element
     */
    void unsetLocationFocus();
    
    /**
     * Gets the "LocationOptions" element
     */
    com.conferma.cpapi.ArrayOfLocationOption getLocationOptions();
    
    /**
     * True if has "LocationOptions" element
     */
    boolean isSetLocationOptions();
    
    /**
     * Sets the "LocationOptions" element
     */
    void setLocationOptions(com.conferma.cpapi.ArrayOfLocationOption locationOptions);
    
    /**
     * Appends and returns a new empty "LocationOptions" element
     */
    com.conferma.cpapi.ArrayOfLocationOption addNewLocationOptions();
    
    /**
     * Unsets the "LocationOptions" element
     */
    void unsetLocationOptions();
    
    /**
     * Gets the "Locations" element
     */
    com.conferma.cpapi.ArrayOfLocationRecord getLocations();
    
    /**
     * True if has "Locations" element
     */
    boolean isSetLocations();
    
    /**
     * Sets the "Locations" element
     */
    void setLocations(com.conferma.cpapi.ArrayOfLocationRecord locations);
    
    /**
     * Appends and returns a new empty "Locations" element
     */
    com.conferma.cpapi.ArrayOfLocationRecord addNewLocations();
    
    /**
     * Unsets the "Locations" element
     */
    void unsetLocations();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.LocationSearchResponse newInstance() {
          return (com.conferma.cpapi.LocationSearchResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.LocationSearchResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.LocationSearchResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.LocationSearchResponse parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.LocationSearchResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.LocationSearchResponse parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.LocationSearchResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.LocationSearchResponse parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationSearchResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.LocationSearchResponse parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationSearchResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.LocationSearchResponse parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationSearchResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.LocationSearchResponse parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationSearchResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.LocationSearchResponse parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationSearchResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.LocationSearchResponse parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationSearchResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.LocationSearchResponse parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationSearchResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.LocationSearchResponse parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationSearchResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.LocationSearchResponse parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.LocationSearchResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.LocationSearchResponse parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.LocationSearchResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.LocationSearchResponse parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.LocationSearchResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.LocationSearchResponse parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.LocationSearchResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.LocationSearchResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.LocationSearchResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.LocationSearchResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.LocationSearchResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
