/*
 * XML Type:  GeneralPayee
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.GeneralPayee
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * An XML GeneralPayee(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public interface GeneralPayee extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GeneralPayee.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("generalpayee305btype");
    
    /**
     * Gets the "Name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "Name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "Name" element
     */
    void unsetName();
    
    /**
     * Gets the "ConsumerReference" element
     */
    java.lang.String getConsumerReference();
    
    /**
     * Gets (as xml) the "ConsumerReference" element
     */
    org.apache.xmlbeans.XmlString xgetConsumerReference();
    
    /**
     * True if has "ConsumerReference" element
     */
    boolean isSetConsumerReference();
    
    /**
     * Sets the "ConsumerReference" element
     */
    void setConsumerReference(java.lang.String consumerReference);
    
    /**
     * Sets (as xml) the "ConsumerReference" element
     */
    void xsetConsumerReference(org.apache.xmlbeans.XmlString consumerReference);
    
    /**
     * Unsets the "ConsumerReference" element
     */
    void unsetConsumerReference();
    
    /**
     * Gets the "Amount" element
     */
    com.conferma.cpapi.Amount getAmount();
    
    /**
     * True if has "Amount" element
     */
    boolean isSetAmount();
    
    /**
     * Sets the "Amount" element
     */
    void setAmount(com.conferma.cpapi.Amount amount);
    
    /**
     * Appends and returns a new empty "Amount" element
     */
    com.conferma.cpapi.Amount addNewAmount();
    
    /**
     * Unsets the "Amount" element
     */
    void unsetAmount();
    
    /**
     * Gets the "PaymentRange" element
     */
    com.conferma.cpapi.DateRange getPaymentRange();
    
    /**
     * True if has "PaymentRange" element
     */
    boolean isSetPaymentRange();
    
    /**
     * Sets the "PaymentRange" element
     */
    void setPaymentRange(com.conferma.cpapi.DateRange paymentRange);
    
    /**
     * Appends and returns a new empty "PaymentRange" element
     */
    com.conferma.cpapi.DateRange addNewPaymentRange();
    
    /**
     * Unsets the "PaymentRange" element
     */
    void unsetPaymentRange();
    
    /**
     * Gets the "Customer" element
     */
    com.conferma.cpapi.Customer getCustomer();
    
    /**
     * True if has "Customer" element
     */
    boolean isSetCustomer();
    
    /**
     * Sets the "Customer" element
     */
    void setCustomer(com.conferma.cpapi.Customer customer);
    
    /**
     * Appends and returns a new empty "Customer" element
     */
    com.conferma.cpapi.Customer addNewCustomer();
    
    /**
     * Unsets the "Customer" element
     */
    void unsetCustomer();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.GeneralPayee newInstance() {
          return (com.conferma.cpapi.GeneralPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.GeneralPayee newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.GeneralPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.GeneralPayee parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GeneralPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.GeneralPayee parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GeneralPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.GeneralPayee parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GeneralPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.GeneralPayee parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GeneralPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.GeneralPayee parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GeneralPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.GeneralPayee parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GeneralPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.GeneralPayee parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GeneralPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.GeneralPayee parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GeneralPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.GeneralPayee parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GeneralPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.GeneralPayee parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.GeneralPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.GeneralPayee parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GeneralPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.GeneralPayee parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GeneralPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.GeneralPayee parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GeneralPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.GeneralPayee parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.GeneralPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.GeneralPayee parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.GeneralPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.GeneralPayee parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.GeneralPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
