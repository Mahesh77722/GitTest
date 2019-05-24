import java.util.Scanner;
class StarTrianglePatten{
	public static void main(String []args){
	Scanner s=new Scanner(System.in);
	System.out.print("How many star: ");
	int n=s.nextInt();
	int i,k;
	for(i=0;i<n;i++){
		for(k=0;k<=i;k++){
			System.out.print("*");
		}
		System.out.println();
	}
	}
}