package WorkerSystem;

public class Security extends Officer {
    private String idCard;

    public Security(String name, String phone, String email, String department, String workHour, String idCard){
        super(name, phone, email, department, workHour);
        this.idCard=idCard;
    }

    public String getIdCard(){
        return idCard;
    }
    public void setIdCard(String idCard){
        this.idCard=idCard;
    }
    /*----------------------------- */

    public void sentry(){
        System.out.println(this.getName()+ " gözetleme görevini yerine getiriyor.");
    }
}
