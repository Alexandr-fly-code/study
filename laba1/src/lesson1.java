public class lesson1 {
    public static void main (String[] arg){
        Test("Помидоры");
        Test(1);
    }

    public static void Test(String name){
        System.out.println(name+" ещё зеленые");
    }
    public static void Test(int total){
        System.out.println("Количество студентов которых отчислят в этом семестре "+total);
    }
}