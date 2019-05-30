package com.jl.springboot.domain;

import java.io.Serializable;

public class TestUser implements Serializable {
  private static final long serialVersionUID = 1L;
  private String id;
  private String userName;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

}
