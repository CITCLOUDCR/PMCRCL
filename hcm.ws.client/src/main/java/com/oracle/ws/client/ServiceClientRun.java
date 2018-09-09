package com.oracle.ws.client;
import org.apache.log4j.Logger;


public class ServiceClientRun {
	
	private volatile boolean stopped = false;
	private static ServiceClientRun serviceInstance = new ServiceClientRun();
	private static final Logger LOGGER = Logger.getLogger(ServiceClientRun.class);
	
    public static void main(String args[]) {
    	
        String cmd = "start";
        if(args.length > 0) {
           cmd = args[0];
        }
        if("start".equals(cmd)) {
           serviceInstance.start();
        }
        else {
           serviceInstance.stop();
        }

    }
    
    public void start() {

        stopped = false;   
        			
		CreateWorkerClient client = new CreateWorkerClient();	
              
    	LOGGER.info("INFO :: Iniciando aplicacion  web service worker hcm.....");
		
		
        while(!stopped) {
  
            synchronized(this) {
            	    	
            	try {            		
            		client.createWorker();
            		
                               		
				} catch (Exception e) {
					LOGGER.error("Error:\n",e);
				}
               
            }
        }
        
        LOGGER.info("Deteniendo Servicio...");
       
    }
	
    public void stop() {
        stopped = true;
        synchronized(this){
            this.notify();          
            LOGGER.info("Servicio Detenido....");
            Runtime.getRuntime().exit(0);
        }
    }
	
}
