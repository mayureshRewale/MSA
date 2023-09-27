package msa.pro.MSAConfigService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MsaConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaConfigServiceApplication.class, args);
	}

}
