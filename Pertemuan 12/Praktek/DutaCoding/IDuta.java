/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAOInterface;

import java.util.List;
import mvc.Model.Duta;
/**
 *
 * @author Toshiba
 */
public interface IDuta {
    public void insert(Duta b);
    public void update(Duta b);
    public void delete(int nik);
    public List<Duta> getAll();   
}
