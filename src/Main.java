import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entites.Department;
import models.entites.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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
        System.out.println("\n===== Test 04: Seller INSERT ======");
        Seller newSeller = new Seller(null, "Yan", "Yan@gmail.com", new Date(), 4000d, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n===== Test 05: Seller UPDATE ======");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update completed");

        System.out.println("\n===== Test 06: Seller DELETE ======");
        System.out.print("Enter id for delete test: ");
        int delete = sc.nextInt();
        sellerDao.deleteById(delete);
        System.out.println("Delete completed");
        sc.close();
    }
}