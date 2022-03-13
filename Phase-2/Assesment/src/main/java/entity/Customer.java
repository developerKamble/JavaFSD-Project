package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustomerDetails")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CustomerId")
	private int id;
	private String Username;
	private String Password;
	private int age;
	private String CityOfResidence;
	
	public Customer(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCityOfResidence() {
		return CityOfResidence;
	}
	public void setCityOfResidence(String cityOfResidence) {
		CityOfResidence = cityOfResidence;
	}
	public Customer(int id, String username, String password, int age, String cityOfResidence) {
		super();
		this.id = id;
		Username = username;
		Password = password;
		this.age = age;
		CityOfResidence = cityOfResidence;
	}
	
	

}
