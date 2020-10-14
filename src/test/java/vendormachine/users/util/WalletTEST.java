package vendormachine.users.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class WalletTEST {
	// Resources
		private float credit = 10.0f;
		private static Wallet testWallet = new Wallet();
		
		// Keep track of tests
		private static int activeTest = 1;
		private static StringBuilder sBuilder = new StringBuilder();
		private static String div = "=============================================\n";
		
		@Before
		public void beforeTest() {
			
			// Set Default test Wallet credit
			testWallet.setCredit(credit);
			
			// Start of console test format
			sBuilder.setLength(0);
			sBuilder
			.append("\tTest ").append(activeTest).append("\n")
			.append(div)
			.append("Console:")
			.append("Starting Credit: ").append(testWallet.getAllCredit()).append("\n");
			
			System.out.println(sBuilder.toString());
			activeTest++;
			// End of console test format
		}
		
		
		@Test
	    public void getAllCreditTest(){
	        Wallet wallet = new Wallet();
	        float actual = wallet.getAllCredit();
	        assertTrue(actual == 0.5f);

	    }
		
		@Test
		public void test_addCredit() {
			Wallet wallet = new Wallet();
			wallet.addCredit(credit);
			float actual = wallet.getCredit(10.5f);
			assertTrue(actual == 10.5f);
		}
		
		@Test
		public void test_setCredit() {
			Wallet wallet = new Wallet();
			wallet.setCredit(credit);
			float actual = wallet.getAllCredit();
			assertTrue(actual == credit);
		}
}
