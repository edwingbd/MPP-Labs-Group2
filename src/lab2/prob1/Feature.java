package lab2.prob1;

import java.util.Date;

public class Feature {
	private int featureId;
	private String name;
	private String description;
	private Date dueDate;
	private int estimatedWorkingHour;
	private Sprint sprint;
	private Developer developer;
	
	
	
	
	public Feature() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Feature(int featureId, String name, String description, Date dueDate, int estimatedWorkingHour,
			Sprint sprint, Developer developer) {
		super();
		this.featureId = featureId;
		this.name = name;
		this.description = description;
		this.dueDate = dueDate;
		this.estimatedWorkingHour = estimatedWorkingHour;
		this.sprint = sprint;
		this.developer = developer;
	}




	public int getFeatureId() {
		return featureId;
	}




	public String getName() {
		return name;
	}




	public String getDescription() {
		return description;
	}




	public Date getDueDate() {
		return dueDate;
	}




	public int getEstimatedWorkingHour() {
		return estimatedWorkingHour;
	}




	public Sprint getSprint() {
		return sprint;
	}




	public Developer getDeveloper() {
		return developer;
	}
	
	
	
	
	
}
