/*
 * An XML document type.
 * Localname: ResendPaymentAuthorisationResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * A document containing one ResendPaymentAuthorisationResponse(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public interface ResendPaymentAuthorisationResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResendPaymentAuthorisationResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("resendpaymentauthorisationresponseb695doctype");
    
    /**
     * Gets the "ResendPaymentAuthorisationResponse" element
     */
    com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument.ResendPaymentAuthorisationResponse getResendPaymentAuthorisationResponse();
    
    /**
     * Sets the "ResendPaymentAuthorisationResponse" element
     */
    void setResendPaymentAuthorisationResponse(com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument.ResendPaymentAuthorisationResponse resendPaymentAuthorisationResponse);
    
    /**
     * Appends and returns a new empty "ResendPaymentAuthorisationResponse" element
     */
    com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument.ResendPaymentAuthorisationResponse addNewResendPaymentAuthorisationResponse();
    
    /**
     * An XML ResendPaymentAuthorisationResponse(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public interface ResendPaymentAuthorisationResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResendPaymentAuthorisationResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("resendpaymentauthorisationresponsed947elemtype");
        
        /**
         * Gets the "ResendPaymentAuthorisationResult" element
         */
        com.conferma.cpapi.SendMessageResponse getResendPaymentAuthorisationResult();
        
        /**
         * True if has "ResendPaymentAuthorisationResult" element
         */
        boolean isSetResendPaymentAuthorisationResult();
        
        /**
         * Sets the "ResendPaymentAuthorisationResult" element
         */
        void setResendPaymentAuthorisationResult(com.conferma.cpapi.SendMessageResponse resendPaymentAuthorisationResult);
        
        /**
         * Appends and returns a new empty "ResendPaymentAuthorisationResult" element
         */
        com.conferma.cpapi.SendMessageResponse addNewResendPaymentAuthorisationResult();
        
        /**
         * Unsets the "ResendPaymentAuthorisationResult" element
         */
        void unsetResendPaymentAuthorisationResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument.ResendPaymentAuthorisationResponse newInstance() {
              return (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument.ResendPaymentAuthorisationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument.ResendPaymentAuthorisationResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument.ResendPaymentAuthorisationResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument newInstance() {
          return (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
