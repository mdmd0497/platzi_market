package com.platzimarket.persistence;

import com.platzimarket.persistence.crud.ClienteCrudRepository;
import com.platzimarket.persistence.entity.Cliente;

import java.sql.ClientInfoStatus;
import java.util.List;

public class ClienteRepository {
    private ClienteCrudRepository clienteCrudRepository;

    //obtener un cliente por Direccion y ordenar por ID
    public List<Cliente> getByDireccion(String direccion){
        return clienteCrudRepository.findByDireccionOrderById(direccion);
    }
    //obtener todos los clientes
    public List<Cliente> findAll(){
        return (List<Cliente>) clienteCrudRepository.findAll();
    }

}
