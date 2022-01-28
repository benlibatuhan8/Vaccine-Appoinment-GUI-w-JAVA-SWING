
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Date;
public class userManager {
  Connection con;
  
    Statement statement;
   public userManager(){
       String sql="ALTER SESSION SET CURRENT_SCHEMA = BENLIBATUHAN8";
       try {
            Class.forName("oracle.jdbc.OracleDriver");           
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Driver Bulunamadı");            
        return;
        } 
          System.out.println("Oracle JDBC Driver Kaydı Başarılı!");
        try {
             this.con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","benlibatuhan8");
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Bağlantı başarısız! Console output kontrol et!");
            return;
        }
           
      try {
          con.createStatement().execute(sql);
      } catch (SQLException ex) {
//          Logger.getLogger(userManager.class.getName()).log(Level.SEVERE, null, ex);
      }
       
       try {
           statement= con.createStatement();
       } catch (SQLException ex) {
           Logger.getLogger(userManager.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   public void AddPatient(Patient patient){
      String query="INSERT INTO PATIENT (PIDENTITYNO,NAMESURNAME,USERNAME,PASSWORD,GENDER,DATEOFBIRTH,ALLERGYINFO,CHRONICINFO) VALUES "
              + "('"+patient.getTc()+ "','" +patient.getNamesurname()+ "','"+patient.getUserName()+"','"     
              +patient.getPassword()+"','"+patient.getGender()+"','"+patient.getDateofBirth()+"','"+patient.getAllergyInfo()+"','"
              +patient.getChronicInfo()+"')";
      try {
          statement.executeUpdate(query);
      } catch (SQLException ex) {
          Logger.getLogger(userManager.class.getName()).log(Level.SEVERE, null, ex);
      }
      
     
   }
   
   public ResultSet getPatients(){
       ResultSet rs = null;
       String query="Select * from patient";
      try {
          rs=statement.executeQuery(query);
      } catch (SQLException ex) {
          Logger.getLogger(userManager.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      return rs;
   }
   public ResultSet getDoctors(String hospital){
    ResultSet rs=null;
    String query="Select * from doctor where hospital ='"+hospital+"'";
      try {
          rs=statement.executeQuery(query);
      } catch (SQLException ex) {
          Logger.getLogger(userManager.class.getName()).log(Level.SEVERE, null, ex);
      }
      return rs;
   
   }
   public ResultSet getHospitals(){
   ResultSet rs=null;
    String query="Select * from doctor";
    
      try {
          rs=statement.executeQuery(query);
      } catch (SQLException ex) {
          Logger.getLogger(userManager.class.getName()).log(Level.SEVERE, null, ex);
      }
   return rs;
   }
   public ResultSet getAppoinment(){
   ResultSet rs = null;
   String query="Select * from appoinment";
   
      try {
          rs=statement.executeQuery(query);
      } catch (SQLException ex) {
          Logger.getLogger(userManager.class.getName()).log(Level.SEVERE, null, ex);
      }
   return rs;
   }
   public void setAppoinment(Appoinment appoinment){
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    String strdate=formatter.format(appoinment.getDate());
    String query="insert into appoinment values"+"('"+appoinment.getPid()+"','"+appoinment.getDid()+"','"
    +appoinment.getVid()+"','"+strdate+"')";

      try {
          statement.executeUpdate(query);
      } catch (SQLException ex) {
          Logger.getLogger(userManager.class.getName()).log(Level.SEVERE, null, ex);
      }
            
      
   }
   public ResultSet getVaccines(){
   String query ="Select * from vaccine";
   ResultSet rs=null;
  
      try {
          rs=statement.executeQuery(query);
      } catch (SQLException ex) {
          Logger.getLogger(userManager.class.getName()).log(Level.SEVERE, null, ex);
      }
   return rs;
   
   }
   public Doctor getDoctorInfos(String doctor){
   String query="Select * from doctor where namesurname='"+doctor+"'";
   ResultSet rs = null;
   Doctor doctor1= new Doctor();
      try {
          rs=statement.executeQuery(query);
      } catch (SQLException ex) {
          Logger.getLogger(userManager.class.getName()).log(Level.SEVERE, null, ex);
      }
      try {
          while(rs.next()){
              System.out.println(rs.getString("didentityno"));
              doctor1.setDoctorId(rs.getString("didentityno"));
              doctor1.setHospital(rs.getString("hospital"));
              doctor1.setPassword(rs.getString("password"));
          } } catch (SQLException ex) {
          Logger.getLogger(userManager.class.getName()).log(Level.SEVERE, null, ex);
      }
   return doctor1;
   
   }
   
   
}
