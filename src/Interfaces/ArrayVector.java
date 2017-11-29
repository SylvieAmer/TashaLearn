package Interfaces;

public class ArrayVector implements ArrayManager {
    int [] mas; //поле 
    
    public ArrayVector(int length){
        mas = new int[length]; //создание массива фиксированной длины
        initialize();
        //конструктор
    }
    
    @Override
    public int getElement(int index){
        return mas[index];
    }
    
    @Override
    public int getLength(){
        return mas.length;
    }
    
    @Override
    public String toString(){
        StringBuffer massive = new StringBuffer(mas.length);
        for (int i=0; i<mas.length; i++){
            massive.append(mas[i] + " ");
        }
        return massive.toString();
    }
    
    
    @Override
    public int showElement(int index) {
        if (this.getLength() > index) {
            System.out.println(index + " элемент массива = " + mas[index]);
        } else {
            System.out.println("Такого элемента не существует");
        }
        return mas[index];
    } //Показываем элемент массива
        public void initialize() {
        for (int i = 0; i < getLength(); i++) {
            int a = 0;
            int b = 10;
            mas[i] = a + (int)(Math.random() * b);
        }
    } //заполнение массива

    @Override
    public void changeElement(int index, int data) {
        mas[index]=data;
    }

}
