package org.itstack.behavioralPattern.statePattern.solution.event;

import org.itstack.behavioralPattern.statePattern.Status;
import org.itstack.behavioralPattern.statePattern.solution.Result;
import org.itstack.behavioralPattern.statePattern.solution.State;

public class PassState extends State {
    @Override
    public Result arraignment(String activityId, Enum<Status> currentStatus) {
        return null;
    }

    @Override
    public Result checkPass(String activityId, Enum<Status> currentStatus) {
        return null;
    }

    @Override
    public Result checkRefuse(String activityId, Enum<Status> currentStatus) {
        return null;
    }

    @Override
    public Result checkRevoke(String activityId, Enum<Status> currentStatus) {
        return null;
    }

    @Override
    public Result close(String activityId, Enum<Status> currentStatus) {
        return null;
    }

    @Override
    public Result open(String activityId, Enum<Status> currentStatus) {
        return null;
    }

    @Override
    public Result doing(String activityId, Enum<Status> currentStatus) {
        return null;
    }
}
