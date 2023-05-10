package WorkerSystem;

public class Main {
    public static void main(String[] args){

        LabAssistant Ahmet = new LabAssistant("Ahmet", "5551112222","info@labmail", "Kardiyoloji", "Kardiyoloji Assistanı", "4 saat");

        Ahmet.setName("Ahmet");
        System.out.println(Ahmet.getName());
        System.out.println(Ahmet.getOfficeTime());
        Ahmet.entryLesson();
        Ahmet.enterCourse();

    }
}
