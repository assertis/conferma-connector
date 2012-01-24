/*
 * XML Type:  HotelRate
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.HotelRate
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * An XML HotelRate(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public interface HotelRate extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HotelRate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("hotelrate8f19type");
    
    /**
     * Gets the "BookingPlatform" element
     */
    java.lang.String getBookingPlatform();
    
    /**
     * Gets (as xml) the "BookingPlatform" element
     */
    org.apache.xmlbeans.XmlString xgetBookingPlatform();
    
    /**
     * True if has "BookingPlatform" element
     */
    boolean isSetBookingPlatform();
    
    /**
     * Sets the "BookingPlatform" element
     */
    void setBookingPlatform(java.lang.String bookingPlatform);
    
    /**
     * Sets (as xml) the "BookingPlatform" element
     */
    void xsetBookingPlatform(org.apache.xmlbeans.XmlString bookingPlatform);
    
    /**
     * Unsets the "BookingPlatform" element
     */
    void unsetBookingPlatform();
    
    /**
     * Gets the "Stay" element
     */
    com.conferma.cpapi.DateRange getStay();
    
    /**
     * True if has "Stay" element
     */
    boolean isSetStay();
    
    /**
     * Sets the "Stay" element
     */
    void setStay(com.conferma.cpapi.DateRange stay);
    
    /**
     * Appends and returns a new empty "Stay" element
     */
    com.conferma.cpapi.DateRange addNewStay();
    
    /**
     * Unsets the "Stay" element
     */
    void unsetStay();
    
    /**
     * Gets the "RoomType" element
     */
    java.lang.String getRoomType();
    
    /**
     * Gets (as xml) the "RoomType" element
     */
    org.apache.xmlbeans.XmlString xgetRoomType();
    
    /**
     * True if has "RoomType" element
     */
    boolean isSetRoomType();
    
    /**
     * Sets the "RoomType" element
     */
    void setRoomType(java.lang.String roomType);
    
    /**
     * Sets (as xml) the "RoomType" element
     */
    void xsetRoomType(org.apache.xmlbeans.XmlString roomType);
    
    /**
     * Unsets the "RoomType" element
     */
    void unsetRoomType();
    
    /**
     * Gets the "RateInformation" element
     */
    java.lang.String getRateInformation();
    
    /**
     * Gets (as xml) the "RateInformation" element
     */
    org.apache.xmlbeans.XmlString xgetRateInformation();
    
    /**
     * True if has "RateInformation" element
     */
    boolean isSetRateInformation();
    
    /**
     * Sets the "RateInformation" element
     */
    void setRateInformation(java.lang.String rateInformation);
    
    /**
     * Sets (as xml) the "RateInformation" element
     */
    void xsetRateInformation(org.apache.xmlbeans.XmlString rateInformation);
    
    /**
     * Unsets the "RateInformation" element
     */
    void unsetRateInformation();
    
    /**
     * Gets the "CancellationPolicy" element
     */
    java.lang.String getCancellationPolicy();
    
    /**
     * Gets (as xml) the "CancellationPolicy" element
     */
    org.apache.xmlbeans.XmlString xgetCancellationPolicy();
    
    /**
     * True if has "CancellationPolicy" element
     */
    boolean isSetCancellationPolicy();
    
    /**
     * Sets the "CancellationPolicy" element
     */
    void setCancellationPolicy(java.lang.String cancellationPolicy);
    
    /**
     * Sets (as xml) the "CancellationPolicy" element
     */
    void xsetCancellationPolicy(org.apache.xmlbeans.XmlString cancellationPolicy);
    
    /**
     * Unsets the "CancellationPolicy" element
     */
    void unsetCancellationPolicy();
    
    /**
     * Gets the "CancellationReference" element
     */
    java.lang.String getCancellationReference();
    
    /**
     * Gets (as xml) the "CancellationReference" element
     */
    org.apache.xmlbeans.XmlString xgetCancellationReference();
    
    /**
     * True if has "CancellationReference" element
     */
    boolean isSetCancellationReference();
    
    /**
     * Sets the "CancellationReference" element
     */
    void setCancellationReference(java.lang.String cancellationReference);
    
    /**
     * Sets (as xml) the "CancellationReference" element
     */
    void xsetCancellationReference(org.apache.xmlbeans.XmlString cancellationReference);
    
    /**
     * Unsets the "CancellationReference" element
     */
    void unsetCancellationReference();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.HotelRate newInstance() {
          return (com.conferma.cpapi.HotelRate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.HotelRate newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.HotelRate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.HotelRate parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.HotelRate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.HotelRate parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.HotelRate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.HotelRate parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.HotelRate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.HotelRate parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.HotelRate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.HotelRate parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.HotelRate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.HotelRate parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.HotelRate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.HotelRate parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.HotelRate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.HotelRate parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.HotelRate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.HotelRate parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.HotelRate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.HotelRate parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.HotelRate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.HotelRate parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.HotelRate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.HotelRate parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.HotelRate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.HotelRate parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.HotelRate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.HotelRate parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.HotelRate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.HotelRate parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.HotelRate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.HotelRate parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.HotelRate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
