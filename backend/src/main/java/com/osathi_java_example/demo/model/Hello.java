package com.osathi_java_example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hello") 
public class Hello {
    
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"helloId\"")
    private Integer helloId; 

    @Column(name = "\"helloMessage\"")
    private String helloMessage; 

    // Add constructor to handle deserialization from number value
    public Hello(Integer id) {
        this.helloId = id;
    }

}
