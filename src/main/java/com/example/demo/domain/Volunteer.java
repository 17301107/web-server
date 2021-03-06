package com.example.demo.domain;


public class Volunteer {

  private long id;
  private long orgId;
  private long clientId;
  private String name;
  private String gender;
  private String phone;
  private String idCard;
  private java.sql.Timestamp birthday;
  private java.sql.Timestamp checkinDate;
  private java.sql.Timestamp checkoutDate;
  private String imgsetDir;
  private String profilePhoto;
  private String description;
  private String isactive;
  private java.sql.Timestamp created;
  private long createby;
  private java.sql.Timestamp updated;
  private long updateby;
  private String remove;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getOrgId() {
    return orgId;
  }

  public void setOrgId(long orgId) {
    this.orgId = orgId;
  }


  public long getClientId() {
    return clientId;
  }

  public void setClientId(long clientId) {
    this.clientId = clientId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getIdCard() {
    return idCard;
  }

  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }


  public java.sql.Timestamp getBirthday() {
    return birthday;
  }

  public void setBirthday(java.sql.Timestamp birthday) {
    this.birthday = birthday;
  }


  public java.sql.Timestamp getCheckinDate() {
    return checkinDate;
  }

  public void setCheckinDate(java.sql.Timestamp checkinDate) {
    this.checkinDate = checkinDate;
  }


  public java.sql.Timestamp getCheckoutDate() {
    return checkoutDate;
  }

  public void setCheckoutDate(java.sql.Timestamp checkoutDate) {
    this.checkoutDate = checkoutDate;
  }


  public String getImgsetDir() {
    return imgsetDir;
  }

  public void setImgsetDir(String imgsetDir) {
    this.imgsetDir = imgsetDir;
  }


  public String getProfilePhoto() {
    return profilePhoto;
  }

  public void setProfilePhoto(String profilePhoto) {
    this.profilePhoto = profilePhoto;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getIsactive() {
    return isactive;
  }

  public void setIsactive(String isactive) {
    this.isactive = isactive;
  }


  public java.sql.Timestamp getCreated() {
    return created;
  }

  public void setCreated(java.sql.Timestamp created) {
    this.created = created;
  }


  public long getCreateby() {
    return createby;
  }

  public void setCreateby(long createby) {
    this.createby = createby;
  }


  public java.sql.Timestamp getUpdated() {
    return updated;
  }

  public void setUpdated(java.sql.Timestamp updated) {
    this.updated = updated;
  }


  public long getUpdateby() {
    return updateby;
  }

  public void setUpdateby(long updateby) {
    this.updateby = updateby;
  }


  public String getRemove() {
    return remove;
  }

  public void setRemove(String remove) {
    this.remove = remove;
  }

}
