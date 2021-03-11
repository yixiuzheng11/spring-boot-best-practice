package cn.javastack;

public class PublicVar {
        public String username = "A";
        public String password = "AA";

        //同步实例方法
        public  void setValue(String username, String password) {
            try {
                this.username = username;
                Thread.sleep(5000);
                this.password = password;

                System.out.println("method=setValue " +"\t" + "threadName="
                        + Thread.currentThread().getName() + "\t" + "username="
                        + username + ", password=" + password);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //非同步实例方法
        public void getValue() {
            System.out.println("method=getValue " + "\t" +  "threadName="
                    + Thread.currentThread().getName()+ "\t" + " username=" + username
                    + ", password=" + password);
        }
}
