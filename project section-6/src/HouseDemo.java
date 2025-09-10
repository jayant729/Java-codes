public class HouseDemo {
    public static void main(String[] args) {
        House myhouse = new House();
        House yourhouse = new House(3,10,"blue");



        myhouse.setnumStories(2);
        myhouse.setnumWindows(5);
        myhouse.setcolor("Grey");

//        yourhouse.setnumStories(4);
//        yourhouse.setnumWindows(8);
//        yourhouse.setcolor("Blue");

        printhouse(myhouse);
        System.out.println();
        printhouse(yourhouse);

//        System.out.println("My house is " +myhouse.getNumstories()+ " stories" + " and has " + myhouse.getnumWindows()+ " windows and color is " + myhouse.getcolor() );
//
//        System.out.println();
//
//        System.out.println("Your house is " +yourhouse.getNumstories()+ " stories" + " and has " + yourhouse.getnumWindows()+ " windows and color is " + yourhouse.getcolor() );


    }//end main
        public static void printhouse(House house){
            System.out.println("My house is " +house.getNumstories()+ " stories" + " and has " + house.getnumWindows()+ " windows and color is " + house.getcolor() );
        }

    }
