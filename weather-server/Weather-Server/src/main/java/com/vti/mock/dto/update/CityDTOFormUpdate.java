package com.vti.mock.dto.update;

public class CityDTOFormUpdate {

	private String name;

	private String description;

	private int countryID;

	private String image;

	public CityDTOFormUpdate() {
		// TODO Auto-generated constructor stub
	}

	public CityDTOFormUpdate(String name, String description, int countryID, String image) {
		this.name = name;
		this.description = description;
		this.countryID = countryID;
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getCountryID() {
		return countryID;
	}

	public String getImage() {
		return image;
	}

}
