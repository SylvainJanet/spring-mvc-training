package springcoreapp.o2ioc;

import java.io.Serializable;

public class Address implements Serializable {

	private static final long serialVersionUID = 8803161207040637706L;
	private String city;
	private String state;
	private String country;
	
	public Address() {
		super();
	}
	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
}
