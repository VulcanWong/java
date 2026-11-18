class Mammals{
    void mam(){
        System.out.println("Inside Mammals Class");
    }
}

class Lion extends Mammals{
   void roar(){
    System.out.println("Inside Lion class ");
   }
}

class Human extends Mammals{
    void hum(){
        System.out.println("Inside Human");
    }
}

class Main2{
    public static void main(String args []){
    Lion obj = new Lion();
    Human obj2=new Human();
    obj2.hum();
    obj.roar();
    obj.mam();
    }
}