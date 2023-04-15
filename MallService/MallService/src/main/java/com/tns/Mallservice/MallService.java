package com.tns.Mallservice;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class MallService {
	@Autowired
        
	private MallService repo;
public List <Mall>listAll()
{
	return repo.findAll();
}
private List<Mall> findAll() {
	// TODO Auto-generated method stub
	return null;
}
public Mall get(Integer Mall_id)
{
	return (Mall) repo.findById(Mall_id);
}
private Object findById(Integer mall_id) {
	// TODO Auto-generated method stub
	return null;
}
public void delete(Integer Mall_id)
{
	repo.deleteById(Mall_id);
}
private void deleteById(Integer mall_id) { 
	// TODO Auto-generated method stub
	
}
public void save(Mall mls)
{
	repo.save(mls);
}
}
