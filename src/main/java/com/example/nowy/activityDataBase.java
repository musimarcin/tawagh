package com.example.nowy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Scope("singleton")
public class activityDataBase {
    private List<Activity> activityList = new ArrayList<>();
    private int activityCounter = 1;
    public void addActivity(Activity element){
        element.setId(activityCounter);
        activityList.add(element);
        activityCounter++;
    }

    public List<Activity> getActivityList()
    {
        return activityList;
    }

    public Activity getActivityById(Integer id) {
         for (Activity element : activityList) {
             if (element.getId().equals(id)) {
                 return element;
             }
         }
         return null;
    }

    public List<Activity> getActivityList(Integer ects, String name, Integer room, String exam)
    {
        if (ects==null && name==null && room==null && exam==null) {
            return activityList;
        }
        List<Activity> filteredActivities = new ArrayList<>(activityList);
        if (ects != null) {
            filteredActivities = filteredActivities.stream()
                    .filter(e -> e.getEcts().equals(ects))
                    .collect(Collectors.toList());
        }
        if (name != null) {
            filteredActivities = filteredActivities.stream()
                    .filter(e -> e.getName().equals(name))
                    .collect(Collectors.toList());
        }
        if (room != null) {
            filteredActivities = filteredActivities.stream()
                    .filter(e -> e.getRoom().equals(room))
                    .collect(Collectors.toList());
        }
        if (exam != null) {
            filteredActivities = filteredActivities.stream()
                    .filter(e -> e.getExam().equals(exam))
                    .collect(Collectors.toList());
        }
        /*
        List<Activity> filteredActivities = new ArrayList<>();
        for (Activity element : activityList) {

            if (priority==null && element.getName().equals(name)) {
                    filteredActivities.add(element);
            } else if (name==null && element.getProriety().equals(priority)) {
                        filteredActivities.add(element);
                }
                else {
                    if (element.getName().equals(name) && element.getProriety().equals(priority)) {
                        filteredActivities.add(element);
                    }
                }
            }
         */
        return filteredActivities;
    }
    public void deleteAll(){
        activityList.clear();
    }

  /*  public boolean deleteById(Integer id) {
        Activity toDelete = null;
        for (Activity element : activityList) {
            if (element.getId().equals(id)) {
                toDelete = element;
            }
        }
        return activityList.remove(toDelete);
    }*/

    public void deleteById(Activity activity) {
        activityList.remove(activity);
    }
}
