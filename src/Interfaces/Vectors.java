package Interfaces;

public class Vectors {
    public static void summ(ArrayManager massive, ArrayManager massive2) {
        ArrayManager massivetemp = new ArrayVector(massive.getLength());
        if (massive.getLength() == massive2.getLength()) {
            System.out.print("Результат сложения векторов = ");
            for (int i = 0; i < massive2.getLength(); i++) {
                massivetemp.changeElement(i, massive2.getElement(i) + massive.getElement(i));
            }
            massivetemp.toString();
            System.out.println(massivetemp.toString());
        }
    } //Статистическое сложение массивов

    public static int getVectorMult(ArrayManager massive, ArrayManager massive2) {
        if (massive2.getLength() == massive.getLength()) {
            int VectorSum = 0;
            for (int i = 0; i < massive2.getLength(); i++) {
                VectorSum += massive2.getElement(i) * massive.getElement(i);
            }
                System.out.println("Результат произведения векторов = " + VectorSum);
                return VectorSum;
            
        } else {
            System.out.println("Массивы не равны, невозможно найти скалярное произведение");
        }
        return -1;
    } //Скалярное произведение векторов

    //Сравнение массивов
    public static boolean vectorCompare(ArrayManager massive, ArrayManager massive2) { 
        if (massive.getLength() != massive2.getLength()) {
            System.out.println("Массивы не равны по длине");
            return false;
        }

        for (int i = 0; i < massive2.getLength(); i++) {
            if (massive2.getElement(i) != massive.getElement(i)) {
                System.out.println("Массивы не одинаковые");
                return false;
            }   
        }
        
        System.out.println("Массивы одинаковые");
        return true;
    } //Сравнение массивов

}
