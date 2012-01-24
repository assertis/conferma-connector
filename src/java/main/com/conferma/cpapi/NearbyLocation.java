/*
 * XML Type:  NearbyLocation
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.NearbyLocation
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * An XML NearbyLocation(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public interface NearbyLocation extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NearbyLocation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("nearbylocation9607type");
    
    /**
     * Gets the "LocationType" attribute
     */
    com.conferma.cpapi.LocationType.Enum getLocationType();
    
    /**
     * Gets (as xml) the "LocationType" attribute
     */
    com.conferma.cpapi.LocationType xgetLocationType();
    
    /**
     * Sets the "LocationType" attribute
     */
    void setLocationType(com.conferma.cpapi.LocationType.Enum locationType);
    
    /**
     * Sets (as xml) the "LocationType" attribute
     */
    void xsetLocationType(com.conferma.cpapi.LocationType locationType);
    
    /**
     * Gets the "Name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "Name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "Name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "Name" attribute
     */
    void unsetName();
    
    /**
     * Gets the "Code" attribute
     */
    java.lang.String getCode();
    
    /**
     * Gets (as xml) the "Code" attribute
     */
    org.apache.xmlbeans.XmlString xgetCode();
    
    /**
     * True if has "Code" attribute
     */
    boolean isSetCode();
    
    /**
     * Sets the "Code" attribute
     */
    void setCode(java.lang.String code);
    
    /**
     * Sets (as xml) the "Code" attribute
     */
    void xsetCode(org.apache.xmlbeans.XmlString code);
    
    /**
     * Unsets the "Code" attribute
     */
    void unsetCode();
    
    /**
     * Gets the "Distance" attribute
     */
    java.math.BigDecimal getDistance();
    
    /**
     * Gets (as xml) the "Distance" attribute
     */
    org.apache.xmlbeans.XmlDecimal xgetDistance();
    
    /**
     * Sets the "Distance" attribute
     */
    void setDistance(java.math.BigDecimal distance);
    
    /**
     * Sets (as xml) the "Distance" attribute
     */
    void xsetDistance(org.apache.xmlbeans.XmlDecimal distance);
    
    /**
     * Gets the "DistanceType" attribute
     */
    com.conferma.cpapi.DistanceType.Enum getDistanceType();
    
    /**
     * Gets (as xml) the "DistanceType" attribute
     */
    com.conferma.cpapi.DistanceType xgetDistanceType();
    
    /**
     * Sets the "DistanceType" attribute
     */
    void setDistanceType(com.conferma.cpapi.DistanceType.Enum distanceType);
    
    /**
     * Sets (as xml) the "DistanceType" attribute
     */
    void xsetDistanceType(com.conferma.cpapi.DistanceType distanceType);
    
    /**
     * Gets the "Latitude" attribute
     */
    java.math.BigDecimal getLatitude();
    
    /**
     * Gets (as xml) the "Latitude" attribute
     */
    org.apache.xmlbeans.XmlDecimal xgetLatitude();
    
    /**
     * Sets the "Latitude" attribute
     */
    void setLatitude(java.math.BigDecimal latitude);
    
    /**
     * Sets (as xml) the "Latitude" attribute
     */
    void xsetLatitude(org.apache.xmlbeans.XmlDecimal latitude);
    
    /**
     * Gets the "Longitude" attribute
     */
    java.math.BigDecimal getLongitude();
    
    /**
     * Gets (as xml) the "Longitude" attribute
     */
    org.apache.xmlbeans.XmlDecimal xgetLongitude();
    
    /**
     * Sets the "Longitude" attribute
     */
    void setLongitude(java.math.BigDecimal longitude);
    
    /**
     * Sets (as xml) the "Longitude" attribute
     */
    void xsetLongitude(org.apache.xmlbeans.XmlDecimal longitude);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.NearbyLocation newInstance() {
          return (com.conferma.cpapi.NearbyLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.NearbyLocation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.NearbyLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.NearbyLocation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.NearbyLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.NearbyLocation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.NearbyLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.NearbyLocation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.NearbyLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.NearbyLocation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.NearbyLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.NearbyLocation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.NearbyLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.NearbyLocation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.NearbyLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.NearbyLocation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.NearbyLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.NearbyLocation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.NearbyLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.NearbyLocation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.NearbyLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.NearbyLocation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.NearbyLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.NearbyLocation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.NearbyLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.NearbyLocation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.NearbyLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.NearbyLocation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.NearbyLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.NearbyLocation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.NearbyLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.NearbyLocation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.NearbyLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.NearbyLocation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.NearbyLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
