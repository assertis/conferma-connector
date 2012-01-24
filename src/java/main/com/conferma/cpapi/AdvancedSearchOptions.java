/*
 * XML Type:  AdvancedSearchOptions
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.AdvancedSearchOptions
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * An XML AdvancedSearchOptions(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public interface AdvancedSearchOptions extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdvancedSearchOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("advancedsearchoptionse379type");
    
    /**
     * Gets the "ConvertToCurrencyCode" element
     */
    java.lang.String getConvertToCurrencyCode();
    
    /**
     * Gets (as xml) the "ConvertToCurrencyCode" element
     */
    org.apache.xmlbeans.XmlString xgetConvertToCurrencyCode();
    
    /**
     * True if has "ConvertToCurrencyCode" element
     */
    boolean isSetConvertToCurrencyCode();
    
    /**
     * Sets the "ConvertToCurrencyCode" element
     */
    void setConvertToCurrencyCode(java.lang.String convertToCurrencyCode);
    
    /**
     * Sets (as xml) the "ConvertToCurrencyCode" element
     */
    void xsetConvertToCurrencyCode(org.apache.xmlbeans.XmlString convertToCurrencyCode);
    
    /**
     * Unsets the "ConvertToCurrencyCode" element
     */
    void unsetConvertToCurrencyCode();
    
    /**
     * Gets the "MaxResults" element
     */
    int getMaxResults();
    
    /**
     * Gets (as xml) the "MaxResults" element
     */
    org.apache.xmlbeans.XmlInt xgetMaxResults();
    
    /**
     * Sets the "MaxResults" element
     */
    void setMaxResults(int maxResults);
    
    /**
     * Sets (as xml) the "MaxResults" element
     */
    void xsetMaxResults(org.apache.xmlbeans.XmlInt maxResults);
    
    /**
     * Gets the "StarRange" element
     */
    com.conferma.cpapi.StarRange getStarRange();
    
    /**
     * True if has "StarRange" element
     */
    boolean isSetStarRange();
    
    /**
     * Sets the "StarRange" element
     */
    void setStarRange(com.conferma.cpapi.StarRange starRange);
    
    /**
     * Appends and returns a new empty "StarRange" element
     */
    com.conferma.cpapi.StarRange addNewStarRange();
    
    /**
     * Unsets the "StarRange" element
     */
    void unsetStarRange();
    
    /**
     * Gets the "HotelNameLike" element
     */
    java.lang.String getHotelNameLike();
    
    /**
     * Gets (as xml) the "HotelNameLike" element
     */
    org.apache.xmlbeans.XmlString xgetHotelNameLike();
    
    /**
     * True if has "HotelNameLike" element
     */
    boolean isSetHotelNameLike();
    
    /**
     * Sets the "HotelNameLike" element
     */
    void setHotelNameLike(java.lang.String hotelNameLike);
    
    /**
     * Sets (as xml) the "HotelNameLike" element
     */
    void xsetHotelNameLike(org.apache.xmlbeans.XmlString hotelNameLike);
    
    /**
     * Unsets the "HotelNameLike" element
     */
    void unsetHotelNameLike();
    
    /**
     * Gets the "GroupNameLike" element
     */
    java.lang.String getGroupNameLike();
    
    /**
     * Gets (as xml) the "GroupNameLike" element
     */
    org.apache.xmlbeans.XmlString xgetGroupNameLike();
    
    /**
     * True if has "GroupNameLike" element
     */
    boolean isSetGroupNameLike();
    
    /**
     * Sets the "GroupNameLike" element
     */
    void setGroupNameLike(java.lang.String groupNameLike);
    
    /**
     * Sets (as xml) the "GroupNameLike" element
     */
    void xsetGroupNameLike(org.apache.xmlbeans.XmlString groupNameLike);
    
    /**
     * Unsets the "GroupNameLike" element
     */
    void unsetGroupNameLike();
    
    /**
     * Gets the "PreferredFilter" element
     */
    com.conferma.cpapi.FilterOption.Enum getPreferredFilter();
    
    /**
     * Gets (as xml) the "PreferredFilter" element
     */
    com.conferma.cpapi.FilterOption xgetPreferredFilter();
    
    /**
     * Sets the "PreferredFilter" element
     */
    void setPreferredFilter(com.conferma.cpapi.FilterOption.Enum preferredFilter);
    
    /**
     * Sets (as xml) the "PreferredFilter" element
     */
    void xsetPreferredFilter(com.conferma.cpapi.FilterOption preferredFilter);
    
    /**
     * Gets the "POIDisplay" element
     */
    com.conferma.cpapi.DisplayOption.Enum getPOIDisplay();
    
    /**
     * Gets (as xml) the "POIDisplay" element
     */
    com.conferma.cpapi.DisplayOption xgetPOIDisplay();
    
    /**
     * Sets the "POIDisplay" element
     */
    void setPOIDisplay(com.conferma.cpapi.DisplayOption.Enum poiDisplay);
    
    /**
     * Sets (as xml) the "POIDisplay" element
     */
    void xsetPOIDisplay(com.conferma.cpapi.DisplayOption poiDisplay);
    
    /**
     * Gets the "PriceRange" element
     */
    com.conferma.cpapi.PriceRange getPriceRange();
    
    /**
     * True if has "PriceRange" element
     */
    boolean isSetPriceRange();
    
    /**
     * Sets the "PriceRange" element
     */
    void setPriceRange(com.conferma.cpapi.PriceRange priceRange);
    
    /**
     * Appends and returns a new empty "PriceRange" element
     */
    com.conferma.cpapi.PriceRange addNewPriceRange();
    
    /**
     * Unsets the "PriceRange" element
     */
    void unsetPriceRange();
    
    /**
     * Gets the "HotelClosestAirports" element
     */
    com.conferma.cpapi.DisplayOption.Enum getHotelClosestAirports();
    
    /**
     * Gets (as xml) the "HotelClosestAirports" element
     */
    com.conferma.cpapi.DisplayOption xgetHotelClosestAirports();
    
    /**
     * Sets the "HotelClosestAirports" element
     */
    void setHotelClosestAirports(com.conferma.cpapi.DisplayOption.Enum hotelClosestAirports);
    
    /**
     * Sets (as xml) the "HotelClosestAirports" element
     */
    void xsetHotelClosestAirports(com.conferma.cpapi.DisplayOption hotelClosestAirports);
    
    /**
     * Gets the "HotelClosestMetroStations" element
     */
    com.conferma.cpapi.DisplayOption.Enum getHotelClosestMetroStations();
    
    /**
     * Gets (as xml) the "HotelClosestMetroStations" element
     */
    com.conferma.cpapi.DisplayOption xgetHotelClosestMetroStations();
    
    /**
     * Sets the "HotelClosestMetroStations" element
     */
    void setHotelClosestMetroStations(com.conferma.cpapi.DisplayOption.Enum hotelClosestMetroStations);
    
    /**
     * Sets (as xml) the "HotelClosestMetroStations" element
     */
    void xsetHotelClosestMetroStations(com.conferma.cpapi.DisplayOption hotelClosestMetroStations);
    
    /**
     * Gets the "HotelClosestTrainStations" element
     */
    com.conferma.cpapi.DisplayOption.Enum getHotelClosestTrainStations();
    
    /**
     * Gets (as xml) the "HotelClosestTrainStations" element
     */
    com.conferma.cpapi.DisplayOption xgetHotelClosestTrainStations();
    
    /**
     * Sets the "HotelClosestTrainStations" element
     */
    void setHotelClosestTrainStations(com.conferma.cpapi.DisplayOption.Enum hotelClosestTrainStations);
    
    /**
     * Sets (as xml) the "HotelClosestTrainStations" element
     */
    void xsetHotelClosestTrainStations(com.conferma.cpapi.DisplayOption hotelClosestTrainStations);
    
    /**
     * Gets the "OrderBy" element
     */
    com.conferma.cpapi.LocationResultsOrder.Enum getOrderBy();
    
    /**
     * Gets (as xml) the "OrderBy" element
     */
    com.conferma.cpapi.LocationResultsOrder xgetOrderBy();
    
    /**
     * Sets the "OrderBy" element
     */
    void setOrderBy(com.conferma.cpapi.LocationResultsOrder.Enum orderBy);
    
    /**
     * Sets (as xml) the "OrderBy" element
     */
    void xsetOrderBy(com.conferma.cpapi.LocationResultsOrder orderBy);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.AdvancedSearchOptions newInstance() {
          return (com.conferma.cpapi.AdvancedSearchOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.AdvancedSearchOptions newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.AdvancedSearchOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.AdvancedSearchOptions parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.AdvancedSearchOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.AdvancedSearchOptions parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.AdvancedSearchOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.AdvancedSearchOptions parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.AdvancedSearchOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.AdvancedSearchOptions parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.AdvancedSearchOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.AdvancedSearchOptions parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.AdvancedSearchOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.AdvancedSearchOptions parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.AdvancedSearchOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.AdvancedSearchOptions parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.AdvancedSearchOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.AdvancedSearchOptions parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.AdvancedSearchOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.AdvancedSearchOptions parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.AdvancedSearchOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.AdvancedSearchOptions parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.AdvancedSearchOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.AdvancedSearchOptions parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.AdvancedSearchOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.AdvancedSearchOptions parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.AdvancedSearchOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.AdvancedSearchOptions parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.AdvancedSearchOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.AdvancedSearchOptions parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.AdvancedSearchOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.AdvancedSearchOptions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.AdvancedSearchOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.AdvancedSearchOptions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.AdvancedSearchOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
