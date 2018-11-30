package lab2.prob1;

public class Project {
	
	
	private int projectId;
	private String name;
	private String description;
	private ProjectManager projectManager;
	
	
	public Project(int projectId, String name, String description, ProjectManager projectManager) {
		super();
		this.projectId = projectId;
		this.name = name;
		this.description = description;
		this.projectManager = projectManager;
	}


	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getProjectId() {
		return projectId;
	}


	public String getName() {
		return name;
	}


	public String getDescription() {
		return description;
	}


	public ProjectManager getProjectManager() {
		return projectManager;
	}
	
	
	
	
	
}