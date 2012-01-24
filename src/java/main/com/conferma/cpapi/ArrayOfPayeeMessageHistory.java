/*
 * XML Type:  ArrayOfPayeeMessageHistory
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.ArrayOfPayeeMessageHistory
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * An XML ArrayOfPayeeMessageHistory(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public interface ArrayOfPayeeMessageHistory extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOfPayeeMessageHistory.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("arrayofpayeemessagehistoryf076type");
    
    /**
     * Gets array of all "PayeeMessageHistory" elements
     */
    com.conferma.cpapi.PayeeMessageHistory[] getPayeeMessageHistoryArray();
    
    /**
     * Gets ith "PayeeMessageHistory" element
     */
    com.conferma.cpapi.PayeeMessageHistory getPayeeMessageHistoryArray(int i);
    
    /**
     * Tests for nil ith "PayeeMessageHistory" element
     */
    boolean isNilPayeeMessageHistoryArray(int i);
    
    /**
     * Returns number of "PayeeMessageHistory" element
     */
    int sizeOfPayeeMessageHistoryArray();
    
    /**
     * Sets array of all "PayeeMessageHistory" element
     */
    void setPayeeMessageHistoryArray(com.conferma.cpapi.PayeeMessageHistory[] payeeMessageHistoryArray);
    
    /**
     * Sets ith "PayeeMessageHistory" element
     */
    void setPayeeMessageHistoryArray(int i, com.conferma.cpapi.PayeeMessageHistory payeeMessageHistory);
    
    /**
     * Nils the ith "PayeeMessageHistory" element
     */
    void setNilPayeeMessageHistoryArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PayeeMessageHistory" element
     */
    com.conferma.cpapi.PayeeMessageHistory insertNewPayeeMessageHistory(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PayeeMessageHistory" element
     */
    com.conferma.cpapi.PayeeMessageHistory addNewPayeeMessageHistory();
    
    /**
     * Removes the ith "PayeeMessageHistory" element
     */
    void removePayeeMessageHistory(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.ArrayOfPayeeMessageHistory newInstance() {
          return (com.conferma.cpapi.ArrayOfPayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.ArrayOfPayeeMessageHistory newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.ArrayOfPayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.ArrayOfPayeeMessageHistory parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ArrayOfPayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.ArrayOfPayeeMessageHistory parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ArrayOfPayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.ArrayOfPayeeMessageHistory parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ArrayOfPayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.ArrayOfPayeeMessageHistory parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ArrayOfPayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.ArrayOfPayeeMessageHistory parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ArrayOfPayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.ArrayOfPayeeMessageHistory parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ArrayOfPayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.ArrayOfPayeeMessageHistory parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ArrayOfPayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.ArrayOfPayeeMessageHistory parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ArrayOfPayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.ArrayOfPayeeMessageHistory parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ArrayOfPayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.ArrayOfPayeeMessageHistory parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ArrayOfPayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.ArrayOfPayeeMessageHistory parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ArrayOfPayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.ArrayOfPayeeMessageHistory parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ArrayOfPayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.ArrayOfPayeeMessageHistory parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ArrayOfPayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.ArrayOfPayeeMessageHistory parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ArrayOfPayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.ArrayOfPayeeMessageHistory parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.ArrayOfPayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.ArrayOfPayeeMessageHistory parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.ArrayOfPayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
