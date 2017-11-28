package Interfaces;

public class Main {
    public static void main(String[] args) {
        ArrayManager mas1 = new ArrayVector(10);
        ArrayManager list = new LinkedListArray();
        showArrayElement(mas1, 0);
        showArrayElement(list, 0);
        
    }
    public static void showArrayElement(ArrayManager arrayManager, int index){
        arrayManager.showElement(index);
        }
}
