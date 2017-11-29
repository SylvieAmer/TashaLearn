package Interfaces;

public interface ArrayManager {
    public int showElement(int index);
    public int getElement(int index);
    public int getLength();
    public void changeElement(int index, int data);
    @Override
    public String toString();
}
