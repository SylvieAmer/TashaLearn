package Interfaces;

public class ArrayVector implements ArrayManager {
    int [] mas; //поле 
    
    public ArrayVector(int length){
        mas = new int[length]; //создание массива фиксированной длины
        initialize();
        //конструктор
    }
    
    public int getLength() {
        return mas.length;
    } // Получаем длину массива
    
    @Override
    public void showElement(int index) {
        if (this.getLength() > index) {
            System.out.println(index + " элемент массива = " + mas[index]);
        } else {
            System.out.println("Такого элемента не существует");
        }
    } //Показываем элемент массива
        public void initialize() {
        for (int i = 0; i < getLength(); i++) {
            int a = 0;
            int b = 10;
            mas[i] = a + (int)(Math.random() * b);
        }
    } //заполнение массива

}
