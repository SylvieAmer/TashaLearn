package Interfaces;

 interface ArrayManager {
     int showElement(int index);
     int getElement(int index);
     void addElement(int data);
     int getLength();
     void changeElement(int index, int data);
    @Override
     String toString();
     
     ArrayManager clone();
}
