// Interface's object can't be created but reference can be given
// In abstract class some can be non-abstract methods but in interface all are abstract

// Interface forcing the class made by it, to implement the given methods


interface Bicycle {
    int a = 45; // Properties can be defined in interfaces but these can't be modified
    // Properties don't need overriding
    void applyBrake();

    void speedUp();
}

interface HornBicycle {
    int x = 45;

    void blowHornK3g();

    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle // This feature is not in abstract class as multiple classes can't be formed
// from abstract classes, It is one of the most important feature of it.
{
    void blowHorn() {
        System.out.println("Pee Pee Poo Poo");
    }

    // Every method of interface must be public
    public void applyBrake() {
        System.out.println("Applying Brake");
    }

    public void speedUp() {
        System.out.println("Applying SpeedUP");
    }

    public void blowHornK3g() {
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }

    public void blowHornmhn() {
        System.out.println("Main hoon naa po po po po");
    }
}

public class java_54 {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake();

        // You can create properties in Interfaces
        System.out.println(cycleHarry.a);

        // You cannot modify the properties in Interfaces as they are final
        // cycleHarry.a = 454; This will give errors

        cycleHarry.blowHornK3g();
        cycleHarry.blowHornmhn();
    }
}

// Multiple Inheritance can create ambiguity but inteface don't