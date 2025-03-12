import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class Task implements Comparable<Task> {
    String taskName;
    Integer priority;
    Integer duratio;

    public Task(String taskName, Integer priority, Integer duratio) {
        this.taskName = taskName;
        this.priority = priority;
        this.duratio = duratio;
    }

    @Override
    public int compareTo(Task other) {
        int priorityCompare = Integer.compare(this.priority, other.priority);
        if (priorityCompare == 0) {
            return Integer.compare(this.duratio, other.duratio);
        }
        return priorityCompare;
    }

    @Override
    public String toString() {
        return "[Priority " + priority + "] " + taskName + " (Duratio: " + duratio + " mins)";
    }
}

class TaskSchedueler {
    PriorityQueue<Task> scheduletasks = new PriorityQueue<>();
    Queue<Task> pendigTasks = new LinkedList<>();

    public static <T> void mergelists(LinkedList<T> list1, LinkedList<T> list2) {
        LinkedList<T> mergedlist = new LinkedList<>();
        int i = 0, j = 0;
        while (i < list1.size() || j < list2.size()) {
            if (i < list1.size()) {
                mergedlist.add(list1.get(i));
                i++;
            }
            if (j < list2.size()) {
                mergedlist.add(list2.get(j));
                j++;
            }
        }
        System.out.println("Merged lst: " + mergedlist);
    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> enty : map.entrySet()) {
            System.out.println("Key: " + enty.getKey() + ", Value: " + enty.getValue());
        }
    }

    public void addTask(Task task) {
        scheduletasks.add(task);
        System.out.println("Taskss Added: " + task);
    }

    public Task procesTask() {
        Task task = scheduletasks.poll();
        if (task != null) {
            System.out.println("Procesing Task: " + task);
        } else if (!pendigTasks.isEmpty()) {
            Task pendingTask = pendigTasks.poll();
            System.out.println("Procesing Task: " + pendingTask);
            return pendingTask;
        } else {
            System.out.println("No task to proces!");
        }
        return task;
    }

    public void delayTask(String taskName) {
        Task toDelay = null;
        for (Task task : scheduletasks) {
            if (task.taskName.equals(taskName)) {
                toDelay = task;
                break;
            }
        }
        if (toDelay != null) {
            scheduletasks.remove(toDelay);
            pendigTasks.add(toDelay);
            System.out.println("Delayin Task: " + toDelay.taskName);
        }
    }

    public void displayScheduletasks() {
        System.out.println("Schedueld Tasks (sorted by priorty):");
        int count = 1;
        PriorityQueue<Task> tempQueue = new PriorityQueue<>(scheduletasks);
        while (!tempQueue.isEmpty()) {
            System.out.println(count + ". " + tempQueue.poll());
            count++;
        }
        if (tempQueue.isEmpty()) {
            System.out.println("(No priorty tasks)");
        }
    }

    public void displayPendinTasks() {
        System.out.println("Pendin Tasks (FIFO Order):");
        int count = 1;
        Queue<Task> tempQueue = new LinkedList<>(pendigTasks);
        while (!tempQueue.isEmpty()) {
            System.out.println(count + ". " + tempQueue.poll());
            count++;
        }
        if (tempQueue.isEmpty()) {
            System.out.println("(No pendin tasks)");
        }
    }
}

class Main {
    public static void main(String[] args) {
        TaskSchedueler scheduler = new TaskSchedueler();

        scheduler.addTask(new Task("Code Revision", 3, 20));
        scheduler.addTask(new Task("System Update", 5, 45));
        scheduler.addTask(new Task("Ui updates", 2, 30));
        scheduler.addTask(new Task("Feature Deployment", 5, 50));
        scheduler.addTask(new Task("Bug Fixing", 4, 25));

        scheduler.displayScheduletasks();

        scheduler.procesTask();
        scheduler.delayTask("Code Revison");
        scheduler.displayScheduletasks();
        scheduler.displayPendinTasks();

        scheduler.delayTask("Databas Backup");
        scheduler.displayScheduletasks();
        scheduler.displayPendinTasks();

        scheduler.procesTask();
        scheduler.displayScheduletasks();
        scheduler.displayPendinTasks();

        scheduler.procesTask();
        scheduler.displayScheduletasks();
        scheduler.displayPendinTasks();

        scheduler.procesTask();
        scheduler.displayScheduletasks();
        scheduler.displayPendinTasks();

        scheduler.procesTask();
        scheduler.displayScheduletasks();
        scheduler.displayPendinTasks();

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(3);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(4);
        TaskSchedueler.mergelists(list1, list2);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("On", 1);
        map.put("Tw", 2);
        TaskSchedueler.printMap(map);
    }
}
