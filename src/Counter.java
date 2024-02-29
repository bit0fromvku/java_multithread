public class Counter extends Thread {
    @Override
    public void run() {
        Tools.count();
    }
}
