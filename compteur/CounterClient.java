import java.rmi.Naming;

public class CounterClient {
    public static void main(String[] args) {
        try {
            Counter counter = (Counter) Naming.lookup("//localhost/Counter");
            System.out.println("Initial counter value: " + counter.getValue());
            counter.increment();
            System.out.println("Counter after increment: " + counter.getValue());
            counter.decrement();
            System.out.println("Counter after decrement: " + counter.getValue());
        } catch (Exception e) {
            System.err.println("CounterClient exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
