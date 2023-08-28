package org.itstack.behavioralPattern.iteratorPattern.group;

import org.itstack.behavioralPattern.iteratorPattern.lang.Collection;
import org.itstack.behavioralPattern.iteratorPattern.lang.Iterator;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class GroupStructure implements Collection<Employee, Link> {
    private String groupId;
    private String groupName;
    private Map<String, Employee> employeeMap = new ConcurrentHashMap<String, Employee>();
    private Map<String, List<Link>> linkMap = new ConcurrentHashMap<String, List<Link>>();
    private Map<String, String> invertedMap = new ConcurrentHashMap<String, String>();

    public GroupStructure(String groupId, String groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
    }

    @Override
    public boolean add(Employee employee) {
        return null != employeeMap.put(employee.getuId(), employee);
    }

    @Override
    public boolean remove(Employee employee) {
        return null != employeeMap.remove(employee.getuId());
    }

    @Override
    public boolean addLink(String key, Link link) {
        invertedMap.put(link.getToId(), link.getToId());
        if (linkMap.containsKey(key)) {
            return linkMap.get(key).add(link);
        } else {
            List<Link> links = new LinkedList<Link>();
            links.add(link);
            linkMap.put(key, links);
            return true;
        }
    }

    @Override
    public boolean removeLink(String key) {
        return null != linkMap.remove(key);
    }

    @Override
    public Iterator<Employee> iterator() {
        return new Iterator<Employee>() {
            HashMap<String, Integer> keyMap = new HashMap<>();

            int totalIdx = 0;
            private String fromId = groupId;
            private String toId = groupId;

            @Override
            public boolean hasNext() {
                return totalIdx < employeeMap.size();
            }

            @Override
            public Employee next() {
                List<Link> links = linkMap.get(toId);
                int cursorIdx = getCursorIdx(toId);
                // in the same level scanning
                if (links == null) {
                    cursorIdx = getCursorIdx(fromId);
                    links = linkMap.get(fromId);
                }
                //parent Node scanning
                while (cursorIdx > links.size() - 1) {
                    fromId = invertedMap.get(fromId);
                    cursorIdx = getCursorIdx(fromId);
                    links = linkMap.get(fromId);
                }

                //get Node
                Link link = links.get(cursorIdx);
                toId = link.getToId();
                fromId = link.getFromId();
                totalIdx++;
                return employeeMap.get(link.getToId());
            }

            //define iterator rate of progress for every level
            private int getCursorIdx(String key) {
                int idx = 0;
                if (keyMap.containsKey(key)) {
                    idx = keyMap.get(key);
                    keyMap.put(key, ++idx);
                } else {
                    keyMap.put(key, idx);
                }
                return idx;
            }
        };
    }
}
