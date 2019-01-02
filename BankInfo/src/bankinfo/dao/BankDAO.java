    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankinfo.dao;

import bankinfo.entity.Bank;
import java.util.List;

/**
 *
 * @author thapaniwas
 */
public interface BankDAO {
    List<Bank> getAll();
    boolean insert(Bank b);
    Bank getById(int id);
    int edit(int id);
    boolean delete(int id);
    
}
