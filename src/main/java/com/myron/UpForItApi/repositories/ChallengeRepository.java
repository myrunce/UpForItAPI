package com.myron.UpForItApi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myron.UpForItApi.models.Challenge;

@Repository
public interface ChallengeRepository extends CrudRepository<Challenge, Long> {

}
