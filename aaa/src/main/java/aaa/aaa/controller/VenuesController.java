package aaa.aaa.controller;

import aaa.aaa.entity.Venues;
import aaa.aaa.repository.VenuesRepository;
import aaa.aaa.service.VenuesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("get")
public class VenuesController {


    VenuesService venuesService;
    @Autowired
    public VenuesController(  VenuesService venuesService){
        this.venuesService = venuesService;

    }
    @GetMapping("get")
    public String  index(){
        return  "666";
    }

    @GetMapping
    public List<Venues> findByCategory(){
       return  venuesService.findByCategory();

    }



}
