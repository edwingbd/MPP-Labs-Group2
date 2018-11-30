package lab2.prob1;

import java.util.Date;

public class Release {
	private int releaseId;
	private String name;
	private Date releasedDate;
	private Project project;
	
	
	public Release() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Release(int releaseId, String name, Date releasedDate, Project project) {
		super();
		this.releaseId = releaseId;
		this.name = name;
		this.releasedDate = releasedDate;
		this.project = project;
	}


	public int getReleaseId() {
		return releaseId;
	}


	public String getName() {
		return name;
	}


	public Date getReleasedDate() {
		return releasedDate;
	}


	public Project getProject() {
		return project;
	}
	
	
	
}
