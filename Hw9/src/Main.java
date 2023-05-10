public class Main {
    public static void main(String[] args) {

        Book b1=new Book("java",200,"Besic Java");
        System.out.println(b1.getName());
        System.out.println(b1.getPrice());
        System.out.println(b1.getDiscount());

        System.out.println("----------------");

        Movie m1=new Movie("Troy",450,"Alyami");
        System.out.println(m1.getName());
        System.out.println(m1.getPrice());
        System.out.println(m1.getDiscount());


    }
}