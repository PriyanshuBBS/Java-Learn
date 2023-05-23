interface sampleInterface {
    void meth1();
    void meth2();
}
// Classes can't inherit interface, but can implement it
interface childSampleInterface extends sampleInterface {
    void meth3();
    void meth4();
}

class MySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class java_57 {
    public static void main(String[] args) {

    }
}
