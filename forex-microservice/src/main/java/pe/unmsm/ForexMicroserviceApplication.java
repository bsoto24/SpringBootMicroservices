package pe.unmsm;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "pe.unmsm" })
@EnableJpaRepositories(basePackages = { "pe.unmsm" })
@EntityScan(basePackages = { "pe.unmsm" })
public class ForexMicroserviceApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ForexMicroserviceApplication.class, args);
	
	}
	
}
