/*
 * XML Type:  GetDeploymentResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.GetDeploymentResponse
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * An XML GetDeploymentResponse(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public interface GetDeploymentResponse extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetDeploymentResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("getdeploymentresponsef131type");
    
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
     * Gets the "Card" element
     */
    com.conferma.cpapi.Card getCard();
    
    /**
     * True if has "Card" element
     */
    boolean isSetCard();
    
    /**
     * Sets the "Card" element
     */
    void setCard(com.conferma.cpapi.Card card);
    
    /**
     * Appends and returns a new empty "Card" element
     */
    com.conferma.cpapi.Card addNewCard();
    
    /**
     * Unsets the "Card" element
     */
    void unsetCard();
    
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
    com.conferma.cpapi.DeploymentType.Enum getType();
    
    /**
     * Gets (as xml) the "Type" attribute
     */
    com.conferma.cpapi.DeploymentType xgetType();
    
    /**
     * Sets the "Type" attribute
     */
    void setType(com.conferma.cpapi.DeploymentType.Enum type);
    
    /**
     * Sets (as xml) the "Type" attribute
     */
    void xsetType(com.conferma.cpapi.DeploymentType type);
    
    /**
     * Gets the "DeploymentID" attribute
     */
    int getDeploymentID();
    
    /**
     * Gets (as xml) the "DeploymentID" attribute
     */
    org.apache.xmlbeans.XmlInt xgetDeploymentID();
    
    /**
     * Sets the "DeploymentID" attribute
     */
    void setDeploymentID(int deploymentID);
    
    /**
     * Sets (as xml) the "DeploymentID" attribute
     */
    void xsetDeploymentID(org.apache.xmlbeans.XmlInt deploymentID);
    
    /**
     * Gets the "Status" attribute
     */
    com.conferma.cpapi.DeploymentStatus.Enum getStatus();
    
    /**
     * Gets (as xml) the "Status" attribute
     */
    com.conferma.cpapi.DeploymentStatus xgetStatus();
    
    /**
     * Sets the "Status" attribute
     */
    void setStatus(com.conferma.cpapi.DeploymentStatus.Enum status);
    
    /**
     * Sets (as xml) the "Status" attribute
     */
    void xsetStatus(com.conferma.cpapi.DeploymentStatus status);
    
    /**
     * Gets the "CardPoolName" attribute
     */
    java.lang.String getCardPoolName();
    
    /**
     * Gets (as xml) the "CardPoolName" attribute
     */
    org.apache.xmlbeans.XmlString xgetCardPoolName();
    
    /**
     * True if has "CardPoolName" attribute
     */
    boolean isSetCardPoolName();
    
    /**
     * Sets the "CardPoolName" attribute
     */
    void setCardPoolName(java.lang.String cardPoolName);
    
    /**
     * Sets (as xml) the "CardPoolName" attribute
     */
    void xsetCardPoolName(org.apache.xmlbeans.XmlString cardPoolName);
    
    /**
     * Unsets the "CardPoolName" attribute
     */
    void unsetCardPoolName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.GetDeploymentResponse newInstance() {
          return (com.conferma.cpapi.GetDeploymentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.GetDeploymentResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.GetDeploymentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.GetDeploymentResponse parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetDeploymentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.GetDeploymentResponse parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetDeploymentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.GetDeploymentResponse parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetDeploymentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.GetDeploymentResponse parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetDeploymentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.GetDeploymentResponse parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetDeploymentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.GetDeploymentResponse parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetDeploymentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.GetDeploymentResponse parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetDeploymentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.GetDeploymentResponse parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetDeploymentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.GetDeploymentResponse parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetDeploymentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.GetDeploymentResponse parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetDeploymentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.GetDeploymentResponse parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetDeploymentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.GetDeploymentResponse parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetDeploymentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.GetDeploymentResponse parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetDeploymentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.GetDeploymentResponse parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetDeploymentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.GetDeploymentResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.GetDeploymentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.GetDeploymentResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.GetDeploymentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
