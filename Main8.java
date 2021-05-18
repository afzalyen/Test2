public class Main8{
  public static void main (String [] args){
    student john= new student();
      john.setName("john");
      john.setAddress("banani");
      john.setID("18201129");
      john.setCGPA(4.0);
    student mike= new student();
      mike.setName("mike");
      mike.setAddress("gulshan");
      mike.setID("18201130");
      mike.setCGPA(3.0);
    student carol= new student();
      carol.setName("carol");
      carol.setAddress("wari");
      carol.setID("18301131");
      carol.setCGPA(3.33);
      
      System.out.println(john.getName());
      System.out.println(john.getID());
      System.out.println(john.getAddress());
      System.out.println(john.getCGPA());
      
      System.out.println(mike.getName());
      System.out.println(mike.getID());
      System.out.println(mike.getAddress());
      System.out.println(mike.getCGPA());
      
      System.out.println(carol.getName());
      System.out.println(carol.getID());
      System.out.println(carol.getAddress());
      System.out.println(carol.getCGPA());
  }
}