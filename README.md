# 🚀 Apprendre Groovy - De Zéro à Héros

[![Groovy Version](https://img.shields.io/badge/Groovy-4.0.25-green.svg)](https://groovy-lang.org/)
[![LICENSE](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

**Un guide pratique pour maîtriser Groovy, des bases à la métaprogrammation.**  
Ce dépôt contient des exemples de code, des exercices et des projets pour apprendre Groovy progressivement.

---

## 📚 Table des matières
- [Niveau Débutant](base.groovy)
- [Niveau Intermédiaire](intermediaire.groovy)

## 🎯 Pour commencer

### Prérequis
- Java JDK 8+ (Groovy s'exécute sur la JVM)
- [SDKMAN!](https://sdkman.io/) (recommandé pour installer Groovy)
- Un IDE (IntelliJ, VSCode, etc.)

### Installation
1. **Installer Groovy** :
   ```bash
   sdk install groovy
   ```
2. **Vérifier l'installation** :
    ```bash
    groovy --version
    ```

---

## 📖 Curriculum

### 🟢 Niveau Débutant
- Syntaxe de base : Variables, boucles, conditions ([exemple](base.groovy)).
- Collections : Listes, Maps, Ranges ([exemple](base.groovy)).
- Fonctions et Closures ([exemple](base.groovy)).

### 🔵 Niveau Intermédiaire
- POO en Groovy : Classes, héritage ([exemple](intermediaire.groovy)).
- Gestion de fichiers/JSON/XML ([exemple](intermediaire.groovy)).
- Tests unitaires avec Spock ([exemple](intermediaire.groovy)).

### 🔴 Niveau Expert
- Métaprogrammation : `metaClass`, `methodMissing` ([exemple](expert.groovy)).
- AST Transformations : `@ToString`, `@Builder` ([exemple](expert.groovy)).
- Création de DSL ([exemple](expert.groovy)).

---

## 💡 Projets
- **Script d'automatisation** : Nettoyage de fichiers temporaires.
- **API REST** : Avec Micronaut et Groovy.
- **Jeu text-based** : Utilisation de closures et de Maps.

---

## 🧪 Exercices

### Débutant
- **Calculatrice simple** ([solution](exercices/debutant.groovy))  
  Écrivez une fonction qui prend deux nombres et une opération (+, -, *, /).

### Intermédiaire
- **Parser de CSV** ([solution](exercices/intermediaire.groovy))  
  Convertissez un fichier CSV en liste de Maps.

### Expert
- **DSL pour recettes de cuisine** ([solution](exercices/expert.groovy))  
  Créez un DSL pour décrire des recettes avec étapes et ingrédients.

---

## 🤝 Contribuer
Les contributions sont les bienvenues !

1. **Forkez** le dépôt.
2. **Créez une branche** :
   ```bash
   git checkout -b feature/nouvelle-fonctionnalite
   ```
3. **Commitez vos changements** :
   ```bash
   git commit -m "Ajout d'une nouvelle fonctionnalité"
   ```
4. **Poussez vers la branche** :
   ```bash
   git push origin feature/nouvelle-fonctionnalite
   ```
5. **Ouvrez une Pull Request**.

---

🚀 **Prêt à maîtriser Groovy ? Lancez-vous dès maintenant !**