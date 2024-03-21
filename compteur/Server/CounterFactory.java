import java.rmi.RemoteException;

public class CounterFactory {
    public static Counter createCounter() throws RemoteException {
        return new CounterImpl();
    }
}
