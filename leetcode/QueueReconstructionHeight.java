//  406. Queue Reconstruction by Height

class QueueReconstructionHeight {

    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> (a[0] != b[0]) ? b[0] - a[0] : a[1] - b[1]);
        List<int[]> result = new ArrayList<>();
        for (int[] p : people) {
            result.add(p[1], p);
        }
        return result.toArray(new int[people.length][]);
    }
}