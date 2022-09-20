public class Hello {
    private String msg = "Hello, world.";

    private void greet() {
        System.out.println(msg);
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.setMsg("Hallo Propra");
        hello.greet();
    }
}