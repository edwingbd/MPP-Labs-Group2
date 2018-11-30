package uml;

public class ProjectManager {
	
	
	private int projectManagerId;
	private String name;
	
	
	
	public ProjectManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjectManager(int projectManagerId, String name) {
		super();
		this.projectManagerId = projectManagerId;
		this.name = name;
	}

	public int getProjectManagerId() {
		return projectManagerId;
	}
	
	public String getName() {
		return name;
	}
	
	
}
