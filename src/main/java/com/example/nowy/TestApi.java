package com.example.nowy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class TestApi {
    @Autowired
    private activityDataBase activityDataBase;

    @GetMapping("test")
    public String TestApi() {
        return "test";
    }
    @PostMapping(value="activities",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void addNewActivity(@RequestBody Activity element)
    {
        activityDataBase.addActivity(element);
    }
    @GetMapping(value="activities",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Activity> getActivities(
            @Nullable @RequestParam("ects") Integer ects,
            @Nullable @RequestParam("name") String name,
            @Nullable @RequestParam("room") Integer room,
            @Nullable @RequestParam("exam") String exam)
    {
        return activityDataBase.getActivityList(ects, name, room, exam);
    }

    @GetMapping(value = "activities/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity getActivityById(@PathVariable("id") Integer id) {
        Activity activity = activityDataBase.getActivityById(id);
        if (activity==null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(activity);
        }
    }

    @DeleteMapping(value = "activities/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        Activity activity = activityDataBase.getActivityById(id);
        activityDataBase.deleteById(activity);
    }
 /*  @DeleteMapping(value = "activities/{id}")
        public ResponseEntity deleteById(@PathVariable("id") Integer id) {
        boolean isDeleted = activityDataBase.deleteById(id);
        if (isDeleted == true) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
       }
*/
    @DeleteMapping(value="activities")
    public void deleteAll() {
        activityDataBase.deleteAll();
    }
}