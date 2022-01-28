
package GUI;

import java.util.Date;

public class Appoinment {
  String Pid;
  String Did;
  int Vid;
  Date date;

    @Override
    public String toString() {
        return "Appoinment{" + "Pid=" + Pid + ", Did=" + Did + ", Vid=" + Vid + ", date=" + date + '}';
    }

    public String getPid() {
        return Pid;
    }

    public void setPid(String Pid) {
        this.Pid = Pid;
    }

    public String getDid() {
        return Did;
    }

    public void setDid(String Did) {
        this.Did = Did;
    }

    public int getVid() {
        return Vid;
    }

    public void setVid(int Vid) {
        this.Vid = Vid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
  
  
}
