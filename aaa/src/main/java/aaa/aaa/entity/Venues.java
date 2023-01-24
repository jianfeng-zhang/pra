package aaa.aaa.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

//@Entity
//@Table(name="venues")
@Data
public class Venues {

    private String id;

    private String lat;

    private String lon;

    private String category;

    private String name;

    private String created_on;

    private String geolocation_degrees;

}
