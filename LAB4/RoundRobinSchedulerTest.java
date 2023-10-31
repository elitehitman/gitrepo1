import java.util.Scanner;

public class RoundRobinSchedulerTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int numberOfProcesses = s.nextInt();

        ArrayQueue<Long> process = new ArrayQueue<>(numberOfProcesses);

        // Add processes to the queue
        for (long i = 1; i <= numberOfProcesses; i++) {
            process.insert(i);
        }

        System.out.print("Enter the time quantum: ");
        int time = s.nextInt();

        System.out.println("Round-Robin Scheduling Results:");
        while (!process.isEmpty()) {
            long cp = process.remove();
            System.out.println("Processing process " + cp);

            for (int tick = 1; tick <= time; tick++) {
                System.out.println("  - Time Tick " + tick);
            }
            
            // Check if the process still has work to do
            if (cp > 1) {
                process.insert(cp - 1);
            }
        }
    }
}
