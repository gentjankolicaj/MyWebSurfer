package com.util;

/**
 * 
 * @author gentjan koliçaj
 *
 */
public class User {

	private int number;
	private String name;
	private String surname;
	private String email;
	private String password;
	private String city;
	private String country;
	private String zipCode;

	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param number
	 * @param name
	 * @param surname
	 * @param email
	 * @param password
	 * @param city
	 * @param country
	 * @param zipCode
	 * @param birthplace
	 * @param birthday
	 * @param payPalUrl
	 */
	public User(int number, String name, String surname, String email, String password, String city, String country,
			String zipCode) {
		super();
		this.number = number;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.city = city;
		this.country = country;
		this.zipCode = zipCode;

	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
