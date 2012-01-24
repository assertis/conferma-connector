/*
 * An XML document type.
 * Localname: GetPayeeMessageHistory
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.GetPayeeMessageHistoryDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * A document containing one GetPayeeMessageHistory(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public interface GetPayeeMessageHistoryDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetPayeeMessageHistoryDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("getpayeemessagehistory32acdoctype");
    
    /**
     * Gets the "GetPayeeMessageHistory" element
     */
    com.conferma.cpapi.GetPayeeMessageHistoryDocument.GetPayeeMessageHistory getGetPayeeMessageHistory();
    
    /**
     * Sets the "GetPayeeMessageHistory" element
     */
    void setGetPayeeMessageHistory(com.conferma.cpapi.GetPayeeMessageHistoryDocument.GetPayeeMessageHistory getPayeeMessageHistory);
    
    /**
     * Appends and returns a new empty "GetPayeeMessageHistory" element
     */
    com.conferma.cpapi.GetPayeeMessageHistoryDocument.GetPayeeMessageHistory addNewGetPayeeMessageHistory();
    
    /**
     * An XML GetPayeeMessageHistory(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public interface GetPayeeMessageHistory extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetPayeeMessageHistory.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("getpayeemessagehistorye2a7elemtype");
        
        /**
         * Gets the "GetHistoryRequest" element
         */
        com.conferma.cpapi.PayeeMessageHistoryRequest getGetHistoryRequest();
        
        /**
         * True if has "GetHistoryRequest" element
         */
        boolean isSetGetHistoryRequest();
        
        /**
         * Sets the "GetHistoryRequest" element
         */
        void setGetHistoryRequest(com.conferma.cpapi.PayeeMessageHistoryRequest getHistoryRequest);
        
        /**
         * Appends and returns a new empty "GetHistoryRequest" element
         */
        com.conferma.cpapi.PayeeMessageHistoryRequest addNewGetHistoryRequest();
        
        /**
         * Unsets the "GetHistoryRequest" element
         */
        void unsetGetHistoryRequest();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.conferma.cpapi.GetPayeeMessageHistoryDocument.GetPayeeMessageHistory newInstance() {
              return (com.conferma.cpapi.GetPayeeMessageHistoryDocument.GetPayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.conferma.cpapi.GetPayeeMessageHistoryDocument.GetPayeeMessageHistory newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.conferma.cpapi.GetPayeeMessageHistoryDocument.GetPayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.GetPayeeMessageHistoryDocument newInstance() {
          return (com.conferma.cpapi.GetPayeeMessageHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.GetPayeeMessageHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.GetPayeeMessageHistoryDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.GetPayeeMessageHistoryDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.GetPayeeMessageHistoryDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.GetPayeeMessageHistoryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.GetPayeeMessageHistoryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.GetPayeeMessageHistoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
