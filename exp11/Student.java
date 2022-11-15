//save this file as Student.java
public class Student implements Cloneable{
    int id;
    String name;
    Student(int id, String name){
        this.id=id;
        this.name=name;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String arg[]){
        Student s = new Student(101,"John");
        System.out.println(s.id+" "+s.name);
        try{
            Student s1 = (Student)s.clone();
            System.out.println(s.id+" "+s.name);
        }
        catch(Exception e){
            System.out.println(s.toString());
        }
    }

}