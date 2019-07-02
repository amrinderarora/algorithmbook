package boxStack;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class BoxStacker {
	public static void main(String[] args) {
			int count = 0;
			List<Box> boxes = new ArrayList<>();
while(count<10){
				Box box = new Box((int)(Math.random()*20+1),(int)(Math.random()*20+1),(int)(Math.random()*20+1), 1, ++count);
				boxes.add(box);
				for(int i = 2; i <7; i++){
					boxes.add(box.rotate(i, count));
				}
			}
			long t = System.currentTimeMillis();
			Collections.sort(boxes);
			StackCreator sc = new StackCreator(boxes);
			sc.stack();
			System.out.println("Time :"+(System.currentTimeMillis()-t)/1000f+" ms");
	}
}
