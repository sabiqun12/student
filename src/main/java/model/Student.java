package model;

import jakarta.persistence.*;

@Entity
@Table(name = "students")

public class Student {
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;

	@Column(name = "name")
	private String name;

	@Column(name = "AdmissionYear")
	private String AdmissionYear;

	@Column(name = "Address")
	private String Address;

	@Column(name = "Phone")
	private String Phone;

	@Column(name = "Email")
	private String Email;


	
	public Student() {

	}

	public Student(String name, String AdmissionYear, String Address, String Phone, String Email) {
		this.name = name;
		this.AdmissionYear = AdmissionYear;
		this.Address = Address;
		this.Phone = Phone;
		this.Email = Email;
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdmissionYear() {
		return AdmissionYear;
	}

	public void setAdmissionYear(String AdmissionYear) {
		this.AdmissionYear = AdmissionYear;
	}

	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String Address) {
		this.Address = Address;
	}
	
	public String getPhone() {
		return Phone;
	}
	
	public void setPhone(String Phone) {
		this.Phone = Phone;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", AdmissionYear=" + AdmissionYear + ", Address=" + Address + ", Email="  +Email+", Phone=" +Phone+"]";
	}

}
