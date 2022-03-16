package com.example.taskTwo.entities;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
@Data
public class User {

    @Id
    Long studentId;
    String studentName;
    String examName;
    Long examNote;
    Boolean isPassed;



}
