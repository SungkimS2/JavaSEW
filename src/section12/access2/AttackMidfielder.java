package section12.access2;

public class AttackMidfielder implements Midfielder{
	public String name;
	
	public AttackMidfielder() {
		this.name = "이강인";
	}
	
	@Override
	public void pass() {
		System.out.println("훌륭합니다.");
		
	}

	@Override
	public void kick() {
		System.out.println("예술입니다.");
		
	}

	@Override
	public void shoot() {
		System.out.println("매우 정확해요.");
				
	}

	@Override
	public void dribble() {
		System.out.println("매우 화려함. 월드클래스급");
				
	}

	@Override
	public void printClubTeamInfo() {
		System.out.println("레알 마요르카");
		
	}

	@Override
	public void printNationalTeamInfo() {
		System.out.println("대한민국");
		
	}

	@Override
	public void makeGame() {
		System.out.println("창의적이고 팀에서 캐리중입니다.");
		
	}

}
