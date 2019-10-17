public class SinglyLinkedList{
   
   //Node variable and size variable
   Node head;
   int size;
   
   
   //Adds new node to the front of the list.
   public void push (int new_data){
      Node new_node = new Node(new_data);
      new_node.next = head;
      head = new_node;
      
      System.out.println("New Node Added: " + new_node.getData());
   
   }
   
   
   //Inserts a new add after another node.
   public void insertAfter (Node prev_node, int new_data){
      if (prev_node == null){
         System.out.println("previous node is null");
         return;
      }
      
      Node new_node = new Node(new_data);
      
      new_node.next = prev_node.next;
      
      prev_node.next = new_node;
      
      System.out.println("New Node: " + new_node.getData() + " Added After Node: " + prev_node.getData());
   
   
   }
   
   
   //Adds the Node to the end of the singly linked list.
   public void addToEnd(int new_data){
      Node new_node = new Node(new_data);
      
      if (head == null){
         head = new Node(new_data);
         System.out.println("List was empty node added to the front of the list.");
      }
      
      new_node.next = null;
      
      Node last = head;
      
      while(last.next != null){
         last = last.next;
        
      }
      
      last.next = new_node;
      System.out.println("Added Node: " + new_node.getData() + " to the back of the list.");
      
   
   }
   
   
   //Removes Node From The Front Of The List
   public void removeFront(){
      
      Node current_node = head;
      
      head = current_node.next;
      
      current_node = null;
      
      size--;
      
   
   }
   
   //Deletes A Node With A Certain Value
   public void deleteNode(int key){
      Node current_node = head;
      Node prev_node = null;
      
      if (current_node != null && current_node.data == key){
         head = current_node.next;
         size--;

      }
      
      while (current_node != null && current_node.data != key ){
         prev_node = current_node;
         current_node = current_node.next;
         
      }
      
      if (current_node == null){
         System.out.print("current node is null or list is empty");
      }
      
      prev_node.next = current_node.next;
      
   }
   
   
   
   //Prints To The Terminal A Visual List
   public void printList(){
      
      Node current_node = head;
      
      System.out.print("Head--> ");
      
      while (current_node != null){
         System.out.print(current_node.data + "--> ");
         current_node = current_node.next;
         
      }
      
      System.out.print("Null...");
   
   
   }
 




}