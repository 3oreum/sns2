package com.resns.user.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
@Table(name = "user")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "loginId")
	private String loginId;
	
	private String password;
	
	private String name;
	
	private String email;
	
	@Column(name = "profileImageUrl")
	private String profileImageUrl;
	
	@UpdateTimestamp
	@Column(name = "createdAt", updatable = false)
	private Date createdAt;

	@UpdateTimestamp
	@Column(name = "updatedAt")
	private Date updatedAt;
}
