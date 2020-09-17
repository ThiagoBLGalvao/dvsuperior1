package com.dvsuperior.dspesquisa.resources;

import com.dvsuperior.dspesquisa.dto.GameDTO;
import com.dvsuperior.dspesquisa.dto.RecordDTO;
import com.dvsuperior.dspesquisa.dto.RecordInsertDTO;
import com.dvsuperior.dspesquisa.services.GameService;
import com.dvsuperior.dspesquisa.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/records")
public class RecordResource {

    @Autowired
    private RecordService service;

    @PostMapping
    public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO dto){
        RecordDTO newDTO = service.insert(dto);
        return ResponseEntity.ok().body(newDTO);

    }


}
