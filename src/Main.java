//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public Main() {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.start();
        c2.start();
    }
    public static void main(String[] args) {
        new Main();
    }
}