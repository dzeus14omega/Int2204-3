public class StudentManagement {
    private Student[] courseK62 = new Student[100]; 
    public boolean sameGroup(Student s1, Student s2){
        return s1.getGroup().equals(s2.getGroup());
    }

    public void studentsByGroup() {
        //filter group
        
        Group[] groupsK62 = new Group[100];
        String group_name = courseK62[0].getGroup();
        Group group = new Group();
        group.setGroup(group_name);
        groupsK62[0] = group;
        for(int i=0; i<this.courseK62.length; i++){
            if(courseK62[i] == null){
                break;
            }
            for(int j=0; j<groupsK62.length; j++){
                String s1 = courseK62[i].getGroup();
                String s2 = groupsK62[j].getGroup();
                if(s1.equals(s2)) break;
                else if(groupsK62[j+1] == null){
                    Group new_group = new Group();
                    new_group.setGroup(courseK62[i].getGroup());
                    groupsK62[j+1] = new_group;
                }
                
            }
        }

        //student by group

        for(int i =0; i<groupsK62.length; i++){
            if(groupsK62[i] == null){
                break;
            }
            for(int j = 0; j<this.courseK62.length; j++){
                if(courseK62[j] == null) break;
                String s1 = courseK62[j].getGroup();
                String s2 = groupsK62[i].getGroup();
                if(s1.equals(s2)) courseK62[j].getInfo();
            }            
        }
    }

    public void removeStudent(String id) {
        for(int i=0; i<this.courseK62.length; i++){
            if(courseK62[i].getId().equals(id)){
                for(int j = i; j<this.courseK62.length; j++){
                    courseK62[j] = courseK62[j+1];
                    if(courseK62[j+1] == null) break;
                }
                break;
            }
        }
    }

    public static void main(String args[]) {
        //Student s = new Student(17020998,"vansido99@gmail.com","Van Si");
        StudentManagement manager = new StudentManagement();
        
        Student si = new Student("17020998","vansido99@gmail.com","Van Si","K62-CD");
        Student quan = new Student("17020984","zed.quan@gmail.com", "Tien Quan","K62-CD");
        Student hieu = new Student("17020118", "hieutran@gmail.com", "Duc Hieu", "K62_CLC");
        Student hieu2 = new Student("17020119", "hieutran2@gmail.com", "Duc Hieu2", "K63_CLC");

        manager.courseK62[0] = si;
        manager.courseK62[2] = quan;
        manager.courseK62[1] = hieu;
        manager.courseK62[3] = si;
        manager.courseK62[4] = hieu2;
        manager.studentsByGroup();
        
        
        
        /*if(manager.sameGroup(si, quan)){
            System.out.println("same group");
        } else System.out.println("diferrent group");*/

        
        //Student si = new Student(17020998,"vansido99@gmail.com","Van Si");
        // si.setId(17020998);
        // si.setGroup("K62-C-D");
        // si.setEmail("vansido99@gmail.com");
        // si.setName("Van Si");
        //si.getInfo();


    }
}