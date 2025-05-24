public class WrapperDemo {
    public static void main(String[] args) {
        // Character wrapper
        Character ch = Character.valueOf('A');
        System.out.println("Character: " + ch);
        System.out.println("To lower case: " + Character.toLowerCase(ch));

        // Boolean wrapper
        Boolean flag = Boolean.valueOf("true");
        System.out.println("\nBoolean: " + flag);

        // Integer wrapper
        Integer num1 = Integer.valueOf("100");
        Integer num2 = Integer.valueOf("200");
        System.out.println("Integer: " + num1);
        System.out.println("Integer: " + num2);
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Max: " + Integer.max(num1, num2));

        // Double wrapper
        Double d1 = Double.valueOf("45.67");
        System.out.println("Double: " + d1);

        // Float wrapper
        Float f = Float.valueOf("3.14");
        System.out.println("Float: " + f);
        System.out.println("Rounded: " + Math.round(f));
    }
}
