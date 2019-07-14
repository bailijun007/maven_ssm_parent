package com.blj.domain;

import java.io.Serializable;
import java.util.Date;

//User
public class User implements Serializable {
    private long userId;
    private String userName, password, telephone, unit, landmark;
    private long role;//
    private String name;
   // @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date enterdate;//
   //方法一：新添 用户角色名字 userRole
    private String userRoleName;
    //方法2：
    private Role r;

    public User() {
    }

    public User(long id, String userName, String password, String telephone, String unit, String landmark,
                long userRole, String name) {
        super();
        this.userId = id;
        this.userName = userName;
        this.password = password;
        this.telephone = telephone;
        this.unit = unit;
        this.landmark = landmark;
        this.role = userRole;
        this.name = name;
    }

    public User(String userName, String password, String telephone, String unit, String landmark, long userRole,
                String name) {
        super();
        this.userName = userName;
        this.password = password;
        this.telephone = telephone;
        this.unit = unit;
        this.landmark = landmark;
        this.role = userRole;
        this.name = name;
    }

    public long getId() {
        return userId;
    }

    public void setId(long id) {
        this.userId = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    /*public long getUserRole() {
        return userRole;
    }

    public void setUserRole(long userRole) {
        this.userRole = userRole;
    }
*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnterdate() {
        return enterdate;
    }

    public void setEnterdate(Date enterdate) {
        this.enterdate = enterdate;
    }

    public long getRole() {
        return role;
    }

    public void setRole(long role) {
        this.role = role;
    }

    public String getUserRoleName() {
        return userRoleName;
    }

    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName;
    }

    public Role getR() {
        return r;
    }

    public void setR(Role r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", telephone='" + telephone + '\'' +
                ", unit='" + unit + '\'' +
                ", landmark='" + landmark + '\'' +
                ", role=" + role +
                ", name='" + name + '\'' +
                ", enterdate=" + enterdate +
                ", userRoleName='" + userRoleName + '\'' +
                ", r=" + r +
                '}';
    }
}
