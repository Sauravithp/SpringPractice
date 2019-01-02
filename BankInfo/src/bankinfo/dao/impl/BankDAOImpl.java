/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankinfo.dao.impl;

import bankinfo.dao.BankDAO;
import bankinfo.entity.Bank;
import bankinfo.entity.Department;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thapaniwas
 */
public class BankDAOImpl implements BankDAO{
            List<Bank> blist=new ArrayList<>();
             
    @Override
    public List<Bank> getAll() {
        return blist;
        
        
    }

    @Override
    public boolean insert(Bank b) {
       return blist.add(b);
       
               
    }

    @Override
    public boolean delete(int id) {
        Bank be=getById(id);
               if(be!=null){
                    System.out.println("Deleted");
                    blist.remove(be);
                    
                }
                return false;
                
    }

    @Override
    public Bank getById(int id) {
        for(Bank b:blist){
            if(b.getId()==id)
                return b;
        }
                return null;
    }

    @Override
    public int edit(int id) {
        Bank bb=getById(id);
        if(bb!=null){
            return bb.getId();
        }
                return 0;  
}
}
