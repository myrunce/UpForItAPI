package com.myron.UpForItApi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myron.UpForItApi.models.Challenge;
import com.myron.UpForItApi.models.ChallengesToBeAdded;
import com.myron.UpForItApi.repositories.ChallengeRepository;

@Service
public class ChallengeService {
	private ChallengeRepository challengeRepository;
	
	public ChallengeService(ChallengeRepository challengeRepository) {
		this.challengeRepository = challengeRepository;
	}
	
	public void saveTbaAsChallenge(ChallengesToBeAdded challengetba) {
		Challenge challenge = new Challenge(challengetba.getChallenge());
		challengeRepository.save(challenge);
	}
	
	public void saveChallenge(Challenge challenge) {
		challengeRepository.save(challenge);
	}
	
	public List<Challenge> allChallenges(){
		return (List<Challenge>) challengeRepository.findAll();
	}
	
	public void deleteChallengeById(Long id) {
		challengeRepository.delete(id);
	}
	
	public Challenge findOne(Long id) {
		return challengeRepository.findOne(id);
	}
}
