/*
 * XML Type:  Hotel
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.Hotel
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * An XML Hotel(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public interface Hotel extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Hotel.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("hotel2299type");
    
    /**
     * Gets the "Rate" element
     */
    com.conferma.cpapi.HotelRate getRate();
    
    /**
     * True if has "Rate" element
     */
    boolean isSetRate();
    
    /**
     * Sets the "Rate" element
     */
    void setRate(com.conferma.cpapi.HotelRate rate);
    
    /**
     * Appends and returns a new empty "Rate" element
     */
    com.conferma.cpapi.HotelRate addNewRate();
    
    /**
     * Unsets the "Rate" element
     */
    void unsetRate();
    
    /**
     * Gets the "CareOfName" element
     */
    java.lang.String getCareOfName();
    
    /**
     * Gets (as xml) the "CareOfName" element
     */
    org.apache.xmlbeans.XmlString xgetCareOfName();
    
    /**
     * True if has "CareOfName" element
     */
    boolean isSetCareOfName();
    
    /**
     * Sets the "CareOfName" element
     */
    void setCareOfName(java.lang.String careOfName);
    
    /**
     * Sets (as xml) the "CareOfName" element
     */
    void xsetCareOfName(org.apache.xmlbeans.XmlString careOfName);
    
    /**
     * Unsets the "CareOfName" element
     */
    void unsetCareOfName();
    
    /**
     * Gets the "ContactName" element
     */
    java.lang.String getContactName();
    
    /**
     * Gets (as xml) the "ContactName" element
     */
    org.apache.xmlbeans.XmlString xgetContactName();
    
    /**
     * True if has "ContactName" element
     */
    boolean isSetContactName();
    
    /**
     * Sets the "ContactName" element
     */
    void setContactName(java.lang.String contactName);
    
    /**
     * Sets (as xml) the "ContactName" element
     */
    void xsetContactName(org.apache.xmlbeans.XmlString contactName);
    
    /**
     * Unsets the "ContactName" element
     */
    void unsetContactName();
    
    /**
     * Gets the "PaymentInstruction" element
     */
    java.lang.String getPaymentInstruction();
    
    /**
     * Gets (as xml) the "PaymentInstruction" element
     */
    org.apache.xmlbeans.XmlString xgetPaymentInstruction();
    
    /**
     * True if has "PaymentInstruction" element
     */
    boolean isSetPaymentInstruction();
    
    /**
     * Sets the "PaymentInstruction" element
     */
    void setPaymentInstruction(java.lang.String paymentInstruction);
    
    /**
     * Sets (as xml) the "PaymentInstruction" element
     */
    void xsetPaymentInstruction(org.apache.xmlbeans.XmlString paymentInstruction);
    
    /**
     * Unsets the "PaymentInstruction" element
     */
    void unsetPaymentInstruction();
    
    /**
     * Gets the "Comments" element
     */
    java.lang.String getComments();
    
    /**
     * Gets (as xml) the "Comments" element
     */
    org.apache.xmlbeans.XmlString xgetComments();
    
    /**
     * True if has "Comments" element
     */
    boolean isSetComments();
    
    /**
     * Sets the "Comments" element
     */
    void setComments(java.lang.String comments);
    
    /**
     * Sets (as xml) the "Comments" element
     */
    void xsetComments(org.apache.xmlbeans.XmlString comments);
    
    /**
     * Unsets the "Comments" element
     */
    void unsetComments();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.Hotel newInstance() {
          return (com.conferma.cpapi.Hotel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.Hotel newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.Hotel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.Hotel parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Hotel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.Hotel parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Hotel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.Hotel parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Hotel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.Hotel parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Hotel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.Hotel parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Hotel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.Hotel parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Hotel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.Hotel parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Hotel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.Hotel parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Hotel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.Hotel parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Hotel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.Hotel parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.Hotel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.Hotel parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Hotel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.Hotel parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Hotel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.Hotel parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Hotel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.Hotel parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.Hotel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.Hotel parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.Hotel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.Hotel parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.Hotel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
