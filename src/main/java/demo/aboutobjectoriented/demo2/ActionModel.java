package demo.aboutobjectoriented.demo2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import demo.aboutobjectoriented.demo2.actions.SingleActions;

/**
 * @author
 */
public class ActionModel {

    private String theDescription;
    private List<SingleActions> actions;

    public List<SingleActions> getActions() {
        return actions;
    }

    public String getTheDescription() {
        return theDescription;
    }

    public void setActions(List<SingleActions> actions) {
        this.actions = actions;
    }

    public void setTheDescription(String theDescription) {
        this.theDescription = theDescription;
    }

    public void showTheModel() {
        Objects.nonNull(this.theDescription);
        if (this.actions == null || this.actions.size() == 0) {
            throw new Error("actions cannot empty");
        }
        System.out.println("the model is >>" + this.theDescription);
        System.out.println("=== here is the model actions ===");
        for (SingleActions action : this.actions) {
            if (Objects.nonNull(action)) {
                action.doAction();
                continue;
            }
            System.out.println("the action is empty");
        }
    }
}
