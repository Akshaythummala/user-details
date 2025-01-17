package com.example.user_details_service.Model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Address {
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipcode;
}
