package com.springAss.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springAss.dao.ContentsDaoImpl;
import com.springAss.model.Contents;


@RestController
public class ContentsController {
	
	@Autowired
private ContentsDaoImpl cont;
	
	@GetMapping("/contents")
	public List<Contents>getContent(){
		return cont.list();
	}
	@GetMapping("/contents/{id}")
public ResponseEntity<?>getContent(@PathVariable("id")int id){
	Contents con=cont.get(id);
	if(cont==null) {
		return new ResponseEntity<String>("No Contents Found",HttpStatus.NOT_FOUND);
		
	}
	return new ResponseEntity<Contents>(con,HttpStatus.OK);
}
	@PostMapping("/content")
	public ResponseEntity<?>save(@RequestBody Contents conts){
		cont.save(conts);
		return new ResponseEntity<Contents>(conts,HttpStatus.OK);
	}
	@PutMapping("/content")
	public ResponseEntity<?>save1(@RequestBody Contents conts){
		cont.save(conts);
		return new ResponseEntity<Contents>(conts,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/contents/{id}")
public ResponseEntity<?>delete(@PathVariable("id")int id){
	if(cont.delete(id)<=0){
		return new ResponseEntity<String>("No contents found to delete",HttpStatus.NOT_FOUND);
		
	}
	return new ResponseEntity<Integer>(id,HttpStatus.OK);
}
}

