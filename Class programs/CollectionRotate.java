import java.util.*;
public class CollectionRotate
{
	public static void main(String[] args) {
	    
		List<Integer> num = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            num.add(sc.nextInt());
        }
        int k=sc.nextInt();
		
		System.out.println("Before list : "+ num);
		
		Collections.rotate(num,k);
		System.out.println("Right Rotated list : "+ num);
		Collections.rotate(num,-(k+1));
		
		System.out.println("Left Rotated list : "+ num);
		
	}
}