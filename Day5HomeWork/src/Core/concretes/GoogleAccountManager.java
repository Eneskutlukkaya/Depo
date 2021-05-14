package Core.concretes;

import Core.abstracts.AccountService;

public class GoogleAccountManager implements AccountService {

	@Override
	public void singIn(String email, String password) {
		GoogleAccountManager googleaccountManager = new GoogleAccountManager();
		googleaccountManager.singIn(email, password);
		
	}

}
