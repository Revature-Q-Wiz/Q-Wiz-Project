package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Data

@Getter

@Setter

@AllArgsConstructor

@NoArgsConstructor

@Entity

@Table(name = "user_info")

public class User_Info {
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int user_id;

	//@ColumnName (name = "first_name")
	private String first_name;
    
	//@ColumnName (name = "last_name")
	private String last_name;
	
	//@ColumnName (name = "email")
	private String email;

	//@ColumnName (name = "password")
	private String passWord;
}
