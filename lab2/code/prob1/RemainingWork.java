package uml;

import java.util.Date;

public class RemainingWork {
	private int remainingWorkId;
	private Date date;
	private int remainingWorkingHour;
	private Feature feature;
	
	public RemainingWork() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getRemainingWorkId() {
		return remainingWorkId;
	}


	public Date getDate() {
		return date;
	}


	public int getRemainingWorkingHour() {
		return remainingWorkingHour;
	}


	public Feature getFeature() {
		return feature;
	}


	public RemainingWork(int remainingWorkId, Date date, int remainingWorkingHour, Feature feature) {
		super();
		this.remainingWorkId = remainingWorkId;
		this.date = date;
		this.remainingWorkingHour = remainingWorkingHour;
		this.feature = feature;
	}



	
	
}
