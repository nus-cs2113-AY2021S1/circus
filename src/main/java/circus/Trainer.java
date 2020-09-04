package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
import circus.animal.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird)d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal)b; // upcasting
        getToSpeak(a);

        /* Polymofisim
        *  Adda child class and make it as subclass
        * - Dynamic Binding
        * Use this url to know more
        * http://www.corejavaguru.com/blog/java/up-and-down-casting#:~:text=If%20you%20upcast%20an%20object,object%20to%20the%20right%20level.
        * */
        Duck d2 = (Duck) a; // downcasting
        getToSpeak(d2);
        train(new Duck()); // create new object to train
        train(new Parrot()); //*** we can compile not will face ClassCastException err0r
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) { // use this method
            Duck d = (Duck) bird; //downcasting bird object to a duck object
            d.swim();
        }
    }
}
