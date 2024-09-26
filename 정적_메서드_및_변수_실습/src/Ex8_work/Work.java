package Ex8_work;

import java.util.ArrayList;

public class Work {
	 ArrayList<WorkReceive> tourists = new ArrayList<>();

	    public void addTourist(WorkReceive tourist) {
	        tourists.add(tourist);
	    }

	    public void printAllInfo() {
	        for (WorkReceive tourist : tourists) {
	            tourist.printInfo();
	        }
	    }

	    public void changePlace(int index, String newPlace) {
	        tourists.get(index - 1).cPlace(newPlace);
	    }

}
