// Classe
class Animal{
    String nom
    int age

     // Constructeur
    Animal(String nom, int age) {
        this.nom = nom
        this.age = age
    }

     def decrire() {
        println "$nom a $age ans"
    }

}

def chien = new Animal("Rex", 5)
chien.decrire()