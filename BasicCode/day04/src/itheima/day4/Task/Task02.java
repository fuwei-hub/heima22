package itheima.day4.Task;


//	请使用静态初始化的方式,创建一个长度为5的整数数组,并为数组中的元素赋值,遍历数组,
//	在同一行打印所有元素,元素之间用空格隔开,
//	比如:如果数组为{1,2,3,4,5}打印结果:1 2 3 4 5
public class Task02 {
    public static void main(String[] args) {
        int[] aar = new int[5];
        aar[0]=12;
        aar[1]=13;
        aar[2]=14;
        aar[3]=15;
        aar[4]=16;
        for (int i = 0; i < aar.length; i++) {
            System.out.print(aar[i] + "  ");
        }


        }
    }

