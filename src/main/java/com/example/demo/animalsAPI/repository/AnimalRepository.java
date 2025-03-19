package com.example.demo.animalsAPI.repository;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.demo.animalsAPI.data.AnimalData;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class AnimalRepository {

	public AnimalData[] getAnimals() throws IOException {

		String url = "https://wsaz0e6z45.execute-api.ap-northeast-1.amazonaws.com/prod/animalsAPI";

		RestTemplate rest = new RestTemplate();
		ResponseEntity<String> response = rest.getForEntity(url, String.class);
		String json = response.getBody();
		ObjectMapper mapper = new ObjectMapper();
		AnimalData[] animalsList = mapper.readValue(json, AnimalData[].class);

		return animalsList;
	}

	public AnimalData[] getAnimalsDetail(int id) throws IOException {

		String url = "https://wsaz0e6z45.execute-api.ap-northeast-1.amazonaws.com/prod/animalsAPI?id=" + id;

		RestTemplate rest = new RestTemplate();
		ResponseEntity<String> response = rest.getForEntity(url, String.class);
		String json = response.getBody();
		ObjectMapper mapper = new ObjectMapper();
		AnimalData[] animalsList = mapper.readValue(json, AnimalData[].class);

		return animalsList;
	}
}
