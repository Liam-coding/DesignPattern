package org.itstack.behavioralPattern.visitorPattern.visitor.impl;

import org.itstack.behavioralPattern.visitorPattern.user.impl.Student;
import org.itstack.behavioralPattern.visitorPattern.user.impl.Teacher;
import org.itstack.behavioralPattern.visitorPattern.visitor.Visitor;

public class Principal implements Visitor {
    @Override
    public void visit(Student student) {
        System.out.println("student name: " + student.name + ",class: " + student.clazz);
    }

    @Override
    public void visit(Teacher teacher) {
        System.out.println("teacher name: " + teacher.name + ",entrance rate: " + teacher.entranceRatio());
    }
}
