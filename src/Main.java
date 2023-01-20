public class Main {
    public static void main(String[] args) {
        divideLine("Hello_world!");
    }

    private static void divideLine(String line) {
        int symbols = line.length();
        if (symbols % 2 != 0) {
            System.out.println("Не делится пополам");
        } else if (line.isEmpty()) {
            System.out.println("Строка пустая");
        } else {
            int symbolsNew = symbols / 2;
            String firstHalf = line.substring(0, symbolsNew);
            String secondHalf = line.substring(symbolsNew);
            System.out.println(firstHalf + " " + secondHalf);
        }
    }

}