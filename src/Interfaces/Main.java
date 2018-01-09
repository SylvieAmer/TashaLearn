package Interfaces;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException  {
        ArrayManager mas1 = new ArrayVector(2);
        ArrayManager list = new LinkedListArray();
        
        System.out.println(mas1.toString());
        System.out.println(list.toString());
        Vectors.summ(mas1, list);
        Vectors.getVectorMult(mas1, list);
        Vectors.vectorCompare(mas1, list);
        
        list.addElement(25);
        ArrayManager cloneList = list.clone();
        cloneList.addElement(45);
        System.out.println(list.toString());
        System.out.println(cloneList.toString());
    }
    public static void showArrayElement(ArrayManager arrayManager, int index){
        arrayManager.showElement(index);
        }
}
