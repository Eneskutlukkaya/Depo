package concrete;

import Abstract.CampaignService;

public class CampaignManager implements CampaignService {

	@Override
	public void add() {
		System.out.println("Kampanya eklendi");
		
	}

	@Override
	public void delete() {
		System.out.println("Kampanya silindi");
		
	}

	@Override
	public void update() {
		System.out.println("Kampanya güncellendi");
		
	}

}
