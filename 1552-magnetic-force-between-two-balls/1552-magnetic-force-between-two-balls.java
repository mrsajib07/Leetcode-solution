class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int start=0;
        int end=position[position.length-1] - position[0];
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            int lastPosition= position[0], balls=1;
            for(int i=1;i<position.length;i++){
                if (position[i]-lastPosition >= mid) {
                    lastPosition = position[i];
                    balls++;                
            }
        }
        if(balls >= m){
            ans=mid;
            start=mid+1;
        }else{
            end=mid-1;
        }
    }
        return ans;
    }
}
