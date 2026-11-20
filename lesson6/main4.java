class Parent{
    protected void protect(){
        System.out.println("I'm inside protected method");
    }
}
class child extends Parent{
    private void privateMethod(){
        System.out.println("I'm inside private method");
    }
}

class Main4 {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}