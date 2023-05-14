package WorkerSystem;

public class ITDepartment extends Officer {
    private String role;

    public ITDepartment(String name, String phone, String email, String department, String workHour, String role) {
        super(name, phone, email, department, workHour);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    /*-------------------------- */

    public void operationOfNetworking() {
        System.out.println(this.getName() + " network kurulumundan sorumludur.");
    }
}
