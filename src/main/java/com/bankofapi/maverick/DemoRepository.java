package com.bankofapi.maverick;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public class DemoRepository {

    private List<Fundraiser> demoRepo = new ArrayList<>();

    public Fundraiser findById(Long id){
        return demoRepo.stream().filter(a -> (a.getId() == id)).findFirst().orElseThrow();
    }

    public List<Fundraiser> findAll() {
        return demoRepo;
    }

    public Fundraiser add(Fundraiser fundraiser){
        fundraiser.setId((long) (demoRepo.size() + 1));
        demoRepo.add(fundraiser);
        return fundraiser;
    }
}
