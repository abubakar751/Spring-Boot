package com.test.enitit;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Self_Entity")
public class TestEntity {
    @Id
    private int id;
    private String name;
    private int age;


}
