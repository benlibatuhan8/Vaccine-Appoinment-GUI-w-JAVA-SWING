
package GUI;

import oracle.net.ano.SupervisorService;


public class Patient extends User {
     private String Tc;
     private String allergyInfo;
     private String chronicInfo;

    public Patient() {
    }

    public Patient(String Tc, String allergyInfo, String chronicInfo, String UserName, String Password, String Gender, java.util.Date dateofBirth, String namesurname) {
        super(UserName, Password, Gender, dateofBirth, namesurname);
        this.Tc = Tc;
        this.allergyInfo = allergyInfo;
        this.chronicInfo = chronicInfo;
    }

    @Override
    public String toString() {
        return "Patient{" + "Tc=" + Tc + ", allergyInfo=" + allergyInfo + ", chronicInfo=" + chronicInfo + '}';
    }

    
    
  

    
    
    public String getTc() {
        return Tc;
    }

    public void setTc(String Tc) {
        this.Tc = Tc;
    }

    public String getAllergyInfo() {
        return allergyInfo;
    }

    public void setAllergyInfo(String allergyInfo) {
        this.allergyInfo = allergyInfo;
    }

    public String getChronicInfo() {
        return chronicInfo;
    }

    public void setChronicInfo(String chronicInfo) {
        this.chronicInfo = chronicInfo;
    }

   
    
     
     
}
