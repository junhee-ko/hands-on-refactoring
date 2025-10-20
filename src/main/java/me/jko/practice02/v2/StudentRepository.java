package me.jko.practice02.v2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StudentRepository {

    private final Map<String, Integer> students = new HashMap<>();

    public void addStudent(String name, int score) {
        students.put(name, score);
    }

    public Collection<Integer> getScores() {
        return students.values();
    }
}