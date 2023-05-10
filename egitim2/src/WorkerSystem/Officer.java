package WorkerSystem;

public class Officer extends Worker{
    private String department;
    private String workHour;

    public Officer(String name, String phone, String email, String department, String workHour){
        super(name, phone, email);
        this.department=department;
        this.workHour=workHour;
    }

    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department=department;
    }

    public String getWorkHour(){
    return workHour;
    }
    public void setWorkHour(String workHour){
        this.workHour=workHour;
    }
 /*--------------------------------- */

 public void work(){
    System.out.println(this.getName()+ " sabah 8 ve akşam 4 saatleri arası çalışıyor.");
 }
}
