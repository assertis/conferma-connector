/*
 * An XML document type.
 * Localname: SendScheduleResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.SendScheduleResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * A document containing one SendScheduleResponse(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public interface SendScheduleResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SendScheduleResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("sendscheduleresponse90ebdoctype");
    
    /**
     * Gets the "SendScheduleResponse" element
     */
    com.conferma.cpapi.SendScheduleResponseDocument.SendScheduleResponse getSendScheduleResponse();
    
    /**
     * Sets the "SendScheduleResponse" element
     */
    void setSendScheduleResponse(com.conferma.cpapi.SendScheduleResponseDocument.SendScheduleResponse sendScheduleResponse);
    
    /**
     * Appends and returns a new empty "SendScheduleResponse" element
     */
    com.conferma.cpapi.SendScheduleResponseDocument.SendScheduleResponse addNewSendScheduleResponse();
    
    /**
     * An XML SendScheduleResponse(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public interface SendScheduleResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SendScheduleResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("sendscheduleresponseca47elemtype");
        
        /**
         * Gets the "SendScheduleResult" element
         */
        com.conferma.cpapi.SendMessageResponse getSendScheduleResult();
        
        /**
         * True if has "SendScheduleResult" element
         */
        boolean isSetSendScheduleResult();
        
        /**
         * Sets the "SendScheduleResult" element
         */
        void setSendScheduleResult(com.conferma.cpapi.SendMessageResponse sendScheduleResult);
        
        /**
         * Appends and returns a new empty "SendScheduleResult" element
         */
        com.conferma.cpapi.SendMessageResponse addNewSendScheduleResult();
        
        /**
         * Unsets the "SendScheduleResult" element
         */
        void unsetSendScheduleResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.conferma.cpapi.SendScheduleResponseDocument.SendScheduleResponse newInstance() {
              return (com.conferma.cpapi.SendScheduleResponseDocument.SendScheduleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.conferma.cpapi.SendScheduleResponseDocument.SendScheduleResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.conferma.cpapi.SendScheduleResponseDocument.SendScheduleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.SendScheduleResponseDocument newInstance() {
          return (com.conferma.cpapi.SendScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.SendScheduleResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.SendScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.SendScheduleResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.SendScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.SendScheduleResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.SendScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.SendScheduleResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.SendScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.SendScheduleResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.SendScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.SendScheduleResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.SendScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.SendScheduleResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.SendScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.SendScheduleResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.SendScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.SendScheduleResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.SendScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.SendScheduleResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.SendScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.SendScheduleResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.SendScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.SendScheduleResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.SendScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.SendScheduleResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.SendScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.SendScheduleResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.SendScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.SendScheduleResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.SendScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.SendScheduleResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.SendScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.SendScheduleResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.SendScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
