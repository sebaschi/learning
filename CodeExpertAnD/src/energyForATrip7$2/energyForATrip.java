package energyForATrip7$2;

public class energyForATrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[] road = {true, false, false, true, true, false, true, true, false, true, true, true, true, true, false, true, true, false, true, true, false, false, true, false};
		System.out.print(energy_for_trip(road, 24));
	}
//    private static int energy_for_trip(boolean [] road, int n)
//    {
//      int totalEnergy = 0;
//      int i = 0;
//      for(; i < road.length-6; i++){
//        if(road[i+1] == true){
//          if(road[i+6] == false){
//            i += 5;
//            totalEnergy += 6;
//          }
//          totalEnergy += 1;
//        }
//        totalEnergy++;
//      }
//      for(; i < road.length-1; i++){
//        if(road[i+1] == true){
//          totalEnergy++;
//        }
//        totalEnergy++;
//      }
//      return totalEnergy;
//        
//    }
	
	private static int energy_for_trip(boolean[] road, int n) {
		if(n == 0) {
			return 0;
		}
		int totalEnergy = 0;
		if(n+1 < 6) {
			if(road[n-1]==true) {
				return energy_for_trip(road, n-1) + 2;
			} else {
				return energy_for_trip(road, n-1) + 1;
			}
		}
	}

}
