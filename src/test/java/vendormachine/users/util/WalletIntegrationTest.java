package vendormachine.users.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class WalletIntegrationTest {

	private Wallet testWallet;
	
	private final float credit = 0.5f;
	private String brand;
	
	
	@BeforeEach
	void init() {
		this.testWallet = new Wallet();
		
	}
	
	@Test
	void testGetAllCredit() {
		assertThat(this.credit)
			.isEqualTo(this.testWallet.getAllCredit());
	}
	
	@Test
	void testAddCredit() {
		//assertThat(component)
		
	}
	
	@Test
	void testSetCredit() {
		
	}
	
	@Test
	void testSetBrand() {
		
	}
}

