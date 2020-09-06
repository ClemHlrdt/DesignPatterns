package com.clemhlrdt.behavioral.observer;

public interface Observable {
	void add(Observer observer);
	void remove(Observer observer);
	void doNotify();
}
