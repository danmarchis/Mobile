package tools;

public class EmployeeVacationModel {

	private String employeeName;
	private String startDate;
	private String endDate;
	private String building;
	private String department;
	private String type;
	private String status;
	public String getCancelled() {
		return cancelled;
	}
	public void setCancelled(String cancelled) {
		this.cancelled = cancelled;
	}
	private String rejected;
	private String cancelled;
	public String getRejected() {
		return rejected;
	}
	public void setRejected(String rejected) {
		this.rejected = rejected;
	}
	public String getApproved() {
		return approved;
	}
	public void setApproved(String approved) {
		this.approved = approved;
	}
	public String getSickLeave() {
		return sickLeave;
	}
	public void setSickLeave(String sickLeave) {
		this.sickLeave = sickLeave;
	}
	public String getPending() {
		return pending;
	}
	public void setPending(String pending) {
		this.pending = pending;
	}
	public String getWithdrown() {
		return withdrown;
	}
	public void setWithdrown(String withdrown) {
		this.withdrown = withdrown;
	}
	private String approved;
	private String sickLeave;
	private String pending;
	private String withdrown;
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
