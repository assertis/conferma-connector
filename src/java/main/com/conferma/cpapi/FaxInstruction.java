/*
 * XML Type:  FaxInstruction
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.FaxInstruction
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * An XML FaxInstruction(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public interface FaxInstruction extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FaxInstruction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("faxinstruction2e0atype");
    
    /**
     * Gets the "DeploymentID" attribute
     */
    int getDeploymentID();
    
    /**
     * Gets (as xml) the "DeploymentID" attribute
     */
    org.apache.xmlbeans.XmlInt xgetDeploymentID();
    
    /**
     * Sets the "DeploymentID" attribute
     */
    void setDeploymentID(int deploymentID);
    
    /**
     * Sets (as xml) the "DeploymentID" attribute
     */
    void xsetDeploymentID(org.apache.xmlbeans.XmlInt deploymentID);
    
    /**
     * Gets the "FaxType" attribute
     */
    com.conferma.cpapi.FaxType.Enum getFaxType();
    
    /**
     * Gets (as xml) the "FaxType" attribute
     */
    com.conferma.cpapi.FaxType xgetFaxType();
    
    /**
     * Sets the "FaxType" attribute
     */
    void setFaxType(com.conferma.cpapi.FaxType.Enum faxType);
    
    /**
     * Sets (as xml) the "FaxType" attribute
     */
    void xsetFaxType(com.conferma.cpapi.FaxType faxType);
    
    /**
     * Gets the "FaxNumberOption" attribute
     */
    com.conferma.cpapi.FaxNumberOption.Enum getFaxNumberOption();
    
    /**
     * Gets (as xml) the "FaxNumberOption" attribute
     */
    com.conferma.cpapi.FaxNumberOption xgetFaxNumberOption();
    
    /**
     * Sets the "FaxNumberOption" attribute
     */
    void setFaxNumberOption(com.conferma.cpapi.FaxNumberOption.Enum faxNumberOption);
    
    /**
     * Sets (as xml) the "FaxNumberOption" attribute
     */
    void xsetFaxNumberOption(com.conferma.cpapi.FaxNumberOption faxNumberOption);
    
    /**
     * Gets the "DeclaredNumber" attribute
     */
    java.lang.String getDeclaredNumber();
    
    /**
     * Gets (as xml) the "DeclaredNumber" attribute
     */
    org.apache.xmlbeans.XmlString xgetDeclaredNumber();
    
    /**
     * True if has "DeclaredNumber" attribute
     */
    boolean isSetDeclaredNumber();
    
    /**
     * Sets the "DeclaredNumber" attribute
     */
    void setDeclaredNumber(java.lang.String declaredNumber);
    
    /**
     * Sets (as xml) the "DeclaredNumber" attribute
     */
    void xsetDeclaredNumber(org.apache.xmlbeans.XmlString declaredNumber);
    
    /**
     * Unsets the "DeclaredNumber" attribute
     */
    void unsetDeclaredNumber();
    
    /**
     * Gets the "FailedFaxEmailAddress" attribute
     */
    java.lang.String getFailedFaxEmailAddress();
    
    /**
     * Gets (as xml) the "FailedFaxEmailAddress" attribute
     */
    org.apache.xmlbeans.XmlString xgetFailedFaxEmailAddress();
    
    /**
     * True if has "FailedFaxEmailAddress" attribute
     */
    boolean isSetFailedFaxEmailAddress();
    
    /**
     * Sets the "FailedFaxEmailAddress" attribute
     */
    void setFailedFaxEmailAddress(java.lang.String failedFaxEmailAddress);
    
    /**
     * Sets (as xml) the "FailedFaxEmailAddress" attribute
     */
    void xsetFailedFaxEmailAddress(org.apache.xmlbeans.XmlString failedFaxEmailAddress);
    
    /**
     * Unsets the "FailedFaxEmailAddress" attribute
     */
    void unsetFailedFaxEmailAddress();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.FaxInstruction newInstance() {
          return (com.conferma.cpapi.FaxInstruction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.FaxInstruction newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.FaxInstruction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.FaxInstruction parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.FaxInstruction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.FaxInstruction parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.FaxInstruction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.FaxInstruction parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.FaxInstruction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.FaxInstruction parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.FaxInstruction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.FaxInstruction parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.FaxInstruction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.FaxInstruction parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.FaxInstruction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.FaxInstruction parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.FaxInstruction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.FaxInstruction parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.FaxInstruction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.FaxInstruction parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.FaxInstruction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.FaxInstruction parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.FaxInstruction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.FaxInstruction parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.FaxInstruction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.FaxInstruction parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.FaxInstruction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.FaxInstruction parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.FaxInstruction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.FaxInstruction parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.FaxInstruction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.FaxInstruction parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.FaxInstruction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.FaxInstruction parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.FaxInstruction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
