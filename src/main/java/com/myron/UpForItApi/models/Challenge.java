package com.myron.UpForItApi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "challenges")
public class Challenge {
	@Id
	@GeneratedValue
	private Long id;
	
	@JsonProperty("challenge")
	@Size(min=5, max=255)
	private String theChallenge;
	
	public Challenge() {
		
	}
	
	public Challenge(String challenge) {
		this.theChallenge = challenge;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTheChallenge() {
		return theChallenge;
	}

	public void setTheChallenge(String theChallenge) {
		this.theChallenge = theChallenge;
	}
	
	
}
