package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "testCollection")
@Getter
@Setter
@ToString
public class TestDocument {
	@Id
	private String id;
	private String name;

	public TestDocument(String name) {
		this.name = name;
	}
}
