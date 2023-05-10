package WorkerSystem;

public class Prelector extends Academician{
    private String numberOfGate;

    public Prelector(String name, String phone, String email, String department, String title, String numberOfGate){        
        super(name, phone,email,department, title);
        this.numberOfGate= numberOfGate;    
}

public String getNumberOfGate(){
    return numberOfGate;
}
public void setNumberOfGate(String numberOfGate){
    this.numberOfGate=numberOfGate;
}

public void senateMeeting(){
    System.out.println(this.getName()+ " saat 10' da toplantıya katılması gerekmektedir.");
}
public void makeExam(){
    System.out.println(this.getName()+ " sınav yapma hakkına yetkisine sahiptir.");
}
}
