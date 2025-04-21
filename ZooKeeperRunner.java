public class ZooKeeperRunner {
  public static void main(String[] args) {
   //step 14
   Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
   elephant.trumpet();
   //step 15
   elephant.forage();
   elephant.eat();
   elephant.isNocturnal();
   elephant.getLifeSpan();
   //step 22
   Tiger tiger = new Tiger("meat", true, 17.0);
   tiger.swim();
   tiger.huntAlone();
   //step 9-10 Tiger to Feline to Animal
   tiger.growl();
   tiger.eat();
   tiger.isNocturnal();
   //step 23
   //define a no arg constructor for feline
   Tiger tiger2 = new Tiger();
   Elephant elephant2 = new Elephant();
   //step 26, no arg constructor called the Object class's instructor, program would not run because JVM could not follow class constructor hiearchy to object
   Gorilla gorilla = new Gorilla();
   //step 27
   Giraffe giraffe = new Giraffe("leaves", false, 25.0);
   giraffe.eat();
   //step 28 hippo successfuly initalized
   Hippo hippo = new Hippo();
   hippo.eat();
   Penguin penguin = new Penguin();
   penguin.fish();
   //step 30
   Owl owl = new Owl();
   owl.hunt();
   Owl owl2 = new Owl("mice,insects", true, 4.0);
   owl2.eat();
  }
}