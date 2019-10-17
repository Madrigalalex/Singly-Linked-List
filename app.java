public class app{

   public static void main(String[] args){
      SinglyLinkedList list = new SinglyLinkedList();
      
     list.push(1);
     list.push(3);
     list.push(1);
     list.addToEnd(3);
     list.printList();
     list.removeFront();
     list.printList();
     
     
    
     
   
   }

}