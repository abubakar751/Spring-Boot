package com.student_api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "Student")
public class StudentEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)

    private int id;
    @NotBlank(message = "name may not be null")
    private String name;
    @Min(value = 1, message = "roll number must be greater  than 0")
    private int  rollNumber;
    @NotBlank(message = "college name required ")
    private String collegeName;

}
