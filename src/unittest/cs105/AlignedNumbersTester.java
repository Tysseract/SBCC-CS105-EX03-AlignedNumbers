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

import edu.sbcc.cs105.Main;

public class AlignedNumbersTester {
	private static final int maximumScore = 6;
	private static final int maximumAssignmentScore = 10;
	private static int totalScore;

	private PrintStream oldOut;
	private InputStream oldIn;
	private ByteArrayOutputStream baos;
	private ByteArrayInputStream bais;

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

	@Before
	public void setUp() {
		this.baos = new ByteArrayOutputStream();
		this.bais = new ByteArrayInputStream("20 25".getBytes());
		this.oldOut = System.out;
		this.oldIn  = System.in;
		System.setOut(new PrintStream(baos));
		System.setIn(this.bais);
	}

	@After
	public void tearDown() {
		System.setOut(this.oldOut);
		System.setIn(this.oldIn);
	}

	@Test
	public void testStatPrintout() throws Exception {
		Main.main(null);
		System.out.flush();

		StringBuilder answer = new StringBuilder();
		answer.append("Enter the first number: Enter the second number: ");
		answer.append("Sum:                        45\n");
		answer.append("Average:                    22.50\n");
		answer.append("Difference:                 -5\n");
		answer.append("Product:                   500\n");
		answer.append("Distance:                    5\n");
		answer.append("Maximum:                    25\n");
		answer.append("Minimum:                    20\n");

		assertEquals("The strings need to match.", answer.toString(), this.baos.toString());

		this.baos.reset();

		totalScore += 6;
	}

}
