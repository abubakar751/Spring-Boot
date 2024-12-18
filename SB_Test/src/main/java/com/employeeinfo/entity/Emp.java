package com.employeeinfo.entity;

import com.employeeinfo.constant.EmploymentStatus;
import com.employeeinfo.constant.EmploymentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Emp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String jobTitle;
    private String location;
    private String country;
    /*@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonDeserialize(using = LocalDateDeserializer.class)*/
    private LocalDate dateOfBirth;
    /*  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
      @JsonDeserialize(using = LocalDateDeserializer.class)*/
    private LocalDate dateOfJoining;
    @Enumerated(EnumType.STRING)
    private EmploymentType employmentType;
    @Enumerated(EnumType.STRING)
    private EmploymentStatus employmentStatus;
    @Lob
    private byte[] image;
    @Lob
    private byte[] idProof;

}
