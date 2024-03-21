import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CounterImpl extends UnicastRemoteObject implements Counter {
    private int value;

    public CounterImpl() throws RemoteException {
        super();
        value = 0;
    }

    public void increment() throws RemoteException {
        value++;
    }

    public void decrement() throws RemoteException {
        value--;
    }

    public int getValue() throws RemoteException {
        return value;
    }
}
