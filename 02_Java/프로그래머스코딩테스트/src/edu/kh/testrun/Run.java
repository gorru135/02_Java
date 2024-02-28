package edu.kh.testrun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.kh.test.IPInfo;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<IPInfo> ipinfolist = new ArrayList<IPInfo>();
		
		ipinfolist.add(new IPInfo("123.123.123.123","홍길동"));
		ipinfolist.add(new IPInfo("123.123.123.123","홍길동"));
		ipinfolist.add(new IPInfo("123.123.123.123","홍길동"));
		
		System.out.print("ip 입력 : ");
		String ip = sc.next();
		
		for(IPInfo ipinfo : ipinfolist) {
			if(ipinfo.getIp().equals(ip)) {
				System.out.println(ipinfo);
				;
			}
		}
		System.out.println("일치하는 ip 사용자가 없습니다.");
	}
}
