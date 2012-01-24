/*
 * XML Type:  Address
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.Address
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * An XML Address(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public interface Address extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Address.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("address6219type");
    
    /**
     * Gets the "AddressLine1" element
     */
    java.lang.String getAddressLine1();
    
    /**
     * Gets (as xml) the "AddressLine1" element
     */
    org.apache.xmlbeans.XmlString xgetAddressLine1();
    
    /**
     * True if has "AddressLine1" element
     */
    boolean isSetAddressLine1();
    
    /**
     * Sets the "AddressLine1" element
     */
    void setAddressLine1(java.lang.String addressLine1);
    
    /**
     * Sets (as xml) the "AddressLine1" element
     */
    void xsetAddressLine1(org.apache.xmlbeans.XmlString addressLine1);
    
    /**
     * Unsets the "AddressLine1" element
     */
    void unsetAddressLine1();
    
    /**
     * Gets the "AddressLine2" element
     */
    java.lang.String getAddressLine2();
    
    /**
     * Gets (as xml) the "AddressLine2" element
     */
    org.apache.xmlbeans.XmlString xgetAddressLine2();
    
    /**
     * True if has "AddressLine2" element
     */
    boolean isSetAddressLine2();
    
    /**
     * Sets the "AddressLine2" element
     */
    void setAddressLine2(java.lang.String addressLine2);
    
    /**
     * Sets (as xml) the "AddressLine2" element
     */
    void xsetAddressLine2(org.apache.xmlbeans.XmlString addressLine2);
    
    /**
     * Unsets the "AddressLine2" element
     */
    void unsetAddressLine2();
    
    /**
     * Gets the "City" element
     */
    java.lang.String getCity();
    
    /**
     * Gets (as xml) the "City" element
     */
    org.apache.xmlbeans.XmlString xgetCity();
    
    /**
     * True if has "City" element
     */
    boolean isSetCity();
    
    /**
     * Sets the "City" element
     */
    void setCity(java.lang.String city);
    
    /**
     * Sets (as xml) the "City" element
     */
    void xsetCity(org.apache.xmlbeans.XmlString city);
    
    /**
     * Unsets the "City" element
     */
    void unsetCity();
    
    /**
     * Gets the "PostalOrZipCode" element
     */
    java.lang.String getPostalOrZipCode();
    
    /**
     * Gets (as xml) the "PostalOrZipCode" element
     */
    org.apache.xmlbeans.XmlString xgetPostalOrZipCode();
    
    /**
     * True if has "PostalOrZipCode" element
     */
    boolean isSetPostalOrZipCode();
    
    /**
     * Sets the "PostalOrZipCode" element
     */
    void setPostalOrZipCode(java.lang.String postalOrZipCode);
    
    /**
     * Sets (as xml) the "PostalOrZipCode" element
     */
    void xsetPostalOrZipCode(org.apache.xmlbeans.XmlString postalOrZipCode);
    
    /**
     * Unsets the "PostalOrZipCode" element
     */
    void unsetPostalOrZipCode();
    
    /**
     * Gets the "CountryCode" element
     */
    java.lang.String getCountryCode();
    
    /**
     * Gets (as xml) the "CountryCode" element
     */
    org.apache.xmlbeans.XmlString xgetCountryCode();
    
    /**
     * True if has "CountryCode" element
     */
    boolean isSetCountryCode();
    
    /**
     * Sets the "CountryCode" element
     */
    void setCountryCode(java.lang.String countryCode);
    
    /**
     * Sets (as xml) the "CountryCode" element
     */
    void xsetCountryCode(org.apache.xmlbeans.XmlString countryCode);
    
    /**
     * Unsets the "CountryCode" element
     */
    void unsetCountryCode();
    
    /**
     * Gets the "Telephone" element
     */
    java.lang.String getTelephone();
    
    /**
     * Gets (as xml) the "Telephone" element
     */
    org.apache.xmlbeans.XmlString xgetTelephone();
    
    /**
     * True if has "Telephone" element
     */
    boolean isSetTelephone();
    
    /**
     * Sets the "Telephone" element
     */
    void setTelephone(java.lang.String telephone);
    
    /**
     * Sets (as xml) the "Telephone" element
     */
    void xsetTelephone(org.apache.xmlbeans.XmlString telephone);
    
    /**
     * Unsets the "Telephone" element
     */
    void unsetTelephone();
    
    /**
     * Gets the "Fax" element
     */
    java.lang.String getFax();
    
    /**
     * Gets (as xml) the "Fax" element
     */
    org.apache.xmlbeans.XmlString xgetFax();
    
    /**
     * True if has "Fax" element
     */
    boolean isSetFax();
    
    /**
     * Sets the "Fax" element
     */
    void setFax(java.lang.String fax);
    
    /**
     * Sets (as xml) the "Fax" element
     */
    void xsetFax(org.apache.xmlbeans.XmlString fax);
    
    /**
     * Unsets the "Fax" element
     */
    void unsetFax();
    
    /**
     * Gets the "Email" element
     */
    java.lang.String getEmail();
    
    /**
     * Gets (as xml) the "Email" element
     */
    org.apache.xmlbeans.XmlString xgetEmail();
    
    /**
     * True if has "Email" element
     */
    boolean isSetEmail();
    
    /**
     * Sets the "Email" element
     */
    void setEmail(java.lang.String email);
    
    /**
     * Sets (as xml) the "Email" element
     */
    void xsetEmail(org.apache.xmlbeans.XmlString email);
    
    /**
     * Unsets the "Email" element
     */
    void unsetEmail();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.Address newInstance() {
          return (com.conferma.cpapi.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.Address newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.Address parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.Address parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.Address parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.Address parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.Address parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.Address parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.Address parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.Address parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.Address parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.Address parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.Address parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.Address parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.Address parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.Address parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.Address parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.Address parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
