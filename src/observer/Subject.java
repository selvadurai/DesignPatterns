package observer;

public interface Subject {
 public void registarObserver(Observer o);
 public void removeObserver(Observer o);
 public void notifyObserver();

}
