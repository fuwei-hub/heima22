package test.生产者消费者;

public class Test {
    public static void main(String[] args) {
        Desk desk = new Desk();
        //生产者
        new Thread(){
            @Override
            public void run() {
                while(true){
                    synchronized (desk){
                        if(desk.isFlag()){
                            try {
                                desk.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }else{
                            System.out.println("老八秘制小🍔");
                            desk.setFlag(true);
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
                        if(desk.isFlag()){
                            System.out.println("真不错!!");
                            desk.setFlag(false);
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
    public  boolean flag;

    public Desk() {
    }

    public Desk(boolean flag) {
        this.flag = flag;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "flag=" + flag +
                '}';
    }
}
