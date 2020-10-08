import java.util.Scanner;
public class Domo08{
	public static void main(String[]args){
	Scanner a=new Scanner(System.in);
	System.out.println("请输入你的成绩！");
	int socar=a.nextInt();
	if(socar>100|socar<0){System.out.println("输入有误，请重新输入！");}
	else{if(socar>=90&&socar<=100){System.out.println("恭喜你获得自行车一辆！");}
	    else if(socar>=80&&socar<90){System.out.println("恭喜你获得潮装一套！");}
	    else if(socar>=60&&socar<80){System.out.println("恭喜你获得五三一套！");}
	    else if(socar>=0&&socar<60){System.out.println("恭喜你获得军体拳一套！");}}
	System.out.println();
	}
}
	
