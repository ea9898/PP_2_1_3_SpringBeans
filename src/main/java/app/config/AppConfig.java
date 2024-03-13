package app.config;

import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean(name = "dog")
    @Scope(scopeName = "prototype")
    public Dog getCat() {
        Dog dog = new Dog();
        dog.setName("Nona");

        return dog;
    }

    @Bean(name = "timer")
    public Timer getTimer() {
        return new Timer();
    }
}
