package resumeBuilder.model;

import java.util.List;

public class Experience {
	private String company;
	private String jobrole;
	private String experience;
	private String location;
	private List<String> responsibilites;

	public String getCompany() {
		return company;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Experience [company=" + company + ", jobrole=" + jobrole + ", experience=" + experience + ", location="
				+ location + ", responsibilites=" + responsibilites + "]";
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getJobrole() {
		return jobrole;
	}

	public void setJobrole(String jobrole) {
		this.jobrole = jobrole;
	}

	public String getPeriod() {
		return experience;
	}

	public void setPeriod(String period) {this.experience = experience;}

	public List<String> getResponsibilites() {
		return responsibilites;
	}

	public void setResponsibilites(List<String> responsibilites) {
		this.responsibilites = responsibilites;
	}

}