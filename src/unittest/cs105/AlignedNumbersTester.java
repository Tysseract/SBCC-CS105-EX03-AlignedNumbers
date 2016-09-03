package unittest.cs105;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.sbcc.cs105.AlignedNumbers;

public class AlignedNumbersTester {
	private static final int maximumScore = 6;
	private static final int maximumAssignmentScore = 10;
	private static int totalScore;

	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {
		System.out.printf("Your program's functionality scores %d out of %d.\n\n", totalScore, maximumScore);

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		System.out.printf("The assignment is worth a total of %d where the remainder of %d %s\n",
				maximumAssignmentScore, difference, correctedPoint);
		System.out.println("comes from grading related to documentation, algorithms, and other");
		System.out.println("criteria.");
	}

	@Test
	public void testStatPrintout() throws Exception {
		StringBuilder answer = new StringBuilder();
		answer.append("Sum:                        45\n");
		answer.append("Average:                    22.50\n");
		answer.append("Difference:                 -5\n");
		answer.append("Product:                   500\n");
		answer.append("Distance:                    5\n");
		answer.append("Maximum:                    25\n");
		answer.append("Minimum:                    20\n");

		assertEquals("The strings need to match.", answer.toString(), AlignedNumbers.alignNumbers(20,  25));

		totalScore += 6;
	}

}
