package examples.examples2;

public class Application {
    public static void main(String[] args) {

        AnimalRecognizer animalRecognizer = new AnimalRecognizer();

        String recognizedAnimal = animalRecognizer.recognize(new Cat());

        System.out.println(recognizedAnimal);
    }
}
