package pro.sky.skyprospringbasket.service;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Service
public class BasketService {
    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public void add (Integer... ids){
        basket.add(ids);
    }

    public Collection<Integer> getAll(){
        return basket.getAll();
    }

}
