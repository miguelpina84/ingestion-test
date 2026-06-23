package com.home.ingestiontest.service;

import com.home.ingestiontest.model.record.ClienteDto;
import com.home.ingestiontest.model.record.ClienteRequestDto;

import java.util.Optional;

public interface ClienteOp {

    ClienteDto saveClientInfoDB(ClienteRequestDto request);

    Optional<ClienteDto> findClientInDB(Integer idCliente);

    void deleteClientInDB(Integer idCliente);

    ClienteDto updateClientInDB(Integer idCliente, ClienteRequestDto request);
}
