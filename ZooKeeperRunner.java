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
   //step 10
   tiger.growl();
   tiger.eat();
   tiger.isNocturnal();
   Tiger tiger2 = new Tiger();
   Elephant elephant2 = new Elephant();
   //step 25
   Gorilla gorilla = new Gorilla();
   //step 27
   Giraffe giraffe = new Giraffe("leaves", false, 25.0);
   giraffe.eat();
   //step 28
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