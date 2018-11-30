package uml;

public class Sprint {
    private int sprintId;
    private boolean isCompleted;
    private Release release;
   
    
	public Sprint() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Sprint(int sprintId, boolean isCompleted, Release release) {
		super();
		this.sprintId = sprintId;
		this.isCompleted = isCompleted;
		this.release = release;
	}
	
	public int getSprintId() {
		return sprintId;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public Release getRelease() {
		return release;
	}
    
    
}
