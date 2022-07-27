package com.personal.miportafolio.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.personal.miportafolio.model.Hard;
import com.personal.miportafolio.service.IHardService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HardController {
	@Autowired
	private IHardService interHard;
	@GetMapping("/hards/traer")
	@ResponseBody
	public List<Hard> getHards(){
		return interHard.getHards();
	}
	
	
	@GetMapping("/hards/traer/{id}")
	@ResponseBody
	public Hard obtenerHard(@PathVariable Long id) {
		Hard har = interHard.findHard(id);
		return har;
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/hards/guardar")
	@ResponseBody
	public ResponseEntity<Object>guardarHard(@RequestBody Hard har) {
		interHard.saveHard(har);
		return ResponseEntity.ok(Boolean.TRUE);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/hards/borrar/{id}")
	@ResponseBody
	public ResponseEntity<Object> deleteHard(@PathVariable Long id) {
		interHard.deleteHard(id);
		return ResponseEntity.ok(Boolean.TRUE);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/hards/editar/{id}")
	@ResponseBody
	public ResponseEntity<Object> updateHard(@RequestBody Hard res,
			@PathVariable Long id) {	
		this.interHard.update(res, id);
		return ResponseEntity.ok(Boolean.TRUE);
	}

	

}
