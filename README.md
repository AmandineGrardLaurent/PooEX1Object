# 🏙️ Projet Gestion de Villes et Personnes en Java

Ce projet illustre la gestion d'objets représentant des **villes** (`City`) et des **personnes** (`Person`) en Java. Il met en pratique :

- L'encapsulation
- Les constructeurs surchargés
- Les accesseurs et mutateurs
- L'utilisation d'`ArrayList` pour manipuler des collections d'objets
- Les méthodes utilitaires et filtres

---

## 🏘️ Description des classes

### City

Représente une ville avec :

- `cityName` : le nom de la ville
- `cityCountry` : le pays de la ville
- `cityPopulation` : le nombre d'habitants
- `counterInstance` : compteur statique du nombre d'instances créées

#### Constructeurs

- `City(String cityName, String cityCountry, int cityPopulation)`
- `City(String cityName, int cityPopulation)` (pays par défaut `"unknown"`)
- `City(String cityName, String cityCountry)` (population par défaut `0`)

#### Méthodes principales

- `toString()` : retourne les informations de la ville
- `display()` : retourne une description sous forme de phrase
- `setSubtractPopulation(int nbPopulation)` : retire un nombre d'habitants à la population de la ville (avec vérification)
  
---

### Person

Représente une personne avec :

- `lastName` : nom de famille
- `firstName` : prénom
- `years` : âge
- `address` : adresse
- `hometown` : ville d'origine (objet `City`)

#### Constructeurs

- `Person(String lastName, String firstName, int years, String address, City hometown)`
- `Person(String lastName, String firstName, int years)` (avec valeurs par défaut pour l'adresse et la ville)
- `Person(String lastName, String firstName)` (avec valeurs par défaut pour l'âge, l'adresse et la ville)

#### Méthodes principales

- `toString()` : retourne une description complète de la personne
- `addFrenchPersons(ArrayList<Person> persons)` : filtre les personnes françaises ou habitant à Paris
- `displayPersons(ArrayList<Person> persons)` : affiche une liste de personnes

---

## ⚙️ Fonctionnalités

- Gestion d'objets `City` et `Person` avec encapsulation
- Utilisation de constantes par défaut
- Validation des valeurs (population et âge)
- Filtrage et affichage de collections d'objets
- Compteur d'instances de `City`

---

## 💻 Exemples d'utilisation

```java
City toulouse = new City("Toulouse", "France", 450000);
City rabat = new City("Rabat", 73500);
rabat.setCityCountry("Maroc");

Person macron = new Person("Macron", "Emmanuel", 43, "Elysée à Paris", new City("Amiens", "France"));
Person sarkozy = new Person("Sarkozy", "Nicolas", 66, "Paris", new City("Paris", "France", 2000000));

ArrayList<Person> persons = new ArrayList<>();
persons.add(macron);
persons.add(sarkozy);

Person.displayPersons(persons);

ArrayList<Person> frenchPersons = Person.addFrenchPersons(persons);
System.out.println("Liste des français :");
Person.displayPersons(frenchPersons);
```
---

## 💻 Résultat attendu

#### TestCity

```yaml
[Ville : Toulouse, Pays : France, Nombre d'habitants : 450000]
[Ville : Mérignac, Pays : France, Nombre d'habitants : 34000]
[Ville : Saint-Geours-de-Maremne, Pays : France, Nombre d'habitants : 15000]
[Ville : Rabat, Pays : Maroc, Nombre d'habitants : 73500]
Nombre de villes : 4
```

#### TestPerson

```yaml
Liste des personnalités :
Macron, Emmanuel, 43ans, habitant Elysée à Paris, Ville de naissance : [Ville : Amiens, Pays : France, Nombre d'habitants : 0]
Sarkozy, Nicolas, 66ans, habitant Paris, Ville de naissance : [Ville : Paris, Pays : France, Nombre d'habitants : 2000000]
Johnson, Boris, 56ans, habitant Downing Street London, Ville de naissance : [Ville : New York, Pays : USA, Nombre d'habitants : 0]
Kravitz, Lenny, 56ans, habitant Habitant hotel particuler à Paris, Ville de naissance : [Ville : New York, Pays : USA, Nombre d'habitants : 0]
-----------------------------------
Liste des français :
Macron, Emmanuel, 43ans, habitant Elysée à Paris, Ville de naissance : [Ville : Amiens, Pays : France, Nombre d'habitants : 0]
Sarkozy, Nicolas, 66ans, habitant Paris, Ville de naissance : [Ville : Paris, Pays : France, Nombre d'habitants : 2000000]
Kravitz, Lenny, 56ans, habitant Habitant hotel particuler à Paris, Ville de naissance : [Ville : New York, Pays : USA, Nombre d'habitants : 0]
```
---

## 🛠 Compilation et exécution

```bash
# Compiler les fichiers Java
javac City.java Person.java TestCity.java TestPerson.java

# Exécuter les tests
java TestCity
java TestPerson
```