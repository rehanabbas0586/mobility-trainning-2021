package exr;

public class RvLl {

    public static void printList (Node rv){
        while(rv!=null)
        {
            System.out.println(rv.data);
            rv=rv.next;
        }
    }

    public static void reverseList( )
    {
        String a="andriod";
        String b="ios";
        String c="linux";
        String d="windows";
        
        System.out.println(a+" "+b+" "+c+" "+d);
        
        String temp=a;
        a=d;
        d=temp;
        temp=c;
        c=b;
        b=temp;
        System.out.println(a+" "+b+" "+c+" "+d);

    }
    public static void main(String[] args) {
        Node nd=new Node();
        nd.data=100;
        nd.next=null;

        Node nd1=new Node();
        nd1.data=200;
        nd1.next=nd;

        Node nd2=new Node();
        nd2.data=300;
        nd2.next=nd1;

         //printList(nd2);
         reverseList();
    }
}
