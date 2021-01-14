package demo.aboutobjectoriented.demo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import demo.aboutobjectoriented.demo2.actions.HitAction;
import demo.aboutobjectoriented.demo2.actions.SingleActions;
import demo.aboutobjectoriented.demo2.actions.WalkAction;

/**
 * @author
 */
public class Run {

    public static void main(String[] args) {
        ActionModel actionModel = new ActionModel();
        SingleActions hitAction = new HitAction();
        SingleActions walkAction = new WalkAction();
        List<SingleActions> actions = new ArrayList<>();
        Collections.addAll(actions, hitAction, walkAction, null);

        actionModel.setTheDescription("my hero");
        actionModel.setActions(actions);
        actionModel.showTheModel();
    }
}
