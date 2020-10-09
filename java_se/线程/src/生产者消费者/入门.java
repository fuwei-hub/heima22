package 生产者消费者;

public class 入门 {
    public static void main(String[] args) {
        Desk desk = new Desk();

        //生产者
        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized(desk){
                        if(desk.flag){
                            try {
                                desk.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }else{
                            System.out.println("老八秘制小🍔");
                            desk.flag=true;
                            desk.notifyAll();
                        }
                    }
                }
            }
        }.start();


        //消费者
        new Thread(){
            @Override
            public void run() {
                while(true){
                    synchronized (desk){
                        if(desk.flag){
                            System.out.println("真不戳");
                            desk.flag=false;
                            desk.notifyAll();
                        }else{
                            try {
                                desk.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }.start();
    }
}


class Desk{
    public boolean flag;
}
