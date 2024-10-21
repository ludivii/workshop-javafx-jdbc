package model.servicies;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {

	private SellerDao dao = DaoFactory.createSellerDao();
	
	public List<Seller> findAll() {
		return dao.findAll();
	}

	public void saveOrUpdate(Seller Seller) {
		if (Seller.getId() == null) {
			dao.insert(Seller);
		} else {
			dao.update(Seller);
		}
	}
	
	public void remove(Seller obj) {
		dao.deleteById(obj.getId());
	}
}
