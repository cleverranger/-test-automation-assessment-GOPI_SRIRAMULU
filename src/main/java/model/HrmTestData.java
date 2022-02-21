package model;

public class HrmTestData {

    private String username;
    private String password;
    private String expectedFullName;

    public String getUsername(){
        return username;
    }

    public void setUsername(final String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(final String password){
        this.password = password;
    }

    public String getExpectedFullName(){
        return expectedFullName;
    }

    public void setExpectedFullName(final String expectedFullName){
        this.expectedFullName = expectedFullName;
    }

}
