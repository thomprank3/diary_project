package com.cptayc.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity @Table(name = "Users")
public class User implements Serializable{
	String username;
	String password;
	String fullName;
	String facebook;
	String email;
	String image;
	Date create_at;
	Date update_at;
}
