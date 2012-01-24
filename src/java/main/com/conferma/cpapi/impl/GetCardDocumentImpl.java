/*
 * An XML document type.
 * Localname: GetCard
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.GetCardDocument
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * A document containing one GetCard(@http://cpapi.conferma.com/) element.
 *
 * This is a complex type.
 */
public class GetCardDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetCardDocument
{
    
    public GetCardDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCARD$0 = 
        new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GetCard");
    
    
    /**
     * Gets the "GetCard" element
     */
    public com.conferma.cpapi.GetCardDocument.GetCard getGetCard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetCardDocument.GetCard target = null;
            target = (com.conferma.cpapi.GetCardDocument.GetCard)get_store().find_element_user(GETCARD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCard" element
     */
    public void setGetCard(com.conferma.cpapi.GetCardDocument.GetCard getCard)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetCardDocument.GetCard target = null;
            target = (com.conferma.cpapi.GetCardDocument.GetCard)get_store().find_element_user(GETCARD$0, 0);
            if (target == null)
            {
                target = (com.conferma.cpapi.GetCardDocument.GetCard)get_store().add_element_user(GETCARD$0);
            }
            target.set(getCard);
        }
    }
    
    /**
     * Appends and returns a new empty "GetCard" element
     */
    public com.conferma.cpapi.GetCardDocument.GetCard addNewGetCard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.GetCardDocument.GetCard target = null;
            target = (com.conferma.cpapi.GetCardDocument.GetCard)get_store().add_element_user(GETCARD$0);
            return target;
        }
    }
    /**
     * An XML GetCard(@http://cpapi.conferma.com/).
     *
     * This is a complex type.
     */
    public static class GetCardImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.GetCardDocument.GetCard
    {
        
        public GetCardImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETCARDREQUEST$0 = 
            new javax.xml.namespace.QName("http://cpapi.conferma.com/", "GetCardRequest");
        
        
        /**
         * Gets the "GetCardRequest" element
         */
        public com.conferma.cpapi.GetCardRequest getGetCardRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.GetCardRequest target = null;
                target = (com.conferma.cpapi.GetCardRequest)get_store().find_element_user(GETCARDREQUEST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetCardRequest" element
         */
        public boolean isSetGetCardRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETCARDREQUEST$0) != 0;
            }
        }
        
        /**
         * Sets the "GetCardRequest" element
         */
        public void setGetCardRequest(com.conferma.cpapi.GetCardRequest getCardRequest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.GetCardRequest target = null;
                target = (com.conferma.cpapi.GetCardRequest)get_store().find_element_user(GETCARDREQUEST$0, 0);
                if (target == null)
                {
                    target = (com.conferma.cpapi.GetCardRequest)get_store().add_element_user(GETCARDREQUEST$0);
                }
                target.set(getCardRequest);
            }
        }
        
        /**
         * Appends and returns a new empty "GetCardRequest" element
         */
        public com.conferma.cpapi.GetCardRequest addNewGetCardRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.conferma.cpapi.GetCardRequest target = null;
                target = (com.conferma.cpapi.GetCardRequest)get_store().add_element_user(GETCARDREQUEST$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetCardRequest" element
         */
        public void unsetGetCardRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETCARDREQUEST$0, 0);
            }
        }
    }
}
