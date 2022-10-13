package com.monika.advance.LinkedList;

import java.util.Scanner;

public class LongestPlainDromeL {
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
    public static int count(Node A,Node B){
        int num=0;
        while (A!=null && B!=null){
            if(A.data!=B.data){
                break;
            }
            num=num+1;
            A=A.next;
            B=B.next;
        }
        return  num;
    }
    public static void printLL(Node start){
        while (start!=null){
            System.out.print(start.data+"---->");
            start=start.next;
        }
    }

    public static int greatesPlaindrome(Node A){
        Node head=A;
        Node prev=null;
        int number=length(head);
        System.out.println("length"+number);
        int ans=0;
        while (head!=null){
            Node tail=head.next;
            head.next=prev;

            ans=Math.max(ans,2*count(prev,tail)+1);
            ans=Math.max(ans,2*count(head,tail));


            prev=head;
            head=tail;


        }
        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Node head = createLL(number);
        printLL(head);
       int k= greatesPlaindrome(head);
        System.out.println(k);
    }
}
