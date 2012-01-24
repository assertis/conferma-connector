/*
 * XML Type:  QueueRecord
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.QueueRecord
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * An XML QueueRecord(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public interface QueueRecord extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueueRecord.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("queuerecord800btype");
    
    /**
     * Gets the "DeliveryDate" attribute
     */
    java.util.Calendar getDeliveryDate();
    
    /**
     * Gets (as xml) the "DeliveryDate" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetDeliveryDate();
    
    /**
     * Sets the "DeliveryDate" attribute
     */
    void setDeliveryDate(java.util.Calendar deliveryDate);
    
    /**
     * Sets (as xml) the "DeliveryDate" attribute
     */
    void xsetDeliveryDate(org.apache.xmlbeans.XmlDateTime deliveryDate);
    
    /**
     * Gets the "DeliveryAddress" attribute
     */
    java.lang.String getDeliveryAddress();
    
    /**
     * Gets (as xml) the "DeliveryAddress" attribute
     */
    org.apache.xmlbeans.XmlString xgetDeliveryAddress();
    
    /**
     * True if has "DeliveryAddress" attribute
     */
    boolean isSetDeliveryAddress();
    
    /**
     * Sets the "DeliveryAddress" attribute
     */
    void setDeliveryAddress(java.lang.String deliveryAddress);
    
    /**
     * Sets (as xml) the "DeliveryAddress" attribute
     */
    void xsetDeliveryAddress(org.apache.xmlbeans.XmlString deliveryAddress);
    
    /**
     * Unsets the "DeliveryAddress" attribute
     */
    void unsetDeliveryAddress();
    
    /**
     * Gets the "Status" attribute
     */
    com.conferma.cpapi.DeliveryStatus.Enum getStatus();
    
    /**
     * Gets (as xml) the "Status" attribute
     */
    com.conferma.cpapi.DeliveryStatus xgetStatus();
    
    /**
     * Sets the "Status" attribute
     */
    void setStatus(com.conferma.cpapi.DeliveryStatus.Enum status);
    
    /**
     * Sets (as xml) the "Status" attribute
     */
    void xsetStatus(com.conferma.cpapi.DeliveryStatus status);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.QueueRecord newInstance() {
          return (com.conferma.cpapi.QueueRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.QueueRecord newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.QueueRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.QueueRecord parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.QueueRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.QueueRecord parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.QueueRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.QueueRecord parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.QueueRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.QueueRecord parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.QueueRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.QueueRecord parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.QueueRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.QueueRecord parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.QueueRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.QueueRecord parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.QueueRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.QueueRecord parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.QueueRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.QueueRecord parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.QueueRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.QueueRecord parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.QueueRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.QueueRecord parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.QueueRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.QueueRecord parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.QueueRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.QueueRecord parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.QueueRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.QueueRecord parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.QueueRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.QueueRecord parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.QueueRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.QueueRecord parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.QueueRecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
