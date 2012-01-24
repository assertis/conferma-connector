/*
 * XML Type:  KeywordSearch
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.KeywordSearch
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML KeywordSearch(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class KeywordSearchImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.KeywordSearch
{
    
    public KeywordSearchImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYWORDID$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "KeywordID");
    
    
    /**
     * Gets the "KeywordID" element
     */
    public java.lang.String getKeywordID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "KeywordID" element
     */
    public org.apache.xmlbeans.XmlString xgetKeywordID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORDID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "KeywordID" element
     */
    public boolean isSetKeywordID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYWORDID$0) != 0;
        }
    }
    
    /**
     * Sets the "KeywordID" element
     */
    public void setKeywordID(java.lang.String keywordID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEYWORDID$0);
            }
            target.setStringValue(keywordID);
        }
    }
    
    /**
     * Sets (as xml) the "KeywordID" element
     */
    public void xsetKeywordID(org.apache.xmlbeans.XmlString keywordID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORDID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEYWORDID$0);
            }
            target.set(keywordID);
        }
    }
    
    /**
     * Unsets the "KeywordID" element
     */
    public void unsetKeywordID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYWORDID$0, 0);
        }
    }
}
