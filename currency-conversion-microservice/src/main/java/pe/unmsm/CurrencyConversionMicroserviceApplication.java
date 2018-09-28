package pe.unmsm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication(scanBasePackages= {"pe.unmsm"})
@EnableFeignClients(basePackages= {"pe.unmsm"})
public class CurrencyConversionMicroserviceApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(CurrencyConversionMicroserviceApplication.class, args);
		
	}
}
