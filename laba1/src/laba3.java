public class laba3 {
    public static void main (String[] arg){
        String tomato = "Помидор";
        String cucumber = "Огурец";
        String totalText = "Количество:";
        String firstColor = "(red)";
        int firstTotal = 100;
        String secondColor = "(green)";
        float secondTotal = 55.5f;
            String test = "\n";
//        System.out.print(tomato + firstColor + totalText + firstTotal);
//        System.out.println("");

        System.out.print("Помидор" + firstColor + "Количество" + firstTotal + "\n" + "Огурец" + secondColor + "Количество" + secondTotal);

        System.out.println("");
        System.out.printf("Помидор%s", firstColor, "Количество%s", firstTotal);
//        System.out.println("");
//        System.out.printf("%s %s %s %f", cucumber, secondColor, totalText, secondTotal);

    }
};



//public class lesson1 {
//    public static void main (String[] arg){
//        Test("Помидоры");
//    }
//
//    public static void Test(String name){
//        System.out.println(name+"ещё зеленые");
//    }
//}