package com.saga.paymentservice.configuration;

import org.axonframework.eventsourcing.eventstore.EventStorageEngine;
import org.axonframework.eventsourcing.eventstore.inmemory.InMemoryEventStorageEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxonConfiguration {
	
	/*@Bean
	public EventStorageEngine eventStoreEngine() {
	    return new InMemoryEventStorageEngine();
	}*/

}
