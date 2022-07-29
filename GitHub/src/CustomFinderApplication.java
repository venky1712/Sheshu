package cfm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages="cfm")
public class CustomFinderApplication {

	public static void main(String[] args) {
		
		System.out.println("------------------------");
		SpringApplication.run(CustomFinderApplication.class, args);
	}

}
