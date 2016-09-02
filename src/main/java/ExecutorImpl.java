import java.util.ArrayList;
import java.util.List;

/**
 * Created by a.lyahovich on 02.09.2016.
 */
public class ExecutorImpl implements Executor {

    private boolean isExecuted;

    private List<Task> taskList = new ArrayList<Task>();
    private List<Task> validResults;
    private List<Task> invalidResults;

    /*Добавить таск на выполнение. Результат таска будет доступен через метод getValidResults().
    Бросает Эксепшн если уже был вызван метод execute()
    */
    public void addTask(Task task){
            taskList.add(task);
    }

    /*Добавить таск на выполнение и валидатор результата.
    Результат таска будет записан в ValidResults если validator.isValid вернет true для этого результата
    Результат таска будет записан в InvalidResults если validator.isValid вернет false для этого результата
    Бросает Эксепшн если уже был вызван метод execute()
     */
    public void addTask(Task task, Validator validator) {

    }

    public void execute() {

    }

    public List getValidResults() {
        return validResults;
    }

    public List getInvalidResults() {
        return invalidResults;
    }


}
