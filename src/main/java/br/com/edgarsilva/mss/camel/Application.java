package br.com.edgarsilva.mss.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.wso2.carbon.mss.MicroservicesRunner;

/**
 * Application entry point.
 */
public class Application {
	public static void main(String[] args) throws Exception {
		
		new MicroservicesRunner(7888, 8888).deploy(new MSSCamelService()).start();
		//Start the REST Endpoints
		
		ConfigurableApplicationContext appContext = new ClassPathXmlApplicationContext("camel-context.xml");
		CamelContext camelContext = SpringCamelContext.springCamelContext(appContext, false);
		//Starting Camel Routes based on Spring
        camelContext.start();
		
		
	}
}
