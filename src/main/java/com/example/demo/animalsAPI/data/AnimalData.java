package com.example.demo.animalsAPI.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AnimalData {
	@JsonProperty("id")
	private int id;

	@JsonProperty("name")
	private String name;

	@JsonProperty("japanese_name")
	private String japaneseName;

	@JsonProperty("cry")
	private String cry;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJapaneseName() {
		return japaneseName;
	}

	public void setJapaneseName(String japaneseName) {
		this.japaneseName = japaneseName;
	}

	public String getCry() {
		return cry;
	}

	public void setCry(String cry) {
		this.cry = cry;
	}
}
