package vishal.org;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {


    @Bean
    public CartService getCartBean(){
        return new CartService();
    }
}