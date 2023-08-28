package org.itstack.behavioralPattern.visitorPattern;

import org.itstack.behavioralPattern.visitorPattern.user.User;
import org.itstack.behavioralPattern.visitorPattern.user.impl.Student;
import org.itstack.behavioralPattern.visitorPattern.user.impl.Teacher;
import org.itstack.behavioralPattern.visitorPattern.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class DataView {
    List<User> userList = new ArrayList<User>();

    public DataView() {
        userList.add(new Student("student1", "an elite class", "Class1 for 1years"));
        userList.add(new Student("student2", "an elite class", "Class1 for 1years"));
        userList.add(new Student("student3", "normal class", "Class3 for 2years"));
        userList.add(new Student("student4", "normal class", "Class4 for 3years"));
        userList.add(new Teacher("teacher1", "special teacher", "Class1 for 1years"));
        userList.add(new Teacher("teacher2", "special teacher", "Class1 for 1years"));
        userList.add(new Teacher("teacher3", "normal teacher", "Class3 for 2years"));
        userList.add(new Teacher("teacher4", "inter teacher", "Class4 for 3years"));
    }

    public void show(Visitor visitor) {
        for (User user : userList) {
            user.accept(visitor);
        }
    }
}
