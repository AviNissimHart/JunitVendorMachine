package vendormachine;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import vendormachine.users.Person;
import vendormachine.users.util.Wallet;
import vendormachine.vendors.DefaultSnacks;
import vendormachine.vendors.DrinkVendingMachine;

public class DrinkVendingMachineTEST {
	// Resources
			private float credit = 10.0f;
			private Person person = new Person("Alyx", testWallet);;
			private static Wallet testWallet = new Wallet();
			private int arrayPosition = 1;
			
			// Keep track of tests
			private static int activeTest = 1;
			private static StringBuilder sBuilder = new StringBuilder();
			private static String div = "=============================================\n";
			
			@BeforeEach
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
		    public void test_giveCredit(){
				DrinkVendingMachine dvm = new DrinkVendingMachine();
//				dvm.giveCredit(person, credit);
//		        float actual = person.getCredit(credit);
//		        assertTrue(actual == credit);
				 final float giveCredit =2.0f;
			     Person user = new Person("James", new Wallet(giveCredit));
			     assertThat(2.0f)
			     	.isEqualTo(user.getCredit(giveCredit));

		    }
			
			@Test
			public void test_setStartCredit() {
				DrinkVendingMachine dvm = new DrinkVendingMachine();
				dvm.setStartCredit(credit);
				float actual = dvm.getStartCredit();
				assertTrue(actual == credit);
			}
			
			@Test
			public void test_selectDrink() {
				DrinkVendingMachine dvm = new DrinkVendingMachine();
				dvm.setStartCredit(credit);
				dvm.giveCredit(person, 3.5f);
				dvm.selectDrink(arrayPosition);
				
				assertEquals(
						DefaultSnacks.snackList[arrayPosition].name,
						dvm.selectDrink(arrayPosition).name);
				
				assertEquals(
						DefaultSnacks.snackList[arrayPosition].cost(),
						dvm.selectDrink(arrayPosition).cost());

				// use mockito to mock a class
			}
	/** 
	 * Task 2:
	 * 	Objective:
	 * 		Test the Wallet class from:
	 * 		'vendormachine.vendors.DrinkVendingMachine'
	 * 
	 * 	Goal: 
	 * 		80% code/line coverage
	 * 		TDD: analyse code and add missing methods.
	 * */

}
