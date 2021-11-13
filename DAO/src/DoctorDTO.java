
public class DoctorDTO {
	private String doctorName;
	private String specilization;
	private String hospitalName;
	private String gender;
	private Float salary;
	private Integer age;
	
	public DoctorDTO(){
		System.out.println("Invoked no argument constructor");
	}

	public DoctorDTO(String doctorName, String specilization, String hospitalName, String gender, Float salary,
			Integer age) {
		super();
		this.doctorName = doctorName;
		this.specilization = specilization;
		this.hospitalName = hospitalName;
		this.gender = gender;
		this.salary = salary;
		this.age = age;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpecilization() {
		return specilization;
	}

	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
