package com.blj.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Professor implements Serializable {
	// public static final int PAGE_SIZE=2;
	private long id;
private List<Workhistory> list;
	private int workDate, lostNum;
	private Date birthday, modifyDate, createDate;
	private String professorName, gender, identityNumber, workStatus, institution, education, major, employCompany,
			administrative, technicalPost, phone, mobliePhone, address, projectCategory, createBy, modifyBy;


	/*
	 * public String getProjectName() { return projectName; } public void
	 * setProjectName(String projectName) { this.projectName = projectName; }
	 */
	// public Professor(String professorName, String mobliePhone, String
	// employCompany, String administrative, int id) {
	//
	// this.professorName = professorName;
	// this.employCompany = employCompany;
	// this.administrative = administrative;
	// this.mobliePhone = mobliePhone;
	// this.id = id;
	// }

	// public Professor(int workDate, int lostNum, Date birthday, String
	// professorName, String gender,
	// String identityNumber, String workStatus, String institution, String
	// education, String major,
	// String employCompany, String administrative, String technicalPost, String
	// mobliePhone,
	// String projectCategory) {
	// super();
	// this.workDate = workDate;
	// this.lostNum = lostNum;
	// this.birthday = birthday;
	// this.professorName = professorName;
	// this.gender = gender;
	// this.identityNumber = identityNumber;
	// this.workStatus = workStatus;
	// this.institution = institution;
	// this.education = education;
	// this.major = major;
	// this.employCompany = employCompany;
	// this.administrative = administrative;
	// this.technicalPost = technicalPost;
	// this.mobliePhone = mobliePhone;
	// this.projectCategory = projectCategory;
	// }

	// public Professor(String professorName, String mobliePhone, String
	// employCompany, String administrative) {
	//
	// this.professorName = professorName;
	// this.employCompany = employCompany;
	// this.administrative = administrative;
	// this.mobliePhone = mobliePhone;
	//
	// }

	public Professor() {

	}

	// public Professor(String professorName, String gender, Date birthday,
	// String identityNumber, String workStatus,
	// String institution, String education, String major, String employCompany,
	// String administrative,
	// String technicalPost, String phone, String mobliePhone, String address,
	// String projectCategory,
	// String createBy, Date createDate, String modifyBy, Date modifyDate, int
	// workdate, int lostNum, int id) {
	//
	// this.professorName = professorName;
	// this.gender = gender;
	// this.identityNumber = identityNumber;
	// this.workStatus = workStatus;
	// this.institution = institution;
	// this.education = education;
	// this.major = major;
	// this.employCompany = employCompany;
	// this.administrative = administrative;
	// this.technicalPost = technicalPost;
	// this.phone = phone;
	// this.mobliePhone = mobliePhone;
	// this.address = address;
	// this.projectCategory = projectCategory;
	// this.createBy = createBy;
	// this.modifyBy = modifyBy;
	// this.id = id;
	// this.workDate = workdate;
	// this.lostNum = lostNum;
	// this.birthday = birthday;
	// this.modifyDate = modifyDate;
	// this.createDate = createDate;
	// }

	public Professor(int workDate, Date birthday, String professorName, String gender, String identityNumber,
			String workStatus, String institution, String education, String major, String employCompany,
			String administrative, String technicalPost, String mobliePhone, String projectCategory) {
		super();
		this.workDate = workDate;
		this.birthday = birthday;
		this.professorName = professorName;
		this.gender = gender;
		this.identityNumber = identityNumber;
		this.workStatus = workStatus;
		this.institution = institution;
		this.education = education;
		this.major = major;
		this.employCompany = employCompany;
		this.administrative = administrative;
		this.technicalPost = technicalPost;
		this.mobliePhone = mobliePhone;
		this.projectCategory = projectCategory;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getWorkStatus() {
		return workStatus;
	}

	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getEmployCompany() {
		return employCompany;
	}

	public void setEmployCompany(String employCompany) {
		this.employCompany = employCompany;
	}

	public String getAdministrative() {
		return administrative;
	}

	public void setAdministrative(String administrative) {
		this.administrative = administrative;
	}

	public String getTechnicalPost() {
		return technicalPost;
	}

	public void setTechnicalPost(String technicalPost) {
		this.technicalPost = technicalPost;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobliePhone() {
		return mobliePhone;
	}

	public void setMobliePhone(String mobliePhone) {
		this.mobliePhone = mobliePhone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProjectCategory() {
		return projectCategory;
	}

	public void setProjectCategory(String projectCategory) {
		this.projectCategory = projectCategory;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getWorkDate() {
		return workDate;
	}

	public void setWorkDate(int workdate) {
		this.workDate = workdate;
	}

	public int getLostNum() {
		return lostNum;
	}

	public void setLostNum(int lostNum) {
		this.lostNum = lostNum;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public List<Workhistory> getList() {
		return list;
	}

	public void setList(List<Workhistory> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", workdate=" + workDate + ", lostNum=" + lostNum + ", birthday=" + birthday
				+ ", modifyDate=" + modifyDate + ", createDate=" + createDate + ", professorName=" + professorName
				+ ", gender=" + gender + ", identityNumber=" + identityNumber + ", workStatus=" + workStatus
				+ ", institution=" + institution + ", education=" + education + ", major=" + major + ", employCompany="
				+ employCompany + ", administrative=" + administrative + ", technicalPost=" + technicalPost + ", phone="
				+ phone + ", mobliePhone=" + mobliePhone + ", address=" + address + ", projectCategory="
				+ projectCategory + ", createBy=" + createBy + ", modifyBy=" + modifyBy + "]";
	}

}
