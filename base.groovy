//declaration de variable
/**
    En Groovy, la déclaration de variables peut se faire de plusieurs 
    manières. Voici quelques exemples de base pour déclarer des variables 
    en Groovy :
    1. Déclaration implicite : Groovy permet de déclarer des variables 
    sans spécifier leur type. Le type est déterminé dynamiquement à l'exécution.
*/
def variable = "Bonjour"
def nombre = 42
def liste = [1, 2, 3]

/**
    2. Déclaration explicite : Il est également possible de déclarer des 
    variables avec un type explicite en Groovy. Cela peut être utile pour 
    améliorer la lisibilité du code et pour indiquer le type de données 
    attendu.
*/

String salutation = "Bonjour"
int nombre = 42
List<Integer> liste = [1, 2, 3]

/**
    3. Déclaration de variables non modifiables : En Groovy, il est possible 
    de déclarer des variables non modifiables en utilisant le mot-clé `final`. 
    Cela signifie que la valeur de la variable ne peut pas être modifiée une 
    fois qu'elle a été initialisée.
*/

final String salutation = "Bonjour"

/**
    4. Déclaration de variables nulles : En Groovy, les variables peuvent 
    être initialisées avec la valeur `null`, qui indique l'absence de valeur. 
    Cela peut être utile pour indiquer qu'une variable n'a pas encore été 
    initialisée ou pour la réinitialiser à une valeur nulle.
*/

def valeur = null

/**
    5. Déclaration de variables avec des types primitifs : En Groovy, les 
    types primitifs comme `int`, `long`, `float`, `double`, `boolean`, etc., 
    sont automatiquement convertis en objets lorsqu'ils sont utilisés dans 
    des expressions. Cela signifie que vous pouvez utiliser des types primitifs 
    comme des objets sans avoir à les convertir explicitement.
*/

int nombre = 42
long longNombre = 1234567890L
float nombreDecimal = 3.14f
double nombreDouble = 3.14159
boolean estVrai = true

/**
    6. Déclaration de variables avec des types de données complexes : En Groovy, 
    il est possible de déclarer des variables avec des types de données complexes 
    comme des listes, des maps, des ensembles, etc. Ces types de données peuvent 
    contenir des éléments de différents types et peuvent être manipulés de manière 
    flexible.
*/

List<Integer> liste = [1, 2, 3]
Map<String, Integer> map = ['a': 1, 'b': 2, 'c': 3]
Set<String> ensemble = ['a', 'b', 'c']

/**
variables locales et globales
*/
// Variables locales : Les variables locales sont déclarées à l'intérieur d'une méthode ou d'une fonction et ne sont accessibles que dans le contexte de cette méthode ou fonction.
def direBonjour() {
    def message = "Bonjour"
    println message
}
direBonjour()
//println message // Erreur: message non défini

// Variables globales : Les variables globales sont déclarées en dehors de toute méthode ou fonction et sont accessibles dans tout le script.
def message = "Bonjour"
def direBonjour() {
    println message
}
direBonjour()

// Variables de classe : Les variables de classe sont déclarées à l'intérieur d'une classe et sont accessibles dans toutes les méthodes de cette classe.
class Personne {
    def nom
    def prenom
}
def personne = new Personne()
personne.nom = "N'dri"
personne.prenom = "Thierry"
println personne.nom + " " + personne.prenom


def lastName ="N'dri"
def firstName = "Thierry"
def name = lastName +' '+ firstName
int age = 18

//  Structures de contrôle
if(age>18){
    println "vous etes majeur"
}else if(age==18){
    println "vous etes a peine majeur"
}else{
    println "vous etes mineur"
}

5.times { println "Hello" }
(1..5).each { println it }

println name

// Fonctions
def somme(x,y){
    return x + y
}
println somme(2,3)

// Syntaxe raccourcie
def multiplication(x,y){x*y}
println multiplication(2,3)

def divsion(x,y){
    if(y==0){
        return "Division par zero"
    }
    return x/y
}
println divsion(10,2)
// Arguments par défaut
def saluer(nom = "Invité") {
    println "Bonjour, $nom !"
}
println saluer("Thierry")

// Les collections
/**
 * 
 * Listes: Les listes sont des collections ordonnées d'éléments.
 * 
 * Caractéristiques des listes en Groovy:
 * - Les listes sont des collections ordonnées, ce qui signifie que les éléments ont une position définie.
 * - Les listes peuvent contenir des éléments de types différents.
 * - Les listes en Groovy sont dynamiques, ce qui signifie que leur taille peut changer.
 * - Les listes peuvent être créées en utilisant la notation littérale avec des crochets, par exemple: `def maListe = [1, 2, 3]`.
 * - Les listes supportent les opérations de base comme l'ajout, la suppression et la modification d'éléments.
 * - Les listes peuvent être parcourues en utilisant des boucles comme `for` ou des méthodes de collection comme `each`.
 * - Les listes en Groovy implémentent l'interface `java.util.List`, ce qui permet d'utiliser toutes les méthodes disponibles pour les listes en Java.
 * - Les listes peuvent être triées et filtrées en utilisant des méthodes comme `sort()` et `findAll()`.
 * - Les listes supportent l'accès par index, par exemple: `maListe[0]` pour accéder au premier élément.
 * - Les listes peuvent être manipulées de manière fonctionnelle en utilisant des méthodes comme `collect()`, `find()`, `any()`, `every()`, etc.
 */
// listes: les listes sont des collections ordonnées d'éléments
def fruits = ['pomme', 'banane', 'orange']
println "le premier element:" + " " + fruits[0]
fruits.each { println it.toUpperCase() }

// Maps : les maps sont des collections de paires clé-valeur
def personne = [nom: 'N\'dri', prenom: 'Thierry']
println personne.nom // N'dri

//Closures (fonctions anonymes)
/**
 * Une Closure en Groovy est un objet qui encapsule un bloc de code qui peut être
 * exécuté à un moment ultérieur. Les closures peuvent être passées en tant que
 * arguments à des méthodes, stockées dans des variables, et retournées par des
 * méthodes. Elles peuvent accéder et modifier les variables définies dans leur
 * contexte d'origine, ce qui les rend très puissantes pour la programmation
 * fonctionnelle et les opérations sur les collections.
 */

 def closure = { println "Hello" }

 def fermeture = { x -> x * 2 }
println fermeture(4) // 8

// Les boucles

// Boucle for
for (int i = 0; i <= 5; i++) {
    println i
}

// Boucle while
int j = 0
while (j <= 5) {
    println j
    j++
}

// Boucle do-while
int k = 0
do {
    println k
    k++
} while (k <= 5)

// Boucle each
(1..5).each { println it }

// Boucle sur une liste
def fruits = ['pomme', 'banane', 'orange']
fruits.each { println it }

// Boucle sur une map
def personne = [nom: 'N\'dri', prenom: 'Thierry']
personne.each { cle, valeur -> println "$cle: $valeur" }

// Les exceptions
/**
 * Les exceptions en Groovy sont des objets qui représentent des erreurs ou des
 * conditions exceptionnelles qui se produisent pendant l'exécution d'un programme.
 * Les exceptions peuvent être levées (throw) et attrapées (catch) pour gérer les
 * erreurs et les situations imprévues.
*/

try {
    def resultat = 10 / 0
} catch (ArithmeticException e) {
    println "Erreur: Division par zéro"
}
 