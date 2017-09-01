package com.myron.UpForItApi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myron.UpForItApi.models.ChallengesToBeAdded;

@Repository
public interface ChallengesTBARepository extends CrudRepository<ChallengesToBeAdded, Long> {

}
