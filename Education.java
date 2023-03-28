package resumeBuilder.model;

public class Education {

	private String name;
	private String degree;
	private String branch;
	private String period;
	private String location;
	private String percentage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Education [name=" + name + ", degree=" + branch + ", majors=" + branch + ", period=" + period
				+ ", location=" + location + ", percentage=" + percentage + "]";
	}

	public String getMajors() {
		return branch;
	}

	public void setMajors(String majors) {
		this.branch = branch;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGpa() {
		return percentage;
	}

	public void setGpa(String gpa) {
		this.percentage = percentage;
	}

}
