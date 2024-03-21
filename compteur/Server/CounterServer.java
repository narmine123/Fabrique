import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class CounterServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            Counter counter = CounterFactory.createCounter();
            Naming.rebind("//localhost/Counter", counter);
            System.out.println("CounterServer is ready.");
        } catch (Exception e) {
            System.err.println("CounterServer exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
