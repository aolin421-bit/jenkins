package com.my.jenkins.system.vo;

public class MyEntity {
    private String firstName;
    private String lastName;
    private String phone;

    public static MyEntity instance(){
        return new MyEntity("yo","hei","123");
    }
    public MyEntity( String firstName,String lastName,String phone ){
        this.firstName=firstName;
        this.lastName =lastName;
        this.phone    =phone;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName( String firstName ){
        this.firstName=firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName( String lastName ){
        this.lastName=lastName;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone( String phone ){
        this.phone=phone;
    }
}
