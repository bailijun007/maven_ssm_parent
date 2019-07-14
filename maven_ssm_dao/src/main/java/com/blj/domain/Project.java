package com.blj.domain;

import java.util.Date;

public class Project {
	private String projectName, projectCategory, isEvaluated, prochaseMode, address, url, dealCompany, linkMan;
	private String mobliePhone, createBy, department, updateBy, registerAddress, professional;
	private long id, departmentId, committee;
	private int professorNum;
	private double budget, settlePrice;
	private Date announceDate, openDate, dealDate, createDate, updateDate, registerTime;
	private String projectFilePath;
	private long status;

	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectCategory() {
		return projectCategory;
	}

	public void setProjectCategory(String projectCategory) {
		this.projectCategory = projectCategory;
	}

	public String getIsEvaluated() {
		return isEvaluated;
	}

	public void setIsEvaluated(String isEvaluated) {
		this.isEvaluated = isEvaluated;
	}

	public String getProchaseMode() {
		return prochaseMode;
	}

	public void setProchaseMode(String prochaseMode) {
		this.prochaseMode = prochaseMode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDealCompany() {
		return dealCompany;
	}

	public void setDealCompany(String dealCompany) {
		this.dealCompany = dealCompany;
	}

	public String getLinkMan() {
		return linkMan;
	}

	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}

	public String getMobliePhone() {
		return mobliePhone;
	}

	public void setMobliePhone(String mobliePhone) {
		this.mobliePhone = mobliePhone;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getRegisterAddress() {
		return registerAddress;
	}

	public void setRegisterAddress(String registerAddress) {
		this.registerAddress = registerAddress;
	}

	public String getProfessional() {
		return professional;
	}

	public void setProfessional(String professional) {
		this.professional = professional;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	public long getCommittee() {
		return committee;
	}

	public void setCommittee(long committee) {
		this.committee = committee;
	}

	public int getProfessorNum() {
		return professorNum;
	}

	public void setProfessorNum(int professorNum) {
		this.professorNum = professorNum;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public double getSettlePrice() {
		return settlePrice;
	}

	public void setSettlePrice(double settlePrice) {
		this.settlePrice = settlePrice;
	}

	public Date getAnnounceDate() {
		return announceDate;
	}

	public void setAnnounceDate(Date announceDate) {
		this.announceDate = announceDate;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public Date getDealDate() {
		return dealDate;
	}

	public void setDealDate(Date dealDate) {
		this.dealDate = dealDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public String getProjectFilePath() {
		return projectFilePath;
	}

	public void setProjectFilePath(String projectFilePath) {
		this.projectFilePath = projectFilePath;
	}

	public Project(String projectName, String projectCategory, String isEvaluated, String prochaseMode, String address,
			String url, String dealCompany, String linkMan, String mobliePhone, String createBy, String department,
			String updateBy, String registerAddress, String professional, long id, long departmentId, long committee,
			int professorNum, double budget, double settlePrice, Date announceDate, Date openDate, Date dealDate,
			Date createDate, Date updateDate, Date registerTime, String projectFilePath) {
		super();
		this.projectName = projectName;
		this.projectCategory = projectCategory;
		this.isEvaluated = isEvaluated;
		this.prochaseMode = prochaseMode;
		this.address = address;
		this.url = url;
		this.dealCompany = dealCompany;
		this.linkMan = linkMan;
		this.mobliePhone = mobliePhone;
		this.createBy = createBy;
		this.department = department;
		this.updateBy = updateBy;
		this.registerAddress = registerAddress;
		this.professional = professional;
		this.id = id;
		this.departmentId = departmentId;
		this.committee = committee;
		this.professorNum = professorNum;
		this.budget = budget;
		this.settlePrice = settlePrice;
		this.announceDate = announceDate;
		this.openDate = openDate;
		this.dealDate = dealDate;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.registerTime = registerTime;
		this.projectFilePath = projectFilePath;

	}

	@Override
	public String toString() {
		return "Project{" +
				"projectName='" + projectName + '\'' +
				", projectCategory='" + projectCategory + '\'' +
				", isEvaluated='" + isEvaluated + '\'' +
				", prochaseMode='" + prochaseMode + '\'' +
				", address='" + address + '\'' +
				", url='" + url + '\'' +
				", dealCompany='" + dealCompany + '\'' +
				", linkMan='" + linkMan + '\'' +
				", mobliePhone='" + mobliePhone + '\'' +
				", createBy='" + createBy + '\'' +
				", department='" + department + '\'' +
				", updateBy='" + updateBy + '\'' +
				", registerAddress='" + registerAddress + '\'' +
				", professional='" + professional + '\'' +
				", id=" + id +
				", departmentId=" + departmentId +
				", committee=" + committee +
				", professorNum=" + professorNum +
				", budget=" + budget +
				", settlePrice=" + settlePrice +
				", announceDate=" + announceDate +
				", openDate=" + openDate +
				", dealDate=" + dealDate +
				", createDate=" + createDate +
				", updateDate=" + updateDate +
				", registerTime=" + registerTime +
				", projectFilePath='" + projectFilePath + '\'' +
				", status=" + status +
				'}';
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

}
