package com.monika.advance.LinkedList;

import java.util.Scanner;

public class ReverseMiddleLinkedList {
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
    public static void printLL(Node start){
        while (start!=null){
            System.out.print(start.data+"---->");
            start=start.next;
        }
    }
    public static Node reverseK(Node A,int B,int C){
        if(A==null || A.next==null){
            return A;
        }

        Node start=null;
        Node end=null;
        Node from=null;
        Node to=null;
        Node c=A;
        int i=0;
         while (c!=null) {
             i++;
             if (i < B) {
                 start = c;
             }
             if (i == B) {
                 from = c;
             }
             if (i == C) {
                 to = c;
                 end = c.next;

             }
             c = c.next;
         }

            to.next=null;
           if(i==1){
               return A;
           }
            Node rev= reverseList(from);


             if (start != null) {
                 start.next = to;

             }
             else {
                 A=to;
             }

             if(end!=null){
                 from.next=end;
             }


        return A;
        }
        public static Node reverseList(Node head){
        if(head==null){
            return null;
        }
        Node p=null;
        Node c=head;

        Node tail=c.next;

        while (c!=null || tail!=null){
            tail=c.next;

            c.next=p;

            p=c;

            c=tail;
            System.out.print("tail"+tail+" "+c.next+" "+p+" "+c);


        }

        return p;
    }


    public static int lPalin(Node A) {
        System.out.println(A.data);

        Node p=null;
        Node c=A;

        while(c!=null){
            Node tail=c.next;
            c.next=p;
            p=c;
            c=tail;
        }
      //  printLL(p);
        System.out.println(p.data);
        if(p.data==A.data){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        Node head=createLL(number);
//        printLL(head);
        System.out.println();
        int reverse=lPalin(head);
        System.out.println(reverse);
       // printLL(reverse);

//        Node reverse=reverseList(head);
//        printLL(reverse);
    }
}
