
/**
 * Conferma_x0020_Payment_x0020_APIStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
        package net.assertis.conferma;

        

        /*
        *  Conferma_x0020_Payment_x0020_APIStub java implementation
        */

        
        public class Conferma_x0020_Payment_x0020_APIStub extends org.apache.axis2.client.Stub
        {
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("Conferma_x0020_Payment_x0020_API" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[14];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "getLocations"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "getDeployment"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "updateDeployment"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "sendSchedule"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "amendPayment"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "sendFax"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "getCard"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "updateDeploymentStatus"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[7]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "createPayment"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[8]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "createPayee"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[9]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "getMessageQueue"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[10]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "ping"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[11]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "resendPaymentAuthorisation"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[12]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "getPayeeMessageHistory"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[13]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         


    }

    /**
      *Constructor that takes in a configContext
      */

    public Conferma_x0020_Payment_x0020_APIStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public Conferma_x0020_Payment_x0020_APIStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
            //Set the soap version
            _serviceClient.getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
        
    
    }

    /**
     * Default Constructor
     */
    public Conferma_x0020_Payment_x0020_APIStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"https://test-papi.conferma.com/v1_3/Service.asmx" );
                
    }

    /**
     * Default Constructor
     */
    public Conferma_x0020_Payment_x0020_APIStub() throws org.apache.axis2.AxisFault {
        
                    this("https://test-papi.conferma.com/v1_3/Service.asmx" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public Conferma_x0020_Payment_x0020_APIStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * Retrieves locations of varied property types.
                     * @see net.assertis.conferma.Conferma_x0020_Payment_x0020_API#getLocations
                     * @param getLocations
                    
                     * @param confermaUserStateHeader
                    
                     */

                    

                            public  com.conferma.cpapi.GetLocationsResponseDocument getLocations(

                            com.conferma.cpapi.GetLocationsDocument getLocations,com.conferma.cpapi.ConfermaUserStateHeaderDocument confermaUserStateHeader)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("http://cpapi.conferma.com/GetLocations");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getLocations,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "getLocations")), new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "getLocations"));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (confermaUserStateHeader!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementconfermaUserStateHeader = toOM(confermaUserStateHeader, optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "getLocations")));
                                                    addHeader(omElementconfermaUserStateHeader,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.conferma.cpapi.GetLocationsResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.conferma.cpapi.GetLocationsResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetLocations"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetLocations"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetLocations"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Returns a previously deployed card based on DeploymentID.
                     * @see net.assertis.conferma.Conferma_x0020_Payment_x0020_API#getDeployment
                     * @param getDeployment
                     * @param confermaUserStateHeader0
                     */

                    

                            public  com.conferma.cpapi.GetDeploymentResponseDocument getDeployment(

                            com.conferma.cpapi.GetDeploymentDocument getDeployment,com.conferma.cpapi.ConfermaUserStateHeaderDocument confermaUserStateHeader0)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("http://cpapi.conferma.com/GetDeployment");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getDeployment,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "getDeployment")), new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "getDeployment"));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (confermaUserStateHeader0!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementconfermaUserStateHeader0 = toOM(confermaUserStateHeader0, optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "getDeployment")));
                                                    addHeader(omElementconfermaUserStateHeader0,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.conferma.cpapi.GetDeploymentResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.conferma.cpapi.GetDeploymentResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetDeployment"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetDeployment"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetDeployment"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Updates a deployment.
                     * @see net.assertis.conferma.Conferma_x0020_Payment_x0020_API#updateDeployment
                     * @param updateDeployment
                    
                     * @param confermaUserStateHeader1
                    
                     */

                    

                            public  com.conferma.cpapi.UpdateDeploymentResponseDocument updateDeployment(

                            com.conferma.cpapi.UpdateDeploymentDocument updateDeployment,com.conferma.cpapi.ConfermaUserStateHeaderDocument confermaUserStateHeader1)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("http://cpapi.conferma.com/UpdateDeployment");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    updateDeployment,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "updateDeployment")), new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "updateDeployment"));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (confermaUserStateHeader1!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementconfermaUserStateHeader1 = toOM(confermaUserStateHeader1, optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "updateDeployment")));
                                                    addHeader(omElementconfermaUserStateHeader1,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.conferma.cpapi.UpdateDeploymentResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.conferma.cpapi.UpdateDeploymentResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"UpdateDeployment"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"UpdateDeployment"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"UpdateDeployment"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Send a schedule of payments to a payee via fax and email
                     * @see net.assertis.conferma.Conferma_x0020_Payment_x0020_API#sendSchedule
                     * @param sendSchedule
                    
                     * @param confermaUserStateHeader2
                    
                     */

                    

                            public  com.conferma.cpapi.SendScheduleResponseDocument sendSchedule(

                            com.conferma.cpapi.SendScheduleDocument sendSchedule,com.conferma.cpapi.ConfermaUserStateHeaderDocument confermaUserStateHeader2)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("http://cpapi.conferma.com/SendSchedule");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    sendSchedule,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "sendSchedule")), new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "sendSchedule"));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (confermaUserStateHeader2!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementconfermaUserStateHeader2 = toOM(confermaUserStateHeader2, optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "sendSchedule")));
                                                    addHeader(omElementconfermaUserStateHeader2,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.conferma.cpapi.SendScheduleResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.conferma.cpapi.SendScheduleResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"SendSchedule"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"SendSchedule"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"SendSchedule"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Amend payment(s).
                     * @see net.assertis.conferma.Conferma_x0020_Payment_x0020_API#amendPayment
                     * @param amendPayment
                    
                     * @param confermaUserStateHeader3
                    
                     */

                    

                            public  com.conferma.cpapi.AmendPaymentResponseDocument amendPayment(

                            com.conferma.cpapi.AmendPaymentDocument amendPayment,com.conferma.cpapi.ConfermaUserStateHeaderDocument confermaUserStateHeader3)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("http://cpapi.conferma.com/AmendPayment");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    amendPayment,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "amendPayment")), new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "amendPayment"));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (confermaUserStateHeader3!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementconfermaUserStateHeader3 = toOM(confermaUserStateHeader3, optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "amendPayment")));
                                                    addHeader(omElementconfermaUserStateHeader3,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.conferma.cpapi.AmendPaymentResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.conferma.cpapi.AmendPaymentResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"AmendPayment"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"AmendPayment"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"AmendPayment"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Sends a fax for a DeploymentID.
                     * @see net.assertis.conferma.Conferma_x0020_Payment_x0020_API#sendFax
                     * @param sendFax
                    
                     * @param confermaUserStateHeader4
                    
                     */

                    

                            public  com.conferma.cpapi.SendFaxResponseDocument sendFax(

                            com.conferma.cpapi.SendFaxDocument sendFax,com.conferma.cpapi.ConfermaUserStateHeaderDocument confermaUserStateHeader4)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("http://cpapi.conferma.com/SendFax");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    sendFax,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "sendFax")), new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "sendFax"));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (confermaUserStateHeader4!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementconfermaUserStateHeader4 = toOM(confermaUserStateHeader4, optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "sendFax")));
                                                    addHeader(omElementconfermaUserStateHeader4,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.conferma.cpapi.SendFaxResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.conferma.cpapi.SendFaxResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"SendFax"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"SendFax"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"SendFax"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Returns a card, for use in your own processes.
                     * @see net.assertis.conferma.Conferma_x0020_Payment_x0020_API#getCard
                     * @param getCard
                     * @param confermaUserStateHeader5
                     */
                            public  com.conferma.cpapi.GetCardResponseDocument getCard(

                            com.conferma.cpapi.GetCardDocument getCard,com.conferma.cpapi.ConfermaUserStateHeaderDocument confermaUserStateHeader5)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("http://cpapi.conferma.com/GetCard");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getCard,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "getCard")), new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "getCard"));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (confermaUserStateHeader5!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementconfermaUserStateHeader5 = toOM(confermaUserStateHeader5, optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "getCard")));
                                                    addHeader(omElementconfermaUserStateHeader5,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.conferma.cpapi.GetCardResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.conferma.cpapi.GetCardResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetCard"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetCard"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetCard"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Updates a DeploymentStatus by DeploymentID.
                     * @see net.assertis.conferma.Conferma_x0020_Payment_x0020_API#updateDeploymentStatus
                     * @param updateDeploymentStatus
                    
                     * @param confermaUserStateHeader6
                    
                     */

                    

                            public  com.conferma.cpapi.UpdateDeploymentStatusResponseDocument updateDeploymentStatus(

                            com.conferma.cpapi.UpdateDeploymentStatusDocument updateDeploymentStatus,com.conferma.cpapi.ConfermaUserStateHeaderDocument confermaUserStateHeader6)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("http://cpapi.conferma.com/UpdateDeploymentStatus");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    updateDeploymentStatus,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "updateDeploymentStatus")), new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "updateDeploymentStatus"));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (confermaUserStateHeader6!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementconfermaUserStateHeader6 = toOM(confermaUserStateHeader6, optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "updateDeploymentStatus")));
                                                    addHeader(omElementconfermaUserStateHeader6,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.conferma.cpapi.UpdateDeploymentStatusResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.conferma.cpapi.UpdateDeploymentStatusResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"UpdateDeploymentStatus"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"UpdateDeploymentStatus"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"UpdateDeploymentStatus"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Creates a payment(s).
                     * @see net.assertis.conferma.Conferma_x0020_Payment_x0020_API#createPayment
                     * @param createPayment
                    
                     * @param confermaUserStateHeader7
                    
                     */

                    

                            public  com.conferma.cpapi.CreatePaymentResponseDocument createPayment(

                            com.conferma.cpapi.CreatePaymentDocument createPayment,com.conferma.cpapi.ConfermaUserStateHeaderDocument confermaUserStateHeader7)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
              _operationClient.getOptions().setAction("http://cpapi.conferma.com/CreatePayment");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    createPayment,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "createPayment")), new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "createPayment"));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (confermaUserStateHeader7!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementconfermaUserStateHeader7 = toOM(confermaUserStateHeader7, optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "createPayment")));
                                                    addHeader(omElementconfermaUserStateHeader7,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.conferma.cpapi.CreatePaymentResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.conferma.cpapi.CreatePaymentResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"CreatePayment"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"CreatePayment"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"CreatePayment"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Creates a payee.
                     * @see net.assertis.conferma.Conferma_x0020_Payment_x0020_API#createPayee
                     * @param createPayee
                    
                     * @param confermaUserStateHeader8
                    
                     */

                    

                            public  com.conferma.cpapi.CreatePayeeResponseDocument createPayee(

                            com.conferma.cpapi.CreatePayeeDocument createPayee,com.conferma.cpapi.ConfermaUserStateHeaderDocument confermaUserStateHeader8)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
              _operationClient.getOptions().setAction("http://cpapi.conferma.com/CreatePayee");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    createPayee,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "createPayee")), new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "createPayee"));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (confermaUserStateHeader8!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementconfermaUserStateHeader8 = toOM(confermaUserStateHeader8, optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "createPayee")));
                                                    addHeader(omElementconfermaUserStateHeader8,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.conferma.cpapi.CreatePayeeResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.conferma.cpapi.CreatePayeeResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"CreatePayee"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"CreatePayee"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"CreatePayee"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Gets message queue/history for a DeploymentID.
                     * @see net.assertis.conferma.Conferma_x0020_Payment_x0020_API#getMessageQueue
                     * @param getMessageQueue
                    
                     * @param confermaUserStateHeader9
                    
                     */

                    

                            public  com.conferma.cpapi.GetMessageQueueResponseDocument getMessageQueue(

                            com.conferma.cpapi.GetMessageQueueDocument getMessageQueue,com.conferma.cpapi.ConfermaUserStateHeaderDocument confermaUserStateHeader9)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
              _operationClient.getOptions().setAction("http://cpapi.conferma.com/GetMessageQueue");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getMessageQueue,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "getMessageQueue")), new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "getMessageQueue"));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (confermaUserStateHeader9!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementconfermaUserStateHeader9 = toOM(confermaUserStateHeader9, optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "getMessageQueue")));
                                                    addHeader(omElementconfermaUserStateHeader9,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.conferma.cpapi.GetMessageQueueResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.conferma.cpapi.GetMessageQueueResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetMessageQueue"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetMessageQueue"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetMessageQueue"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Simple connection test.
                     * @see net.assertis.conferma.Conferma_x0020_Payment_x0020_API#ping
                     * @param ping
                    
                     * @param confermaUserStateHeader10
                    
                     */

                    

                            public  com.conferma.cpapi.PingResponseDocument ping(

                            com.conferma.cpapi.PingDocument ping,com.conferma.cpapi.ConfermaUserStateHeaderDocument confermaUserStateHeader10)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
              _operationClient.getOptions().setAction("http://cpapi.conferma.com/Ping");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    ping,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "ping")), new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "ping"));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (confermaUserStateHeader10!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementconfermaUserStateHeader10 = toOM(confermaUserStateHeader10, optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "ping")));
                                                    addHeader(omElementconfermaUserStateHeader10,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.conferma.cpapi.PingResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.conferma.cpapi.PingResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"Ping"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"Ping"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"Ping"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Resend payment authorisation to payee via fax and email
                     * @see net.assertis.conferma.Conferma_x0020_Payment_x0020_API#resendPaymentAuthorisation
                     * @param resendPaymentAuthorisation
                    
                     * @param confermaUserStateHeader11
                    
                     */

                    

                            public  com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument resendPaymentAuthorisation(

                            com.conferma.cpapi.ResendPaymentAuthorisationDocument resendPaymentAuthorisation,com.conferma.cpapi.ConfermaUserStateHeaderDocument confermaUserStateHeader11)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
              _operationClient.getOptions().setAction("http://cpapi.conferma.com/ResendPaymentAuthorisation");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    resendPaymentAuthorisation,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "resendPaymentAuthorisation")), new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "resendPaymentAuthorisation"));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (confermaUserStateHeader11!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementconfermaUserStateHeader11 = toOM(confermaUserStateHeader11, optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "resendPaymentAuthorisation")));
                                                    addHeader(omElementconfermaUserStateHeader11,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"ResendPaymentAuthorisation"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"ResendPaymentAuthorisation"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"ResendPaymentAuthorisation"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * Get a list of confirmations to a payee
                     * @see net.assertis.conferma.Conferma_x0020_Payment_x0020_API#getPayeeMessageHistory
                     * @param getPayeeMessageHistory
                    
                     * @param confermaUserStateHeader12
                    
                     */

                    

                            public  com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument getPayeeMessageHistory(

                            com.conferma.cpapi.GetPayeeMessageHistoryDocument getPayeeMessageHistory,com.conferma.cpapi.ConfermaUserStateHeaderDocument confermaUserStateHeader12)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
              _operationClient.getOptions().setAction("http://cpapi.conferma.com/GetPayeeMessageHistory");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getPayeeMessageHistory,
                                                    optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "getPayeeMessageHistory")), new javax.xml.namespace.QName("http://cpapi.conferma.com/",
                                                    "getPayeeMessageHistory"));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (confermaUserStateHeader12!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementconfermaUserStateHeader12 = toOM(confermaUserStateHeader12, optimizeContent(new javax.xml.namespace.QName("http://cpapi.conferma.com/", "getPayeeMessageHistory")));
                                                    addHeader(omElementconfermaUserStateHeader12,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetPayeeMessageHistory"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetPayeeMessageHistory"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetPayeeMessageHistory"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //https://test-papi.conferma.com/v1_3/Service.asmx

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.GetLocationsDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.GetLocationsDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.GetLocationsResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.GetLocationsResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.ConfermaUserStateHeaderDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.ConfermaUserStateHeaderDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.GetDeploymentDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.GetDeploymentDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.GetDeploymentResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.GetDeploymentResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.UpdateDeploymentDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.UpdateDeploymentDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.UpdateDeploymentResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.UpdateDeploymentResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.SendScheduleDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.SendScheduleDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.SendScheduleResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.SendScheduleResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.AmendPaymentDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.AmendPaymentDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.AmendPaymentResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.AmendPaymentResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.SendFaxDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.SendFaxDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.SendFaxResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.SendFaxResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.GetCardDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.GetCardDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.GetCardResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.GetCardResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.UpdateDeploymentStatusDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.UpdateDeploymentStatusDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.UpdateDeploymentStatusResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.UpdateDeploymentStatusResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.CreatePaymentDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.CreatePaymentDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.CreatePaymentResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.CreatePaymentResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.CreatePayeeDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.CreatePayeeDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.CreatePayeeResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.CreatePayeeResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.GetMessageQueueDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.GetMessageQueueDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.GetMessageQueueResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.GetMessageQueueResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.PingDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.PingDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.PingResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.PingResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.ResendPaymentAuthorisationDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.ResendPaymentAuthorisationDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.GetPayeeMessageHistoryDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.GetPayeeMessageHistoryDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.conferma.cpapi.GetLocationsDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.conferma.cpapi.GetDeploymentDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.conferma.cpapi.UpdateDeploymentDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.conferma.cpapi.SendScheduleDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.conferma.cpapi.AmendPaymentDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.conferma.cpapi.SendFaxDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.conferma.cpapi.GetCardDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.conferma.cpapi.UpdateDeploymentStatusDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.conferma.cpapi.CreatePaymentDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.conferma.cpapi.CreatePayeeDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.conferma.cpapi.GetMessageQueueDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.conferma.cpapi.PingDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.conferma.cpapi.ResendPaymentAuthorisationDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.conferma.cpapi.GetPayeeMessageHistoryDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }

        public org.apache.xmlbeans.XmlObject fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{
        try{
        

            if (com.conferma.cpapi.GetLocationsDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.GetLocationsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.GetLocationsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.GetLocationsResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.GetLocationsResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.GetLocationsResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.GetDeploymentDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.GetDeploymentDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.GetDeploymentDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.GetDeploymentResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.GetDeploymentResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.GetDeploymentResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.UpdateDeploymentDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.UpdateDeploymentDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.UpdateDeploymentDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.UpdateDeploymentResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.UpdateDeploymentResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.UpdateDeploymentResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.SendScheduleDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.SendScheduleDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.SendScheduleDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.SendScheduleResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.SendScheduleResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.SendScheduleResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.AmendPaymentDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.AmendPaymentDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.AmendPaymentDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.AmendPaymentResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.AmendPaymentResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.AmendPaymentResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.SendFaxDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.SendFaxDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.SendFaxDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.SendFaxResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.SendFaxResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.SendFaxResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.GetCardDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.GetCardDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.GetCardDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.GetCardResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.GetCardResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.GetCardResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.UpdateDeploymentStatusDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.UpdateDeploymentStatusDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.UpdateDeploymentStatusDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.UpdateDeploymentStatusResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.UpdateDeploymentStatusResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.UpdateDeploymentStatusResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.CreatePaymentDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.CreatePaymentDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.CreatePaymentDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.CreatePaymentResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.CreatePaymentResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.CreatePaymentResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.CreatePayeeDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.CreatePayeeDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.CreatePayeeDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.CreatePayeeResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.CreatePayeeResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.CreatePayeeResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.GetMessageQueueDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.GetMessageQueueDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.GetMessageQueueDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.GetMessageQueueResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.GetMessageQueueResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.GetMessageQueueResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.PingDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.PingDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.PingDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.PingResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.PingResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.PingResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ResendPaymentAuthorisationDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ResendPaymentAuthorisationDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ResendPaymentAuthorisationDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ResendPaymentAuthorisationResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.GetPayeeMessageHistoryDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.GetPayeeMessageHistoryDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.GetPayeeMessageHistoryDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.GetPayeeMessageHistoryResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.conferma.cpapi.ConfermaUserStateHeaderDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.conferma.cpapi.ConfermaUserStateHeaderDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        
        }catch(java.lang.Exception e){
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
        }

        
        
   }
   