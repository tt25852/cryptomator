### Ruo Tian Tang 20090404

### Rechache Rafik 20200123

## Cas d'étude : Cryptomator

On a fait 11 tests en total, et la couverture est passée de 13.43% à 13.71%. Pour la majorité de tests, on a choisit des fonctions simples, parce qu'elles sont des bases de programme, il est importante de s'assurer elles marchent correctement. 

#### Test 1: testProvideVault() 

---

Code Source: https://github.com/tt25852/cryptomator/blob/24b696e572d90d41605f87c9ea3339d7361e94a8/src/main/java/org/cryptomator/ui/addvaultwizard/AddVaultModule.java#L79

Test: https://github.com/tt25852/cryptomator/blob/24b696e572d90d41605f87c9ea3339d7361e94a8/src/test/java/org/cryptomator/ui/addvaultwizard/addVaultModuleTest.java#L100

Ce test vérifie que la fonction provideVault() initialise correctement le coffre et s'assure qu'il n'est pas nul.

#### Test 2: testProvideCreateNewVaultPasswordScene() 

---

Code Source:  https://github.com/tt25852/cryptomator/blob/24b696e572d90d41605f87c9ea3339d7361e94a8/src/main/java/org/cryptomator/ui/addvaultwizard/AddVaultModule.java#L116

Test: https://github.com/tt25852/cryptomator/blob/24b696e572d90d41605f87c9ea3339d7361e94a8/src/test/java/org/cryptomator/ui/addvaultwizard/addVaultModuleTest.java#L126

Ce test vérifie que la fonction provideCreateNewVaultPasswordScene() créer correctement la nouvelle scene. 
#### Test 3: testProvideChooseExistingVaultScene()

---

Code Source: https://github.com/tt25852/cryptomator/blob/24b696e572d90d41605f87c9ea3339d7361e94a8/src/main/java/org/cryptomator/ui/addvaultwizard/AddVaultModule.java#L95

Test: https://github.com/tt25852/cryptomator/blob/24b696e572d90d41605f87c9ea3339d7361e94a8/src/test/java/org/cryptomator/ui/addvaultwizard/addVaultModuleTest.java#L112

On a fait un mocking pour simuler la création d'une scène de coffre existant et vérifie que la scène est créée comme prévu à l'aide du FxmlLoaderFactory.  

#### Test 4: testProvideVaultName()

---

Code Source: https://github.com/tt25852/cryptomator/blob/24b696e572d90d41605f87c9ea3339d7361e94a8/src/main/java/org/cryptomator/ui/addvaultwizard/AddVaultModule.java#L65

Test: https://github.com/tt25852/cryptomator/blob/24b696e572d90d41605f87c9ea3339d7361e94a8/src/test/java/org/cryptomator/ui/addvaultwizard/addVaultModuleTest.java#L80

Ce test vérifie que la méthode provideVaultName() renvoie un StringProperty initialisé pour le nom du coffre.

#### Test 5: testProvideVaultPath()

---

Code Source: https://github.com/tt25852/cryptomator/blob/24b696e572d90d41605f87c9ea3339d7361e94a8/src/main/java/org/cryptomator/ui/addvaultwizard/AddVaultModule.java#L58

Test: https://github.com/tt25852/cryptomator/blob/24b696e572d90d41605f87c9ea3339d7361e94a8/src/test/java/org/cryptomator/ui/addvaultwizard/addVaultModuleTest.java#L70

Ce test vérifie que la fonction provideVaultPath() renvoie un ObjectProperty<Path> correctement initialisé.

#### Test 6: testProvideStage()

---

Code Source: https://github.com/tt25852/cryptomator/blob/24b696e572d90d41605f87c9ea3339d7361e94a8/src/main/java/org/cryptomator/ui/addvaultwizard/AddVaultModule.java#L48

Test: https://github.com/tt25852/cryptomator/blob/24b696e572d90d41605f87c9ea3339d7361e94a8/src/test/java/org/cryptomator/ui/addvaultwizard/addVaultModuleTest.java#L54

Ce test vérifie que la méthode provideStage() configure correctement la fenêtre Stage avec les propriétés de fenêtre et la modalité appropriées. On a fait un mocking pour simuler la scène et vérifie son état après avoir appelé la fonction.

#### Test 7: testProvideShorteningThreshold()

---

Code Source: https://github.com/tt25852/cryptomator/blob/24b696e572d90d41605f87c9ea3339d7361e94a8/src/main/java/org/cryptomator/ui/addvaultwizard/AddVaultModule.java#L72

Test: https://github.com/tt25852/cryptomator/blob/24b696e572d90d41605f87c9ea3339d7361e94a8/src/test/java/org/cryptomator/ui/addvaultwizard/addVaultModuleTest.java#L90

Ce test vérifie que la méthode provideShorteningThreshold() initialise correctement la propriété IntegerProperty pour la valeur seuil de raccourcissement.

#### Test 8: testUnlockAndClose() 

---

Code Source: https://github.com/tt25852/cryptomator/blob/24b696e572d90d41605f87c9ea3339d7361e94a8/src/main/java/org/cryptomator/ui/addvaultwizard/AddVaultSuccessController.java#L28

Test: https://github.com/tt25852/cryptomator/blob/24b696e572d90d41605f87c9ea3339d7361e94a8/src/test/java/org/cryptomator/ui/addvaultwizard/AddVaultSuccessControllerTest.java#L34

 Ce test vérifie que la méthode unlockAndClose() appelle correctement la fermeture de la fenêtre et démarre le workflow de déverrouillage du coffre.

#### Test 9: testClose()

---

Code Source: https://github.com/tt25852/cryptomator/blob/24b696e572d90d41605f87c9ea3339d7361e94a8/src/main/java/org/cryptomator/ui/addvaultwizard/AddVaultSuccessController.java#L34

Test: https://github.com/tt25852/cryptomator/blob/24b696e572d90d41605f87c9ea3339d7361e94a8/src/test/java/org/cryptomator/ui/addvaultwizard/AddVaultSuccessControllerTest.java#L47

Ce test vérifie que la méthode close() ferme correctement la fenêtre.

#### Test 10: testVaultProperty()

---

Code Source: https://github.com/tt25852/cryptomator/blob/24b696e572d90d41605f87c9ea3339d7361e94a8/src/main/java/org/cryptomator/ui/addvaultwizard/AddVaultSuccessController.java#L40

Test: https://github.com/tt25852/cryptomator/blob/24b696e572d90d41605f87c9ea3339d7361e94a8/src/test/java/org/cryptomator/ui/addvaultwizard/AddVaultSuccessControllerTest.java#L57

Ce test vérifie que la méthode vaultProperty() renvoie correctement la propriété vault initialisée dans le contrôleur.

#### Test 11: testGetVault()

---

Code Source: https://github.com/tt25852/cryptomator/blob/24b696e572d90d41605f87c9ea3339d7361e94a8/src/main/java/org/cryptomator/ui/addvaultwizard/AddVaultSuccessController.java#L44

Test:  https://github.com/tt25852/cryptomator/blob/24b696e572d90d41605f87c9ea3339d7361e94a8/src/test/java/org/cryptomator/ui/addvaultwizard/AddVaultSuccessControllerTest.java#L67

 Ce test vérifie que la méthode getVault() renvoie correctement le coffre (Vault) associé.


