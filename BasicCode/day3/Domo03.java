/*������е�ˮ�ɻ���
1.���100-999������
2.��ÿ�����ֵĸ�λ��ʮλ����λ�г���
3.����ˮ�ɻ����Ĺ����ж��������͵���
4.�����ӡ
*/

public class Domo03{
	public static void main(String[]args){
		int count=0;
		for(int i=100;i<=999;i++){
			//i
		int ge=i%10;
		int shi=i/10%10;
		int bai=i/100%10;
		if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i ){
			System.out.print(i+"  ");
			count++;
			if(count%2==0){System.out.println();}
		}		
		}
		
		
		
		
			
	}
}