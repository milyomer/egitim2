package WorkerSystem;

public class Worker {
    private String name;
    private String phone;
    private String email;

public Worker(String name, String phone, String email){
this.name= name;
this.phone= phone;
this.email= email;
}

public String getName(){
return name;
}
public void setName(String name){
    this.name= name;
}

public String getPhone(){
    return phone;
}
public void setPhone(String phone){
    this.phone= phone;
}

public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email= email;
}

/*--------------------------------------*/

public void entry(){
    System.out.println(this.name+ " işe giriş yaptı.");
}
public void outry(){
    System.out.println(this.name+ " işten çıkış yaptı.");
}
public void foodry(){
    System.out.println(this.name+ " yemekhaneye girdi. Yemek molası için 1 saat izni vardır.");
}
}
