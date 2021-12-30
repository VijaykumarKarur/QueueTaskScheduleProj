import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int determineCPUCycles(int[] arrSchedulerQueue, int[] arrPriority){
        Queue<Integer> queue = new LinkedList<>();
        int cpuCycleCount = 0;
        for(int index = 0; index < arrSchedulerQueue.length; index++){
            queue.add(arrSchedulerQueue[index]);
        }
        int index = 0;
        while(!queue.isEmpty()){
            Integer task = queue.remove();
            if(task == arrPriority[index]){
                index++;
            }
            else{
                queue.add(task);
            }
            cpuCycleCount++;
        }
        return cpuCycleCount;
    }
}
