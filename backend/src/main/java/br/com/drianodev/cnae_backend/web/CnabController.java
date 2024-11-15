package br.com.drianodev.cnae_backend.web;

import br.com.drianodev.cnae_backend.service.CnabService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("cnab")
public class CnabController {

    private final CnabService cnabService;

    public CnabController(CnabService cnabService) {
        this.cnabService = cnabService;
    }

    @CrossOrigin(origins = { "http://localhost:5173" })
    @PostMapping("upload")
    public String upload(@RequestParam("file") MultipartFile file) throws Exception {
        System.out.println("Received file: " + file.getOriginalFilename());
        cnabService.uploadCnabFile(file);
        return "Processamento iniciado!";
    }
}
