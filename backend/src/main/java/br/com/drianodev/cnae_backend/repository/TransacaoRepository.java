package br.com.drianodev.cnae_backend.repository;

import br.com.drianodev.cnae_backend.entity.Transacao;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransacaoRepository extends CrudRepository<Transacao, Long> {
    List<Transacao> findAllByOrderByNomeDaLojaAscIdDesc();
}
