import com.ftanc.controller.GoalController;
import com.ftanc.model.Goal;
import org.junit.Test;

import java.util.List;

static import

import java.util.List;

/**
 * Created by ftanc on 10/10/2016.
 */
public class GoalControllerTest {

    @Test
    public void testGoalGet(){
        GoalController controller = new GoalController();
        List<Goal> goal = controller.getAllGoals();
        assertEquals
    }
}
