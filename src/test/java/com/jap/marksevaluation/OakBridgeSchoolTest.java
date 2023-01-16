package com.jap.marksevaluation;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OakBridgeSchoolTest {
    OakBridgeSchool oakSchool;

    private int len = 20;
    String[] studentNames = null;
    int math[] = null;
    int science[] = null;
    int english[] = null;
    int language[] = null;
    int social[] = null;
    int rollNo[] = null;
    int total[] = null;

    @BeforeEach
    void setUp() {
        studentNames = new String[]{"Abe", "Gary", "Chloe", "Dave", "Fara", "Harry", "Ira", "Jack", "Jim", "Joel", "Kevin", "Larry", "Levin", "Malcolm", "Navya", "Nathan", "Noel", "Oliver", "Pamela", "Randall"};
        rollNo = new int[]{101, 104, 102, 103, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120};
        math = new int[]{95, 30, 55, 67, 88, 90, 45, 100, 95, 89, 66, 55, 35, 90, 22, 12, 67, 80, 75, 80};
        science = new int[]{95, 30, 55, 67, 83, 90, 54, 100, 95, 89, 66, 55, 35, 90, 22, 19, 67, 80, 75, 80};
        english = new int[]{98, 45, 65, 67, 87, 96, 45, 98, 95, 89, 66, 55, 35, 90, 34, 18, 68, 81, 76, 81};
        language = new int[]{95, 55, 76, 68, 89, 90, 44, 99, 95, 89, 66, 55, 35, 90, 44, 10, 69, 82, 77, 82};
        social = new int[]{95, 88, 44, 70, 81, 93, 36, 99, 95, 89, 66, 55, 35, 90, 23, 20, 70, 83, 78, 80};
        total = new int[]{478, 248, 295, 339, 428, 459, 224, 496, 475, 445, 330, 275, 175, 450, 145, 79, 341, 406, 381, 403};
        oakSchool = new OakBridgeSchool();
    }

    @AfterEach
    void tearDown() {
        oakSchool = null;
    }


    @Test
    public void givenRespectiveMarksArrayCalculateTotalMarks() {
        assertArrayEquals(new int[]{478, 248, 295, 339, 428, 459, 224, 496, 475, 445, 330, 275, 175, 450, 145, 79, 341, 406, 381, 403},
                oakSchool.calculateTotalMarks(math, science, english, language, social));
    }

    @Test
    public void givenTotalMarksCalculateAverageTotalMarks() {
        assertArrayEquals(new int[]{95, 49, 59, 67, 85, 91, 44, 99, 95, 89, 66, 55, 35, 90, 29, 15, 68, 81, 76, 80},
                oakSchool.calculateAverageTotalMarks(total));
    }

    @Test
    public void givenMathMarksCalculateAverageOfMathMarks() {
        assertEquals(66, oakSchool.calculateAverageMathMarks(math));
    }

    @Test
    public void givenScienceMarksCalculateAverageOfScienceMarks() {
        assertEquals(67, oakSchool.calculateAverageScienceMarks(science));
    }

    @Test
    public void givenLanguageMarksCalculateAverageOfLanguageMarks() {
        assertEquals(70, oakSchool.calculateAverageLanguageMarks(language));
    }

    @Test
    public void givenSocialMarksCalculateAverageOfMathMarks() {
        assertEquals(69, oakSchool.calculateAverageSocialMarks(social));
    }

    @Test
    public void givenEnglishMarksCalculateAverageOfEnglishMarks() {
        assertEquals(69, oakSchool.calculateAverageEnglishMarks(english));
    }

    @Test
    public void givenTotalMarksAndStudentNamesFindTopScorer() {
        assertEquals("Jack", oakSchool.findTopScorer(total, studentNames));
    }

    @Test
    public void givenMarksOfAllFiveSubjectsReturnPassedFailedArray() {
        assertArrayEquals(new int[]{1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1},
                oakSchool.isPassed(math,science,social,language,english));
    }
    @Test
    public void givenPassedFailedArrayAndListOfStudentNamesReturnPassedStudentNames()
    {
        assertArrayEquals(new String[]{"Abe", "Chloe", "Dave", "Fara", "Harry", "Ira", "Jack", "Jim", "Joel", "Kevin", "Larry", "Levin", "Malcolm","Noel", "Oliver", "Pamela", "Randall"},
                oakSchool.listOfStudentsPassedTheExam(new int[]{1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1},studentNames));
    }
    @Test
    public void givenPassedFailedArrayAndListOfStudentNamesReturnFailedStudentNames()
    {
        assertArrayEquals(new String[]{"Gary","Navya", "Nathan"},
                oakSchool.listOfStudentsToReAppearForExam(new int[]{1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1},studentNames));
    }
    @Test
    public void givenAverageTotalMarksOfStudentsReturnGradeArray()
    {
        int [] avgTotalMarks = new int[]{95, 49, 59, 67, 85, 91, 44, 99, 95, 89, 66, 55, 35, 90, 29, 15, 68, 81, 76, 80};
        char [] expectedGrades = new char[] {'A','F','E','D','B','A','F','A','A','B','D','E','F','A','F','F','D','B','C','B'};
        assertArrayEquals(expectedGrades,oakSchool.generateGrades(avgTotalMarks));
    }
    @Test
    public void givenTotalMarksAndRollNosOfStudentsReturnTheRollNosInSortedOrder()
    {
       int [] totalMarks = new int[]{478, 248, 295, 339, 428, 459, 224, 496, 475, 445, 330, 275, 175, 450, 145, 79, 341, 406, 381, 403};
       int [] expectedSortedRollNos = new int[]{116,115,113,107,104,112,102,111,103,117,119,120,118,105,110,114,106,109,101,108};
       assertArrayEquals(expectedSortedRollNos,oakSchool.sortByTotalMarks(totalMarks,rollNo));
    }
}
