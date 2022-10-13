package com.monika.advance.LinkedList;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int d){
        data =d;

        next=null;
    }
}

public class KReverseList {
    public static int length(Node head){
        int count=0;
        Node t=head;

        while (t!=null){
            count=count+1;
            t=t.next;
        }
        return count;
    }
    public static void printLL(Node start){
       while (start!=null){
           System.out.print(start.data+"---->");
           start=start.next;
       }
    }
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
    public static Node reverseK(Node head,int K){
        int n=length(head);
        if(n<K){
            return  head;
        }
        printLL(head);
        if(head==null){
            return null;
        }
        Node p=null;
        Node c=head;
        int count=0;
        Node tail;
        while (count<K){

            tail=c.next;
            System.out.println("tail");
            printLL(tail);
            c.next=p;
            p=c;
            System.out.println("address");
            printLL(p);
            c=tail;


            count++;
        }

        head.next=reverseK(c,K);
        return p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
           Node head=createLL(number);

        Node reverse=reverseK(head,3);
        printLL(reverse);


    }
}
