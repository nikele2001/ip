import java.util.*;

import dukeExceptions.*;
import dukeExceptions.IndexOutOfBoundsException;

/*
 * A class that represents a list that stores tasks inputted by user.
 */
public class TaskList {
    protected ArrayList<Task> taskArr;

    public TaskList() {
        this.taskArr = new ArrayList<Task>();
    }

    public Task getTask(int index) throws DukeException {
        try {
            return this.taskArr.get(index);
        } catch (Exception e) {
            throw new IndexOutOfBoundsException();
        }
    }

    public int length() {
        return this.taskArr.size();
    }

    public void markTaskAsDone(int index) throws DukeException {
        this.getTask(index).markAsDone();
    }

    public void markTaskAsNotDone(int index) throws DukeException {
        this.getTask(index).markAsNotDone();

    }

    /*
     * A method that returns the string representation of a Task object
     * at specified index.
     * 
     * @param index task at given index of TaskList object.
     * 
     * @return string representation of the Task object.
     */
    public String taskToString(int index) {
        return this.taskArr.get(index).toString();
    }

    /*
     * A method that returns a string representation of the number of
     * tasks in a TaskList.
     * 
     * @return string representation of the number of tasks in the TaskList.
     */
    public String numTasksToString() {
        if (this.length() == 1) {
            return "1 task";
        }
        return this.length() + " tasks";
    }

    /*
     * A method to to add a task to the TaskList.
     * 
     * @param task task object to be added.
     */
    public void addTask(Task task) {
        this.taskArr.add(task);
    }

    /*
     * A method to to add a task to the TaskList.
     * 
     * @param index index of Task object that user wants to delete.
     */
    public void delete(int index) {
        this.taskArr.remove(index);
    }
}
