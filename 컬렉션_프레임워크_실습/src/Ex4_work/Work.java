package Ex4_work;

import java.io.Serializable;

public class Work implements Serializable{
	 private static final long serialVersionUID = 1L;
	    private String id;
	    private int win;
	    private int draw;
	    private int lose;

	    public Work(String id) {
	        this.id = id;
	        this.win = 0;
	        this.draw = 0;
	        this.lose = 0;
	    }

	    public String getId() {
	        return id;
	    }

	    public int getWin() {
	        return win;
	    }

	    public int getDraw() {
	        return draw;
	    }

	    public int getLose() {
	        return lose;
	    }

	    public void addWin() {
	        this.win++;
	    }

	    public void addDraw() {
	        this.draw++;
	    }

	    public void addLose() {
	        this.lose++;
	    }

	    @Override
	    public String toString() {
	        return "ID: " + id + "\n" +
	               win + "승 " + draw + "무 " + lose + "패";
	    }
}
