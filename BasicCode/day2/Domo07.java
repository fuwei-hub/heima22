public class Domo07{
	public static void main(String[]args){
		int a=185;
		int b=220;
		int c=206;
		System.out.println(++a>b&&c--<b);//1
		System.out.println(a);//a=186
		System.out.println(c);//c=206
		System.out.println(a++<b&&--c<b);//2
		System.out.println(a);//a=187
		System.out.println(c);//c=205
		System.out.println(++a>b||c--<b);//3
		System.out.println(a);//a=188
		System.out.println(c);//c=204
		System.out.println(++a<b||c--<b);//4
		System.out.println(a);//a=189
		System.out.println(c);//c=204
		/*�����������ĸ������a��c��ֵʱ��Ҫ���ǵ����ֵ�Ƿ��Լ������仯��
		&&��ʾ�ң�ֻ�ж����ϲ���ԣ����������һ�����ԵĻ�����ô�����ʽ�ӾͲ������ˣ�����1*/
	}
}