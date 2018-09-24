
class Student{
    private String name;
    private String id; 
    private String group;
    private String email;

    public Student(){
        name="Student";
        id="000";
        group="INT22041";
        email="uet@vnu.edu.vn";
        
    }
    public Student(String n, String sid, String em){
        name=n;
        id=sid;
        email=em;
        group="INT22041";
        
    }
    public Student(Student s){
    this. id = s.id;  
    this.name =s.name;
    this.group = s.group;
    this.email = s.email;
    }
    public void setName(String name1){
       this.name= name1;
    }
    public String getName(){
        return name;
    }
    public void setId(String id1){
        this.id= id1;
    }
    public String getId(){
        return id;
    }
    public void setGroup(String group1){
        this.group= group1;
    }
    public String getGroup(){
        return group;
    }
    public void setEmail(String email1){
        this.email= email1;
    }
    public String getEmail(){
        return email;
    }
    public String getInfo(){
        return "Ho ten:"+name+", MSSV: "+id+", Lop: "+group+", Email: "+email;
    }
    
}
public class StudentManagement {
   
            
    public static void main(String[] args) {
        Student s1= new Student();
        s1.setName("Nguyen Thi Thu Ha");
        s1.setId("16022257");
        s1.setGroup("INT22041");
        s1.setEmail("16022257@vnu.edu.vn");
        System.out.println("Ho ten: " +s1.getName());
        System.out.println("Student: " +s1.getInfo());
        
        Student s2= new Student();
        System.out.println("Student: " +s2.getInfo());
        
        Student s3= new Student("Nguyen ThiThu Ha","16022257","16022257@vnu.edu.vn");
        System.out.println("Student: " +s3.getInfo());
        
        Student s4= new Student(s1);
        System.out.println("Student: " +s4.getInfo());
        
        if(sameGroup(s1, s2)){
            System.out.println("Cung lop");
        }else{
            System.out.println("Khac lop");
        }
        
        
        
           
}
        public static boolean sameGroup(Student s1, Student s2){
           if((s1.getGroup()).equals(s2.getGroup())){
               return true;
           }
           else 
               return false;
}
    

    
            
   