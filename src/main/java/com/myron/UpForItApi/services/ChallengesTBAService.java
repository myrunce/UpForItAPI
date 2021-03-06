package com.myron.UpForItApi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myron.UpForItApi.models.ChallengesToBeAdded;
import com.myron.UpForItApi.repositories.ChallengesTBARepository;

@Service
public class ChallengesTBAService {
	private ChallengesTBARepository challengeTBARepo;
	
	public ChallengesTBAService(ChallengesTBARepository challengeTBARepo) {
		this.challengeTBARepo = challengeTBARepo;
	}
	
	public void saveTBA(ChallengesToBeAdded challengeTBA) {
		challengeTBARepo.save(challengeTBA);
	}
	
	public List<ChallengesToBeAdded> allTBA(){
		return (List<ChallengesToBeAdded>) challengeTBARepo.findAll();
	}
	
	public void deleteTBA(Long id) {
		challengeTBARepo.delete(id);
	}
	
	public ChallengesToBeAdded findOne(Long id) {
		return challengeTBARepo.findOne(id);
	}
}
