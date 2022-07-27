package com.personal.miportafolio.service;

import java.util.List;

import com.personal.miportafolio.model.Hard;
public interface IHardService {

	public List<Hard> getHards();
	public void saveHard(Hard hard);
	public void deleteHard(Long id);
	public Hard findHard(Long id);
	public void update(Hard har, Long id);
}