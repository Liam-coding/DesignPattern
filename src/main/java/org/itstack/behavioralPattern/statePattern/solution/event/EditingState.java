package org.itstack.behavioralPattern.statePattern.solution.event;

import org.itstack.behavioralPattern.statePattern.ActivityService;
import org.itstack.behavioralPattern.statePattern.Status;
import org.itstack.behavioralPattern.statePattern.solution.Result;
import org.itstack.behavioralPattern.statePattern.solution.State;

public class EditingState extends State {
    @Override
    public Result arraignment(String activityId, Enum<Status> currentStatus) {
        ActivityService.execStatus(activityId, currentStatus,
                Status.Check);
        return new Result("0000", "arraignment successfully!");
    }

    @Override
    public Result checkPass(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "now in editing process,can't checkPass");
    }

    @Override
    public Result checkRefuse(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "now in editing process,can't checkRefuse");
    }

    @Override
    public Result checkRevoke(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "now in editing process,can't checkRevoke");
    }

    @Override
    public Result close(String activityId, Enum<Status> currentStatus) {
        return new Result("0000", "close successfully");
    }

    @Override
    public Result open(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "no-close process, can't open");
    }

    @Override
    public Result doing(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "now in editing process,can't doing");
    }
}
