package br.com.dbunit.dbunit.dao;

import java.util.List;

import br.com.dbunit.dbunit.entidades.Transacao;

public interface TransacaoDAO {

    Transacao save(Transacao transacao) throws Exception;

    Transacao edit(Transacao transacao) throws Exception;
 
    Transacao findById(Long transacaoId) throws Exception;

    void delete(Transacao transacao) throws Exception;
 
    List<Transacao> list() throws Exception;
}
