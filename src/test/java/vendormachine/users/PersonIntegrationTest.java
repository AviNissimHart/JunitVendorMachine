package vendormachine.users;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import vendormachine.users.util.Wallet;

public class PersonIntegrationTest {
	
	private Person testPerson;

	
	 @Test
	    public void addCreditTest(){
	        Wallet wallet = new Wallet("Generic", 2.0f);
	        Person person = new Person("James",wallet);
	        assertThat(2.0f).isEqualTo(person.getWallet().getAllCredit());
	        assertThat("Generic").isEqualTo(person.getWallet().getBrand());
	        
	    }
	 
	 @Test
	    public void getNameTest(){
	        Wallet wallet = new Wallet("Generic", 2.0f);
	        Person person = new Person("James",wallet);
	        assertThat(2.0f).isEqualTo(person.getWallet().getAllCredit());
	        assertThat("James").isEqualTo(person.getName());
	        
	    }
}
