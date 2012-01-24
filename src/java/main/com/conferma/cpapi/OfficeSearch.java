/*
 * XML Type:  OfficeSearch
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.OfficeSearch
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * An XML OfficeSearch(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public interface OfficeSearch extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OfficeSearch.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("officesearch1d97type");
    
    /**
     * Gets the "OfficeID" element
     */
    int getOfficeID();
    
    /**
     * Gets (as xml) the "OfficeID" element
     */
    org.apache.xmlbeans.XmlInt xgetOfficeID();
    
    /**
     * Sets the "OfficeID" element
     */
    void setOfficeID(int officeID);
    
    /**
     * Sets (as xml) the "OfficeID" element
     */
    void xsetOfficeID(org.apache.xmlbeans.XmlInt officeID);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.OfficeSearch newInstance() {
          return (com.conferma.cpapi.OfficeSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.OfficeSearch newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.OfficeSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.OfficeSearch parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.OfficeSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.OfficeSearch parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.OfficeSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.OfficeSearch parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.OfficeSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.OfficeSearch parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.OfficeSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.OfficeSearch parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.OfficeSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.OfficeSearch parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.OfficeSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.OfficeSearch parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.OfficeSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.OfficeSearch parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.OfficeSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.OfficeSearch parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.OfficeSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.OfficeSearch parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.OfficeSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.OfficeSearch parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.OfficeSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.OfficeSearch parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.OfficeSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.OfficeSearch parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.OfficeSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.OfficeSearch parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.OfficeSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.OfficeSearch parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.OfficeSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.OfficeSearch parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.OfficeSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
