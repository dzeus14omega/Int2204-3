import java.security.acl.Group;

public class Student {
    private String id,group, email, name;
    
    public Student(){
        this.id = "000";
        this.name = "Student";
        this.group = "K59CB";
        this.email = "uet@vnu.edu.vn";
    }

    public Student(String id, String email, String name, String group){
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = group;
    }

    public Student(Student s){
        this.id = s.id;
        this.name = s.name;
        this.email = s.email;
        this.group = s.group;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return this.id;
    }

    public String getGroup() {
        return this.group;
    }

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public void getInfo() {
        System.out.println("id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email); 
        System.out.println("Group: " + this.group);       
    }


}