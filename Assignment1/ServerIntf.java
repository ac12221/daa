import java.rmi.*;
interface ServerIntf extends Remote{
  public double Addition(double int1,double int2) throws RemoteException;
  public double Subtraction(double int1,double int2) throws RemoteException;
  public double Multiplication(double int1,double int2) throws RemoteException;
  public double Division(double int1,double int2) throws RemoteException;
}
