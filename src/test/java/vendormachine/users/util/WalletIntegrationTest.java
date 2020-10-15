package vendormachine.users.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class WalletIntegrationTest {

	private Wallet testWallet;
	
	private final float credit = 0.5f;
	private String brand = "InFuse";
	
	
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
		testWallet.addCredit(credit);
		assertThat(1.0f)
			.isEqualTo(this.testWallet.getAllCredit());
		
	}
	
	@Test
	void testSetCredit() {
		testWallet.setCredit(credit * 3);
		assertThat(1.5f)
			.isEqualTo(this.testWallet.getAllCredit());
		
	}
	
	@Test
	void testSetBrand() {
		testWallet.setBrand(brand);
		assertThat(brand)
			.isEqualTo(testWallet.getBrand());
		
	}
}

