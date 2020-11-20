package tsp;

import java.util.ArrayList;

public class TourManager {
	private static ArrayList destinationStations = new ArrayList<Station>();
	
	//루트 추가
	public static void addStation(Station station) {
		destinationStations.add(station);
	}
	
	//정류소추출
	public static Station getStation(int index) {
		return (Station)destinationStations.get(index);
	}
	
	//루트갯수
	public static int numberOfStations() {
		return destinationStations.size();
	}
}
