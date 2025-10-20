package me.jko.practice02.v1;

import java.util.HashMap;
import java.util.Map;

public class StudentManager {

    private final Map<String, Integer> students = new HashMap<>();

    public void addStudent(String name, int score) {
        students.put(name, score);
    }

    public double calculateAverage() {
        int sum = 0;

        for (int score : students.values()) {
            sum += score;
        }
        return students.isEmpty() ? 0 : sum / (double) students.size();
    }

    public void sendNotification() {
        double avg = calculateAverage();
        System.out.println("학생 평균 점수: " + avg);
    }
}
