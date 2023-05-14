package WorkerSystem;

public class Main {
    public static void main(String[] args){

        LabAssistant Ahmet = new LabAssistant("Ahmet", "5551112222","info@labmail", "Kardiyoloji", "Kardiyoloji Assistanı", "4 saat");
        Officer Mehmet = new Officer("Mehmet", "44455", "info@patika", "Ofis", "55");
        Assistant Mahmut = new Assistant("Mahmut","7878989", "info", "Kazan Dairesi ", "Leader", "45");
        Worker zübeyde = new Prelector("zübeyde", "6653256", "infocu@info", "amele", "kalfa", "D");

        Mehmet.entry();
        Ahmet.entry();
        Mahmut.entry();
        zübeyde.entry();
   /*     Ahmet.setName("Ahmet");
        System.out.println(Ahmet.getName());
        System.out.println(Ahmet.getOfficeTime());
        Ahmet.entryLesson();
        Ahmet.enterCourse();
        */
    }
}
