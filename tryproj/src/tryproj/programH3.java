package tryproj;

import java.util.ArrayList;

public class programH3 {
	
	
   public int cal(int n) {
       
	   
        
        int arr[]=new int[256];
        int x=10;
        int y=1;
        int z=99;
        int q=250;
        for(int i=0;i<100;i++){
        arr[i]=x++;
        }
        for(int i=100;i<200;i++)
        {
        arr[i]=y++;
        }
        for(int i=200;i<225;i++){
        arr[i]=z--;
        }
        for(int i=225;i<255;i++){
        arr[i]=q++;
        }
        
        int asd; int tr;
        		tr=arr[n];
        asd=279-arr[n];
        return tr;

    

}
}