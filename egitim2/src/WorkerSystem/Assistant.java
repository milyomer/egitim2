package WorkerSystem;

public class Assistant extends Academician{
    private String officeTime;

    public Assistant(String name, String phone, String email, String department, String title, String officeTime){
        super(name, phone, email, department, title);
        this.officeTime=officeTime;
    }

    public String getOfficeTime(){
        return officeTime;
    }
    public void SetOfficeTime(String officeTime){
        this.officeTime=officeTime;
    }

    public void makeQuiz(){
        System.out.println(this.getName()+ " önümüzdeki hafta çarşamba günü sınav yapıcaktır.");
    }
}
