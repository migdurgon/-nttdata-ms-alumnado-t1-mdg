/**
 * 
 */
package com.nttdata.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nttdata.dtos.NttdataAlumnadoDto;

/**
 * @author DURAN
 *
 */
@Service
public class NttdataAlumnadoServiceImpl implements NttdataAlumnadoServiceI {

	@Value("${spring.application.name}")
	private String applicationName;
	@Value("${server.port}")
	private String port;
	
	@Override
	public NttdataAlumnadoDto getStudentsInfo() {
		final NttdataAlumnadoDto resultDto = new NttdataAlumnadoDto();
		resultDto.setApplicationName(applicationName);
		resultDto.setPort(port);
		return resultDto;
	}

}
