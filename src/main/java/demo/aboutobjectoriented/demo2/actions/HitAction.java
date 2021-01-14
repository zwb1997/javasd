package demo.aboutobjectoriented.demo2.actions;

/**
 * @author
 */
public class HitAction implements SingleActions {

    public HitAction() {
        super();
    }

    @Override
    public void doAction() {
        System.out.println("hit it!");
    }
}
