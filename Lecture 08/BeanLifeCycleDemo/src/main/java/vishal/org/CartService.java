package vishal.org;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CartService /* implements InitializingBean */{

    private final Map<Integer, String> mp;

    public CartService() {
        mp = new HashMap<>();
        System.out.println("CartService constructor called");
    }

//    @Override
//    public void afterPropertiesSet() {
//        System.out.println("Initialization callback");
//
//        mp.put(1, "Vishal");
//        mp.put(2, "Aryan");
//    }

    public void addToCart() {
        System.out.println("Added to cart");
    }

    public String getValue(int key) {
        return mp.get(key);
    }
}