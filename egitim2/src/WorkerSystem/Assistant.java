package WorkerSystem;

public class Assistant extends Academician {
    private String officeTime;

    public Assistant(String string, String phone, String email, String department, String title, String officeTime) {
        super(string, phone, email, department, title);
        this.officeTime = officeTime;
    }

    public String getOfficeTime() {
        return officeTime;
    }

    public void SetOfficeTime(String officeTime) {
        this.officeTime = officeTime;
    }

    @Override
    public void enterCourse() {
        System.out.println(this.getName() + " derse girmedi");
    }

    public void makeQuiz() {
        System.out.println(this.getName() + " önümüzdeki hafta çarşamba günü sınav yapıcaktır.");
    }

    public void entry() {
        System.out.println(this.getName() + " asistanı sisteme giriş yaptı.");
    }
}
