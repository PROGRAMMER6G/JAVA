import java.util.*;
public class pyramid
	{
		public static void main(String[]args)
			{
				Scanner in=new Scanner(System.in);
				System.out.println("Enter the number of levels for the under pyramid:");
				int level=in.nextInt();
				for(int row=1;row<level+1;row++)
					{
						for(int space=row;space<level;space++)
							{
								System.out.print("");
							}
						for(int col=row;col<=2*row-1;col++)
							{
								System.out.print(col+"");
							}
						for(int k=2*row-2;k>=row;k--)
							{
								System.out.print(k+"");
							}
						System.out.println();
					}
			}
	}
