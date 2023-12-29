// Default Methods

interface MyCamera {
    void takeSnap();

    void recordVideo();
    private void greet() {
        System.out.println("Good Morning!!!");
    }
    default void record4kVideo() {
        System.out.println("Recording 4k...");
    }
}

interface Mywifi {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class MyCellPhone {
    void callNumber(long phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class MysmartPhone extends MyCellPhone implements MyCamera, Mywifi {

    @Override
    public String[] getNetworks() {
        System.out.println("Getting List of Networks...");
        String[] networkList = { "Airtel", "Jio", "VI", "Reliance" };
        return networkList;
    }

    // public void record4kVideo(){
    // System.out.println("Recording in 4k...");
    // }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }

    @Override
    public void takeSnap() {
        System.out.println("Taking Snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Taking Snap");
    }
}

public class DefaultMethod {
    public static void main(String[] args) {
        MysmartPhone obj = new MysmartPhone();
        obj.takeSnap();
        obj.callNumber(541252351);
        obj.connectToNetwork("Jio");
        obj.pickCall();
        obj.recordVideo();
        obj.record4kVideo();
        // obj.greet(); // Throws Error as it is private
        String[] ar = obj.getNetworks();
        for (String str : ar) {
            System.out.println(str);
        }
    }
}