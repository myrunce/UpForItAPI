package com.myron.UpForItApi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "challengesTBA")
public class ChallengesToBeAdded {
	@Id
	@GeneratedValue
	private Long id;
	
	@Size(min=5, max=255)
	private String challenge;
	
	public ChallengesToBeAdded() {
		
	}
	
	public ChallengesToBeAdded(String challenge) {
		this.challenge = challenge;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getChallenge() {
		return challenge;
	}

	public void setChallenge(String challenge) {
		this.challenge = challenge;
	}	
}
