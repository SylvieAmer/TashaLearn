package Interfaces;

public class Main {
    public static void main(String[] args) {
        ArrayManager mas1 = new ArrayVector(2);
        ArrayManager list = new LinkedListArray();
        System.out.println(mas1.toString());
        System.out.println(list.toString());
        Vectors.summ(mas1, list);
        Vectors.getVectorMult(mas1, list);
        Vectors.vectorCompare(mas1, list);
        
    }
    public static void showArrayElement(ArrayManager arrayManager, int index){
        arrayManager.showElement(index);
        }
}
