package Interfaces;

public class LinkedListArray implements ArrayManager{
    private class Element{
        int data;
        Element prev;
        Element next;
        public Element(int data, Element prev, Element next){
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    } 
    int count;
    Element head;
        
    public LinkedListArray(){
        head = null;
        addElement(0);
        addElement(1);
    }
    public void addElement(int data){
	if (head == null) {
	head = new Element(data, null, null);
        head.prev = head;
        head.next = head;
	}
        else {
        Element E = new Element(data, head.prev, head.prev.next);
        head.prev.next = E;
        head.prev = E;
        }
        count++;
    }  //добавление элемента в конец

    public void getLength(){
    System.out.println("Размерность связного списка = " + count);
}//возвращение длины связного списка
    
    @Override
    public void showElement(int index) {
    Element temp = head;
    for (int i=0; i<index; i++){
        temp = temp.next;
    }
    System.out.println("Элемент связного списка № " + index + " = " + temp.data);
    temp = null;
} //Вывод элемента по индексу
}
