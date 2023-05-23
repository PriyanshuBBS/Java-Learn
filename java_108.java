// Annotations : used to provide extra information

class KeyPadPhone {
    void sendMessage() {
        System.out.println("Text message sent!");
    }
}

class AndroidPhone extends KeyPadPhone {
    // Here override annotation help to remember about override
    @Override
    void sendMessage() {
        System.out.println("Message sent via WhatsApp!");
    }

    // If using deprecated method, warning will be generated
    @Deprecated
    public int sum(int a, int b) {
        return a + b;
    }
}

// ** Functional Interface : An Interface that have only single method
// It is used to point out if more than 1 method is added
@FunctionalInterface
interface myFunctionalInterface {
    void method1();

}

public class java_108 {
    // It supress the warning
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

    }
}
