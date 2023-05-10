package WorkerSystem;

public class LabAssistant extends Assistant{
    public LabAssistant(String name, String phone, String email, String department, String title, String officeWork){
        super(name, phone, email, department, title, officeWork);
    }
    public void entryLaboratory(){
        System.out.println(this.getName()+ " için labaratuvara giriş izni verilmiştir.");
    }
    public void entryLesson(){
        System.out.println(this.getName()+ " için derse giriz izni verilmiştir.");
    }
}
