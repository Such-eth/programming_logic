//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public class Meeting{
        int start;
        int end;
        public Meeting(int start, int end){
            this.start=start;
            this.end=end;
        }
    }
    public int maxMeetings(int start[], int end[], int n)
    {
        int count=1;
        PriorityQueue<Meeting> q = new PriorityQueue<>((m1,m2)->m1.end-m2.end);
        for(int i=0;i<start.length;i++){
            q.add(new Meeting(start[i],end[i]));
        }
        int check=q.poll().end;
        while(!q.isEmpty()){
            Meeting meet = q.poll();
            if(meet.start>check){
                // System.out.println(meet.start);
                count++;
                check=meet.end;
            }
        }
        return count;
    }
}
