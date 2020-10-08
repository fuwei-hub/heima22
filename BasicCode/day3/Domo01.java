import java.util.Scanner;
public class Domo01{
	public static void main(String[]args){
		Scanner a=new Scanner(System.in);
		System.out.println("请输入");
		int week=a.nextInt();
		switch(week){
			case 1:
			System.out.println("跑步");
			break;
			case 2:
			System.out.println("游泳");
			break;
			case 3:
			System.out.println("慢走");
			break;
			case 4:
			System.out.println("动感单车");
			break;
			case 5:
			System.out.println("快跑");
			break;
			case 6:
			System.out.println("快活");
			break;
			case 7:
			System.out.println("搓一顿");
			break;
			default:
			System.out.println("输入有误");
			break;	
		}
	}
}