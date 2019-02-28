public class FormatTester {
    public static void main(String[] args) {
        NumberFormatter defaultFormat = new DefaultFormatter();
        System.out.println(defaultFormat.format(-1000));
        NumberFormatter decimalFormat = new DecimalSeparatorFormatter();
        System.out.println(decimalFormat.format(-1000));
        NumberFormatter accountFormat = new AccountingFormatter();
        System.out.println(accountFormat.format(-1000));
        NumberFormatter baseFormat = new BaseFormatter(16);
        System.out.println(baseFormat.format(-1000));

        for (int i = 2; i <= 32; i++) {
            baseFormat = new BaseFormatter(i);
            System.out.println(baseFormat.format(-1000));
        }
    }
}