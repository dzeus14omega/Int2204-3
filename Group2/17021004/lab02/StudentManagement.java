import java.util.ArrayList;
public class StudentManagement {
    public static ArrayList<Student> students= new ArrayList<>();               //Khoi tao array list
    public static void main (String []args){
        Student me= new Student("Son","17021004","phamhoangson99@gmail.com");           //Khoi tao cac doi tuong
        Student me1= new Student("Thuyet","17021804","abc@gmail.com");
        Student hii= new Student(me);
        Student son= new Student();
        System.out.println(hii.getName());
        System.out.println(hii.getInfo());
        StudentManagement test = new StudentManagement();
        System.out.println(test.sameGroup(hii, me));
        System.out.println("----------");

        students.add(me);                                                   //Them cac doi tuong vao array list
        students.add(hii);
        students.add(son);
        students.add(me1);
        students.add(son);
        students.add(me1);
        for (Student elements: students){                                   //Kiem tra list ban dau
                System.out.println(elements.getInfo());
        }

        System.out.println("----------");        
        System.out.println("----------"); 
        test.studentByGroup();
        System.out.println("----------");        
        for (int i=0;i<students.size();i++)                                 //Remove doi tuong
            test.removeStudent("17021004");
        for (Student elements: students){                                   //List sau khi remove
                System.out.println(elements.getInfo());
        }

    }
    public boolean sameGroup (Student s1, Student s2){                      //Check group 2 doi tuong
        return s1.getGroup().equals(s2.getGroup());
    }
    public void removeStudent (String id){                                  //Ham remove doi tuong bang id
            for (int i=0;i<students.size();i++){
                Student stud=students.get(i);                               //Lay doi tuong tw list de kiem tra
                if (stud.getId().equals(id)) 
                    students.remove(i);                                     //Remove doi tuong trong list

            }
        }
    public void studentByGroup (){                                           //sap xep list
        Student tem=students.get(0);
        String presentGroup =tem.getGroup();                                //Tao present group de duyet list lan dau
        String nextGroup="";                                                //Tao string nextgroup chua group chua duoc duyet

        int size=students.size();                                           //rut gon size cua list cho de nhin
        boolean[] check= new boolean[size];                                 //tạo mạng bool để check các phần tử trong list đã được in ra hay chưa
        for (int i=0;i<size;i++)
        {
            Student temStudent= students.get(i);
            if (check[i]!=true)                                             //check phần tử i đã được in ra hay chưa
            {
                if (temStudent.getGroup().equals(presentGroup))             //check phan tu i co thuoc group dang xet hay khong
                {
                    System.out.println(temStudent.getInfo());               //in ra man hinh neu thuoc group dang xet
                    check[i]=true;                                          //danh dau la da in ra man hinh
                }
            else
            {
                nextGroup=temStudent.getGroup();                            //neu khong thuoc group dang xet thi se dua gruop la vao nextgroup de cho xet duyet

            }
                if (i==size-1)                                              //neu den cuoi list 
                {
                    i=0;                                                    //thi se duyet lai list tu dau
                    presentGroup=nextGroup;                                 //voi group la group dang cho xet duyet
                }
            
                
        }                                                                   //ket thuc khi ta ca deu da duoc duyet
    }
}
}
