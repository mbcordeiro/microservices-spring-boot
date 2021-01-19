package com.matheuscordeiro.hrworker.controllers;

import com.matheuscordeiro.hrworker.entities.Worker;
import com.matheuscordeiro.hrworker.repositories.WorkerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {
    private static Logger logger = LoggerFactory.getLogger(WorkerController.class);

    @Autowired
    Environment env;

    @Autowired
    WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> list = workerRepository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
        logger.info("Port = ".concat(env.getProperty("local.server.port")));
        Worker worker = workerRepository.findById(id).get();
        return ResponseEntity.ok(worker);
    }
}
