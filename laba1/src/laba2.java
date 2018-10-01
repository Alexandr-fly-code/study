public class laba2 {
    public static void main (String[] arg){
        String text = "Student \t text"; // \n перенос на новую строку \t табуляция (4 проблела)
        System.out.println(text);
        System.out.print(text);
        String format = "Formating for text";
        int a = 10;
        System.out.printf("%s %d", text, a);// спецификаторы задаются через значёк % s - text, d - целые числа, f - флоат/дабл
    }

}
