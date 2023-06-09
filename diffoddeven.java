import java.util.linkedLIST;
import java.util.Queue;
public class diffoddeven
	{
		public static class Node
			{
				int data;
				Node left;
				Node right;
				public Node(int data)
					{
						this.data=data;
						this.left=null;
						this.right=null;
					}
			}
		public Node root;
		public diffoddeven()
			{
				root=null;
			}
		public int difference()
			{
				int oddlevel=0,evenlevel=0,diffoddeven=0;
				int nodesinlevel=0;
				int currentlevel=0;
				Queue<Node>queue=new Linkedlist<Node>
				if(root==null)
					{
						System.out.println("Tree is empty");
						return 0;
					}
				else
					{
						queue.add(root);
						currentlevel++;
						while(queue.size()!=0)
						evenlevel+=current.data;
						else
						oddlevel+=current.data;
						if(current.left!=null)
						queue.add(current.left);
						if(current.right!=null)
						queue.add(current.right);
						nodesinlevel--;
					}
					currentlevel++;
					diffoddeven=Math.abs(oddlevel-evenlevel);
			}
			return diffoddeven;
	}
public static void main(String[]args)
	{
		diffoddeven bt=new diffoddeven();
		bt.root=new Node(1);
		bt.root.left=new Node(2);
		bt.root.right=new Node(3);
		bt.root.left.left=new Node(4);
		bt.root.left.right=new Node(5);
		bt.root.right.left=new Node(6);
		bt.root.right.right=new Node(7);
		System.out.println("Difference between sum of odd level and even level nodes:"+bt.difference());
	}
