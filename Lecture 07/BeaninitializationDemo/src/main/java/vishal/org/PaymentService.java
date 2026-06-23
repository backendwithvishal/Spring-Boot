package vishal.org;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class PaymentService {

    public PaymentService() {
        System.out.println("PaymentService created");
    }
}