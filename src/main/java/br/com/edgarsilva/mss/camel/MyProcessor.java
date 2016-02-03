package br.com.edgarsilva.mss.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import java.util.Date;

/**
 * My Processor Class
 */
public class MyProcessor implements Processor {

public void process(Exchange exchange) throws Exception {
   exchange.getIn().setBody(" ###### WSO2 TIME HeartBeat " + new Date());
   }
}
