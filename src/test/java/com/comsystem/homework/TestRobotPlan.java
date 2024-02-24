package com.comsystem.homework;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.comsystem.homework.model.RobotAction;
import com.comsystem.homework.model.RobotPlan;
import com.comsystem.homework.robot.RobotOperations;

public class TestRobotPlan {

    @Test
    public void testExcavateStonesForDays() {
        RobotPlan plan = new RobotOperations().excavateStonesForDays(5);
        assertEquals(3, plan.numberOfStones());
        assertEquals(new ArrayList<RobotAction>(Arrays.asList(RobotAction.DIG, RobotAction.CLONE, RobotAction.DIG,
                RobotAction.CLONE, RobotAction.DIG)), plan.robotActions());
    }

    @Test
    public void testDaysRequiredToCollectStones() {
        RobotPlan plan = new RobotOperations().daysRequiredToCollectStones(3);
        assertEquals(5, plan.numberOfDays());
        assertEquals(new ArrayList<RobotAction>(Arrays.asList(RobotAction.DIG, RobotAction.CLONE, RobotAction.DIG,
                RobotAction.CLONE, RobotAction.DIG)), plan.robotActions());
    }
}
