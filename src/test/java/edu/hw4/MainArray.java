package edu.hw4;

@SuppressWarnings({"MagicNumberCheck"})
public final class MainArray {
    private MainArray() {}

    public static Animal[] getAnimals() {
        Animal animal = new Animal("Vova", Animal.Type.DOG, Animal.Sex.M, 19, 180, 65, true);
        Animal[] animals = new Animal[11];
        animals[0] = animal;
        animal = new Animal("Valera", Animal.Type.CAT, Animal.Sex.M, 19, 170, 58, false);
        animals[1] = animal;
        animal = new Animal("Lesha", Animal.Type.FISH, Animal.Sex.M, 22, 190, 80, false);
        animals[2] = animal;
        animal = new Animal("Sveta", Animal.Type.BIRD, Animal.Sex.F, 23, 165, 55, true);
        animals[3] = animal;
        animal = new Animal("Polina Vysockaya", Animal.Type.SPIDER, Animal.Sex.F, 19, 160, 60, false);
        animals[4] = animal;
        animal = new Animal("Marina Vishnevskaya", Animal.Type.CAT, Animal.Sex.F, 23, 170, 58, true);
        animals[5] = animal;
        animal = new Animal("Grisha", Animal.Type.CAT, Animal.Sex.M, 19, 170, 65, false);
        animals[6] = animal;
        animal = new Animal("Petya", Animal.Type.DOG, Animal.Sex.M, 28, 190, 38, false);
        animals[7] = animal;
        animal = new Animal("Angela", Animal.Type.BIRD, Animal.Sex.F, 10, 150, 40, false);
        animals[8] = animal;
        animal = new Animal("Anfisa", Animal.Type.FISH, Animal.Sex.F, 19, 170, 55, true);
        animals[9] = animal;
        animal = new Animal("Artem", Animal.Type.SPIDER, Animal.Sex.M, 20, 175, 64, false);
        animals[10] = animal;
        return animals;
    }
}
