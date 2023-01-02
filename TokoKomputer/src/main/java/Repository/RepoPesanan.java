/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import java.util.List;

/**
 *
 * @author alzildan
 */
public interface RepoPesanan<T, ID> {
   List<T> findAll(String query);
   List<T> findAll();
   ID create(T object);
   ID update(T object);
   T findById(String id);
   ID delete(String kodeProduk);
   ID findId(String kodeProduk);
}
