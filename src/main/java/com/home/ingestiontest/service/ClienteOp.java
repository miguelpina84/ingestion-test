package com.home.ingestiontest.service;

import com.home.ingestiontest.model.record.ClienteDto;

import java.util.Optional;

public interface ClienteOp {

    ClienteDto saveClientInfoDB(ClienteDto clienteDto);

    Optional<ClienteDto> findClientInDB(Integer idCliente);

    void deleteClientInDB(Integer idCliente);

    ClienteDto updateClientInDB(Integer idCliente, ClienteDto clienteDto);
}
