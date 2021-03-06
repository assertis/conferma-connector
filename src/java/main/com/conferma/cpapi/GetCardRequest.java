/*
 * XML Type:  GetCardRequest
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.GetCardRequest
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * An XML GetCardRequest(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public interface GetCardRequest extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetCardRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("getcardrequestb412type");
    
    /**
     * Gets the "DeploymentID" element
     */
    java.lang.String getDeploymentID();
    
    /**
     * Gets (as xml) the "DeploymentID" element
     */
    org.apache.xmlbeans.XmlString xgetDeploymentID();
    
    /**
     * True if has "DeploymentID" element
     */
    boolean isSetDeploymentID();
    
    /**
     * Sets the "DeploymentID" element
     */
    void setDeploymentID(java.lang.String deploymentID);
    
    /**
     * Sets (as xml) the "DeploymentID" element
     */
    void xsetDeploymentID(org.apache.xmlbeans.XmlString deploymentID);
    
    /**
     * Unsets the "DeploymentID" element
     */
    void unsetDeploymentID();
    
    /**
     * Gets the "General" element
     */
    com.conferma.cpapi.GeneralPayee getGeneral();
    
    /**
     * True if has "General" element
     */
    boolean isSetGeneral();
    
    /**
     * Sets the "General" element
     */
    void setGeneral(com.conferma.cpapi.GeneralPayee general);
    
    /**
     * Appends and returns a new empty "General" element
     */
    com.conferma.cpapi.GeneralPayee addNewGeneral();
    
    /**
     * Unsets the "General" element
     */
    void unsetGeneral();
    
    /**
     * Gets the "Identifiers" element
     */
    com.conferma.cpapi.ArrayOfIdentifier getIdentifiers();
    
    /**
     * True if has "Identifiers" element
     */
    boolean isSetIdentifiers();
    
    /**
     * Sets the "Identifiers" element
     */
    void setIdentifiers(com.conferma.cpapi.ArrayOfIdentifier identifiers);
    
    /**
     * Appends and returns a new empty "Identifiers" element
     */
    com.conferma.cpapi.ArrayOfIdentifier addNewIdentifiers();
    
    /**
     * Unsets the "Identifiers" element
     */
    void unsetIdentifiers();
    
    /**
     * Gets the "Supplier" element
     */
    com.conferma.cpapi.Supplier getSupplier();
    
    /**
     * True if has "Supplier" element
     */
    boolean isSetSupplier();
    
    /**
     * Sets the "Supplier" element
     */
    void setSupplier(com.conferma.cpapi.Supplier supplier);
    
    /**
     * Appends and returns a new empty "Supplier" element
     */
    com.conferma.cpapi.Supplier addNewSupplier();
    
    /**
     * Unsets the "Supplier" element
     */
    void unsetSupplier();
    
    /**
     * Gets the "Travellers" element
     */
    com.conferma.cpapi.ArrayOfTraveller getTravellers();
    
    /**
     * True if has "Travellers" element
     */
    boolean isSetTravellers();
    
    /**
     * Sets the "Travellers" element
     */
    void setTravellers(com.conferma.cpapi.ArrayOfTraveller travellers);
    
    /**
     * Appends and returns a new empty "Travellers" element
     */
    com.conferma.cpapi.ArrayOfTraveller addNewTravellers();
    
    /**
     * Unsets the "Travellers" element
     */
    void unsetTravellers();
    
    /**
     * Gets the "Air" element
     */
    com.conferma.cpapi.Air getAir();
    
    /**
     * True if has "Air" element
     */
    boolean isSetAir();
    
    /**
     * Sets the "Air" element
     */
    void setAir(com.conferma.cpapi.Air air);
    
    /**
     * Appends and returns a new empty "Air" element
     */
    com.conferma.cpapi.Air addNewAir();
    
    /**
     * Unsets the "Air" element
     */
    void unsetAir();
    
    /**
     * Gets the "Hotel" element
     */
    com.conferma.cpapi.Hotel getHotel();
    
    /**
     * True if has "Hotel" element
     */
    boolean isSetHotel();
    
    /**
     * Sets the "Hotel" element
     */
    void setHotel(com.conferma.cpapi.Hotel hotel);
    
    /**
     * Appends and returns a new empty "Hotel" element
     */
    com.conferma.cpapi.Hotel addNewHotel();
    
    /**
     * Unsets the "Hotel" element
     */
    void unsetHotel();
    
    /**
     * Gets the "Rail" element
     */
    com.conferma.cpapi.Rail getRail();
    
    /**
     * True if has "Rail" element
     */
    boolean isSetRail();
    
    /**
     * Sets the "Rail" element
     */
    void setRail(com.conferma.cpapi.Rail rail);
    
    /**
     * Appends and returns a new empty "Rail" element
     */
    com.conferma.cpapi.Rail addNewRail();
    
    /**
     * Unsets the "Rail" element
     */
    void unsetRail();
    
    /**
     * Gets the "Type" attribute
     */
    com.conferma.cpapi.PayeeType.Enum getType();
    
    /**
     * Gets (as xml) the "Type" attribute
     */
    com.conferma.cpapi.PayeeType xgetType();
    
    /**
     * Sets the "Type" attribute
     */
    void setType(com.conferma.cpapi.PayeeType.Enum type);
    
    /**
     * Sets (as xml) the "Type" attribute
     */
    void xsetType(com.conferma.cpapi.PayeeType type);
    
    /**
     * Gets the "ReturnCVV" attribute
     */
    boolean getReturnCVV();
    
    /**
     * Gets (as xml) the "ReturnCVV" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetReturnCVV();
    
    /**
     * Sets the "ReturnCVV" attribute
     */
    void setReturnCVV(boolean returnCVV);
    
    /**
     * Sets (as xml) the "ReturnCVV" attribute
     */
    void xsetReturnCVV(org.apache.xmlbeans.XmlBoolean returnCVV);
    
    /**
     * Gets the "UseEmergencyCard" attribute
     */
    boolean getUseEmergencyCard();
    
    /**
     * Gets (as xml) the "UseEmergencyCard" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetUseEmergencyCard();
    
    /**
     * Sets the "UseEmergencyCard" attribute
     */
    void setUseEmergencyCard(boolean useEmergencyCard);
    
    /**
     * Sets (as xml) the "UseEmergencyCard" attribute
     */
    void xsetUseEmergencyCard(org.apache.xmlbeans.XmlBoolean useEmergencyCard);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.GetCardRequest newInstance() {
          return (com.conferma.cpapi.GetCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.GetCardRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.GetCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.GetCardRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.GetCardRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.GetCardRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.GetCardRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.GetCardRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.GetCardRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.GetCardRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.GetCardRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.GetCardRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.GetCardRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.GetCardRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.GetCardRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.GetCardRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.GetCardRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.GetCardRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.GetCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.GetCardRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.GetCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
