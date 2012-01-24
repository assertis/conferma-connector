/*
 * XML Type:  ConfermaUserStateHeader
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.ConfermaUserStateHeader
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * An XML ConfermaUserStateHeader(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public interface ConfermaUserStateHeader extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConfermaUserStateHeader.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("confermauserstateheader08fftype");
    
    /**
     * Gets the "AgentID" element
     */
    java.lang.String getAgentID();
    
    /**
     * Gets (as xml) the "AgentID" element
     */
    org.apache.xmlbeans.XmlString xgetAgentID();
    
    /**
     * True if has "AgentID" element
     */
    boolean isSetAgentID();
    
    /**
     * Sets the "AgentID" element
     */
    void setAgentID(java.lang.String agentID);
    
    /**
     * Sets (as xml) the "AgentID" element
     */
    void xsetAgentID(org.apache.xmlbeans.XmlString agentID);
    
    /**
     * Unsets the "AgentID" element
     */
    void unsetAgentID();
    
    /**
     * Gets the "ClientID" element
     */
    java.lang.String getClientID();
    
    /**
     * Gets (as xml) the "ClientID" element
     */
    org.apache.xmlbeans.XmlString xgetClientID();
    
    /**
     * True if has "ClientID" element
     */
    boolean isSetClientID();
    
    /**
     * Sets the "ClientID" element
     */
    void setClientID(java.lang.String clientID);
    
    /**
     * Sets (as xml) the "ClientID" element
     */
    void xsetClientID(org.apache.xmlbeans.XmlString clientID);
    
    /**
     * Unsets the "ClientID" element
     */
    void unsetClientID();
    
    /**
     * Gets the "BookerID" element
     */
    java.lang.String getBookerID();
    
    /**
     * Gets (as xml) the "BookerID" element
     */
    org.apache.xmlbeans.XmlString xgetBookerID();
    
    /**
     * True if has "BookerID" element
     */
    boolean isSetBookerID();
    
    /**
     * Sets the "BookerID" element
     */
    void setBookerID(java.lang.String bookerID);
    
    /**
     * Sets (as xml) the "BookerID" element
     */
    void xsetBookerID(org.apache.xmlbeans.XmlString bookerID);
    
    /**
     * Unsets the "BookerID" element
     */
    void unsetBookerID();
    
    /**
     * Gets the "GuestIDs" element
     */
    com.conferma.cpapi.ArrayOfString getGuestIDs();
    
    /**
     * True if has "GuestIDs" element
     */
    boolean isSetGuestIDs();
    
    /**
     * Sets the "GuestIDs" element
     */
    void setGuestIDs(com.conferma.cpapi.ArrayOfString guestIDs);
    
    /**
     * Appends and returns a new empty "GuestIDs" element
     */
    com.conferma.cpapi.ArrayOfString addNewGuestIDs();
    
    /**
     * Unsets the "GuestIDs" element
     */
    void unsetGuestIDs();
    
    /**
     * Gets the "ConsumerAccountCode" element
     */
    com.conferma.cpapi.ConsumerAccountCode getConsumerAccountCode();
    
    /**
     * True if has "ConsumerAccountCode" element
     */
    boolean isSetConsumerAccountCode();
    
    /**
     * Sets the "ConsumerAccountCode" element
     */
    void setConsumerAccountCode(com.conferma.cpapi.ConsumerAccountCode consumerAccountCode);
    
    /**
     * Appends and returns a new empty "ConsumerAccountCode" element
     */
    com.conferma.cpapi.ConsumerAccountCode addNewConsumerAccountCode();
    
    /**
     * Unsets the "ConsumerAccountCode" element
     */
    void unsetConsumerAccountCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.ConfermaUserStateHeader newInstance() {
          return (com.conferma.cpapi.ConfermaUserStateHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.ConfermaUserStateHeader newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.ConfermaUserStateHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.ConfermaUserStateHeader parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ConfermaUserStateHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.ConfermaUserStateHeader parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ConfermaUserStateHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.ConfermaUserStateHeader parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ConfermaUserStateHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.ConfermaUserStateHeader parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ConfermaUserStateHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.ConfermaUserStateHeader parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ConfermaUserStateHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.ConfermaUserStateHeader parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ConfermaUserStateHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.ConfermaUserStateHeader parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ConfermaUserStateHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.ConfermaUserStateHeader parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ConfermaUserStateHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.ConfermaUserStateHeader parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ConfermaUserStateHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.ConfermaUserStateHeader parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.ConfermaUserStateHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.ConfermaUserStateHeader parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ConfermaUserStateHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.ConfermaUserStateHeader parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ConfermaUserStateHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.ConfermaUserStateHeader parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ConfermaUserStateHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.ConfermaUserStateHeader parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.ConfermaUserStateHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.ConfermaUserStateHeader parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.ConfermaUserStateHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.ConfermaUserStateHeader parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.ConfermaUserStateHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
