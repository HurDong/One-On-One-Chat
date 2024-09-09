package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class TestService {

	@Autowired
	private TestRepository testRepository;

	@PostConstruct
	public void testMongoConnection() {
		// MongoDB에 데이터 저장
		TestDocument doc = new TestDocument("Test Name");
		testRepository.save(doc);

		// MongoDB에서 데이터 조회
		System.out.println("MongoDB에 저장된 데이터: " + testRepository.findAll());
	}
}

