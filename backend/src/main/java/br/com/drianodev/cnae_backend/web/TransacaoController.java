package br.com.drianodev.cnae_backend.web;

import br.com.drianodev.cnae_backend.entity.TransacaoReport;
import br.com.drianodev.cnae_backend.service.TransacaoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("transacoes")
public class TransacaoController {

    private final TransacaoService transacaoService;

    public TransacaoController(TransacaoService transacaoService) {
        this.transacaoService = transacaoService;
    }

    @CrossOrigin(origins = { "http://localhost:5173", "https://frontend-pagnet.onrender.com" })
    @GetMapping
    List<TransacaoReport> listAll() {
        return transacaoService.getTotaisTransacoesByNomeDaLoja();
    }
}