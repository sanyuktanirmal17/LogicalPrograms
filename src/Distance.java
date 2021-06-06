
//public class Distance {
//	    public static void main(String[] args) {
//
//	        // parse x- and y-coordinates from command-line arguments
//	        int x = Integer.parseInt(args[0]);
//	        int y = Integer.parseInt(args[1]);
//
//	        // compute distance to (0, 0)
//	        double dist = Math.sqrt(x*x + y*y);
//	 
//	        // output distance
//	        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
//	    }   
//	}


public class Distance {
    public static void main(String[] args) {
 
        // input point coordinates
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
 
 
        // compute distance
        //double distance = Math.sqrt((x * x) + (y * y));
        double distance = Math.sqrt(
                                    Math.pow(x, 2) + Math.pow(y, 2));
 
 
        // output distance
        System.out.println("Distance from (0, 0) to (" +
                           x + ", " + y + ") is " +
                           distance);
 
    }
}