import java.util.ArrayList;

public abstract class Subject {
  public float temperature;
  public float pressure;
  public float humidity;
  protected ArrayList<Observer> observers;

  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  public void remove(Observer observer) {
    observers.remove(observer);
  }

  public abstract void notifyObservers();
}
