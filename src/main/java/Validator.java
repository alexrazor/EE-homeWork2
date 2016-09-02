/**
 * Created by a.lyahovich on 02.09.2016.
 */
public interface Validator<T> {
    // Валидирует переданое значение
    boolean isValid(T result);
}
