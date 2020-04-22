package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class ProgramDAOJDBC {

	public static void main(String[] args) {
		
		//Department obj = new Department(1, "Books");
		
		//System.out.println(obj);
		
		//Seller seller = new Seller(21, "Bob", "Bob@gmail.com", new Date(), 3000.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao(); 
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}

}
