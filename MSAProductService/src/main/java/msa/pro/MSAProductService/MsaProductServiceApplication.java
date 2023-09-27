package msa.pro.MSAProductService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsaProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaProductServiceApplication.class, args);
	}

}
