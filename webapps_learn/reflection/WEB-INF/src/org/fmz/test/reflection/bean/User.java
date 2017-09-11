package org.fmz.test.reflection.bean;

import java.io.*;
import java.sql.*;

public class User implements java.io.Serializable {

    // Properties.
    private Long id;
    private String name;
    //private Date birthdate;
    private String birthdate;

    // Getters.
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getBirthdate() { return birthdate; }

    // Setters.
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setBirthdate(String birthdate) { this.birthdate = birthdate; }

    // Important java.lang.Object overrides.
    public boolean equals(Object other) {
        return (other instanceof User) && (id != null) ? id.equals(((User) other).id) : (other == this);
    }
    public int hashCode() {
        return (id != null) ? (getClass().hashCode() + id.hashCode()) : super.hashCode();
    }
    public String toString() {
        return String.format("User[id=%d,name=%s,birthdate=%d]", id, name, birthdate);
    }

    public int store() throws Exception{
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://172.16.192.194:5432/test";
        Connection conn = DriverManager.getConnection(url, "fmz", "147258");
        PreparedStatement ps = conn.prepareStatement("insert into users(id, name, birthdate) values(?, ?, ?)");
        ps.setLong(1, id);
        ps.setString(2, name);
        ps.setDate(3, Date.valueOf(birthdate));
        int a = ps.executeUpdate();
        if(a == 1){
            return a;
        }else{
            return a;
        }
    }
}
