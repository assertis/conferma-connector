/*
 * XML Type:  Identifier
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.Identifier
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML Identifier(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class IdentifierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.Identifier
{
    
    public IdentifierImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEY$0 = 
        new javax.xml.namespace.QName("", "Key");
    private static final javax.xml.namespace.QName VALUE$2 = 
        new javax.xml.namespace.QName("", "Value");
    private static final javax.xml.namespace.QName REPORTKEY$4 = 
        new javax.xml.namespace.QName("", "ReportKey");
    
    
    /**
     * Gets the "Key" attribute
     */
    public java.lang.String getKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEY$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Key" attribute
     */
    public org.apache.xmlbeans.XmlString xgetKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEY$0);
            return target;
        }
    }
    
    /**
     * True if has "Key" attribute
     */
    public boolean isSetKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(KEY$0) != null;
        }
    }
    
    /**
     * Sets the "Key" attribute
     */
    public void setKey(java.lang.String key)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEY$0);
            }
            target.setStringValue(key);
        }
    }
    
    /**
     * Sets (as xml) the "Key" attribute
     */
    public void xsetKey(org.apache.xmlbeans.XmlString key)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(KEY$0);
            }
            target.set(key);
        }
    }
    
    /**
     * Unsets the "Key" attribute
     */
    public void unsetKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(KEY$0);
        }
    }
    
    /**
     * Gets the "Value" attribute
     */
    public java.lang.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Value" attribute
     */
    public org.apache.xmlbeans.XmlString xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
            return target;
        }
    }
    
    /**
     * True if has "Value" attribute
     */
    public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALUE$2) != null;
        }
    }
    
    /**
     * Sets the "Value" attribute
     */
    public void setValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$2);
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "Value" attribute
     */
    public void xsetValue(org.apache.xmlbeans.XmlString value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$2);
            }
            target.set(value);
        }
    }
    
    /**
     * Unsets the "Value" attribute
     */
    public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALUE$2);
        }
    }
    
    /**
     * Gets the "ReportKey" attribute
     */
    public java.lang.String getReportKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTKEY$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReportKey" attribute
     */
    public org.apache.xmlbeans.XmlString xgetReportKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REPORTKEY$4);
            return target;
        }
    }
    
    /**
     * True if has "ReportKey" attribute
     */
    public boolean isSetReportKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REPORTKEY$4) != null;
        }
    }
    
    /**
     * Sets the "ReportKey" attribute
     */
    public void setReportKey(java.lang.String reportKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTKEY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPORTKEY$4);
            }
            target.setStringValue(reportKey);
        }
    }
    
    /**
     * Sets (as xml) the "ReportKey" attribute
     */
    public void xsetReportKey(org.apache.xmlbeans.XmlString reportKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REPORTKEY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REPORTKEY$4);
            }
            target.set(reportKey);
        }
    }
    
    /**
     * Unsets the "ReportKey" attribute
     */
    public void unsetReportKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REPORTKEY$4);
        }
    }
}
