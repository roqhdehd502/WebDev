package fifthWeek.rec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class LocationMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Location[] location = new Location[4];
		HashMap<String, Location> map 
			= new HashMap<String, Location>();
		
		System.out.println("도시, 경도, 위도를 입력하세요.");
		System.out.println("ex) 서울, 37, 126");
		
		try {
			for(int i=0; i<location.length; i++) {
				System.out.print(">> ");
				String text = sc.nextLine();
				StringTokenizer st = new StringTokenizer(text, ",");
				String city = st.nextToken().trim();
				int longitude = Integer.parseInt(st.nextToken().trim());
				int latitude = Integer.parseInt(st.nextToken().trim());
				location[i] = new Location(city, longitude, latitude);
				map.put(city, location[i]);
			}
			Set<String> key = map.keySet();
			Iterator<String> it = key.iterator();
			System.out.println("----------------------------------");
			
			while(it.hasNext()) {
				String city = it.next();
				Location s = map.get(city);
				System.out.println(s.getCity() + " "
						+ s.getLongitude() + " "
						+ s.getLatitude());
			}
			System.out.println("----------------------------------");
			
			while(true) {
				System.out.print("도시 이름 >> ");
				String city = sc.next();
				
				if(city.equals("그만"))
					break;
				
				Location s = map.get(city);
				
				if(s == null)
					System.out.println(city + "는 없습니다.");
				else
					System.out.println(s.getCity() + " "
							+ s.getLongitude() + " "
							+ s.getLatitude());
			}
		} catch (NoSuchElementException e) {
			System.out.println("잘못된 입력 값 입니다.");
			System.out.println("쉼표 및 띄어쓰기를 누락하지 않으셨는지 다시 확인 후 입력해주세요.");
		}
		
		sc.close();
	}
}