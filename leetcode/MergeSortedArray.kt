//  88. Merge Sorted Array

class MergeSortedArray {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        val priorityQueue = PriorityQueue<Int>()
        for (i in 0 until m) {
            priorityQueue.offer(nums1[i])
        }
        for (n in nums2) {
            priorityQueue.offer(n)
        }
        var i = 0
        while (!priorityQueue.isEmpty()) {
            nums1[i] = priorityQueue.remove()
            i++
        }
    }
}