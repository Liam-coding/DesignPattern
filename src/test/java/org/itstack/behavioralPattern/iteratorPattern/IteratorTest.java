package org.itstack.behavioralPattern.iteratorPattern;

import org.itstack.behavioralPattern.iteratorPattern.group.Employee;
import org.itstack.behavioralPattern.iteratorPattern.group.GroupStructure;
import org.itstack.behavioralPattern.iteratorPattern.group.Link;
import org.itstack.behavioralPattern.iteratorPattern.lang.Iterator;
import org.junit.jupiter.api.Test;


public class IteratorTest {
    @Test
    public void test_iterator() {
        GroupStructure groupStructure = new GroupStructure("1", "􀩜􀘓􀟵");
        groupStructure.add(new Employee("2", "two level 001", "the level2 department"));
        groupStructure.add(new Employee("3", "two level 002", "the level2 department"));
        groupStructure.add(new Employee("4", "three level 001", "the level3 department"));
        groupStructure.add(new Employee("5", "three level 002", "the level3 department"));
        groupStructure.add(new Employee("6", "four level 001", "the level4 department"));
        groupStructure.add(new Employee("7", "four level 002", "the level4 department"));
        groupStructure.add(new Employee("8", "four level 003", "the level4 department"));
        // node relationShip 1->(1,2) 2->(4,5)
        groupStructure.addLink("1", new Link("1", "2"));
        groupStructure.addLink("1", new Link("1", "3"));
        groupStructure.addLink("2", new Link("2", "4"));
        groupStructure.addLink("2", new Link("2", "5"));
        groupStructure.addLink("5", new Link("5", "6"));
        groupStructure.addLink("5", new Link("5", "7"));
        groupStructure.addLink("5", new Link("5", "8"));
        Iterator<Employee> iterator = groupStructure.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println("Id: " + employee.getuId() + ",Name:" + employee.getName() + "description:" + employee.getDesc());
        }
    }
}
