package edu.wctc.dj.week10.javacyclesjsf.service;

import edu.wctc.dj.week10.javacyclesjsf.model.ShoppingCart;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ShoppingCartService {

    private static final Map<String, ShoppingCart> contents = new HashMap<>();

    public ShoppingCart getContents(String sessionId) {
        ShoppingCart cart = contents.computeIfAbsent(sessionId,
                (String t) -> new ShoppingCart());
        
        return contents.get(sessionId);
    }

    public void update(String sessionId, ShoppingCart cart) {
        contents.put(sessionId, cart);
    }

    public void delete(String sessionId) {
        contents.remove(sessionId);
    }

}
