class Student{
    int age;
    String name;
    int marks;
    int rollno;
}


public class Arrays {
    public static void main(String[] args) {
       /* int num1[]=new int[4];
        num1[0]=2;
        num1[1]=5;
        num1[2]=8;
        num1[3]=12; */
        Student s1=new Student();
        s1.rollno=1;
        s1.name="spoo";
        s1.marks=79;

        Student s2=new Student();
        s2.rollno=1;
        s2.name="sprti";
        s2.marks=92;

        Student s3=new Student();
        s3.rollno=1;
        s3.name="spandana";
        s3.marks=94;

        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;


        for (int i=0;i<students.length;i++){
            System.out.println(students[i].name + " : " + students[i].marks);
        }
    }

    
}
