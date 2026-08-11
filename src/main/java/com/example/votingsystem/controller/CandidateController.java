package com.example.votingsystem.controller;

import com.example.votingsystem.model.Candidate;
import com.example.votingsystem.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidates")
public class CandidateController {

    @Autowired
    private CandidateRepository repo;

    @PostMapping
    public Candidate addCandidate(@RequestBody Candidate candidate) {
        return repo.save(candidate);
    }

    @GetMapping
    public List<Candidate> getAll() {
        return repo.findAll();
    }
}