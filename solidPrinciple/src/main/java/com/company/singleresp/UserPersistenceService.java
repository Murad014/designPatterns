package com.company.singleresp;

public class UserPersistenceService {
    private Store store = new Store();
	public void persist(User user){
        store.store(user);
    }
}
