
package com.oracle.xmlns.apps.hcm.employment.core.workerservicev2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "WorkerService", targetNamespace = "http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", wsdlLocation = "https://hdes-test.hcm.us2.oraclecloud.com/hcmEmploymentCoreWorkerV2/WorkerService?WSDL")
public class WorkerService_Service
    extends Service
{

    private final static URL WORKERSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.WorkerService_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.oracle.xmlns.apps.hcm.employment.core.workerservicev2.WorkerService_Service.class.getResource(".");
            url = new URL(baseUrl, "https://hdes-test.hcm.us2.oraclecloud.com/hcmEmploymentCoreWorkerV2/WorkerService?WSDL");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'https://hdes-test.hcm.us2.oraclecloud.com/hcmEmploymentCoreWorkerV2/WorkerService?WSDL', retrying as a local file");
            logger.warning(e.getMessage());
        }
        WORKERSERVICE_WSDL_LOCATION = url;
    }

    public WorkerService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WorkerService_Service() {
        super(WORKERSERVICE_WSDL_LOCATION, new QName("http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", "WorkerService"));
    }

    /**
     * 
     * @return
     *     returns WorkerService
     */
    @WebEndpoint(name = "WorkerServiceSoapHttpPort")
    public WorkerService getWorkerServiceSoapHttpPort() {
        return super.getPort(new QName("http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", "WorkerServiceSoapHttpPort"), WorkerService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WorkerService
     */
    @WebEndpoint(name = "WorkerServiceSoapHttpPort")
    public WorkerService getWorkerServiceSoapHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/apps/hcm/employment/core/workerServiceV2/", "WorkerServiceSoapHttpPort"), WorkerService.class, features);
    }

}
