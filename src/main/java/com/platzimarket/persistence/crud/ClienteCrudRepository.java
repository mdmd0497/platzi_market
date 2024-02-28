package com.platzimarket.persistence.crud;

import com.platzimarket.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClienteCrudRepository extends CrudRepository<Cliente,Integer> {
    List<Cliente> findByDireccionOrderById(String direccion);
}
