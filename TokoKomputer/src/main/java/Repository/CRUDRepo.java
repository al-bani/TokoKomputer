/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import java.util.List;

/**
 *
<<<<<<< HEAD:TokoKomputer/src/main/java/Repository/CRUDRepo.java
 * @author User
 */
public interface  CRUDRepo<T, UsernamePembeli> {
    List<T> findAll();
    UsernamePembeli create(T object);
    UsernamePembeli update(T object);
    T findByUsername(String usernamePembeli);
    UsernamePembeli delete(String usernamePembeli);
}