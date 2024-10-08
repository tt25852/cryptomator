package org.cryptomator.ui.addvaultwizard;

import org.cryptomator.common.vaults.Vault;
import org.cryptomator.ui.fxapp.FxApplicationWindows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.stage.Stage;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class AddVaultSuccessControllerTest {

	private AddVaultSuccessController controller;
	private FxApplicationWindows mockAppWindows;
	private Stage mockStage;
	private ObjectProperty<Vault> vaultProperty;

	@BeforeEach
	void setUp() {
		// Arrange: Mocking dependencies
		mockAppWindows = Mockito.mock(FxApplicationWindows.class);
		mockStage = Mockito.mock(Stage.class);
		vaultProperty = new SimpleObjectProperty<>(Mockito.mock(Vault.class));

		// Initialize the controller with mocked dependencies
		controller = new AddVaultSuccessController(mockAppWindows, mockStage, vaultProperty);
	}

	// 1. Test for unlockAndClose()
	@Test
	void testUnlockAndClose() {
		// Arrange: No special setup needed for this test

		// Act: Call the unlockAndClose() method
		controller.unlockAndClose();

		// Assert: Ensure close() was called and the unlock workflow started
		Mockito.verify(mockStage).close();
		Mockito.verify(mockAppWindows).startUnlockWorkflow(vaultProperty.get(), mockStage);
	}

	// 2. Test for close()
	@Test
	void testClose() {
		// Act: Call the close() method
		controller.close();

		// Assert: Ensure the stage's close method was called
		Mockito.verify(mockStage).close();
	}

	// 3. Test for vaultProperty()
	@Test
	void testVaultProperty() {
		// Act: Get the vault property
		ObjectProperty<Vault> result = (ObjectProperty<Vault>) controller.vaultProperty();

		// Assert: Ensure the vault property is the same as initialized
		assertEquals(vaultProperty, result);
	}

	// 4. Test for getVault()
	@Test
	void testGetVault() {
		// Act: Get the vault from the controller
		Vault result = controller.getVault();

		// Assert: Ensure the vault is the same as the one passed during initialization
		assertEquals(vaultProperty.get(), result);
	}
}
