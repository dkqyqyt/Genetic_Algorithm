package tsp;

//import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
//import java.io.FileOutputStream;

//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
/**
 * @author 82106
 *
 */
public class TSP_GA {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// ������ ����
		Station station = new Station(37.549561,126.905754,"(��)������ �ֹμ���");
		TourManager.addStation(station);
		Station station2 = new Station(37.555649,126.910629,"������");
		TourManager.addStation(station2);
		Station station3 = new Station(37.550629,126.914986,"������");
		TourManager.addStation(station3);
		Station station4 = new Station(37.55751,126.918503,"�������� �������������� ��");
		TourManager.addStation(station4);
		Station station5 = new Station(37.552746,126.918617,"������ ��Ÿ�");
		TourManager.addStation(station5);
		Station station6 = new Station(37.547871,126.923531,"�����");
		TourManager.addStation(station6);
		Station station7 = new Station(37.549202,126.923203,"�ص���۱� ��");
		TourManager.addStation(station7);
		Station station8 = new Station(37.557499,126.923805,"ȫ���Ա���");
		TourManager.addStation(station8);
		Station station9 = new Station(37.547733,126.931763,"����â��");
		TourManager.addStation(station9);
		Station station10 = new Station(37.545284,126.931053,"�����������");
		TourManager.addStation(station10);
		Station station11 = new Station(37.545242,126.934113,"�ż��� ��Ÿ�");
		TourManager.addStation(station11);
		Station station12 = new Station(37.549767,126.933174,"�����ҹ漭 ��");
		TourManager.addStation(station12);
		Station station13 = new Station(37.547249,126.939293,"�ż����Ĵ� ��");
		TourManager.addStation(station13);
		Station station14 = new Station(37.55114,126.936989,"������ ���� �ǳ���");
		TourManager.addStation(station14);
		Station station15 = new Station(37.549484,126.93895,"������ ���� ��");
		TourManager.addStation(station15);
		Station station16 = new Station(37.550411,126.943848,"������ �Ĺ� ��");
		TourManager.addStation(station16);
		Station station17 = new Station(37.555054,126.937569,"���̿�");
		TourManager.addStation(station17);
		Station station18 = new Station(37.556004,126.942299,"���ﵿ �ֹμ���");
		TourManager.addStation(station18);
		Station station19 = new Station(37.557201,126.955666,"������");
		TourManager.addStation(station19);
		Station station20 = new Station(37.544579,126.950218,"������");
		TourManager.addStation(station20);
		Station station21 = new Station(37.539936,126.945824,"������");
		TourManager.addStation(station21);
		Station station22 = new Station(37.542347,126.943024,"�밭�� �ֹμ��� ��");
		TourManager.addStation(station22);
		Station station23 = new Station(37.552956,126.934341,"�����뿪");
		TourManager.addStation(station23);
		Station station24 = new Station(37.555687,126.905548,"����1���ֹμ���");
		TourManager.addStation(station24);
		Station station25 = new Station(37.55661,126.898018,"��������ü������ ��");
		TourManager.addStation(station25);
		Station station26 = new Station(37.564697,126.912613,"����2�� ��Ÿ�");
		TourManager.addStation(station26);
		Station station27 = new Station(37.560909,126.905495,"������û��");
		TourManager.addStation(station27);
		Station station28 = new Station(37.56855,126.914513,"���¿�");
		TourManager.addStation(station28);
		Station station29 = new Station(37.549904,126.955147,"���Ｍ��������� ��");
		TourManager.addStation(station29);
		Station station30 = new Station(37.553001,126.956688,"�ֿ�����");
		TourManager.addStation(station30);
		Station station31 = new Station(37.568722,126.896225,"���� �����Ű����");
		TourManager.addStation(station31);
		Station station32 = new Station(37.551342,126.902672,"�����ʷϱ� �Ա�");
		TourManager.addStation(station32);
		Station station33 = new Station(37.565166,126.919395,"�ϴ�ä�ڿ��վ���Ʈ �ǳ���");
		TourManager.addStation(station33);
		Station station34 = new Station(37.558949,126.907753,"SK������������ �ǳ���");
		TourManager.addStation(station34);
		Station station35 = new Station(37.542545,126.934296,"���� �ż����� ��");
		TourManager.addStation(station35);
		Station station36 = new Station(37.563965,126.898209,"������ ����");
		TourManager.addStation(station36);
//		Station station37 = new Station(37.566845,126.896446,"���� ������ �����");
//		TourManager.addStation(station37);
		Station station38 = new Station(37.587524,126.883003,"�����ȭ��������ũ 1�� ��");
		TourManager.addStation(station38);
		Station station39 = new Station(37.586189,126.881615,"��Ͽ�������ũ 10���� ��");
		TourManager.addStation(station39);
		Station station40 = new Station(37.58559,126.884727,"�ξ��̰��� ��");
		TourManager.addStation(station40);
		Station station41 = new Station(37.582657,126.885788,"DMC���� ��");
		TourManager.addStation(station41);
		Station station42 = new Station(37.581314,126.880585,"��Ͽ�������ũ 7���� ��");
		TourManager.addStation(station42);
		Station station43= new Station(37.580631,126.883675,"������ ����������������");
		TourManager.addStation(station43);
		Station station44 = new Station(37.580811,126.88665,"LG CNS��");
		TourManager.addStation(station44);
		Station station45 = new Station(37.579399,126.88916,"�����޽����� ��");
		TourManager.addStation(station45);
		Station station46 = new Station(37.577496,126.887772,"������б� ��");
		TourManager.addStation(station46);
		Station station47 = new Station(37.575802,126.890739,"DMC �������¿������� ��");
		TourManager.addStation(station47);
		Station station48 = new Station(37.571476,126.889687,"��� ��������ũ 3���� �Ĺ�");
		TourManager.addStation(station48);
		Station station49 = new Station(37.57822,126.89447,"��ϵ��ֹμ��� ��");
		TourManager.addStation(station49);
		Station station50 = new Station(37.577469,126.897362,"DMC�� 9���ⱸ");
		TourManager.addStation(station50);
		Station station51 = new Station(37.575665,126.894447,"��Ͽ�������ũ 1���� ������");
		TourManager.addStation(station51);
		Station station52 = new Station(37.570721,126.898979,"�����Ű���忪");
		TourManager.addStation(station52);
		Station station53 = new Station(37.56842,126.899429,"Ȩ�÷��� ��");
		TourManager.addStation(station53);
		Station station54 = new Station(37.566246,126.896179,"����� ���������� ��ϼ���");
		TourManager.addStation(station54);
		Station station55 = new Station(37.565903,126.901184,"������û ��");
		TourManager.addStation(station55);
		Station station56 = new Station(37.569084,126.894424,"��ȭ�������");
		TourManager.addStation(station56);
		Station station57 = new Station(37.57362,126.898048,"�Ե����̸�Ʈ(��Ͽ�������)");
		TourManager.addStation(station57);
		Station station58 = new Station(37.584503,126.885597,"DMC÷�ܻ������");
		TourManager.addStation(station58);
		Station station59 = new Station(37.549061,126.954178,"����ſ뺸�����");
		TourManager.addStation(station59);
		Station station60 = new Station(37.569584,126.903816,"����ÿ�����Ʈ");
		TourManager.addStation(station60);
		Station station61 = new Station(37.563339,126.908203,"�����߾ӵ�����");
		TourManager.addStation(station61);
		
//		ArrayList<Integer> StationNumber = new ArrayList<>();
//		ArrayList<String> StationName = new ArrayList<>();
//		ArrayList<Integer> Bike = new ArrayList<>();
//		ArrayList<Double> LAT = new ArrayList<>();
//		ArrayList<Double> LON = new ArrayList<>();
//		ArrayList<Integer> NEED = new ArrayList<>();
//		
//		//xlxs �ҷ�����
//		FileInputStream fis = new FileInputStream("C:/Users/82106/Desktop/Bike/seoulbike22.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		int rowindex = 0;
//		int columnindex = 0;
//		
//		//��Ʈ �б�
//		XSSFSheet sheet = workbook.getSheetAt(0);
//		
//		//���� �� 
//		int rows = sheet.getPhysicalNumberOfRows();
//		for(rowindex = 1;rowindex<rows;rowindex++) {
//			//�� �б�
//			XSSFRow row = sheet.getRow(rowindex);
//			if(row != null) {
//				//���� ��
//				int cells = row.getPhysicalNumberOfCells();
//				for(columnindex = 1;columnindex <= cells;columnindex++) {
//					//�����б�
//					XSSFCell cell = sheet.getRow(rowindex).getCell((short)columnindex);
//					String value = "";
//					double doubleValue = 0;
//					//���� ��ĭ�� ���
//					if(cell == null) {
//						continue;
//					}else {
//						switch(cell.getCellType()) {
//							case FORMULA:
//								value = cell.getCellFormula();
//								break;
//							case NUMERIC:
//								doubleValue = cell.getNumericCellValue();
//								break;
//							case STRING:
//								value = cell.getStringCellValue();
//								break;
//							case BLANK:
//								value = cell.getBooleanCellValue()+"";
//								break;
//							case ERROR:
//								value = cell.getErrorCellValue()+"";
//								break;
//							
//						}
//					}
//					
//					switch(columnindex) {
//						case 1:
//							StationNumber.add((int)doubleValue);
//							break;
//						case 2:
//							StationName.add(value);
//							break;
//						case 3:
//							Bike.add((int)doubleValue);
//							break;
//						case 4:
//							LAT.add(doubleValue);
//							break;
//						case 5:
//							LON.add(doubleValue);
//							break;
//						case 6:
//							NEED.add((int)doubleValue);
//							break;
//							
//					}
//				}
//			}			
//		}
//		for(int i = 0;i<NEED.size();i++) {
//			if(NEED.get(i) != 0) {
//				TourManager.addStation(new Station(LAT.get(i),LON.get(i),StationNumber.get(i),StationName.get(i),NEED.get(i)));
//			}
//		}
		

