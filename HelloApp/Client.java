
// Client.java
import java.rmi.Naming;

public class Client {
    public static void main(String args[]) {
        try {
            HelloInterface obj = (HelloInterface) Naming.lookup("//localhost/HelloServer");
            System.out.println(obj.sayHello());
        } catch (Exception e) {
            System.err.println("Client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
