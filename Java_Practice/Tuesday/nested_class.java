package Java_Practice.Tuesday;

class classroom{
  int count = 60;
  String section="A";
  class Student{
   int roll_no=202;
   String name="ABC";
   
  }
 }
public class nested_class {
    public static void main(String[] args) {
         classroom c = new classroom();
         classroom.Student obj = c.new Student();
         System.out.println(obj.name);
         System.out.println(c.count);
}
}
