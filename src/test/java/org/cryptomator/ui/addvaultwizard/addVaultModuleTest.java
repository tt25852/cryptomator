package org.cryptomator.ui.addvaultwizard;

import org.cryptomator.common.vaults.Vault;

import org.cryptomator.ui.common.DefaultSceneFactory;
import org.cryptomator.ui.common.FxController;
import org.cryptomator.ui.common.FxmlFile;
import org.cryptomator.ui.common.FxmlLoaderFactory;
import org.cryptomator.ui.common.StageFactory;


import javax.inject.Provider;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;

import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.nio.file.Path;
import java.util.Map;
import java.util.ResourceBundle;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class AddVaultModuleTest {

	private Stage primaryStage;
	private StageFactory stageFactory;
	private FxmlLoaderFactory fxmlLoaderFactory;
	private Map<Class<? extends FxController>, Provider<FxController>> factories;
	private DefaultSceneFactory sceneFactory;
	private ResourceBundle resourceBundle;

	@BeforeEach
	void setUp() {
		// Arrange: Set up mocks and test data
		primaryStage = mock(Stage.class);
		stageFactory = mock(StageFactory.class);
		fxmlLoaderFactory = mock(FxmlLoaderFactory.class);
		factories = mock(Map.class);
		sceneFactory = mock(DefaultSceneFactory.class);
		resourceBundle = mock(ResourceBundle.class);
	}

	@Test
	void testProvideStage() {
		// Arrange: Mock the creation of a Stage
		Stage mockStage = mock(Stage.class);
		when(stageFactory.create()).thenReturn(mockStage);

		// Act: Call the provideStage method
		Stage resultStage = AddVaultModule.provideStage(stageFactory, primaryStage);

		// Assert: Check that the stage was configured correctly
		assertNotNull(resultStage);
		verify(mockStage).setResizable(false);
		verify(mockStage).initModality(Modality.WINDOW_MODAL);
		verify(mockStage).initOwner(primaryStage);
	}

	@Test
	void testProvideVaultPath() {
		// Act: Call the provideVaultPath method
		ObjectProperty<Path> vaultPath = AddVaultModule.provideVaultPath();

		// Assert: Ensure that an ObjectProperty was returned
		assertNotNull(vaultPath);
		assertTrue(vaultPath.isNull().get());
	}

	@Test
	void testProvideVaultName() {
		// Act: Call the provideVaultName method
		StringProperty vaultName = AddVaultModule.provideVaultName();

		// Assert: Check that the vault name is initialized as an empty string
		assertNotNull(vaultName);
		assertEquals("", vaultName.get());
	}

	@Test
	void testProvideShorteningThreshold() {
		// Act: Call the provideShorteningThreshold method
		IntegerProperty shorteningThreshold = AddVaultModule.provideShorteningThreshold();

		// Assert: Check that the threshold is set to the max value
		assertNotNull(shorteningThreshold);
		assertEquals(CreateNewVaultExpertSettingsController.MAX_SHORTENING_THRESHOLD, shorteningThreshold.get());
	}

	@Test
	void testProvideVault() {
		// Act: Call the provideVault method
		ObjectProperty<Vault> vault = AddVaultModule.provideVault();

		// Assert: Ensure that an ObjectProperty was returned
		assertNotNull(vault);
		assertTrue(vault.isNull().get());
	}



	@Test
	void testProvideChooseExistingVaultScene() {
		// Arrange: Mock the creation of a scene
		Scene mockScene = mock(Scene.class);
		when(fxmlLoaderFactory.createScene(FxmlFile.ADDVAULT_EXISTING)).thenReturn(mockScene);

		// Act: Call the method to provide the scene
		Scene resultScene = AddVaultModule.provideChooseExistingVaultScene(fxmlLoaderFactory);

		// Assert: Ensure that the scene was created correctly
		assertNotNull(resultScene);
		verify(fxmlLoaderFactory).createScene(FxmlFile.ADDVAULT_EXISTING);
	}

	@Test
	void testProvideCreateNewVaultPasswordScene() {
		// Arrange: Mock the creation of a scene
		Scene mockScene = mock(Scene.class);
		when(fxmlLoaderFactory.createScene(FxmlFile.ADDVAULT_NEW_PASSWORD)).thenReturn(mockScene);

		// Act: Call the method to provide the scene
		Scene resultScene = AddVaultModule.provideCreateNewVaultPasswordScene(fxmlLoaderFactory);

		// Assert: Ensure that the scene was created correctly
		assertNotNull(resultScene);
		verify(fxmlLoaderFactory).createScene(FxmlFile.ADDVAULT_NEW_PASSWORD);
	}
}
