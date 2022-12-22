package com.nttdata.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.dtos.NttdataAlumnadoDto;
import com.nttdata.services.NttdataAlumnadoServiceI;

@RestController("api")
public class NttdataAlumnadoController {

	@Autowired
	NttdataAlumnadoServiceI alumnadoService;
	
	@GetMapping("/getStudentsInfo")
	public NttdataAlumnadoDto sendAlumnadoDataInfo() {
		return alumnadoService.getStudentsInfo();
	}
}
