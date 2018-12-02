
public class Main {

    public static void main(String[] args) {
        // write testcode here
        Counter countAll = new Counter(5, false);
        Counter countCheck = new Counter(true);
        Counter countStart = new Counter(5);

        System.out.println(countAll.value());
        System.out.println(countCheck.value());
        System.out.println(countStart.value());
        
        countAll.increase(1);
        countCheck.increase(2);
        countStart.increase(3);
        
        System.out.println(countAll.value());
        System.out.println(countCheck.value());
        System.out.println(countStart.value());
        
        countAll.decrease(10);
        countCheck.decrease(10);
        countStart.decrease(10);

        System.out.println(countAll.value());
        System.out.println(countCheck.value());
        System.out.println(countStart.value());
    }
}
