/*
 * XML Type:  Card
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.Card
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * An XML Card(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public interface Card extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Card.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("card258btype");
    
    /**
     * Gets the "Name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "Name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "Name" element
     */
    void unsetName();
    
    /**
     * Gets the "Number" element
     */
    java.lang.String getNumber();
    
    /**
     * Gets (as xml) the "Number" element
     */
    org.apache.xmlbeans.XmlString xgetNumber();
    
    /**
     * True if has "Number" element
     */
    boolean isSetNumber();
    
    /**
     * Sets the "Number" element
     */
    void setNumber(java.lang.String number);
    
    /**
     * Sets (as xml) the "Number" element
     */
    void xsetNumber(org.apache.xmlbeans.XmlString number);
    
    /**
     * Unsets the "Number" element
     */
    void unsetNumber();
    
    /**
     * Gets the "Type" element
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "Type" element
     */
    org.apache.xmlbeans.XmlString xgetType();
    
    /**
     * True if has "Type" element
     */
    boolean isSetType();
    
    /**
     * Sets the "Type" element
     */
    void setType(java.lang.String type);
    
    /**
     * Sets (as xml) the "Type" element
     */
    void xsetType(org.apache.xmlbeans.XmlString type);
    
    /**
     * Unsets the "Type" element
     */
    void unsetType();
    
    /**
     * Gets the "StartDate" element
     */
    com.conferma.cpapi.CardDate getStartDate();
    
    /**
     * True if has "StartDate" element
     */
    boolean isSetStartDate();
    
    /**
     * Sets the "StartDate" element
     */
    void setStartDate(com.conferma.cpapi.CardDate startDate);
    
    /**
     * Appends and returns a new empty "StartDate" element
     */
    com.conferma.cpapi.CardDate addNewStartDate();
    
    /**
     * Unsets the "StartDate" element
     */
    void unsetStartDate();
    
    /**
     * Gets the "ExpiryDate" element
     */
    com.conferma.cpapi.CardDate getExpiryDate();
    
    /**
     * True if has "ExpiryDate" element
     */
    boolean isSetExpiryDate();
    
    /**
     * Sets the "ExpiryDate" element
     */
    void setExpiryDate(com.conferma.cpapi.CardDate expiryDate);
    
    /**
     * Appends and returns a new empty "ExpiryDate" element
     */
    com.conferma.cpapi.CardDate addNewExpiryDate();
    
    /**
     * Unsets the "ExpiryDate" element
     */
    void unsetExpiryDate();
    
    /**
     * Gets the "CVV" element
     */
    java.lang.String getCVV();
    
    /**
     * Gets (as xml) the "CVV" element
     */
    org.apache.xmlbeans.XmlString xgetCVV();
    
    /**
     * True if has "CVV" element
     */
    boolean isSetCVV();
    
    /**
     * Sets the "CVV" element
     */
    void setCVV(java.lang.String cvv);
    
    /**
     * Sets (as xml) the "CVV" element
     */
    void xsetCVV(org.apache.xmlbeans.XmlString cvv);
    
    /**
     * Unsets the "CVV" element
     */
    void unsetCVV();
    
    /**
     * Gets the "Provider" element
     */
    com.conferma.cpapi.CardProvider getProvider();
    
    /**
     * True if has "Provider" element
     */
    boolean isSetProvider();
    
    /**
     * Sets the "Provider" element
     */
    void setProvider(com.conferma.cpapi.CardProvider provider);
    
    /**
     * Appends and returns a new empty "Provider" element
     */
    com.conferma.cpapi.CardProvider addNewProvider();
    
    /**
     * Unsets the "Provider" element
     */
    void unsetProvider();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.Card newInstance() {
          return (com.conferma.cpapi.Card) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.Card newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.Card) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.Card parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Card) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.Card parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Card) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.Card parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Card) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.Card parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Card) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.Card parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Card) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.Card parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Card) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.Card parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Card) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.Card parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Card) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.Card parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Card) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.Card parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Card) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.Card parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Card) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.Card parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Card) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.Card parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Card) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.Card parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Card) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.Card parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.Card) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.Card parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.Card) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
