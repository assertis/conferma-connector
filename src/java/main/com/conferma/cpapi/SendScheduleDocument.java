/*
 * An XML document type.
 * Localname: SendSchedule
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.SendScheduleDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * A document containing one SendSchedule(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public interface SendScheduleDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SendScheduleDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("sendschedule65ecdoctype");
    
    /**
     * Gets the "SendSchedule" element
     */
    com.conferma.cpapi.SendScheduleDocument.SendSchedule getSendSchedule();
    
    /**
     * Sets the "SendSchedule" element
     */
    void setSendSchedule(com.conferma.cpapi.SendScheduleDocument.SendSchedule sendSchedule);
    
    /**
     * Appends and returns a new empty "SendSchedule" element
     */
    com.conferma.cpapi.SendScheduleDocument.SendSchedule addNewSendSchedule();
    
    /**
     * An XML SendSchedule(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public interface SendSchedule extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SendSchedule.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("sendschedule7327elemtype");
        
        /**
         * Gets the "Request" element
         */
        com.conferma.cpapi.SendScheduleRequest getRequest();
        
        /**
         * True if has "Request" element
         */
        boolean isSetRequest();
        
        /**
         * Sets the "Request" element
         */
        void setRequest(com.conferma.cpapi.SendScheduleRequest request);
        
        /**
         * Appends and returns a new empty "Request" element
         */
        com.conferma.cpapi.SendScheduleRequest addNewRequest();
        
        /**
         * Unsets the "Request" element
         */
        void unsetRequest();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.conferma.cpapi.SendScheduleDocument.SendSchedule newInstance() {
              return (com.conferma.cpapi.SendScheduleDocument.SendSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.conferma.cpapi.SendScheduleDocument.SendSchedule newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.conferma.cpapi.SendScheduleDocument.SendSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.SendScheduleDocument newInstance() {
          return (com.conferma.cpapi.SendScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.SendScheduleDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.SendScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.SendScheduleDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.SendScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.SendScheduleDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.SendScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.SendScheduleDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.SendScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.SendScheduleDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.SendScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.SendScheduleDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.SendScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.SendScheduleDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.SendScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.SendScheduleDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.SendScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.SendScheduleDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.SendScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.SendScheduleDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.SendScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.SendScheduleDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.SendScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.SendScheduleDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.SendScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.SendScheduleDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.SendScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.SendScheduleDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.SendScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.SendScheduleDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.SendScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.SendScheduleDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.SendScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.SendScheduleDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.SendScheduleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
