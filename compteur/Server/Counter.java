import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Counter extends Remote {
    void increment() throws RemoteException;

    void decrement() throws RemoteException;

    int getValue() throws RemoteException;
}
