package com.LeeGainer.observer;

public interface Subject {
	
	void registerObserver(Observer newObserver);
	void deleteObserver(Observer deleteObserver);
	void notifyObserver();
}
