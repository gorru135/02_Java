package edu.kh.toy.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import edu.kh.toy.dto.Toy;

public class ToyService {

	private Scanner sc = new Scanner(System.in);
		
	private Map<Integer, String> map = new HashMap<Integer, String>();
	
	/**
	 * 기본 등록된 재료 
	 * */
	public void Materials(){
		map.put(1, "면직물");
		map.put(2, "플라스틱");
		map.put(3, "유리");
		map.put(4, "고무");
	}
	
	private List<Toy> toy = new ArrayList<Toy>();
	
	
	/**
	 * 기존생성된 장난감 메서드 
	 */
	public ToyService() {
		Materials();
		
		toy.add(new Toy("마미롱레그",8,36000,"분홍색",19950805, addMaterials(1 , 4) ));
		toy.add(new Toy("허기워기",5,12000,"파란색",19940312, addMaterials(1 , 2) ));
		toy.add(new Toy("키시미시",5,15000,"분홍색",19940505, addMaterials(1 , 2) ));
		toy.add(new Toy("캣냅",8,27000,"보라색",19960128, addMaterials(1 , 2) ));
		toy.add(new Toy("파피",12,57000,"빨간색",19931225, addMaterials(1 , 2, 4) ));
		
		
	}

	public Set<String> addMaterials(Integer... materials) {
	    Set<String> set = new HashSet<String>();
	    
	    for(Integer material : materials) {
	        set.add(map.get(material)); // 재료 번호에 해당하는 재료명 가져오기
	    }
	    
	    return set;
	}
	
	public void disPlay() {
		
		int menuNum = 0;
		
		do {
			System.out.println("<<< 플레이타임 공장 >>>");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료추가");
			System.out.println("7. 재료 제거");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 선택 : ");
			
			try {
				
				menuNum = sc.nextInt(); 
				System.out.println();
			
				switch(menuNum) {
				case 1 : toyAll(); break;
				case 2 : System.out.println(addToy()); break;
				case 3 : delete(); break;
				case 4 : toyCheck(); break;
				case 5 : ageCheck(); break;
				case 6 : materials(); break;
				case 7 : materialsdelete(); break;
				case 0 : System.out.println("프로그램 종료..");break;
				default : System.out.println("메뉴에 작성된 번호만 입력하세요!"); break;
				
				}
			} catch (InputMismatchException e) {
				
				System.out.println("\neroor : 입력형식이 유효하지 않습니다. 다시 시도해주세요.");
				sc.nextLine(); 
				
				menuNum = -1; 
			}
			
			
		}while(menuNum !=0);
	}

	public void toyAll() {
		System.out.println("< 전체 장난감 목록 >");
		
		if(toy.isEmpty()) {
			System.out.println("장난감이 없습니다.");
			return;
		}
		
		int index = 1;
		
		for(Toy t : toy) {
			System.out.print((index++) +". :");
			System.out.println(t);
		}
	}

	/**
	 * 장난감 추가 메서드 
	 * @return
	 * @throws InputMismatchException
	 */
	public String addToy() throws InputMismatchException {
	    System.out.println("<새로운 장난감 추가>");
	    
	    System.out.print("장난감 이름 : ");
	    String name = sc.next();
	    
	    System.out.print("사용 가능 연령 : ");
	    int age = sc.nextInt();
	    
	    System.out.print("가격 : ");
	    int price = sc.nextInt();
	    
	    System.out.print("색상 : ");
	    String color = sc.next();
	    
	    System.out.print("제조일 : ");
	    int Manufacturing = sc.nextInt();
	    
	    
	    Set<String> materials = new HashSet<String>(); // 재료 저장할 집합
	    
	    char menuNum = ' ';
	    do {
	        System.out.println("재료를 입력하세요. (종료하려면 'q'를 입력하세요)");
	        String materialInput = sc.next();
	        
	        if (materialInput.equals("q")) {
	            break; // 'q'가 입력되면 반복문 종료
	        }
	        
	        // 재료명을 재료 번호로 변환하여 추가
	        if (map.containsValue(materialInput)) {
	        	
	            for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            	
	                if (entry.getValue().equals(materialInput)) {
	                    materials.add(entry.getValue());
	                    break;
	                }
	            }
	        } else {
	            System.out.println("등록되지 않은 재료명입니다. 다시 입력해주세요.");
	        }
	        
	    } while (true);
	    
