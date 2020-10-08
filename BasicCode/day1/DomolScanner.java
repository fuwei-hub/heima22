import java.util.Scanner;
public class Domo03{
	public static void main(String[]args){
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		int ge=(num%10);
		int shi=(num/10%10);
		int bai=(num/100%10);
		System.out.println("请输入任意的三位数：");
		System.out.println("百位是："+bai );
		System.out.println("十位是："+shi);
		System.out.println("个位是："+ge);
		
	}
}
