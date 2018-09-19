public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getInfo(){
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.group);
        System.out.println(this.email);
        return "";
    } 

    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group="K59CB";
    }
    public Student (){
        this.name= "Do Thi Kim Oanh";
        this.id="000";
        this.group="K64";
        this.email="abc@gmail.com";
    }
    public Student (Student s){
        this.name= s.name;
        this.id= s.id;
        this.group= s.group;
        this.email= s.email;
    }
    
}