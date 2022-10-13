package com.monika.advance.LinkedList;

import java.util.Scanner;

public class InsertLinkedList {
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
    public static int length(Node head){
        int count=0;
        Node t=head;

        while (t!=null){
            count=count+1;
            t=t.next;
        }
        return count;
    }
    public static Node insert(Node head,int k,int data){
        int number=length(head);
       if(k>number){
           return  head;
       }
       if(k==0){
           Node n=new Node(data);
           n.next=head;
           return n;
       }
       Node t=head;
       for(int i=1;i<k-1;i++){
           t=t.next;
       }
       Node n=new Node(data);
       n.next=t.next.next;
       t.next.next=n;
       return head;
    }
    public static Node deleteNode(Node A){
        if(A.next == null) return null;
        int number=length(A);
        int mid=0;
       if(number%2==0){
           mid=(number/2)+1;
       }
       else {
           mid=(number+1)/2;
       }

        Node n=A;
       for(int i=1; i<mid-1;i++){
            n=n.next;
        }
        n.next = n.next.next;
        return A;
    }
    public static Node deleteNodeAtPosition(Node A,int K){
        int number=length(A);

       if(K>number){
           return A;
       }
        if(K==1){
         A=A.next;
         return A;

        }
        Node n=A;
        for(int i=2; i<K;i++){
            n=n.next;
        }

        n.next = n.next.next;
        return A;
    }
    public static Node deleteNodeFromLastPosition(Node A,int K){
        int number=length(A);
        System.out.println("number"+number);
        if(K>number){
            A=A.next;
            return A;
        }
        if(number==1){

            return null;
        }
        Node n=A;
        int temLen=number-K+1;
        System.out.println(temLen);
        if(temLen==1)
        {
            A=A.next;
            return A;
        }
        for(int i=1; i<temLen-1;i++){
            n=n.next;
        }

        n.next = n.next.next;
        return A;
    }
    public static Node deleteDuplicate(Node A) {
        Node tail=A;
        while (tail.next!=null) {
            if (tail.data == tail.next.data) {
                if (tail.next != null) {
                    tail.next = tail.next.next;
                }
                else {
                    tail.next=null;
                }
            } else {
                tail = tail.next;

            }
        }
        return A;
    }
        public static int getMiddleElement(Node A){
        if(A.next == null) return 0;
        int number=length(A);
        int mid=0;
        if(number%2==0){
            mid=(number/2)+1;
        }
        else {
            mid=(number+1)/2;
        }
        Node n=A;
        for(int i=1; i<mid-1;i++){
            n=n.next;
        }
        return   n.next.data;

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
      //  printLL(head);
//        System.out.println();
//        head=insert(head,2,6);
//        printLL(head);
//        System.out.println();
//        head=deleteNode(head);
//        printLL(head);
//        System.out.println();
//        head=deleteNodeAtPosition(head,2);
//        printLL(head);
        System.out.println();
        head=deleteDuplicate(head);
        printLL(head);


        System.out.println();
//        int n=getMiddleElement(head);
//        System.out.println(n);


    }
}
