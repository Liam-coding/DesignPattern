package org.itstack.behavioralPattern.visitorPattern.visitor;

import org.itstack.behavioralPattern.visitorPattern.user.impl.Student;
import org.itstack.behavioralPattern.visitorPattern.user.impl.Teacher;

public interface Visitor {
    void visit(Student student);

    void visit(Teacher teacher);
}
