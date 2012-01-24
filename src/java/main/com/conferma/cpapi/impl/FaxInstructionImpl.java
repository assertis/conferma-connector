/*
 * XML Type:  FaxInstruction
 * Namespace: http://cpapi.conferma.com/
 * Java type: com.conferma.cpapi.FaxInstruction
 *
 * Automatically generated - do not modify.
 */
package com.conferma.cpapi.impl;
/**
 * An XML FaxInstruction(@http://cpapi.conferma.com/).
 *
 * This is a complex type.
 */
public class FaxInstructionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.conferma.cpapi.FaxInstruction
{
    
    public FaxInstructionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPLOYMENTID$0 = 
        new javax.xml.namespace.QName("", "DeploymentID");
    private static final javax.xml.namespace.QName FAXTYPE$2 = 
        new javax.xml.namespace.QName("", "FaxType");
    private static final javax.xml.namespace.QName FAXNUMBEROPTION$4 = 
        new javax.xml.namespace.QName("", "FaxNumberOption");
    private static final javax.xml.namespace.QName DECLAREDNUMBER$6 = 
        new javax.xml.namespace.QName("", "DeclaredNumber");
    private static final javax.xml.namespace.QName FAILEDFAXEMAILADDRESS$8 = 
        new javax.xml.namespace.QName("", "FailedFaxEmailAddress");
    
    
    /**
     * Gets the "DeploymentID" attribute
     */
    public int getDeploymentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPLOYMENTID$0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeploymentID" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetDeploymentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(DEPLOYMENTID$0);
            return target;
        }
    }
    
    /**
     * Sets the "DeploymentID" attribute
     */
    public void setDeploymentID(int deploymentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPLOYMENTID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEPLOYMENTID$0);
            }
            target.setIntValue(deploymentID);
        }
    }
    
    /**
     * Sets (as xml) the "DeploymentID" attribute
     */
    public void xsetDeploymentID(org.apache.xmlbeans.XmlInt deploymentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(DEPLOYMENTID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(DEPLOYMENTID$0);
            }
            target.set(deploymentID);
        }
    }
    
    /**
     * Gets the "FaxType" attribute
     */
    public com.conferma.cpapi.FaxType.Enum getFaxType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAXTYPE$2);
            if (target == null)
            {
                return null;
            }
            return (com.conferma.cpapi.FaxType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "FaxType" attribute
     */
    public com.conferma.cpapi.FaxType xgetFaxType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.FaxType target = null;
            target = (com.conferma.cpapi.FaxType)get_store().find_attribute_user(FAXTYPE$2);
            return target;
        }
    }
    
    /**
     * Sets the "FaxType" attribute
     */
    public void setFaxType(com.conferma.cpapi.FaxType.Enum faxType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAXTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAXTYPE$2);
            }
            target.setEnumValue(faxType);
        }
    }
    
    /**
     * Sets (as xml) the "FaxType" attribute
     */
    public void xsetFaxType(com.conferma.cpapi.FaxType faxType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.FaxType target = null;
            target = (com.conferma.cpapi.FaxType)get_store().find_attribute_user(FAXTYPE$2);
            if (target == null)
            {
                target = (com.conferma.cpapi.FaxType)get_store().add_attribute_user(FAXTYPE$2);
            }
            target.set(faxType);
        }
    }
    
    /**
     * Gets the "FaxNumberOption" attribute
     */
    public com.conferma.cpapi.FaxNumberOption.Enum getFaxNumberOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAXNUMBEROPTION$4);
            if (target == null)
            {
                return null;
            }
            return (com.conferma.cpapi.FaxNumberOption.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "FaxNumberOption" attribute
     */
    public com.conferma.cpapi.FaxNumberOption xgetFaxNumberOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.FaxNumberOption target = null;
            target = (com.conferma.cpapi.FaxNumberOption)get_store().find_attribute_user(FAXNUMBEROPTION$4);
            return target;
        }
    }
    
    /**
     * Sets the "FaxNumberOption" attribute
     */
    public void setFaxNumberOption(com.conferma.cpapi.FaxNumberOption.Enum faxNumberOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAXNUMBEROPTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAXNUMBEROPTION$4);
            }
            target.setEnumValue(faxNumberOption);
        }
    }
    
    /**
     * Sets (as xml) the "FaxNumberOption" attribute
     */
    public void xsetFaxNumberOption(com.conferma.cpapi.FaxNumberOption faxNumberOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.conferma.cpapi.FaxNumberOption target = null;
            target = (com.conferma.cpapi.FaxNumberOption)get_store().find_attribute_user(FAXNUMBEROPTION$4);
            if (target == null)
            {
                target = (com.conferma.cpapi.FaxNumberOption)get_store().add_attribute_user(FAXNUMBEROPTION$4);
            }
            target.set(faxNumberOption);
        }
    }
    
    /**
     * Gets the "DeclaredNumber" attribute
     */
    public java.lang.String getDeclaredNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLAREDNUMBER$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeclaredNumber" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDeclaredNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DECLAREDNUMBER$6);
            return target;
        }
    }
    
    /**
     * True if has "DeclaredNumber" attribute
     */
    public boolean isSetDeclaredNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DECLAREDNUMBER$6) != null;
        }
    }
    
    /**
     * Sets the "DeclaredNumber" attribute
     */
    public void setDeclaredNumber(java.lang.String declaredNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLAREDNUMBER$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECLAREDNUMBER$6);
            }
            target.setStringValue(declaredNumber);
        }
    }
    
    /**
     * Sets (as xml) the "DeclaredNumber" attribute
     */
    public void xsetDeclaredNumber(org.apache.xmlbeans.XmlString declaredNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DECLAREDNUMBER$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DECLAREDNUMBER$6);
            }
            target.set(declaredNumber);
        }
    }
    
    /**
     * Unsets the "DeclaredNumber" attribute
     */
    public void unsetDeclaredNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DECLAREDNUMBER$6);
        }
    }
    
    /**
     * Gets the "FailedFaxEmailAddress" attribute
     */
    public java.lang.String getFailedFaxEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILEDFAXEMAILADDRESS$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FailedFaxEmailAddress" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFailedFaxEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILEDFAXEMAILADDRESS$8);
            return target;
        }
    }
    
    /**
     * True if has "FailedFaxEmailAddress" attribute
     */
    public boolean isSetFailedFaxEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FAILEDFAXEMAILADDRESS$8) != null;
        }
    }
    
    /**
     * Sets the "FailedFaxEmailAddress" attribute
     */
    public void setFailedFaxEmailAddress(java.lang.String failedFaxEmailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILEDFAXEMAILADDRESS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILEDFAXEMAILADDRESS$8);
            }
            target.setStringValue(failedFaxEmailAddress);
        }
    }
    
    /**
     * Sets (as xml) the "FailedFaxEmailAddress" attribute
     */
    public void xsetFailedFaxEmailAddress(org.apache.xmlbeans.XmlString failedFaxEmailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILEDFAXEMAILADDRESS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FAILEDFAXEMAILADDRESS$8);
            }
            target.set(failedFaxEmailAddress);
        }
    }
    
    /**
     * Unsets the "FailedFaxEmailAddress" attribute
     */
    public void unsetFailedFaxEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FAILEDFAXEMAILADDRESS$8);
        }
    }
}
