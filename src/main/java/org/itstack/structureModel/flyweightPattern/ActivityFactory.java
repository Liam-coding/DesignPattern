package org.itstack.structureModel.flyweightPattern;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ActivityFactory {
    static Map<Long, Activity> activityMap = new HashMap<>();

    public static Activity getActivity(Long id) {
        Activity activity = activityMap.get(id);
        if (null == activity) {
            activity = new Activity();
            activity.setId(10001L);
            activity.setName("big sales promotion");
            activity.setDesc("it very big sales promotion,,,,,, welcome!!!");
            activity.setStartTime(new Date());
            activity.setStopTime(new Date());
            activityMap.put(id, activity);
        }
        return activity;
    }
}
