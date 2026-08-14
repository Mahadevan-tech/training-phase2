import java.util.*;
public class RotatearrList
{
	public static void main(String[] args) {
	    
		List<Integer> num = new ArrayList<>();

		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            num.add(sc.nextInt());
        }
        int k=sc.nextInt();

		for(int i=0;i<k;i++)
		{
		    int last = num.remove(num.size()-1);
		    num.add(0,last);
		}
		System.out.println("Rotated list : "+ num);
		
	}
}