//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main2 {
    public Main2() {
        try {
            Counter2 c1 = new Counter2();
            Counter2 c2 = new Counter2();

            Thread t1 = new Thread(c1);
            Thread t2 = new Thread(c2);

            t1.start();
            t1.join();
            t2.start();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Main2();
    }
}