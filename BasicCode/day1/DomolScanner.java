import java.util.Scanner;
public class Domo03{
	public static void main(String[]args){
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		int ge=(num%10);
		int shi=(num/10%10);
		int bai=(num/100%10);
		System.out.println("�������������λ����");
		System.out.println("��λ�ǣ�"+bai );
		System.out.println("ʮλ�ǣ�"+shi);
		System.out.println("��λ�ǣ�"+ge);
		
	}
}
