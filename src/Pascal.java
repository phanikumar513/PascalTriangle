//1
//1 1
//1 2 1
//1 3 3 1 
//1 4 6 4 1
import java.util.*;
public class Pascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int i,j,k,n,m=1;
		System.out.print("enter the number of line you want-");
		n=obj.nextInt();
		System.out.println();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			m=1;
			for(k=1;k<=i;k++)
			{
				System.out.print(m+" ");
				m=m*(i-k)/(k);
			}
			System.out.println();
		}
	}
}
