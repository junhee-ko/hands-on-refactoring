package me.jko.practice02.v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Collections;

class StudentStatisticsTest {

    @Test
    void 여러점수_평균계산_테스트() {
        // given
        StudentStatistics stats = new StudentStatistics();
        List<Integer> scores = List.of(90, 80, 70);

        // when
        double avg = stats.calculateAverage(scores);

        // then
        assertEquals(80.0, avg);
    }

    @Test
    void 한명점수_평균계산_테스트() {
        // given
        StudentStatistics stats = new StudentStatistics();
        List<Integer> scores = List.of(100);

        // when
        double avg = stats.calculateAverage(scores);

        // then
        assertEquals(100.0, avg);
    }

    @Test
    void 빈점수리스트_평균계산_테스트() {
        // given
        StudentStatistics stats = new StudentStatistics();
        List<Integer> scores = Collections.emptyList();

        // when
        double avg = stats.calculateAverage(scores);

        // then
        assertEquals(0.0, avg);
    }

    @Test
    void 소수점계산_테스트() {
        // given
        StudentStatistics stats = new StudentStatistics();
        List<Integer> scores = List.of(95, 85);

        // when
        double avg = stats.calculateAverage(scores);

        // then
        assertEquals(90.0, avg);
    }
}