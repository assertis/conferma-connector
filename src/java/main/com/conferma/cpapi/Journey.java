/*
 * XML Type:  Journey
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.Journey
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * An XML Journey(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public interface Journey extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Journey.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("journey4ecdtype");
    
    /**
     * Gets the "SupplierCode" attribute
     */
    java.lang.String getSupplierCode();
    
    /**
     * Gets (as xml) the "SupplierCode" attribute
     */
    org.apache.xmlbeans.XmlString xgetSupplierCode();
    
    /**
     * True if has "SupplierCode" attribute
     */
    boolean isSetSupplierCode();
    
    /**
     * Sets the "SupplierCode" attribute
     */
    void setSupplierCode(java.lang.String supplierCode);
    
    /**
     * Sets (as xml) the "SupplierCode" attribute
     */
    void xsetSupplierCode(org.apache.xmlbeans.XmlString supplierCode);
    
    /**
     * Unsets the "SupplierCode" attribute
     */
    void unsetSupplierCode();
    
    /**
     * Gets the "JourneyID" attribute
     */
    java.lang.String getJourneyID();
    
    /**
     * Gets (as xml) the "JourneyID" attribute
     */
    org.apache.xmlbeans.XmlString xgetJourneyID();
    
    /**
     * True if has "JourneyID" attribute
     */
    boolean isSetJourneyID();
    
    /**
     * Sets the "JourneyID" attribute
     */
    void setJourneyID(java.lang.String journeyID);
    
    /**
     * Sets (as xml) the "JourneyID" attribute
     */
    void xsetJourneyID(org.apache.xmlbeans.XmlString journeyID);
    
    /**
     * Unsets the "JourneyID" attribute
     */
    void unsetJourneyID();
    
    /**
     * Gets the "StartLocation" attribute
     */
    java.lang.String getStartLocation();
    
    /**
     * Gets (as xml) the "StartLocation" attribute
     */
    org.apache.xmlbeans.XmlString xgetStartLocation();
    
    /**
     * True if has "StartLocation" attribute
     */
    boolean isSetStartLocation();
    
    /**
     * Sets the "StartLocation" attribute
     */
    void setStartLocation(java.lang.String startLocation);
    
    /**
     * Sets (as xml) the "StartLocation" attribute
     */
    void xsetStartLocation(org.apache.xmlbeans.XmlString startLocation);
    
    /**
     * Unsets the "StartLocation" attribute
     */
    void unsetStartLocation();
    
    /**
     * Gets the "StartDateTime" attribute
     */
    java.util.Calendar getStartDateTime();
    
    /**
     * Gets (as xml) the "StartDateTime" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetStartDateTime();
    
    /**
     * Sets the "StartDateTime" attribute
     */
    void setStartDateTime(java.util.Calendar startDateTime);
    
    /**
     * Sets (as xml) the "StartDateTime" attribute
     */
    void xsetStartDateTime(org.apache.xmlbeans.XmlDateTime startDateTime);
    
    /**
     * Gets the "EndLocation" attribute
     */
    java.lang.String getEndLocation();
    
    /**
     * Gets (as xml) the "EndLocation" attribute
     */
    org.apache.xmlbeans.XmlString xgetEndLocation();
    
    /**
     * True if has "EndLocation" attribute
     */
    boolean isSetEndLocation();
    
    /**
     * Sets the "EndLocation" attribute
     */
    void setEndLocation(java.lang.String endLocation);
    
    /**
     * Sets (as xml) the "EndLocation" attribute
     */
    void xsetEndLocation(org.apache.xmlbeans.XmlString endLocation);
    
    /**
     * Unsets the "EndLocation" attribute
     */
    void unsetEndLocation();
    
    /**
     * Gets the "EndDateTime" attribute
     */
    java.util.Calendar getEndDateTime();
    
    /**
     * Gets (as xml) the "EndDateTime" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetEndDateTime();
    
    /**
     * Sets the "EndDateTime" attribute
     */
    void setEndDateTime(java.util.Calendar endDateTime);
    
    /**
     * Sets (as xml) the "EndDateTime" attribute
     */
    void xsetEndDateTime(org.apache.xmlbeans.XmlDateTime endDateTime);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.Journey newInstance() {
          return (com.conferma.cpapi.Journey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.Journey newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.Journey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.Journey parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Journey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.Journey parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Journey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.Journey parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Journey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.Journey parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Journey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.Journey parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Journey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.Journey parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Journey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.Journey parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Journey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.Journey parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Journey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.Journey parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Journey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.Journey parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Journey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.Journey parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Journey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.Journey parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Journey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.Journey parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Journey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.Journey parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Journey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.Journey parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.Journey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.Journey parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.Journey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
