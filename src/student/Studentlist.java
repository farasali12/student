
package student;


public class Studentlist {
    public static void main(String[] args){
   // Student sl= new Student("sl","ronak");
    Student[] Studentlist = new Student[3];
    Studentlist[0]= new Student("s1","ronak");
    Studentlist[1]= new Student("s2","john");
    Studentlist[2]= new Student("s3","kevin");
    
    for(int i =0;i<Studentlist.length;i++){
    System.out.println(Studentlist[1] .getStudentName());   
    
    
    }
   
    
    }
}
