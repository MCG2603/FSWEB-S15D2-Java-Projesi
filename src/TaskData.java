import java.util.Set;

public class TaskData {
    Set<Task> annsTasks ;
    Set<Task> bobsTasks ;
    Set<Task> carolsTasks ;

    public TaskData() {
    }
    public Set<Task> getTasks(String s){
        switch (s){
            case "ann":
                return annsTasks;
            case "bob":
                return bobsTasks;

            case "carol":
                return carolsTasks;

            case "all":
                bobsTasks.addAll(carolsTasks);
                annsTasks.addAll(bobsTasks);
                return annsTasks;

            default:
                return annsTasks;
        }

    }
    public Set<Task> getIntersect(Set<Task> t,Set<Task> t1){
        t.retainAll(t1);
        return t;

    }
    public Set<Task> getDifference(Set<Task> t,Set<Task> t1){
        t.removeAll(t1);
        return t;

    }

}
