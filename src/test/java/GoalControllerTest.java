import com.ftanc.controller.GoalController;
import com.ftanc.model.Goal;
import com.ftanc.repository.GoalRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by ftanc on 10/10/2016.
 */
public class GoalControllerTest {
    @InjectMocks
    private GoalController goalController;

    @Mock
    private GoalRepository goalRepository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGoalGet(){
        Goal mockedGoal = new Goal();
        mockedGoal.setId(1);
        when(goalRepository.findOne(1L)).thenReturn(mockedGoal);
        Goal goal = goalController.getOneGoal(1L);
        assertEquals(1L, goal.getId());
    }
}
