/**
 * Created by a.lyahovich on 02.09.2016.
 */
 public interface Task<T> {
    // Метода запускает таск на выполнение
    void execute();

    // Возвращает результат выполнения
    T getResult();
}
