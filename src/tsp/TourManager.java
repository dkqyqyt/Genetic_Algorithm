package tsp;

import java.util.ArrayList;

public class TourManager {
	private static ArrayList destinationStations = new ArrayList<Station>();
	
	//��Ʈ �߰�
	public static void addStation(Station station) {
		destinationStations.add(station);
	}
	
	//����������
	public static Station getStation(int index) {
		return (Station)destinationStations.get(index);
	}
	
	//��Ʈ����
	public static int numberOfStations() {
		return destinationStations.size();
	}
}
