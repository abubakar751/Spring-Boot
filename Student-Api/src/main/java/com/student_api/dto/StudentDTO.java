package com.student_api.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentDTO {
    private int id;
    private String name;
    private int  rollNumber;
    private String collegeName;

 }
