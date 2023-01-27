public class DogTester {

    public static void main(String[] args) {
         Dog dog1=new Dog();

         dog1.name="Nora";
         dog1.color="White";
         dog1.breed="Husky";
         dog1.age=2;
         dog1.attitude=false;
         dog1.friendly();
         dog1.play();
         dog1.bark();

        Dog dog2=new Dog();
        dog2.name="Nini";
        dog2.color="black";
        dog2.breed="Bulldog";
        dog2.age=10;
        dog2.attitude=false;
        dog2.eat();
        dog2.play();
        dog2.bark();

        Dog dog3=new Dog();

        dog3.name="Moki";
        dog3.color="Brown";
        dog3.breed="Labrador";
        dog3.age=8;
        dog3.attitude=true;
        dog3.friendly();
        dog3.play();
        dog3.bark();
        dog3.eat();



    }
}
