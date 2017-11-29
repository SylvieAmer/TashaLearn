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
        addElement(1);
        addElement(2);
    }
    
    @Override
    public int getElement(int index){
        Element temp = head;
        for (int i=0; i<index; i++){
            temp = temp.next;
    }
        return temp.data;
    }
    
    @Override
    public void changeElement(int index, int data){
        Element temp = head;
        for (int i = 0; i<index; i++){
            temp=temp.next;
        }
        temp.data=data;
    }
    
    @Override
    public int getLength(){
        return count;
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
    
    @Override
    public String toString(){
        StringBuffer list = new StringBuffer(count);
        Element temp = head;
        for (int i = 0; i<count; i++){
            list.append(temp.data + " ");
            temp = temp.next;
        }
        return list.toString();
    }
    
    @Override
    public int showElement(int index) {
    Element temp = head;
    for (int i=0; i<index; i++){
        temp = temp.next;
    }
    System.out.println("Элемент связного списка № " + index + " = " + temp.data);
    return temp.data; //Вывод элемента по индексу
    }
}
