package se_8_2021;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LetterGradeTest {

  @Test
  public void EquivalencePartitioningTest() {
    char level = LetterGrade.getGrade(-1);
    assertEquals('X', level);
    level = LetterGrade.getGrade(101);
    assertEquals('X', level);
    level = LetterGrade.getGrade(0);
    assertEquals('F', level);
    level = LetterGrade.getGrade(10);
    assertEquals('F', level);
    level = LetterGrade.getGrade(20);
    assertEquals('F', level);
    level = LetterGrade.getGrade(30);
    assertEquals('F', level);
    level = LetterGrade.getGrade(40);
    assertEquals('F', level);
    level = LetterGrade.getGrade(50);
    assertEquals('F', level);
    level = LetterGrade.getGrade(60);
    assertEquals('D', level);
    level = LetterGrade.getGrade(70);
    assertEquals('C', level);
    level = LetterGrade.getGrade(80);
    assertEquals('B', level);
    level = LetterGrade.getGrade(90);
    assertEquals('A', level);
    level = LetterGrade.getGrade(100);
    assertEquals('A', level);
  }

  @Test
  public void BoundaryValueTest1() {
      // score < 0 or score > 100 'X'
      char level = LetterGrade.getGrade(-2);
      assertEquals('X', level);
      level = LetterGrade.getGrade(-1);
      assertEquals('X', level);
      level = LetterGrade.getGrade(102);
      assertEquals('X', level);
      level = LetterGrade.getGrade(101);
      assertEquals('X', level);

      // 0 <= score < 60 'F'
      level = LetterGrade.getGrade(0);
      assertEquals('F', level);
      level = LetterGrade.getGrade(1);
      assertEquals('F', level);
      level = LetterGrade.getGrade(58);
      assertEquals('F', level);
      level = LetterGrade.getGrade(59);
      assertEquals('F', level);

      // 60 <= score < 70 'D'
      level = LetterGrade.getGrade(60);
      assertEquals('D', level);
      level = LetterGrade.getGrade(61);
      assertEquals('D', level);
      level = LetterGrade.getGrade(68);
      assertEquals('D', level);
      level = LetterGrade.getGrade(69);
      assertEquals('D', level);
  }

  @Test
  public void BoundaryValueTest2() {
      // 70 <= score < 80 'C'
      char level = LetterGrade.getGrade(70);
      assertEquals('C', level);
      level = LetterGrade.getGrade(71);
      assertEquals('C', level);
      level = LetterGrade.getGrade(78);
      assertEquals('C', level);
      level = LetterGrade.getGrade(79);
      assertEquals('C', level);

      // 80 <= score < 90 'B'
      level = LetterGrade.getGrade(80);
      assertEquals('B', level);
      level = LetterGrade.getGrade(81);
      assertEquals('B', level);
      level = LetterGrade.getGrade(88);
      assertEquals('B', level);
      level = LetterGrade.getGrade(89);
      assertEquals('B', level);

      // 90 <= score <= 100 'A'
      level = LetterGrade.getGrade(90);
      assertEquals('A', level);
      level = LetterGrade.getGrade(91);
      assertEquals('A', level);
      level = LetterGrade.getGrade(99);
      assertEquals('A', level);
      level = LetterGrade.getGrade(100);
      assertEquals('A', level);
  }
}
