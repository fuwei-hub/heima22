//���С��Ϸ                                  
/*
1.�����������(1-100)
2.����¼������
3.�ж����ִ�С
4.ѭ���жϴ�С
5.���н���
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
		System.out.println("����������ѡ�����֣�");
		int haoma = sc.nextInt();
		count--;
		if(count==0){System.out.println("��Ǹ����û�л����ˣ�");
			break lo;}
		else{
		    if(haoma > num){System.out.println("����");
		        System.out.println("������ "+count+" �λ���");}
		    else if(haoma < num){System.out.println("����");
			    System.out.println("������ "+count+" �λ���");}
		    else{System.out.println("��ϲ���������");
				System.out.println("��л���Ĳ��룡");
				break lo;}
		}
	}
	}
}

		