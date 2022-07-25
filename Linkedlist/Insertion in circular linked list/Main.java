
import java.util.*;
import java.io.*;

public class Main {

    public static class Node{
        public int val;
        public Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static void solve(Node head, int value){
        Node curr = head;
        while(curr.next!=head){
            curr = curr.next;
        }
        Node newNode = new Node(value);
        curr.next = newNode;
        newNode.next = head;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null, curr = null;
        for(int i=0;i<n;i++){
            if(head==null){
                head = new Node(sc.nextInt());
                curr = head;
            }
            else{
                curr.next = new Node(sc.nextInt());
                curr = curr.next;
            }
        }

        // make this list circular
        curr.next = head;

        int valueOfNewNode = sc.nextInt();
        solve(head,valueOfNewNode);

        curr = head;
        while(curr.next!=head){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.print(curr.val + " ");
    }
}
