package section12;

import section12.access2.AttackMidfielder;
import section12.access2.Midfielder;
import section12.access2.Player;
import section12.access2.Team;

/*
 * 인터페이스(interface)
 * 	추상메소드들의 집합
 * 	변수선언을 해도 변수가 아닌 상수가 된다.
 * 	다중상속 가능
 * 
 * 주역할: 
 * 	객체 구조(뼈대)를 만들어 준다.
 * 	선업방법 클래스명 + implements 
 * 	클래스와 다르게 임플리먼츠명 뒤에 ','를 사용하여 다중상속이 가능하다. ex) Foward implements Player, Team
 * 	이터페이스에 extends 사용가능 또한 abstract 스킵가능.
 * 	인터페이스는 new로 객체화는 못하지만 타입으로 선언가능.
 *	※인터페이스가 인터페이스 상속시 extends 키워드 사용.
 *	 클래스가 인터페이스 받을시 implements 키워드 사용. 
 *
 */


public class InterfaceClass01 {
	public static void main(String[] args) {
		System.out.println("---AttackMidfielder 객체---");
		AttackMidfielder am = new AttackMidfielder();
		am.printClubTeamInfo();
		am.dribble();
		am.makeGame();
		am.kick();
		
		
		System.out.println("---AttackMidfielder객체 Midfielder 타입으로 변환---");
		Midfielder mf = am; // 다형성
		mf.printClubTeamInfo();
		mf.dribble();
		mf.makeGame();
		mf.kick();
		
		
		System.out.println("---AttackMidfielder객체 Player 타입으로 변환---");
		Player p = am; //다형성
//		p.printClubTeamInfo(); // Team 인터페이스 선언되어있는 메소드 Player에 없음.
		p.dribble();
		p.kick();
//		p.makeGame // Midfielder 인터페이스 선언되어있는 메소드 Player에 없음.
		
		
		System.out.println("---AttackMidfielder객체 Team 타입으로 변환---");
		Team t = am; // 호출 불가능이나 다형성으로 받을 수 있음.
		t.printClubTeamInfo();
//		t.dribble(); // 호출 불가능
//		t.makeGame(); // 호출 불가능
//		t.kick(); // 호출 불가능
		
	}
}
