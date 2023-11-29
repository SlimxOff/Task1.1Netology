
public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener doneListener = System.out::println;

        // Лямбда-выражение для обработки ошибки
        OnTaskErrorListener errorListener = error -> System.out.println("Ошибка: " + error);

        Worker worker = new Worker(doneListener, errorListener);
        worker.start();
    }
}
