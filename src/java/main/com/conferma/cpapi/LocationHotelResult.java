/*
 * XML Type:  LocationHotelResult
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.LocationHotelResult
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * An XML LocationHotelResult(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public interface LocationHotelResult extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LocationHotelResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("locationhotelresult1f91type");
    
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
     * Gets the "GroupID" element
     */
    int getGroupID();
    
    /**
     * Gets (as xml) the "GroupID" element
     */
    org.apache.xmlbeans.XmlInt xgetGroupID();
    
    /**
     * Sets the "GroupID" element
     */
    void setGroupID(int groupID);
    
    /**
     * Sets (as xml) the "GroupID" element
     */
    void xsetGroupID(org.apache.xmlbeans.XmlInt groupID);
    
    /**
     * Gets the "GroupName" element
     */
    java.lang.String getGroupName();
    
    /**
     * Gets (as xml) the "GroupName" element
     */
    org.apache.xmlbeans.XmlString xgetGroupName();
    
    /**
     * True if has "GroupName" element
     */
    boolean isSetGroupName();
    
    /**
     * Sets the "GroupName" element
     */
    void setGroupName(java.lang.String groupName);
    
    /**
     * Sets (as xml) the "GroupName" element
     */
    void xsetGroupName(org.apache.xmlbeans.XmlString groupName);
    
    /**
     * Unsets the "GroupName" element
     */
    void unsetGroupName();
    
    /**
     * Gets the "Address" element
     */
    com.conferma.cbapi.cdts.Address getAddress();
    
    /**
     * True if has "Address" element
     */
    boolean isSetAddress();
    
    /**
     * Sets the "Address" element
     */
    void setAddress(com.conferma.cbapi.cdts.Address address);
    
    /**
     * Appends and returns a new empty "Address" element
     */
    com.conferma.cbapi.cdts.Address addNewAddress();
    
    /**
     * Unsets the "Address" element
     */
    void unsetAddress();
    
    /**
     * Gets the "GuideRateType" element
     */
    com.conferma.cpapi.HotelGuideRateType.Enum getGuideRateType();
    
    /**
     * Gets (as xml) the "GuideRateType" element
     */
    com.conferma.cpapi.HotelGuideRateType xgetGuideRateType();
    
    /**
     * Sets the "GuideRateType" element
     */
    void setGuideRateType(com.conferma.cpapi.HotelGuideRateType.Enum guideRateType);
    
    /**
     * Sets (as xml) the "GuideRateType" element
     */
    void xsetGuideRateType(com.conferma.cpapi.HotelGuideRateType guideRateType);
    
    /**
     * Gets the "GuideRateAge" element
     */
    com.conferma.cpapi.HotelGuideRateAge.Enum getGuideRateAge();
    
    /**
     * Gets (as xml) the "GuideRateAge" element
     */
    com.conferma.cpapi.HotelGuideRateAge xgetGuideRateAge();
    
    /**
     * Sets the "GuideRateAge" element
     */
    void setGuideRateAge(com.conferma.cpapi.HotelGuideRateAge.Enum guideRateAge);
    
    /**
     * Sets (as xml) the "GuideRateAge" element
     */
    void xsetGuideRateAge(com.conferma.cpapi.HotelGuideRateAge guideRateAge);
    
    /**
     * Gets the "GuideRate" element
     */
    java.math.BigDecimal getGuideRate();
    
    /**
     * Gets (as xml) the "GuideRate" element
     */
    org.apache.xmlbeans.XmlDecimal xgetGuideRate();
    
    /**
     * Sets the "GuideRate" element
     */
    void setGuideRate(java.math.BigDecimal guideRate);
    
    /**
     * Sets (as xml) the "GuideRate" element
     */
    void xsetGuideRate(org.apache.xmlbeans.XmlDecimal guideRate);
    
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
     * Gets the "IsClientPreferred" element
     */
    boolean getIsClientPreferred();
    
    /**
     * Gets (as xml) the "IsClientPreferred" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsClientPreferred();
    
    /**
     * Sets the "IsClientPreferred" element
     */
    void setIsClientPreferred(boolean isClientPreferred);
    
    /**
     * Sets (as xml) the "IsClientPreferred" element
     */
    void xsetIsClientPreferred(org.apache.xmlbeans.XmlBoolean isClientPreferred);
    
    /**
     * Gets the "IsConsumerPreferred" element
     */
    boolean getIsConsumerPreferred();
    
    /**
     * Gets (as xml) the "IsConsumerPreferred" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsConsumerPreferred();
    
    /**
     * Sets the "IsConsumerPreferred" element
     */
    void setIsConsumerPreferred(boolean isConsumerPreferred);
    
    /**
     * Sets (as xml) the "IsConsumerPreferred" element
     */
    void xsetIsConsumerPreferred(org.apache.xmlbeans.XmlBoolean isConsumerPreferred);
    
    /**
     * Gets the "StarRating" element
     */
    java.math.BigDecimal getStarRating();
    
    /**
     * Gets (as xml) the "StarRating" element
     */
    org.apache.xmlbeans.XmlDecimal xgetStarRating();
    
    /**
     * Sets the "StarRating" element
     */
    void setStarRating(java.math.BigDecimal starRating);
    
    /**
     * Sets (as xml) the "StarRating" element
     */
    void xsetStarRating(org.apache.xmlbeans.XmlDecimal starRating);
    
    /**
     * Gets the "StarRatingProvider" element
     */
    java.lang.String getStarRatingProvider();
    
    /**
     * Gets (as xml) the "StarRatingProvider" element
     */
    org.apache.xmlbeans.XmlString xgetStarRatingProvider();
    
    /**
     * True if has "StarRatingProvider" element
     */
    boolean isSetStarRatingProvider();
    
    /**
     * Sets the "StarRatingProvider" element
     */
    void setStarRatingProvider(java.lang.String starRatingProvider);
    
    /**
     * Sets (as xml) the "StarRatingProvider" element
     */
    void xsetStarRatingProvider(org.apache.xmlbeans.XmlString starRatingProvider);
    
    /**
     * Unsets the "StarRatingProvider" element
     */
    void unsetStarRatingProvider();
    
    /**
     * Gets the "UserStarRating" element
     */
    java.math.BigDecimal getUserStarRating();
    
    /**
     * Gets (as xml) the "UserStarRating" element
     */
    org.apache.xmlbeans.XmlDecimal xgetUserStarRating();
    
    /**
     * Sets the "UserStarRating" element
     */
    void setUserStarRating(java.math.BigDecimal userStarRating);
    
    /**
     * Sets (as xml) the "UserStarRating" element
     */
    void xsetUserStarRating(org.apache.xmlbeans.XmlDecimal userStarRating);
    
    /**
     * Gets the "HasReviews" element
     */
    boolean getHasReviews();
    
    /**
     * Gets (as xml) the "HasReviews" element
     */
    org.apache.xmlbeans.XmlBoolean xgetHasReviews();
    
    /**
     * Sets the "HasReviews" element
     */
    void setHasReviews(boolean hasReviews);
    
    /**
     * Sets (as xml) the "HasReviews" element
     */
    void xsetHasReviews(org.apache.xmlbeans.XmlBoolean hasReviews);
    
    /**
     * Gets the "ClosestAirport" element
     */
    com.conferma.cpapi.NearbyLocation getClosestAirport();
    
    /**
     * True if has "ClosestAirport" element
     */
    boolean isSetClosestAirport();
    
    /**
     * Sets the "ClosestAirport" element
     */
    void setClosestAirport(com.conferma.cpapi.NearbyLocation closestAirport);
    
    /**
     * Appends and returns a new empty "ClosestAirport" element
     */
    com.conferma.cpapi.NearbyLocation addNewClosestAirport();
    
    /**
     * Unsets the "ClosestAirport" element
     */
    void unsetClosestAirport();
    
    /**
     * Gets the "ClosestTrainStation" element
     */
    com.conferma.cpapi.NearbyLocation getClosestTrainStation();
    
    /**
     * True if has "ClosestTrainStation" element
     */
    boolean isSetClosestTrainStation();
    
    /**
     * Sets the "ClosestTrainStation" element
     */
    void setClosestTrainStation(com.conferma.cpapi.NearbyLocation closestTrainStation);
    
    /**
     * Appends and returns a new empty "ClosestTrainStation" element
     */
    com.conferma.cpapi.NearbyLocation addNewClosestTrainStation();
    
    /**
     * Unsets the "ClosestTrainStation" element
     */
    void unsetClosestTrainStation();
    
    /**
     * Gets the "ClosestMetroStation" element
     */
    com.conferma.cpapi.NearbyLocation getClosestMetroStation();
    
    /**
     * True if has "ClosestMetroStation" element
     */
    boolean isSetClosestMetroStation();
    
    /**
     * Sets the "ClosestMetroStation" element
     */
    void setClosestMetroStation(com.conferma.cpapi.NearbyLocation closestMetroStation);
    
    /**
     * Appends and returns a new empty "ClosestMetroStation" element
     */
    com.conferma.cpapi.NearbyLocation addNewClosestMetroStation();
    
    /**
     * Unsets the "ClosestMetroStation" element
     */
    void unsetClosestMetroStation();
    
    /**
     * Gets the "CurrencyConversion" element
     */
    com.conferma.cpapi.CurrencyConversion getCurrencyConversion();
    
    /**
     * True if has "CurrencyConversion" element
     */
    boolean isSetCurrencyConversion();
    
    /**
     * Sets the "CurrencyConversion" element
     */
    void setCurrencyConversion(com.conferma.cpapi.CurrencyConversion currencyConversion);
    
    /**
     * Appends and returns a new empty "CurrencyConversion" element
     */
    com.conferma.cpapi.CurrencyConversion addNewCurrencyConversion();
    
    /**
     * Unsets the "CurrencyConversion" element
     */
    void unsetCurrencyConversion();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.LocationHotelResult newInstance() {
          return (com.conferma.cpapi.LocationHotelResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.LocationHotelResult newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.LocationHotelResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.LocationHotelResult parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.LocationHotelResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.LocationHotelResult parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.LocationHotelResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.LocationHotelResult parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationHotelResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.LocationHotelResult parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationHotelResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.LocationHotelResult parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationHotelResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.LocationHotelResult parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationHotelResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.LocationHotelResult parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationHotelResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.LocationHotelResult parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationHotelResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.LocationHotelResult parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationHotelResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.LocationHotelResult parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.LocationHotelResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.LocationHotelResult parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.LocationHotelResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.LocationHotelResult parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.LocationHotelResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.LocationHotelResult parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.LocationHotelResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.LocationHotelResult parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.LocationHotelResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.LocationHotelResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.LocationHotelResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.LocationHotelResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.LocationHotelResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
