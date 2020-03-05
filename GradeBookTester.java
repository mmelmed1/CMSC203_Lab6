import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

	GradeBook score1, score2;
	
	@BeforeEach
	void setUp() throws Exception {
		score1 = new GradeBook(5);
		score2 = new GradeBook(5);
	}

	@AfterEach
	void tearDown() throws Exception {
		score1= score2 = null;
	}

	@Test
	void testGradeBook() {
		fail("Not yet implemented");
	}

	@Test
	void testAddScore() {
		
		score1.addScore(3);
		score1.addScore(10);
		score2.addScore(3);
		score2.addScore(4);
		score2.addScore(7);
		
		assertEquals(2, score1.getScoreSize());
		assertEquals(3, score2.getScoreSize());
	}

	@Test
	void testSum() {
		score1.sum();
		assertEquals(13, score1.sum());
		score2.sum();
		assertEquals(14, score2.sum());
	}

	@Test
	void testMinimum() {
		score1.minimum();
		assertEquals(3, score1.minimum());
		score2.minimum();
		assertEquals(3, score2.minimum());
		
		
	}

	@Test
	void testFinalScore() {
		score1.finalScore();
		assertEquals(10, score1.sum());
		score2.finalScore();
		assertEquals(11, score2.sum());
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
