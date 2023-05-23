public class java_31 {

    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x +y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;

        // Method invocation using Object creation
        //cwh_31_methods obj = new cwh_31_methods();
        //c = obj.logic(a, b);
        
        logic o1 = new  logic();
        // c = logic(a, b);
    }
}
