public class House {
    private int numStories;
    private int numWindows;
    private String color;

    public House() {
        numStories = 1;
        numWindows = 1;
        color = "Grey";
    }

    public House(int numStories, int numWindows, String color) {
        this.numStories = numStories;
        this.numWindows = numWindows;
        this.color = color;
    }

    public int getNumstories() {
        return numStories;
    }
    public void setnumStories(int numStories) {
        this.numStories=numStories;
    }

    public int getnumWindows(){
        return numWindows;
    }
    public void setnumWindows(int numWindows){
        this.numWindows=numWindows;
    }

    public String getcolor(){
        return color;
    }
    public void setcolor(String color){
        this.color=color;
    }

}
