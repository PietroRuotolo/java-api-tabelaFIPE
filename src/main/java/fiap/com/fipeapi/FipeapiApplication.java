package fiap.com.fipeapi;

import fiap.com.fipeapi.main.Main;
import fiap.com.fipeapi.service.FipeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FipeapiApplication{

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(FipeapiApplication.class, args);

		Main main = context.getBean(Main.class);
		main.menu();
	}
}
