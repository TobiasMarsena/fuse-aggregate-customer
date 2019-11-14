package org.mycompany;

import org.apache.camel.Exchange;

public class CustomerAggregator {

	public void process(Exchange exchange) {
		
		CustomerResponse temp = exchange.getProperty("customerResponse", CustomerResponse.class);
		
		System.out.println("properties:customerResponse:" + temp);
		
		CustomerResponse body = exchange.getIn().getBody(CustomerResponse.class);
		
		System.out.println("body:" + body);
		
		body.setId(temp.getId());
		body.setName(temp.getName());
		
		exchange.getOut().setBody(body);
		
		
	}
	
}
