package me.jko.practice02.v1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentManagerTest {

    @Test
    void 학생추가후_점수조회_테스트() {
        // given
        StudentManager manager = new StudentManager();

        // when
        manager.addStudent("홍길동", 90);
        manager.addStudent("김철수", 80);

        // then
        double avg = manager.calculateAverage();
        assertEquals(85.0, avg);
    }

    @Test
    void 평균점수_빈학생리스트_테스트() {
        // given
        StudentManager manager = new StudentManager();

        // when
        double avg = manager.calculateAverage();

        // then
        assertEquals(0.0, avg);
    }

    @Test
    void 평균점수_하나만_테스트() {
        // given
        StudentManager manager = new StudentManager();
        manager.addStudent("이영희", 100);

        // when
        double avg = manager.calculateAverage();

        // then
        assertEquals(100.0, avg);
    }
}