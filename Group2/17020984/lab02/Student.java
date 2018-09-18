public class Student{
		private String name;
		private String id;
		private String group;
		private String email;
		
		public String getName(){
			return name;
		}
		public void setName(String newName){
			name = newName;
		}
		
		
		public String getId(){
			return id;
		}
		public void setId(String newId){
			id = newId;
		}
		
		
		public String getGroup(){
			return group;
		}
		public void setGroup(String newGroup){
			group = newGroup;
		}
		
		
		public String getEmail(){
			return email;
		}
		public void setEmail(String newEmail){
			email = newEmail;
		}
		
		public String getInfor(){
			System.out.println(name);
			System.out.println(id);
			System.out.println(group);
			System.out.println(email);
			return  "";
		}
		public Student(){
			name = "Student";
			id = "000";
			group = "K621-CD";
			email = "uet@vnu.edu.vn";
		}
		public Student(String newName, String newId, String newEmail){
			name = newName;
			id = newId;
			email = newEmail;
			group = "K622-CD";
		}
		public Student(Student person){
			name = person.getName();
			id = person.getId();
			group = person.getGroup();
			email = person.getEmail();
		}
}