public class java_32 {

    static void change(int a){
        a = 98;
    }

    static void change2(int [] arr){
        arr[0] = 98;
    }

    // Method overloading
    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }

    public static void main(String[] args) {
        

        // Array or its Elements are passed as reference to function
        // Case 1: Changing the Integer
        //int x = 45;
        //change(x);
        //System.out.println("The value of x after running change is: " + x);

        // Case 2: Changing the Array
        // int [] marks = {52, 73, 77, 89, 98, 94};
        // change2(marks);
        // System.out.println("The value of x after running change is: " + marks[0]);

        // Method overloading : Parameters can be different not return type
        foo();
        foo(3000);
    }
}
