package com.sb.jdbc.dao.Empl.Entity;

import jakarta.persistence.Entity;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class EmplEntity {
    private int id;
    private String name;
    private String address;
    private String email;
    private String phone;

    public EmplEntity() {

    }
    public EmplEntity(int id, String name, String address, String email, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;


    }
}
