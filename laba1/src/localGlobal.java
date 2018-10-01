public class localGlobal {
//    static //пренадлежность объекта классу
    static String student = "Petro";
    public static void main (String[] args){
        System.out.println("Был студент "+student);
//        Olya();
        String x = Vasya();
//        String x = "Оля?Нет, всё ещё Вася";
        System.out.print("Стал "+x);
    }

    public static void Olya(){
        student = "Olya";
    }
    public static String Vasya(){
        String x = "Olga";
        return x;
    }
}