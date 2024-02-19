package pro.sky.skyprospringbasket.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;


@Component
@SessionScope
public class Basket {
    private final Set<Integer> items = new HashSet<>();
    public void add (Integer... ids){
        Collections.addAll(items, ids);
    }
    public Collection<Integer> getAll(){
        return Collections.unmodifiableSet(items);
    }
}
