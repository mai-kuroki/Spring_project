package com.example.demo.animalsAPI.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.animalsAPI.data.AnimalData;
import com.example.demo.animalsAPI.repository.AnimalRepository;

@Service
public class AnimalService {
	private final AnimalRepository animalRepository;

	public AnimalService(AnimalRepository animalRepository) {
		this.animalRepository = animalRepository;
	}

	public List<AnimalData> getAnimals() throws IOException {
		AnimalData[] animalsList = animalRepository.getAnimals();
		return Arrays.asList(animalsList);
	}

	public List<AnimalData> getAnimalDetail(int id) throws IOException {
		AnimalData[] animalDetail = animalRepository.getAnimalsDetail(id);
		return Arrays.asList(animalDetail);
	}
}