### Ruo Tian Tang 20090404
### Rechache Rafik 20200123

Nous avons ajoutés 5 flags.

#### -XX:+UseCompressedOops:

Type: Flag d'Optimisation Mémoire

Description: Ce flag permet d'optimiser l'utilisation de la mémoire en compressant les pointeurs d'objets, ce qui est utile pour réduire la consommation de mémoire.

#### -XX:+UseParallelGC

Type:  Flag de Collecte des Déchets

Description: Ce flag spécifie quel collecteur de déchets la JVM doit utiliser. Il active le ramasse-miettes parallèle (Parallel Garbage Collector), qui se concentre sur la maximisation du débit.

#### -XX:+UnlockDiagnosticVMOptions

Type: Flag de Diagnostic et de Débogage

Description: Ce flag permet de déverrouiller des options de diagnostic supplémentaires dans la JVM pour un débogage et un réglage avancés.

#### -XX:+PrintGCDetails

Type: Flag de Diagnostic et de Débogage (Impression)

Description: Ce flag permet d'afficher des informations détaillées sur les événements de collecte des déchets, facilitant l'analyse de la gestion de la mémoire.

#### -XX:+AlwaysTenure

Type: Flag de Gestion de la Mémoire / Débogage

Description:  Ce flag permet de forcer le déplacement de tous les objets directement dans la vieille génération, utile pour l'analyse du comportement de la mémoire.


Cependant, il y a une erreur dans le build, mais il n'a pas de rapport avec nos 5 jobs ajoutés. Les tests de flags fonctionnent bien.
<img width="1438" alt="Capture_decran_le_2024-11-13_a_19 49 57" src="https://github.com/user-attachments/assets/537631fa-9620-4d13-b9a9-615f66f1cc99">
