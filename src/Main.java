import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entites.Department;
import models.entites.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
    }
}