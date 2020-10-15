package vendormachine.users;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import vendormachine.users.util.Wallet;

public class PersonIntegrationTest {
	
	private Person testPerson;

	
	 @Test
	    public void addCreditTest(){
	        Wallet wallet = new Wallet("Generic", 2.0f);
	        Person person = new Person("Avi",wallet);
	        person.addCredit(0.5f);
	        
//	        assertThat(2.5f)
//	        	.isEqualTo(person.getWallet().getAllCredit());
	        // this would have been bad pracitce
	        
	        assertTrue(2.5f == person.getWallet().getAllCredit());
	        
	    }
	 
	 @Test
	    public void getNameTest(){
	        Wallet wallet = new Wallet("Generic", 2.0f);
	        Person person = new Person("Avi",wallet);
	        //assertThat("Avi").isEqualTo(person.getName());
	        assertEquals("Avi", person.getName());

	    }
	 
	 @Test
	 public void example() {
		 	String x = new String("Cat");
	        String z = new String("Cat");
	        System.out.println("X is: " + x);
	        System.out.println("Z is: " + z);
	        System.out.println(x == z);
	        
	 }
}
