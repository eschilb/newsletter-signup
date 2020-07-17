package com.tts.PersonalSite.subscriber;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Subscriber {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String email;
	
	@Column
	@CreationTimestamp
	private Date signedUp;
	
	public Subscriber() {
		//empty constructor
	}
	
	public Subscriber(String firstName, String email, Date signedUp){
		this.firstName = firstName;
		this.email = email;
		this.signedUp = signedUp;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getSignedUp() {
		return signedUp;
	}

	public void setSignedUp(Date signedUp) {
		this.signedUp = signedUp;
	}

	@Override
	public String toString() {
		return "Subscriber [id=" + id + ", firstName=" + firstName + ", email=" + email + ", signedUp=" + signedUp
				+ "]";
	}
	
	
	
}
