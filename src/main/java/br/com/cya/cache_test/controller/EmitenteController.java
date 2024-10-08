package br.com.cya.cache_test.controller;

import br.com.cya.cache_test.model.Emitente;
import br.com.cya.cache_test.repository.EmitenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emitente")
public class EmitenteController {

    private final EmitenteRepository emitenteRepository;

    @Autowired
    public EmitenteController(EmitenteRepository emitenteRepository) {
        this.emitenteRepository = emitenteRepository;
    }

    @GetMapping("/list")
    @Cacheable(value = "emitentes")
    public List<Emitente> list() {
        return emitenteRepository.findAll();
    }

    @PostMapping("/clear-cache")
    @CacheEvict(value = "emitentes", allEntries = true)
    public void clearCache() {}
}
