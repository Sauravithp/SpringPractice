/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankinfo;

import bankinfo.dao.BankDAO;
import bankinfo.dao.impl.BankDAOImpl;
import bankinfo.entity.Bank;
import bankinfo.entity.Department;
import java.util.Scanner;


/**
 *
 * @author thapaniwas
 */
public class BankInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankDAO bankDAO=new BankDAOImpl();
        Scanner input=new Scanner(System.in);
        
        while(true){
        System.out.println("MENU");
        System.out.println("1.Add Bank");
        System.out.println("2.View All");
        System.out.println("3.Edit Bank Details");
        System.out.println("4.Search by ID");
        System.out.println("5.Delte by ID");
        System.out.println("6.Exit");
        
        System.out.println("******************************");
        System.out.println("Enter your choice");
        System.out.println("******************************");
        switch(input.nextInt()){
            case 1:
                Bank b=new Bank();
                System.out.println("Enter ID");
                b.setId(input.nextInt());
                System.out.println("Enter Bank Name");
                input.nextLine();
                b.setBankName(input.nextLine());
                System.out.println("Enter the number of Department");
                int i=input.nextInt();
                for(int j=0;j<i;j++){
                    Department d=new Department();
                    System.out.println("Enter Department ID");
                    d.setdId(input.nextInt());
                    System.out.println("Enter Department Name");
                    input.nextLine();
                    d.setdName(input.nextLine());
                    b.setDepartment(d);
                }
                bankDAO.insert(b);
                break;
                
            case 2:
                bankDAO.getAll();
                System.out.println(bankDAO.getAll());
                break;
                
            case 3:
                
                System.out.println("Enter ID to be edited:");
                System.out.println("---------------------------------------");
                int bl=bankDAO.edit(input.nextInt());
                if(bl!=0){
                   bankDAO.delete(bl);
                   Bank b1=new Bank();
                   b1.setId(bl);
                   System.out.println("Enter Bank Name");
                   input.nextLine();
                   b1.setBankName(input.nextLine());
                   System.out.println("Enter the number of Department");
                  int k=input.nextInt();
                for(int j=0;j<k;j++){
                    Department d=new Department();
                    System.out.println("Enter Department ID");
                    d.setdId(input.nextInt());
                    System.out.println("Enter Department Name");
                    input.nextLine();
                    d.setdName(input.nextLine());
                    b1.setDepartment(d);
                }
                   bankDAO.insert(b1);
                }
                break;
                
            case 4:
                System.out.println("Enter ID to search:");
                System.out.println("---------------------------------------");
                Bank be=bankDAO.getById(input.nextInt());
                System.out.println(be);
                break;
                
            case 5:
                System.out.println("Enter ID to delete:");
                System.out.println("---------------------------------------");
                bankDAO.delete(input.nextInt());
                break;
                
            case 6:
                System.exit(0);
                break;
             
        }
                
        }
        
        
        
    }
    
}
