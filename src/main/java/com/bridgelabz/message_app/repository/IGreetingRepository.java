package com.bridgelabz.message_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.message_app.repository.models.GreetingData;

@Repository
public interface IGreetingRepository extends JpaRepository<GreetingData,Long>{
}
