/*
 * XML Type:  MICEPayee
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.MICEPayee
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * An XML MICEPayee(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public interface MICEPayee extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MICEPayee.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("micepayee9b03type");
    
    /**
     * Gets the "HotelID" element
     */
    int getHotelID();
    
    /**
     * Gets (as xml) the "HotelID" element
     */
    org.apache.xmlbeans.XmlInt xgetHotelID();
    
    /**
     * Sets the "HotelID" element
     */
    void setHotelID(int hotelID);
    
    /**
     * Sets (as xml) the "HotelID" element
     */
    void xsetHotelID(org.apache.xmlbeans.XmlInt hotelID);
    
    /**
     * Gets the "EventRange" element
     */
    com.conferma.cpapi.DateRange getEventRange();
    
    /**
     * True if has "EventRange" element
     */
    boolean isSetEventRange();
    
    /**
     * Sets the "EventRange" element
     */
    void setEventRange(com.conferma.cpapi.DateRange eventRange);
    
    /**
     * Appends and returns a new empty "EventRange" element
     */
    com.conferma.cpapi.DateRange addNewEventRange();
    
    /**
     * Unsets the "EventRange" element
     */
    void unsetEventRange();
    
    /**
     * Gets the "EventReference" element
     */
    java.lang.String getEventReference();
    
    /**
     * Gets (as xml) the "EventReference" element
     */
    org.apache.xmlbeans.XmlString xgetEventReference();
    
    /**
     * True if has "EventReference" element
     */
    boolean isSetEventReference();
    
    /**
     * Sets the "EventReference" element
     */
    void setEventReference(java.lang.String eventReference);
    
    /**
     * Sets (as xml) the "EventReference" element
     */
    void xsetEventReference(org.apache.xmlbeans.XmlString eventReference);
    
    /**
     * Unsets the "EventReference" element
     */
    void unsetEventReference();
    
    /**
     * Gets the "Currency" element
     */
    java.lang.String getCurrency();
    
    /**
     * Gets (as xml) the "Currency" element
     */
    org.apache.xmlbeans.XmlString xgetCurrency();
    
    /**
     * True if has "Currency" element
     */
    boolean isSetCurrency();
    
    /**
     * Sets the "Currency" element
     */
    void setCurrency(java.lang.String currency);
    
    /**
     * Sets (as xml) the "Currency" element
     */
    void xsetCurrency(org.apache.xmlbeans.XmlString currency);
    
    /**
     * Unsets the "Currency" element
     */
    void unsetCurrency();
    
    /**
     * Gets the "ContactName" element
     */
    java.lang.String getContactName();
    
    /**
     * Gets (as xml) the "ContactName" element
     */
    org.apache.xmlbeans.XmlString xgetContactName();
    
    /**
     * True if has "ContactName" element
     */
    boolean isSetContactName();
    
    /**
     * Sets the "ContactName" element
     */
    void setContactName(java.lang.String contactName);
    
    /**
     * Sets (as xml) the "ContactName" element
     */
    void xsetContactName(org.apache.xmlbeans.XmlString contactName);
    
    /**
     * Unsets the "ContactName" element
     */
    void unsetContactName();
    
    /**
     * Gets the "ContactEmail" element
     */
    java.lang.String getContactEmail();
    
    /**
     * Gets (as xml) the "ContactEmail" element
     */
    org.apache.xmlbeans.XmlString xgetContactEmail();
    
    /**
     * True if has "ContactEmail" element
     */
    boolean isSetContactEmail();
    
    /**
     * Sets the "ContactEmail" element
     */
    void setContactEmail(java.lang.String contactEmail);
    
    /**
     * Sets (as xml) the "ContactEmail" element
     */
    void xsetContactEmail(org.apache.xmlbeans.XmlString contactEmail);
    
    /**
     * Unsets the "ContactEmail" element
     */
    void unsetContactEmail();
    
    /**
     * Gets the "ContactTelephone" element
     */
    java.lang.String getContactTelephone();
    
    /**
     * Gets (as xml) the "ContactTelephone" element
     */
    org.apache.xmlbeans.XmlString xgetContactTelephone();
    
    /**
     * True if has "ContactTelephone" element
     */
    boolean isSetContactTelephone();
    
    /**
     * Sets the "ContactTelephone" element
     */
    void setContactTelephone(java.lang.String contactTelephone);
    
    /**
     * Sets (as xml) the "ContactTelephone" element
     */
    void xsetContactTelephone(org.apache.xmlbeans.XmlString contactTelephone);
    
    /**
     * Unsets the "ContactTelephone" element
     */
    void unsetContactTelephone();
    
    /**
     * Gets the "ContactFacsimile" element
     */
    java.lang.String getContactFacsimile();
    
    /**
     * Gets (as xml) the "ContactFacsimile" element
     */
    org.apache.xmlbeans.XmlString xgetContactFacsimile();
    
    /**
     * True if has "ContactFacsimile" element
     */
    boolean isSetContactFacsimile();
    
    /**
     * Sets the "ContactFacsimile" element
     */
    void setContactFacsimile(java.lang.String contactFacsimile);
    
    /**
     * Sets (as xml) the "ContactFacsimile" element
     */
    void xsetContactFacsimile(org.apache.xmlbeans.XmlString contactFacsimile);
    
    /**
     * Unsets the "ContactFacsimile" element
     */
    void unsetContactFacsimile();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.MICEPayee newInstance() {
          return (com.conferma.cpapi.MICEPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.MICEPayee newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.MICEPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.MICEPayee parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.MICEPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.MICEPayee parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.MICEPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.MICEPayee parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.MICEPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.MICEPayee parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.MICEPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.MICEPayee parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.MICEPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.MICEPayee parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.MICEPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.MICEPayee parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.MICEPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.MICEPayee parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.MICEPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.MICEPayee parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.MICEPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.MICEPayee parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.MICEPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.MICEPayee parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.MICEPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.MICEPayee parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.MICEPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.MICEPayee parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.MICEPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.MICEPayee parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.MICEPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.MICEPayee parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.MICEPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.MICEPayee parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.MICEPayee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
