/*
 * XML Type:  HotelGuideRateAge
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.HotelGuideRateAge
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi;


/**
 * An XML HotelGuideRateAge(@http://cpapi.conferma.com/).
 *
 * This is an atomic type that is a restriction of com.conferma.cpapi.HotelGuideRateAge.
 */
public interface HotelGuideRateAge extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HotelGuideRateAge.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4840EABFCCE2902204A6F8C9414298CB").resolveHandle("hotelguiderateage4bb6type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum UNKNOWN = Enum.forString("Unknown");
    static final Enum WITHIN_LAST_24_HOURS = Enum.forString("WithinLast24Hours");
    static final Enum WITHIN_LAST_48_HOURS = Enum.forString("WithinLast48Hours");
    static final Enum WITHIN_LAST_72_HOURS = Enum.forString("WithinLast72Hours");
    static final Enum WITHIN_LAST_WEEK = Enum.forString("WithinLastWeek");
    static final Enum WITHIN_LAST_TWO_WEEKS = Enum.forString("WithinLastTwoWeeks");
    static final Enum OVER_TWO_WEEKS_AGO = Enum.forString("OverTwoWeeksAgo");
    
    static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
    static final int INT_WITHIN_LAST_24_HOURS = Enum.INT_WITHIN_LAST_24_HOURS;
    static final int INT_WITHIN_LAST_48_HOURS = Enum.INT_WITHIN_LAST_48_HOURS;
    static final int INT_WITHIN_LAST_72_HOURS = Enum.INT_WITHIN_LAST_72_HOURS;
    static final int INT_WITHIN_LAST_WEEK = Enum.INT_WITHIN_LAST_WEEK;
    static final int INT_WITHIN_LAST_TWO_WEEKS = Enum.INT_WITHIN_LAST_TWO_WEEKS;
    static final int INT_OVER_TWO_WEEKS_AGO = Enum.INT_OVER_TWO_WEEKS_AGO;
    
    /**
     * Enumeration value class for com.conferma.cpapi.HotelGuideRateAge.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_UNKNOWN
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_UNKNOWN = 1;
        static final int INT_WITHIN_LAST_24_HOURS = 2;
        static final int INT_WITHIN_LAST_48_HOURS = 3;
        static final int INT_WITHIN_LAST_72_HOURS = 4;
        static final int INT_WITHIN_LAST_WEEK = 5;
        static final int INT_WITHIN_LAST_TWO_WEEKS = 6;
        static final int INT_OVER_TWO_WEEKS_AGO = 7;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Unknown", INT_UNKNOWN),
                new Enum("WithinLast24Hours", INT_WITHIN_LAST_24_HOURS),
                new Enum("WithinLast48Hours", INT_WITHIN_LAST_48_HOURS),
                new Enum("WithinLast72Hours", INT_WITHIN_LAST_72_HOURS),
                new Enum("WithinLastWeek", INT_WITHIN_LAST_WEEK),
                new Enum("WithinLastTwoWeeks", INT_WITHIN_LAST_TWO_WEEKS),
                new Enum("OverTwoWeeksAgo", INT_OVER_TWO_WEEKS_AGO),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.conferma.cpapi.HotelGuideRateAge newValue(java.lang.Object obj) {
          return (com.conferma.cpapi.HotelGuideRateAge) type.newValue( obj ); }
        
        public static com.conferma.cpapi.HotelGuideRateAge newInstance() {
          return (com.conferma.cpapi.HotelGuideRateAge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.conferma.cpapi.HotelGuideRateAge newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.conferma.cpapi.HotelGuideRateAge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.conferma.cpapi.HotelGuideRateAge parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.HotelGuideRateAge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.conferma.cpapi.HotelGuideRateAge parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.HotelGuideRateAge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.conferma.cpapi.HotelGuideRateAge parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.HotelGuideRateAge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.conferma.cpapi.HotelGuideRateAge parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.HotelGuideRateAge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.conferma.cpapi.HotelGuideRateAge parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.HotelGuideRateAge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.conferma.cpapi.HotelGuideRateAge parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.HotelGuideRateAge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.conferma.cpapi.HotelGuideRateAge parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.HotelGuideRateAge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.conferma.cpapi.HotelGuideRateAge parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.HotelGuideRateAge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.conferma.cpapi.HotelGuideRateAge parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.HotelGuideRateAge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.conferma.cpapi.HotelGuideRateAge parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.conferma.cpapi.HotelGuideRateAge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.conferma.cpapi.HotelGuideRateAge parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.HotelGuideRateAge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.conferma.cpapi.HotelGuideRateAge parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.HotelGuideRateAge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.conferma.cpapi.HotelGuideRateAge parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.HotelGuideRateAge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.conferma.cpapi.HotelGuideRateAge parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.conferma.cpapi.HotelGuideRateAge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.HotelGuideRateAge parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.HotelGuideRateAge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.conferma.cpapi.HotelGuideRateAge parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.conferma.cpapi.HotelGuideRateAge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
