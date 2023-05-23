interface MyCamera2 {    
    void recordVideo();

    private void greet() {
        System.out.println("Good Morning");
    }

    default void record4KVideo() {
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi2 {
    String[] getNetworks();
}

class MyCellPhone2 {
    void pickCall() {
        System.out.println("Connecting... ");
    }

}

class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2 {
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Taking snap");
    }

    
    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = { "Harry", "Prashanth", "Anjali5G" };
        return networkList;
    }
}

public class java_58 {
    public static void main(String[] args) {
        
        // --> Polymorphism 
        MyCamera2 cam1 = new MySmartPhone2(); // This is a smartphone but, use it as a camera
        // or given as camera to friend and access is restricted by making obj having refe. of
        // camera and object of SmartPhone


        // cam1.getNetworks(); --> Not allowed, how camera can use phone's functions
        
        cam1.recordVideo();
         //-> but it can use interface(camera) features
    }
}
