import java.util.Scanner;
//��������ĵ���
public class Domo03{
	public static void main(String[]args){
		System.out.println("����"+1+"����");
		System.out.println("�򵥵�"+7+8);
		System.out.println(7+8+"˵���ķ�ʽ�򵥵�");
		System.out.println(5%3);
		//%ȡ5����3��������Ҳ����2 
		System.out.println(5/2);
		// ȡ5����2��������Ҳ����2
		/*��������������������������������������������*/
		Scanner a=new Scanner(System.in);//14��15�еġ�a��Ҫһ��
		//��������Ĵ�������
		int num=a.nextInt();
		//����ġ�num"�ǿ��԰���Ҫ���޸ĵģ���һ��������������
		int ge=(num%10);
		int shi=(num/10%10);
		int bai=(num/100%10);
		System.out.println("�������������λ����");
		System.out.println("��λ�ǣ�"+bai );
		System.out.println("ʮλ�ǣ�"+shi);
		System.out.println("��λ�ǣ�"+ge);
		
	}
}
