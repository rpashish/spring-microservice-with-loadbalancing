package com.ashish.sprint.tutorials.forex.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashish.sprint.tutorials.forex.entity.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{
	ExchangeValue findByFromAndTo(String from, String to);

}
