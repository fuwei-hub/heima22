import java.util.Scanner;
public class lianxi{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入您的第一个序号！");
		int yi=sc.nextInt();
		if(yi>10|yi<0){System.out.println("请输正确的序号！");
		}
		else{System.out.println("好了！");}
	}
	}