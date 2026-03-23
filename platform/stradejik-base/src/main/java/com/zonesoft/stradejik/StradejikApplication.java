package com.zonesoft.stradejik;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.zonesoft.monitoring.actions.EmergingMktPriceUpdate;

@SpringBootApplication
public class StradejikApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StradejikApplication.class, args);
	}
	
    @Override
    public void run(String... args) throws Exception {
//    	EmergingMktPriceUpdate priceUpdate = new EmergingMktPriceUpdate();
//    	priceUpdate.execute();
    }
}
