package subjects;

import loose.coupling.ObserverPattern.Observer;

public interface Subject {

	void registerObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObserver();

}
