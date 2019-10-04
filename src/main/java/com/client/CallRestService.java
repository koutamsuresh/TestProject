package com.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.model.Person;

@Component
public class CallRestService implements CommandLineRunner{

	public static void callRestService() {

		RestTemplate restTemplate = new RestTemplate();
		Person person = restTemplate.getForObject("http://localhost:8080/persons/1", Person.class);
		System.out.println("Person's name is " + person.getFirstName());
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		CallRestService.callRestService();
		
	}

}
