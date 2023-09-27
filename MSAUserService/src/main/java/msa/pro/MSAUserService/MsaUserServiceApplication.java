package msa.pro.MSAUserService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsaUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaUserServiceApplication.class, args);
	}

}
