/*
 * XML Type:  CurrencyConversion
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.CurrencyConversion
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML CurrencyConversion(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class CurrencyConversionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.CurrencyConversion
{
    
    public CurrencyConversionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONVERTEDTOTALRATE$0 = 
        new javax.xml.namespace.QName("", "ConvertedTotalRate");
    private static final javax.xml.namespace.QName CURRENCY$2 = 
        new javax.xml.namespace.QName("", "Currency");
    private static final javax.xml.namespace.QName CONVERSIONRATE$4 = 
        new javax.xml.namespace.QName("", "ConversionRate");
    
    
    /**
     * Gets the "ConvertedTotalRate" attribute
     */
    public java.math.BigDecimal getConvertedTotalRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONVERTEDTOTALRATE$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConvertedTotalRate" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetConvertedTotalRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(CONVERTEDTOTALRATE$0);
            return target;
        }
    }
    
    /**
     * Sets the "ConvertedTotalRate" attribute
     */
    public void setConvertedTotalRate(java.math.BigDecimal convertedTotalRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONVERTEDTOTALRATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONVERTEDTOTALRATE$0);
            }
            target.setBigDecimalValue(convertedTotalRate);
        }
    }
    
    /**
     * Sets (as xml) the "ConvertedTotalRate" attribute
     */
    public void xsetConvertedTotalRate(org.apache.xmlbeans.XmlDecimal convertedTotalRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(CONVERTEDTOTALRATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(CONVERTEDTOTALRATE$0);
            }
            target.set(convertedTotalRate);
        }
    }
    
    /**
     * Gets the "Currency" attribute
     */
    public java.lang.String getCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENCY$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Currency" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CURRENCY$2);
            return target;
        }
    }
    
    /**
     * True if has "Currency" attribute
     */
    public boolean isSetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CURRENCY$2) != null;
        }
    }
    
    /**
     * Sets the "Currency" attribute
     */
    public void setCurrency(java.lang.String currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENCY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CURRENCY$2);
            }
            target.setStringValue(currency);
        }
    }
    
    /**
     * Sets (as xml) the "Currency" attribute
     */
    public void xsetCurrency(org.apache.xmlbeans.XmlString currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CURRENCY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CURRENCY$2);
            }
            target.set(currency);
        }
    }
    
    /**
     * Unsets the "Currency" attribute
     */
    public void unsetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CURRENCY$2);
        }
    }
    
    /**
     * Gets the "ConversionRate" attribute
     */
    public java.math.BigDecimal getConversionRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONVERSIONRATE$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConversionRate" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetConversionRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(CONVERSIONRATE$4);
            return target;
        }
    }
    
    /**
     * Sets the "ConversionRate" attribute
     */
    public void setConversionRate(java.math.BigDecimal conversionRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONVERSIONRATE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONVERSIONRATE$4);
            }
            target.setBigDecimalValue(conversionRate);
        }
    }
    
    /**
     * Sets (as xml) the "ConversionRate" attribute
     */
    public void xsetConversionRate(org.apache.xmlbeans.XmlDecimal conversionRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(CONVERSIONRATE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(CONVERSIONRATE$4);
            }
            target.set(conversionRate);
        }
    }
}
