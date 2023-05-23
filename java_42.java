// Constructor and its overloading

class MyMainEmployee {
    private int id;
    private String name;

    // Constructor Overloading
    public MyMainEmployee() {
        id = 0;
        name = "Your-Name-Here";
    }

    public MyMainEmployee(String myName, int myId) {
        id = myId;
        name = myName;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

public class java_42 {
    public static void main(String[] args) {

     // -> 2 Types of Constructors
     //MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12);
     MyMainEmployee harry = new MyMainEmployee();
     
     
     //harry.setName("CodeWithHarry");
     //harry.setId(34);
     System.out.println(harry.getId());
     System.out.println(harry.getName());   
    }
}
