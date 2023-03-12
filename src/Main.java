import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entites.Department;
import models.entites.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        Seller seller = new Seller(21, "yuri", "yuri_matteus@hotmail.com", new Date(),5000d, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
    }
}