package pro.sky.skyprospringbasket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringbasket.service.BasketService;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(path = "/order") // правильно?
public class BasketController {

    private final BasketService service;

    public BasketController(BasketService service) {
        this.service = service;
    }


    @GetMapping(path = "/add")
    public void add(@RequestParam Integer[] ids) {
        service.add(ids);
    }

    @GetMapping(path = "/get")
    public Collection<Integer> get() {
        return service.getAll();

    }
}
