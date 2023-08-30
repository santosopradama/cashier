package com.smk.cashier.model;


public class  User extends com.smk.cashier.model.Model {
    private String username;
    private String password;

    public String getUsername() { return username;}

    public void setUsername(String username) { this.username = username;}

    public String getPassword() { return password;}

    public void setPassword(String password) { this.password = password;}

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dateCreated=" + dateCreated +
                ", lastModified=" + lastModified +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                '}';
    }
}

