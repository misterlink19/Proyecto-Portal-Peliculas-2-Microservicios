package TrabajoFrameworksBackendYMicroservicios.PortalPeliculas_Cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PortalPeliculasClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortalPeliculasClienteApplication.class, args);
	}
	@Bean
	public RestTemplate template() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
}
