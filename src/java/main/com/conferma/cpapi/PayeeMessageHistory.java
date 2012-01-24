/*
 * XML Type:  PayeeMessageHistory
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.PayeeMessageHistory
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * An XML PayeeMessageHistory(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public interface PayeeMessageHistory extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PayeeMessageHistory.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("payeemessagehistory07f8type");
    
    /**
     * Gets the "PaymentID" attribute
     */
    int getPaymentID();
    
    /**
     * Gets (as xml) the "PaymentID" attribute
     */
    org.apache.xmlbeans.XmlInt xgetPaymentID();
    
    /**
     * Sets the "PaymentID" attribute
     */
    void setPaymentID(int paymentID);
    
    /**
     * Sets (as xml) the "PaymentID" attribute
     */
    void xsetPaymentID(org.apache.xmlbeans.XmlInt paymentID);
    
    /**
     * Gets the "MessageType" attribute
     */
    com.conferma.cpapi.MessageType.Enum getMessageType();
    
    /**
     * Gets (as xml) the "MessageType" attribute
     */
    com.conferma.cpapi.MessageType xgetMessageType();
    
    /**
     * Sets the "MessageType" attribute
     */
    void setMessageType(com.conferma.cpapi.MessageType.Enum messageType);
    
    /**
     * Sets (as xml) the "MessageType" attribute
     */
    void xsetMessageType(com.conferma.cpapi.MessageType messageType);
    
    /**
     * Gets the "Address" attribute
     */
    java.lang.String getAddress();
    
    /**
     * Gets (as xml) the "Address" attribute
     */
    org.apache.xmlbeans.XmlString xgetAddress();
    
    /**
     * True if has "Address" attribute
     */
    boolean isSetAddress();
    
    /**
     * Sets the "Address" attribute
     */
    void setAddress(java.lang.String address);
    
    /**
     * Sets (as xml) the "Address" attribute
     */
    void xsetAddress(org.apache.xmlbeans.XmlString address);
    
    /**
     * Unsets the "Address" attribute
     */
    void unsetAddress();
    
    /**
     * Gets the "IssueTime" attribute
     */
    java.util.Calendar getIssueTime();
    
    /**
     * Gets (as xml) the "IssueTime" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetIssueTime();
    
    /**
     * Sets the "IssueTime" attribute
     */
    void setIssueTime(java.util.Calendar issueTime);
    
    /**
     * Sets (as xml) the "IssueTime" attribute
     */
    void xsetIssueTime(org.apache.xmlbeans.XmlDateTime issueTime);
    
    /**
     * Gets the "Status" attribute
     */
    java.lang.String getStatus();
    
    /**
     * Gets (as xml) the "Status" attribute
     */
    org.apache.xmlbeans.XmlString xgetStatus();
    
    /**
     * True if has "Status" attribute
     */
    boolean isSetStatus();
    
    /**
     * Sets the "Status" attribute
     */
    void setStatus(java.lang.String status);
    
    /**
     * Sets (as xml) the "Status" attribute
     */
    void xsetStatus(org.apache.xmlbeans.XmlString status);
    
    /**
     * Unsets the "Status" attribute
     */
    void unsetStatus();
    
    /**
     * Gets the "DocumentName" attribute
     */
    java.lang.String getDocumentName();
    
    /**
     * Gets (as xml) the "DocumentName" attribute
     */
    org.apache.xmlbeans.XmlString xgetDocumentName();
    
    /**
     * True if has "DocumentName" attribute
     */
    boolean isSetDocumentName();
    
    /**
     * Sets the "DocumentName" attribute
     */
    void setDocumentName(java.lang.String documentName);
    
    /**
     * Sets (as xml) the "DocumentName" attribute
     */
    void xsetDocumentName(org.apache.xmlbeans.XmlString documentName);
    
    /**
     * Unsets the "DocumentName" attribute
     */
    void unsetDocumentName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.PayeeMessageHistory newInstance() {
          return (com.conferma.cpapi.PayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.PayeeMessageHistory newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.PayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.PayeeMessageHistory parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.PayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.PayeeMessageHistory parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.PayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.PayeeMessageHistory parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.PayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.PayeeMessageHistory parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.PayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.PayeeMessageHistory parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.PayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.PayeeMessageHistory parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.PayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.PayeeMessageHistory parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.PayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.PayeeMessageHistory parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.PayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.PayeeMessageHistory parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.PayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.PayeeMessageHistory parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.PayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.PayeeMessageHistory parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.PayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.PayeeMessageHistory parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.PayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.PayeeMessageHistory parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.PayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.PayeeMessageHistory parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.PayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.PayeeMessageHistory parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.PayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.PayeeMessageHistory parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.PayeeMessageHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
