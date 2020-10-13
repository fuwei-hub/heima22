package 多线程.生产者和消费者;

public class Test {
    public static void main(String[] args) {
        Desk desk = new Desk();
        new Thread(new Runnable() {
            //生产者
            @Override
            public void run() {
                while (true){
                    synchronized (desk){
                        if(desk.isFalg()){
                            try {
                                desk.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }else{
                            System.out.println("老八秘制小🍔");
                            desk.setFalg(true);
                            desk.notifyAll();
                        }
                    }
                }

            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (desk){
                        if(desk.isFalg()){
                            System.out.println("哎妈,真香");
                            desk.setFalg(false);
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
        }).start();
    }
}





class Desk{
    private boolean falg;

    public Desk() {
    }

    public Desk(boolean falg) {
        this.falg = falg;
    }

    public boolean isFalg() {
        return falg;
    }

    public void setFalg(boolean falg) {
        this.falg = falg;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "falg=" + falg +
                '}';
    }
}