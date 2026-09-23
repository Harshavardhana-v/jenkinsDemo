package dvprg1;
import org.testng.Assert;
import org.testng.annotations.Test;
public class ResultTest {
	@Test
	//function to check for passing marks
	public void testPass() {
		Assert.assertEquals(Result.display(55),"pass");
	}
	@Test
	//function to check for fail marks
	public void testFail() {
		Assert.assertEquals(Result.display(35),"fail");
	}
	@Test
	//function to check for invalid input
	public void testInvalid() {
		Assert.assertEquals(Result.display(-5),"invalid");
	}

}
