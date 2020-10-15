package vendormachine.users.util;

import org.junit.jupiter.api.BeforeEach;

public class WalletIntegrationTest {

	private float credit = 10.0f;
	private String brand;
	private static Wallet testWallet = new Wallet();
	
	@BeforeEach
	void init() {
		this.testWallet = new Wallet();
		
	}
}

