/*
 * XML Type:  CurrencyConversion
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.CurrencyConversion
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * An XML CurrencyConversion(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public interface CurrencyConversion extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CurrencyConversion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("currencyconversion69f4type");
    
    /**
     * Gets the "ConvertedTotalRate" attribute
     */
    java.math.BigDecimal getConvertedTotalRate();
    
    /**
     * Gets (as xml) the "ConvertedTotalRate" attribute
     */
    org.apache.xmlbeans.XmlDecimal xgetConvertedTotalRate();
    
    /**
     * Sets the "ConvertedTotalRate" attribute
     */
    void setConvertedTotalRate(java.math.BigDecimal convertedTotalRate);
    
    /**
     * Sets (as xml) the "ConvertedTotalRate" attribute
     */
    void xsetConvertedTotalRate(org.apache.xmlbeans.XmlDecimal convertedTotalRate);
    
    /**
     * Gets the "Currency" attribute
     */
    java.lang.String getCurrency();
    
    /**
     * Gets (as xml) the "Currency" attribute
     */
    org.apache.xmlbeans.XmlString xgetCurrency();
    
    /**
     * True if has "Currency" attribute
     */
    boolean isSetCurrency();
    
    /**
     * Sets the "Currency" attribute
     */
    void setCurrency(java.lang.String currency);
    
    /**
     * Sets (as xml) the "Currency" attribute
     */
    void xsetCurrency(org.apache.xmlbeans.XmlString currency);
    
    /**
     * Unsets the "Currency" attribute
     */
    void unsetCurrency();
    
    /**
     * Gets the "ConversionRate" attribute
     */
    java.math.BigDecimal getConversionRate();
    
    /**
     * Gets (as xml) the "ConversionRate" attribute
     */
    org.apache.xmlbeans.XmlDecimal xgetConversionRate();
    
    /**
     * Sets the "ConversionRate" attribute
     */
    void setConversionRate(java.math.BigDecimal conversionRate);
    
    /**
     * Sets (as xml) the "ConversionRate" attribute
     */
    void xsetConversionRate(org.apache.xmlbeans.XmlDecimal conversionRate);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.CurrencyConversion newInstance() {
          return (com.conferma.cpapi.CurrencyConversion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.CurrencyConversion newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.CurrencyConversion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.CurrencyConversion parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.CurrencyConversion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.CurrencyConversion parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.CurrencyConversion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.CurrencyConversion parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.CurrencyConversion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.CurrencyConversion parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.CurrencyConversion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.CurrencyConversion parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.CurrencyConversion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.CurrencyConversion parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.CurrencyConversion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.CurrencyConversion parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.CurrencyConversion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.CurrencyConversion parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.CurrencyConversion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.CurrencyConversion parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.CurrencyConversion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.CurrencyConversion parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.CurrencyConversion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.CurrencyConversion parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.CurrencyConversion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.CurrencyConversion parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.CurrencyConversion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.CurrencyConversion parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.CurrencyConversion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.CurrencyConversion parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.CurrencyConversion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.CurrencyConversion parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.CurrencyConversion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.CurrencyConversion parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.CurrencyConversion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
