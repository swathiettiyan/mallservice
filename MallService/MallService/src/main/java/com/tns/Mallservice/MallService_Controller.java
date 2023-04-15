package com.tns.Mallservice;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MallService_Controller {
	@Autowired
	private MallService a;
	
	@GetMapping(("/MallServices"))
	public List<Mall> list()
	{
		return a.listAll();
	}
	@GetMapping("/AdminServices/(Mall_id)")
	public ResponseEntity<Mall> get (@PathVariable Integer Mall_id)
	{
		try
		{
			Mall Mall=a.get(Mall_id);
			return new ResponseEntity<Mall>(Mall,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<Mall>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/MallServices")
	public void add(@RequestBody  Mall mls)
	{
        a.save(mls);
	}
	public ResponseEntity<?> update(@RequestBody Mall mls,@PathVariable Integer Mall_id)
	{
		a.save(mls);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@DeleteMapping("/MallServices/(Mall_id)")
	public void delete (@PathVariable Integer Mall_id)
	{
        a.delete(Mall_id);
	}


}
