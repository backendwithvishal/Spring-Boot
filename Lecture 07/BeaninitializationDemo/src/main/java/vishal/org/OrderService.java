package vishal.org;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class OrderService {

    public OrderService() {
        System.out.println("OrderService created");
    }
}