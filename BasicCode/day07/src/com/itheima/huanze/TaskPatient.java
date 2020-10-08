package com.itheima.huanze;

public class TaskPatient {
    public static void main(String[] args) {
        Patient m=new Patient();
        m.setName("王二狗");
        m.setXingbie("男");
        m.setBingqing("病入膏肓");
        m.setChushengnianyue(19990424);
        String s = m.toString();
        System.out.println(s);

        Patient n=new Patient("王三胖","男",20001212,"非常严重");
        n.zhuyuan("住院");
    }
}
