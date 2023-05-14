package WorkerSystem;

public class Academician extends Worker {
    private String department;
    private String title;

    public Academician(String name, String phone, String email, String department, String title) {
        super(name, phone, email);
        this.department = department;
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    /*-------------------------------------- */

    public void enterCourse() {
        System.out.println(this.getName() + this.getDepartment() + " dersine girdi.");
    }

    public void entry() {
        System.out.println(this.getName() + "akademisyeni sisteme giriş yaptı.");
    }
}