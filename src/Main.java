public class Main {
    public static void main(String[] args) {
        int[] arrSchedulerQueue = {2, 3, 1, 5, 4};
        int[] arrPriority = {1, 3, 5, 4, 2};
        Solution solution = new Solution();
        int cpuCycleCount = solution.determineCPUCycles(arrSchedulerQueue, arrPriority);
        System.out.println(cpuCycleCount);
    }
}
