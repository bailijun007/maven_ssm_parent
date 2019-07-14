package com.blj.domain;

public class Workhistory {
    private int id,professorid;
    private  String startDate,endDate,job,jobduty,employcompany;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProfessorid() {
        return professorid;
    }

    public void setProfessorid(int professorid) {
        this.professorid = professorid;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJobduty() {
        return jobduty;
    }

    public void setJobduty(String jobduty) {
        this.jobduty = jobduty;
    }

    public String getEmploycompany() {
        return employcompany;
    }

    public void setEmploycompany(String employcompany) {
        this.employcompany = employcompany;
    }

    @Override
    public String toString() {
        return "Workhistory{" +
                "id=" + id +
                ", professorid=" + professorid +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", job='" + job + '\'' +
                ", jobduty='" + jobduty + '\'' +
                ", employcompany='" + employcompany + '\'' +
                '}';
    }
}
