import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;
    Node(int newData){
        data = newData;
        next = null;
    }
}
class LinkedList {
    Node head;

    void addNode(int data) {
        Node newNode = new Node(data);

        //if adding the firstNode
        if (head == null) {
            head = newNode;
            return;
        }
        Node current;
        current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // void PrintList() {
    //     Node current;
    //     current = head;
    //     while (current != null) {
    //         System.out.print(current.data + " ");
    //         current = current.next;
    //     }
    // }
    boolean CompareList(LinkedList listl1,LinkedList listl2){
          Node current1 = listl1.head;
          Node current2 = listl2.head;
          while(current1!=null && current2!=null){
              if(current1.data != current2.data){
                  return false;
              }
              current1 = current1.next;
              current2 = current2.next;
          }
          return (current1==null && current2==null);   
    }
    
}
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        LinkedList listl1 = new LinkedList();
        LinkedList listl2 = new LinkedList();
        LinkedList comp = new LinkedList();
        for (int i = 0; i < m; i++) {
            int mElements = sc.nextInt();
            listl1.addNode(mElements);
        }
        for(int i=0;i<n;i++){
           int nElements = sc.nextInt();
           listl2.addNode(nElements);
        }
        boolean ans = comp.CompareList(listl1,listl2);
        if(ans==true){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}

/*class Node {
    int data;
    Node next;
    Node(int newData){
        data = newData;
        next = null;
    }
}
class LinkedList {
    Node head;

    void addNode(int data) {
        Node newNode = new Node(data);

        //if adding the firstNode
        if (head == null) {
            head = newNode;
            return;
        }
        Node current;
        current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    void PrintList() {
        Node current;
        current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    boolean CompareList(LinkedList listl1,LinkedList listl2){
          Node current1 = listl1.head;
          Node current2 = listl2.head;
          while(current1!=null && current2!=null){
              if(current1.data != current2.data){
                  return false;
              }
              current1 = current1.next;
              current2 = current2.next;
          }
          return (current1==null && current2==null);   
    }
    
}
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        LinkedList listl1 = new LinkedList();
        LinkedList listl2 = new LinkedList();
        LinkedList comp = new LinkedList();
        for (int i = 0; i < m; i++) {
            int mElements = sc.nextInt();
            listl1.addNode(mElements);
        }
        for(int i=0;i<n;i++){
           int nElements = sc.nextInt();
           listl2.addNode(nElements);
        }
        boolean ans = comp.CompareList(listl1,listl2);
        if(ans==true){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}*/

