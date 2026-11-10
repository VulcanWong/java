class Main {
    public static void main(String[] args) {

        int a=10;
        int b=5;
        System.out.println("===========================================Guess the Answer============================================");
        System.out.println("Uninary Operater"+ (a++));
        System.out.println("Uninary Operater"+ (++b));
        System.out.println("Binary Operater");
        System.out.println("1+2" +1+2);
        System.out.println("1+2 " +(1+2));
        System.out.println(1+2 +" =3");
        int increment = ++a *b++;
        System.out.println(increment);

        System.out.println("Ternary Operater");
        int largestNumber=(a>b)?a:b;
        System.out.println("Largest of 2 numbers :" +largestNumber);
        
    }
}
