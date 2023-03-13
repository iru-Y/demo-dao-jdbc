import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entites.Department;
import models.entites.Seller;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("===== Test 01: findById ======");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n===== Test 02: Seller findByDepartment ======");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj : list){
            System.out.println(obj);
        }
        System.out.println("\n===== Test 03: Seller findAll ======");
        list = sellerDao.findAll();
        for(Seller obj : list){
            System.out.println(obj);
        }

    }
}