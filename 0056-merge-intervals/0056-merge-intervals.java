class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();

        for(int[] interval: intervals) {
            list.add(interval.clone());
        }

        boolean merged = true;
        while(merged) {
            merged = false;
            for(int i=0; i<list.size(); i++) {
                for(int j=i+1; j<list.size(); j++) {
                    int a[] = list.get(i);
                    int b[] = list.get(j);

                    if(a[0] <= b[1] && b[0] <= a[1]) {
                        int start = Math.min(a[0], b[0]);
                        int end = Math.max(a[1], b[1]);

                        list.set(i, new int[]{start, end});
                        list.remove(j);

                        merged = true;
                        break;
                    
                    }
                }
                if(merged) {
                    break;
                }
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}