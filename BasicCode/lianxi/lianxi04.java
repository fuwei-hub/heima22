import java.util.Scanner;
public class lianxi04{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入");
		String week=sc.next();
		switch(week){
			case "一":
			System.out.println("跑步");
			break;
			case "二":
			System.out.println("游泳");
			break;
			case "三":
			System.out.println("慢走");
			break;
			case "四":
			System.out.println("动感单车");
			break;
			case "五":
			System.out.println("快跑");
			break;
			case "六":
			System.out.println("快活");
			break;
			case "七":
			System.out.println("搓一顿");
			break;
			default:
			System.out.println("输入有误");
			break;	
		}
	}
}