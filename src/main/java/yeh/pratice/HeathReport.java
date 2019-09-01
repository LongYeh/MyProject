package yeh.pratice;

public class HeathReport implements Report {
    @Override
    public void load() {
        System.out.println("Heath loading data");
    }

    @Override
    public void print() {
        System.out.println("heath printing");

    }
}
