package com.bankofapi.maverick;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemoController {
    @Autowired
    DemoRepository demoRepository;

    @PostMapping("/")
    public Fundraiser add(@RequestBody Fundraiser fundraiser){
        System.out.println("Adding fundraiser " + fundraiser);
        return demoRepository.add(fundraiser);
    }

    @GetMapping("/{id}")
    public Fundraiser findbyId(@PathVariable("id") Long id){
        System.out.println("Fundraiser by ID " + id);
        return demoRepository.findById(id);
    }

    @GetMapping("/")
    public List<Fundraiser> findAll(){
        System.out.println("Finding all Fundraisers ");
        return demoRepository.findAll();
    }
}
