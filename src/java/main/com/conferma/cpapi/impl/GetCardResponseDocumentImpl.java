/*
 * An XML document type.
 * Localname: GetCardResponse
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.GetCardResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one GetCardResponse(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class GetCardResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetCardResponseDocument
{
    
    public GetCardResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCARDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GetCardResponse");
    
    
    /**
     * Gets the "GetCardResponse" element
     */
    public com.conferma.cpapi.GetCardResponseDocument.GetCardResponse getGetCardResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetCardResponseDocument.GetCardResponse target = null;
            target = (com.conferma.cpapi.GetCardResponseDocument.GetCardResponse)get_store().find_element_user(GETCARDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCardResponse" element
     */
    public void setGetCardResponse(com.conferma.cpapi.GetCardResponseDocument.GetCardResponse getCardResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetCardResponseDocument.GetCardResponse target = null;
            target = (com.conferma.cpapi.GetCardResponseDocument.GetCardResponse)get_store().find_element_user(GETCARDRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.GetCardResponseDocument.GetCardResponse)get_store().add_element_user(GETCARDRESPONSE$0);
            }
            target.set(getCardResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetCardResponse" element
     */
    public com.conferma.cpapi.GetCardResponseDocument.GetCardResponse addNewGetCardResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetCardResponseDocument.GetCardResponse target = null;
            target = (com.conferma.cpapi.GetCardResponseDocument.GetCardResponse)get_store().add_element_user(GETCARDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetCardResponse(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class GetCardResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetCardResponseDocument.GetCardResponse
    {
        
        public GetCardResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETCARDRESULT$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GetCardResult");
        
        
        /**
         * Gets the "GetCardResult" element
         */
        public com.conferma.cpapi.GetCardResponse getGetCardResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.GetCardResponse target = null;
                target = (com.conferma.cpapi.GetCardResponse)get_store().find_element_user(GETCARDRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetCardResult" element
         */
        public boolean isSetGetCardResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETCARDRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetCardResult" element
         */
        public void setGetCardResult(com.conferma.cpapi.GetCardResponse getCardResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.GetCardResponse target = null;
                target = (com.conferma.cpapi.GetCardResponse)get_store().find_element_user(GETCARDRESULT$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.GetCardResponse)get_store().add_element_user(GETCARDRESULT$0);
                }
                target.set(getCardResult);
            }
        }
        
        /**
         * Appends and returns a new empty "GetCardResult" element
         */
        public com.conferma.cpapi.GetCardResponse addNewGetCardResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.GetCardResponse target = null;
                target = (com.conferma.cpapi.GetCardResponse)get_store().add_element_user(GETCARDRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetCardResult" element
         */
        public void unsetGetCardResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETCARDRESULT$0, 0);
            }
        }
    }
}
