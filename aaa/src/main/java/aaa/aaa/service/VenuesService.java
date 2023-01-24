package aaa.aaa.service;

import aaa.aaa.entity.Venues;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface VenuesService  {



     List<Venues> findByCategory();

}
