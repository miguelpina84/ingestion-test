package com.home.ingestiontest.service;

import com.home.ingestiontest.model.record.ClienteDto;
import com.home.ingestiontest.model.record.ClienteRequestDto;
import com.home.ingestiontest.repository.ClienteRepository;
import com.home.ingestiontest.repository.VehiculoRepository;
import com.home.ingestiontest.repository.ZapatoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientService implements ClienteOp {

    private final ClienteRepository  clienteRepository;
    private final VehiculoRepository vehiculoRepository;
    private final ZapatoRepository  zapatoRepository;


    /**
     * @param request
     * @return
     */
    @Override
    public ClienteDto saveClientInfoDB(ClienteRequestDto request) {

        return null;
    }

    /**
     * @param idCliente
     * @return
     */
    @Override
    public Optional<ClienteDto> findClientInDB(Integer idCliente) {
        return Optional.empty();
    }

    /**
     * @param idCliente
     */
    @Override
    public void deleteClientInDB(Integer idCliente) {

    }

    /**
     * @param idCliente
     * @param request
     * @return
     */
    @Override
    public ClienteDto updateClientInDB(Integer idCliente, ClienteRequestDto request) {
        return null;
    }
}
