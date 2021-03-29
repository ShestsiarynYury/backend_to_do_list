package app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.SpringApplication;

@SpringBootApplication(
)
public class App {
    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }
}