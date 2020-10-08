import java.util.Scanner;
//键盘输入的导包
public class Domo03{
	public static void main(String[]args){
		System.out.println("爱就"+1+"个字");
		System.out.println("简单点"+7+8);
		System.out.println(7+8+"说话的方式简单点");
		System.out.println(5%3);
		//%取5除于3的余数，也就是2 
		System.out.println(5/2);
		// 取5除于2的整数，也就是2
		/*。。。。。。。。。。。。。。。。。。。。。。*/
		Scanner a=new Scanner(System.in);//14和15行的“a”要一样
		//键盘输入的创建对象
		int num=a.nextInt();
		//这里的“num"是可以按照要求修改的，这一步叫做结束数据
		int ge=(num%10);
		int shi=(num/10%10);
		int bai=(num/100%10);
		System.out.println("请输入任意的三位数：");
		System.out.println("百位是："+bai );
		System.out.println("十位是："+shi);
		System.out.println("个位是："+ge);
		
	}
}
