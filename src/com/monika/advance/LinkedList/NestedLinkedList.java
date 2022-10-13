package com.monika.advance.LinkedList;

import java.util.Scanner;

public class NestedLinkedList {
    public static Node createLL(int N){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number==-1){
            return  null;
        }
        Node head=new Node(number);
        Node tail=head;

        for(int i=1;i<N;i++){
            number=sc.nextInt();
            tail.next=new Node(number);
            tail=tail.next;
        }
        return head;
    }
    public static void printLL(Node start){
        while (start!=null){
            System.out.print(start.data+"---->");
            start=start.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        Node head=createLL(number);
        printLL(head);



    }
}
