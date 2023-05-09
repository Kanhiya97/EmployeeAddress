package com.example.EmployeeAddress.employeeModen;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Id
    private int id;
   private String firstName;
   private  String lastName;

   //@OneToOne(cascade = CascadeType.ALL)
   @OneToOne(cascade = CascadeType.ALL, mappedBy = "emp", fetch = FetchType.LAZY,targetEntity =Address.class)
   @JoinColumn(name = "Add", referencedColumnName = "id")
   private Address add;


}
