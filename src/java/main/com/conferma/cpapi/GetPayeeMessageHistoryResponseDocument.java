/*
 * An XML document type.
 * Localname: GetPayeeMessageHistoryResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * A document containing one GetPayeeMessageHistoryResponse(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public interface GetPayeeMessageHistoryResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetPayeeMessageHistoryResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("getpayeemessagehistoryresponse9dabdoctype");
    
    /**
     * Gets the "GetPayeeMessageHistoryResponse" element
     */
    com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument.GetPayeeMessageHistoryResponse getGetPayeeMessageHistoryResponse();
    
    /**
     * Sets the "GetPayeeMessageHistoryResponse" element
     */
    void setGetPayeeMessageHistoryResponse(com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument.GetPayeeMessageHistoryResponse getPayeeMessageHistoryResponse);
    
    /**
     * Appends and returns a new empty "GetPayeeMessageHistoryResponse" element
     */
    com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument.GetPayeeMessageHistoryResponse addNewGetPayeeMessageHistoryResponse();
    
    /**
     * An XML GetPayeeMessageHistoryResponse(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public interface GetPayeeMessageHistoryResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetPayeeMessageHistoryResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("getpayeemessagehistoryresponse8487elemtype");
        
        /**
         * Gets the "GetPayeeMessageHistoryResult" element
         */
        com.conferma.cpapi.PayeeMessageHistoryResponse getGetPayeeMessageHistoryResult();
        
        /**
         * True if has "GetPayeeMessageHistoryResult" element
         */
        boolean isSetGetPayeeMessageHistoryResult();
        
        /**
         * Sets the "GetPayeeMessageHistoryResult" element
         */
        void setGetPayeeMessageHistoryResult(com.conferma.cpapi.PayeeMessageHistoryResponse getPayeeMessageHistoryResult);
        
        /**
         * Appends and returns a new empty "GetPayeeMessageHistoryResult" element
         */
        com.conferma.cpapi.PayeeMessageHistoryResponse addNewGetPayeeMessageHistoryResult();
        
        /**
         * Unsets the "GetPayeeMessageHistoryResult" element
         */
        void unsetGetPayeeMessageHistoryResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument.GetPayeeMessageHistoryResponse newInstance() {
              return (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument.GetPayeeMessageHistoryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument.GetPayeeMessageHistoryResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument.GetPayeeMessageHistoryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument newInstance() {
          return (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
