package edu.kh.Toy.model.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


import edu.kh.Toy.model.dto.Toy;
import edu.kh.Toy.model.service.ToyService;
import edu.kh.Toy.model.service.ToyServiceImpl;

public class ToyView {

	private BufferedReader br = null;
	private ToyService service = null;
	
	public ToyView() {
		
		try {
			
			service = new ToyServiceImpl();
			
			br = new BufferedReader(new InputStreamReader(System.in));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Toy 시작 화면 
	 */
	public void displayView() {
		
		int input = 0;
		
		do {
			
			try {
				
				
				input = selectMenu();
				
				switch(input) {
				case 1 : toyAll(); break;
				case 2 : toyDetail(); break;
				case 3 : toyAdd(); break;
				case 4 : toyComplete(); break;
				case 5 : toyUpdate(); break;
				case 6 : toyDelete(); break;
				case 0 :System.out.println("프로그램 종료"); break;
				default : System.out.println("메뉴에 있는 번호만 선택해주세요."); break;
				}
				
				System.out.println("-------------------------------------------------");
				
			} catch(NumberFormatException e) {
				System.out.println("숫자만 입력!");
				input = -1;
				
			} catch(IOException e) {
				
				System.out.println("입/출력 관련 예외");
				e.printStackTrace();
				
			} catch(Exception e) {
				e.printStackTrace();
				
			}
			
		
		} while(input != 0);
	}
	
	/**
	 * 메뉴 출력 및 선택 
	 * @return 선택한 메뉴 번호 반환 
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public int selectMenu() throws NumberFormatException, IOException {
		
		System.out.println("\n============= 장난감 리스트 =============\n");
		System.out.println("1. 장난감 전체 조회");
		System.out.println("2. 장난감 특이사항");
		System.out.println("3. 장난감 추가하기");
		System.out.println("4. 장난감 완성 여부");
		System.out.println("5. 장난감 수정하기");
		System.out.println("6. 장난감 삭제하기");
		System.out.println("0. 공장 종료");
		
		System.out.print("메뉴 선택 : ");
		
		int input = Integer.parseInt(br.readLine());
	
		return input;
	}
/**
 * 장난감 전체 조회 
 */
	public void toyAll() {
		System.out.println("\n=========[1. 장난감 전체 조회]=========\n");
	
	Map<String, Object> map = service.toyAll();
	
	List<Toy> toyList = (List<Toy>)map.get("장난감 목록");
	int completeCount = (int)map.get("진행 여부");
	System.out.printf("[ 완성된 장난감 개수 / 전체 장난감 수 : %d / %d ]\n"
			, completeCount, toyList.size());
	System.out.println("--------------------------------------------------------------------");
	System.out.printf("%-3s %10s   %10s     %s     %s\n", "번호", "생산일", "완성여부", "장난감 목록","현재 수량");
	System.out.println("--------------------------------------------------------------------");
	
	for(int i=0, len = toyList.size(); i < len; i++) {
	
		String title = toyList.get(i).getName();
		
		String completeYN = toyList.get(i).isComplete() ? "O" : "X";
		
		String regDate = service.dateFormat(toyList.get(i).getRegDate());
		
		int quantity = toyList.get(i).getQuantity();
		
		System.out.printf("[%3d]  %20s    (%s)       %s       %3d\n", i, regDate, completeYN, title, quantity);
	}
	
	}
	/**
	 * 장난감 특이사항 
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public void toyDetail() throws NumberFormatException, IOException {
		System.out.println("\n=========[2. 장난감 특이사항]=========\n");
	
		System.out.println("번호 입력 : ");
		int index = Integer.parseInt(br.readLine() );
	
		String todoDetail = service.toyDetail(index);
		
		if(todoDetail == null) {
			System.out.println("입력한 번호가 존재하지 않습니다.");
			return;
		}
		
		System.out.println(todoDetail);
	}
	
	/**
	 * 장난감 추가 
	 * @throws IOException
	 */
	
	public void toyAdd() throws IOException, Exception{
		System.out.println("\n=========[3. 장난감 추가하기]=========\n");
	
		System.out.println("장난감 추가하기 : ");
		String name =br.readLine();
		
		// 입력받은 이름과 일치하는 장난감이 있는지 검사하는 서비스 호출 및 결과 받기
		boolean isDuplicateToy = service.checkDuplicateToy(name);
		
		if(isDuplicateToy == false) {
			System.out.println("중복된 이름이 있습니다! 메서드 종료");
			return;
			
		} else {
			StringBuilder sb = new StringBuilder();
		
			System.out.println("특이 사항 작성 (입력 종료 시 q 작성 후 엔터)");
			System.out.println("-----------------------------------");				
			
			while (true) {
			
			String content = br.readLine();
			
			if(content.equals("q")) break;
			
			sb.append(content);
			sb.append("\n");
			}
			
			System.out.println("-----------------------------------");
			
			Map<String,Object> map = service.toyAdd(name,sb.toString());
			
			List<Toy> toylist = (List<Toy>)map.get("toyList");
			int toyCount = (int)map.get("toycount");
			
			for(Toy toy : toylist) {
				if(toy.getName().equals(name)) {
				
					toy.setQuantity(toyCount);
					
					break;
				}
				
			}
		}
	
		
	}
	
	/**장난감 완성 여부 체크 
	 * 완성된 장난감은 o 아니면 x 
	 * @throws Exception
	 */
	public void toyComplete() throws Exception {
		
		System.out.println("\n=========[4. 장난감 완성 체크]=========\n");
		
		System.out.print("변경할 인덱스 번호 입력 : ");
		int index = Integer.parseInt(br.readLine() );	
		
		boolean result = service.toyComplete(index);
		
		if(result) { 
			System.out.println("[변경 되었습니다]");
			
		} else { 
			System.out.println("### 인덱스가 존재하지 않습니다 ###");
		}
	}
	
	/**
	 * 장난감 수정 
	 * @throws Exception
	 */
	public void toyUpdate() throws Exception {
		System.out.println("\n=========[5. 장난감 수정하기]=========\n");
	
		System.out.println("수정할 번호 입력 : ");
		int index = Integer.parseInt(br.readLine() );
		
		String todoDetail = service.toyDetail(index);
		
		if( todoDetail == null) {
			System.out.println("번호가 존재하지 않습니다.");
			return;			
		}
		
		System.out.println("*****[수정 전]*****");
		System.out.println(todoDetail);
		System.out.println("*******************");
		
		System.out.println("장난감 수정 하기 : ");
		String name =br.readLine();
		
		System.out.println("특이 사항 작성 (수정할 내용 입력 [종료 시 q 작성 후 엔터]");
		
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			
			String content = br.readLine();
			
			if(content.equals("q")) break;
			
			sb.append(content);
			sb.append("\n");
		}		
		System.out.println("-----------------------------------");
		
		boolean result = service.toyUpdate(index, name,sb.toString());
		if(result) System.out.println("수정 되었습니다.");
		else System.out.println("수정이 실패하였습니다.");
		
	}
	
	/**
	 * 장난감 삭제
	 * @throws Exception
	 */
	public void toyDelete() throws Exception{
		System.out.println("\n=========[6. 장난감 삭제하기]=========\n");
		
		System.out.println("삭제할 장난감 번호 입력 : ");
		int index = Integer.parseInt(br.readLine());
		
		String result = service.toyDelete(index); 
		
		if(result == null) System.out.println("번호가 존재하지 않습니다.");
		else System.out.printf("[%s]가 삭제 되었습니다\n", result);	
	}
	
	
}
