package decoratorpattern.problem;


public class ScrollbarWindow extends Window {

    @Override
    public void draw() {
        System.out.println("Draw scrollbar");
        super.draw();
    }
}
