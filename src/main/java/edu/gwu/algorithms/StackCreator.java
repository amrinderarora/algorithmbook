package boxStack;
import java.util.*;
import java.util.HashSet;
//import java.util.List;

public class StackCreator {
	List<Box> rotatedBoxes;
	public StackCreator(List<Box> b){
		rotatedBoxes = b;
	}
	public void stack(){
		int[] height = new int[rotatedBoxes.size()];
		HashSet<Integer> stacks[] = new HashSet[rotatedBoxes.size()];
		for(int i = 0; i < rotatedBoxes.size(); i++){
			HashSet hs = new HashSet();
			hs.add(rotatedBoxes.get(i).getName());
			height[i]=rotatedBoxes.get(i).getHeight();
			stacks[i]=hs;
		}
		for (int i = 1; i < stacks.length; i++) {
			for (int j = 0; j < i; j++) {
				if (rotatedBoxes.get(i).getFace()[0] < rotatedBoxes.get(j).getFace()[0] &&
						rotatedBoxes.get(i).getFace()[1] < rotatedBoxes.get(j).getFace()[1] &&
						height[i] < height[j] + rotatedBoxes.get(i).getHeight())
				{
						stacks[i] =  (HashSet)stacks[j].clone();
						height[i]= height[j];
 						if(stacks[i].add(rotatedBoxes.get(i).getName()))
 						height[i]+=rotatedBoxes.get(i).getHeight();
				}
			}
		}
		int h=0;
		int j=0;
		for(int i=0;i<height.length;i++){
			if(h<height[i]){
			h=height[i];
			j=i;
			}
		}
		System.out.println("size:"+stacks[j].size());
		System.out.println("height:"+h);
	}
}

