/*
 * An XML document type.
 * Localname: ResendPaymentAuthorisation
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.ResendPaymentAuthorisationDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * A document containing one ResendPaymentAuthorisation(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public interface ResendPaymentAuthorisationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResendPaymentAuthorisationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("resendpaymentauthorisationd596doctype");
    
    /**
     * Gets the "ResendPaymentAuthorisation" element
     */
    com.conferma.cpapi.ResendPaymentAuthorisationDocument.ResendPaymentAuthorisation getResendPaymentAuthorisation();
    
    /**
     * Sets the "ResendPaymentAuthorisation" element
     */
    void setResendPaymentAuthorisation(com.conferma.cpapi.ResendPaymentAuthorisationDocument.ResendPaymentAuthorisation resendPaymentAuthorisation);
    
    /**
     * Appends and returns a new empty "ResendPaymentAuthorisation" element
     */
    com.conferma.cpapi.ResendPaymentAuthorisationDocument.ResendPaymentAuthorisation addNewResendPaymentAuthorisation();
    
    /**
     * An XML ResendPaymentAuthorisation(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public interface ResendPaymentAuthorisation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResendPaymentAuthorisation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("resendpaymentauthorisation85e7elemtype");
        
        /**
         * Gets the "request" element
         */
        com.conferma.cpapi.ResendPaymentAuthorisationRequest getRequest();
        
        /**
         * True if has "request" element
         */
        boolean isSetRequest();
        
        /**
         * Sets the "request" element
         */
        void setRequest(com.conferma.cpapi.ResendPaymentAuthorisationRequest request);
        
        /**
         * Appends and returns a new empty "request" element
         */
        com.conferma.cpapi.ResendPaymentAuthorisationRequest addNewRequest();
        
        /**
         * Unsets the "request" element
         */
        void unsetRequest();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.conferma.cpapi.ResendPaymentAuthorisationDocument.ResendPaymentAuthorisation newInstance() {
              return (com.conferma.cpapi.ResendPaymentAuthorisationDocument.ResendPaymentAuthorisation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.conferma.cpapi.ResendPaymentAuthorisationDocument.ResendPaymentAuthorisation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.conferma.cpapi.ResendPaymentAuthorisationDocument.ResendPaymentAuthorisation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.ResendPaymentAuthorisationDocument newInstance() {
          return (com.conferma.cpapi.ResendPaymentAuthorisationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.ResendPaymentAuthorisationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.ResendPaymentAuthorisationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.ResendPaymentAuthorisationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.ResendPaymentAuthorisationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.ResendPaymentAuthorisationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
