package com.aqgy.firstweb.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
@Getter
@Setter
@ToString
@Entity
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer age;
    private Date birth;
    private String lastName;
    @ManyToOne(fetch = FetchType.LAZY)
    private Department department;
}
