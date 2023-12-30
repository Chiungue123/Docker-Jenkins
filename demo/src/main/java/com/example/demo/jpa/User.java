package com.example.demo.jpa;


import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="USER") // Make sure to use the right case for the table name in sql
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_USER")
    int idUser;
	
	@Column(name="USERNAME")
    String username;
	
	@Column(name="PASSWORD")
    String password;
	
	@Column(name="FIRST_NAME")
    String firstName;
	
	@Column(name="LAST_NAME")
    String lastName;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="BIRTH")
    Date birth;
    
    @Column(name="STATUS")
    String status;

    public User() {
    }
  
    public User(int idUser, String username, String password, String firstName, String lastName, Date birth,
			String status) {
		this.idUser = idUser;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birth = birth;
		this.status = status;
	}
}