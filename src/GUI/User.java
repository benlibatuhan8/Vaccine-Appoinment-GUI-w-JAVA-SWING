
package GUI;


import java.util.Date;

public class User {
     private String UserName;
     private String Password;
     private String Gender;
     private Date dateofBirth;
     private String namesurname;
     
   

    public User() {
    }

    @Override
    public String toString() {
        return "User{" + "UserName=" + UserName + ", Password=" + Password + ", Gender=" + Gender + ", dateofBirth=" + dateofBirth + ", namesurname=" + namesurname + '}';
    }

    public User(String UserName, String Password, String Gender, Date dateofBirth, String namesurname) {
        this.UserName = UserName;
        this.Password = Password;
        this.Gender = Gender;
        this.dateofBirth = dateofBirth;
        this.namesurname = namesurname;
    }

    
    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getNamesurname() {
        return namesurname;
    }

    public void setNamesurname(String namesurname) {
        this.namesurname = namesurname;
    }
     
     

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
     
     
}
