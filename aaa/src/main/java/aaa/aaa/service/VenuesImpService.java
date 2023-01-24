package aaa.aaa.service;

import aaa.aaa.entity.Page;
import aaa.aaa.entity.Venues;
import aaa.aaa.repository.VenuesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class VenuesImpService  implements  VenuesService{
    @Value("${url}")
    private  String url ;



   private  final RestTemplate restTemplate;




    @Autowired
    public VenuesImpService( RestTemplate restTemplate){


        this.restTemplate = restTemplate;
    }





    public List<Venues> findByCategory() {
        Page page = restTemplate.getForObject(url,Page.class);
        System.out.println(page);

        return null;
    }
}
