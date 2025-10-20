package me.jko.practice02.v2;

import java.util.Collection;

public class StudentStatistics {

    public double calculateAverage(Collection<Integer> scores) {
        if (scores.isEmpty()) return 0;

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        return sum / (double) scores.size();
    }
}