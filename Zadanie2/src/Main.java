public class Main {
    public static void main(String[] msi) {
        Veterinar veterinar = new Veterinar();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Бобик", "Педигри","улица Ягодная, дом 14");
        animals[1] = new Cat("Марти", "Sheba", "улица Мира, дом 4а");
        animals[2] = new Horse("Плотва", "трава", "Боголюбово");

        for (Animal animal : animals) {
            veterinar.treatAnimal(animal);
        }
    }
}
