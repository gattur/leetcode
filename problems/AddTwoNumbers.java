package problems;


class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

public class AddTwoNumbers {

	static ListNode getNum(ListNode l1,ListNode l2) {
		int num1=0;
		int num2=0;
		int pos=0;
		while(l1!=null || l2!=null) {
			if(l1!=null) {
				num1=(num1*10)+l1.val;
				l1=l1.next;
			}
			if(l2!=null) {
				num2=(num2*10)+l2.val;
				l2=l2.next;
			}
		}
		int sum=num1+num2;
		ListNode h=new ListNode(sum%10);
		sum=sum/10;
		ListNode tail=h;
		while(sum>0) {
			int temp=sum%10;
			sum=sum/10;
			ListNode t=new ListNode(temp);
			tail.next=t;
			tail=t;
		}
		return h;
	}
	public static void main(String[] args) {
		ListNode l1=new ListNode(2);
		l1.next=new ListNode(4);
		l1.next.next=new ListNode(3);
		ListNode l2=new ListNode(5);
		l2.next=new ListNode(6);
		l2.next.next=new ListNode(4);
		
		ListNode node=getNum(l1,l2);
		while(node!=null) {
			System.out.println(node.val);
			node=node.next;
		}
	}
	
}
