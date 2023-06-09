import java.util.*;
public class digsum
	{
		public static void main(String[]args)
			{
				Scanner in=new Scanner(System.in);
				System.out.println("Enter the number to find digit sum:");
				int num=in.nextInt();
				int sum=num;
				int fin=0;
				int fin1=0;
				String temp=Integer.toString(num);
				int len=temp.length();
				for(int i=0;i<len;i++)
					{
						System.out.println("1:"+sum%10);
						fin=fin+sum%10;
						if(Integer.toString(fin).length()!=1)
							{
								for(int j=0;j<=Integer.toString(fin).length();j++)
									{
										System.out.println("2:"+fin%10);
										fin1=fin1+fin%10;
										fin=fin/10;
									}
								fin=fin1;
							}
						sum=sum/10;
					}
				System.out.println("3:"+fin);
			}
	}
