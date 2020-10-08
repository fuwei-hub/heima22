//随机小游戏                                  
/*
1.生成随机数字(1-100)
2.键盘录入数字
3.判断数字大小
4.循环判断大小
5.猜中结束
*/
import java.util.Random;
import java.util.Scanner;
public class SuiJi{
	public static void main(String[]args){
		int count=5;
		Random a = new Random();
		//System.out.println(a);	
		Scanner sc = new Scanner(System.in);
		int num = a.nextInt(100)+1;
	lo:while(true){
		System.out.println("请输入您所选的数字！");
		int haoma = sc.nextInt();
		count--;
		if(count==0){System.out.println("抱歉，您没有机会了！");
			break lo;}
		else{
		    if(haoma > num){System.out.println("高了");
		        System.out.println("您还有 "+count+" 次机会");}
		    else if(haoma < num){System.out.println("低了");
			    System.out.println("您还有 "+count+" 次机会");}
		    else{System.out.println("恭喜您，答对了");
				System.out.println("感谢您的参与！");
				break lo;}
		}
	}
	}
}

		