	    // Toy 객체 생성 및 추가
	    if (toy.add(new Toy(name, age, price, color, Manufacturing, materials))) {
	        return "새로운 장난감이 추가되었습니다.";
	    } else {
	        return "장난감이 추가되지 않았습니다.";
	    }
	}

	/**
	 * 장난감 삭제 메서드 
	 */
	public void delete() {
	    System.out.print("삭제할 장난감의 이름을 입력하세요: ");
	    String toyInput = sc.next(); // 장난감 이름 입력받기
	    
	    // 장난감 목록을 순회하면서 입력받은 장난감 이름과 일치하는 장난감을 찾아 삭제
	    for (int i = 0; i < toy.size(); i++) {
	        Toy currentToy = toy.get(i);
	        if (currentToy.getName().equals(toyInput)) { // 장난감 이름이 일치하는 경우
	            toy.remove(i); // 해당 인덱스의 장난감을 삭제
	            System.out.println("장난감 \"" + toyInput + "\"이(가) 삭제되었습니다.");
	            return; // 삭제가 완료되면 메서드 종료
	        }
	    }
	    
	    // 여기까지 코드가 도달했다면 입력받은 이름과 일치하는 장난감이 목록에 없는 것이므로 메시지 출력
	    System.out.println("입력하신 이름의 장난감이 목록에 없습니다.");
	}
	
	public void toyCheck() {
		
		System.out.println("<제조일 순으로 장난감들 정렬>");
		
		Collections.sort(toy);
		
		int index = 1;
		for(Toy toylist : toy) {
			System.out.println(index +"."+toylist);
			index++;
		}
	}
	
	/**
	 * 연령별로 사용 가능한 장난감 조회 메서드 
	 * 
	 */
	public void ageCheck() {
		System.out.println("<연령별로 사용 가능한 장난감>");
	
		Comparator<Toy> age = Comparator.comparing(Toy::getAge);
		
		Collections.sort(toy,age);
		
		for(Toy t : toy) {
			System.out.println(t);
		}
	}
	
	public void materials() {
		System.out.println("<재료 추가>");
		
		System.out.println("***현재 등록된 재료***");
		  for (Map.Entry<Integer, String> entry : map.entrySet()) {
		        System.out.println(entry.getKey() + ": " + entry.getValue());
		    }
		
		System.out.println("-----------------------");
		
		System.out.println("재료 고유번호(key)입력 : ");
		int key = sc.nextInt();
		System.out.println("재료명 입력 : ");
		String str = sc.next();
		
		if (map.containsKey(key)) {
	        // 기존에 등록된 재료가 있는 경우
	        System.out.print("기존에 등록된 재료가 있습니다. 덮어쓰시겠습니까? (Y/N): ");
	        String overwrite = sc.next();
	        if (overwrite.equalsIgnoreCase("Y")) {
	            map.put(key, str);
	            System.out.println("재료가 성공적으로 덮어쓰기 되었습니다.");
	        } else {
	            System.out.println("덮어쓰기가 취소되었습니다.");
	        }
	        
	    } else {
	        // 새로운 재료를 추가하는 경우
	        map.put(key, str);
	        System.out.println("새로운 재료가 성공적으로 추가되었습니다.");
	    }
	}
	
	public void materialsdelete() {
		System.out.println("<재료 삭제>");
		
		System.out.println("***현재 등록된 재료***");
		  for (Map.Entry<Integer, String> entry : map.entrySet()) {
		        System.out.println(entry.getKey() + ": " + entry.getValue());
		    }
		
		System.out.println("-----------------------");
		
		System.out.println("삭제할 재료명 입력 : ");
		String str = sc.next();
		
	    boolean removed = false;
	    for (Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
	        Map.Entry<Integer, String> entry = iterator.next();
	        if (entry.getValue().equalsIgnoreCase(str)) {
	            iterator.remove(); // 해당 재료 제거
	            removed = true;
	            break;
	        }
	    }
	    
	    if (removed) {
	        System.out.println("재료 \"" + str + "\"가 성공적으로 제거되었습니다.");
	    } else {
	        System.out.println("해당 이름의 재료가 존재하지 않습니다.");
	    }
	}
}
