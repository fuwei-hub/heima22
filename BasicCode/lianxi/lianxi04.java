import java.util.Scanner;
public class lianxi04{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("������");
		String week=sc.next();
		switch(week){
			case "һ":
			System.out.println("�ܲ�");
			break;
			case "��":
			System.out.println("��Ӿ");
			break;
			case "��":
			System.out.println("����");
			break;
			case "��":
			System.out.println("���е���");
			break;
			case "��":
			System.out.println("����");
			break;
			case "��":
			System.out.println("���");
			break;
			case "��":
			System.out.println("��һ��");
			break;
			default:
			System.out.println("��������");
			break;	
		}
	}
}