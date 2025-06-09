
    public class Principal {
        public static void main(String[] args) {
            Livro livro = new Livro("Java Programming", 59.90, "John Doe", "1234567890");

            CD cd = new CD("Greatest Hits", 29.90, "Jane Smith", 12);

            DVD dvd = new DVD("Inception", 39.90, "Sci-Fi", 148);

            System.out.println(livro);
            System.out.println(cd);
            System.out.println(dvd);
        }
    }