		//ù ��ü ����
		Population pop = new Population(50,true);
		
//		for(int i = 0;i<50;i++) {
//			System.out.println(pop.getTour(i).FirstSta());
//			
//		}
		
		System.out.println("Initial distance : " + pop.getFittest().getDistance());

		//100���� ��ȭ ����
		pop = GA.evolvePopulation(pop);
		for(int i = 0; i < 1000 ;i++) {
			pop = GA.evolvePopulation(pop);
		}

		System.out.println("Finished");
		System.out.println("Final distance : "+ pop.getFittest().getDistance());
		System.out.println("Solution : ");
		System.out.println(pop.getFittest());
		
		
//		String excelFile = "C:/Users/82106/Desktop/GA_Location/Location_station11.xlsx";
//		
//		int numofStation = TourManager.numberOfStations();
//		
//		XSSFWorkbook xlsWb = new XSSFWorkbook();
//		
//		XSSFSheet sheet1 = xlsWb.createSheet("sheet1");
//		
//		for(int i = 0;i<numofStation;i++) {
//			XSSFRow row1 = sheet1.createRow(i);
//			for(int j = 0;j<3;j++) {
//				XSSFCell cell = row1.createCell(j);
//				switch(j) {
//				case 0:
//					pop.getFittest().getStation(i).getName();
//					break;
//				case 1:
//					pop.getFittest().getStation(i).getX();
//					break;
//				case 2:
//					pop.getFittest().getStation(i).getY();
//					break;
//				}
//			}
//		}
//		
//		FileOutputStream fileOut = new FileOutputStream(excelFile);
//		fileOut.close();
		
		
		
	}

}
