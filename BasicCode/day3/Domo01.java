import java.util.Scanner;
public class Domo01{
	public static void main(String[]args){
		Scanner a=new Scanner(System.in);
		System.out.println("������");
		int week=a.nextInt();
		switch(week){
			case 1:
			System.out.println("�ܲ�");
			break;
			case 2:
			System.out.println("��Ӿ");
			break;
			case 3:
			System.out.println("����");
			break;
			case 4:
			System.out.println("���е���");
			break;
			case 5:
			System.out.println("����");
			break;
			case 6:
			System.out.println("���");
			break;
			case 7:
			System.out.println("��һ��");
			break;
			default:
			System.out.println("��������");
			break;	
		}
	}
}