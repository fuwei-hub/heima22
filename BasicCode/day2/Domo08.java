import java.util.Scanner;
public class Domo08{
	public static void main(String[]args){
	Scanner a=new Scanner(System.in);
	System.out.println("��������ĳɼ���");
	int socar=a.nextInt();
	if(socar>100|socar<0){System.out.println("�����������������룡");}
	else{if(socar>=90&&socar<=100){System.out.println("��ϲ�������г�һ����");}
	    else if(socar>=80&&socar<90){System.out.println("��ϲ���ó�װһ�ף�");}
	    else if(socar>=60&&socar<80){System.out.println("��ϲ��������һ�ף�");}
	    else if(socar>=0&&socar<60){System.out.println("��ϲ���þ���ȭһ�ף�");}}
	System.out.println();
	}
}
	
