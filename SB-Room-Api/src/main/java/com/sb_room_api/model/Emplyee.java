package com.sb_room_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Emplyee  {
    @Id
    private int id;
    private String name;
    private String address;
    private int zipCode;
    private String city;

}
