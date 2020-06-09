package com.dx.dx.service.impl;

import com.dx.dx.dao.DxbgDao;
import com.dx.dx.domain.DxbgDO;
import com.dx.dx.service.DxbgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class DxbgServiceImpl implements DxbgService {
	@Autowired
	private DxbgDao dxbgDao;
	
	@Override
	public DxbgDO get(String num){
		return dxbgDao.get(num);
	}
	
	@Override
	public List<DxbgDO> list(Map<String, Object> map){
		return dxbgDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return dxbgDao.count(map);
	}
	
	@Override
	@Async("myTaskAsyncPool")
	public Integer save(List<DxbgDO> ecds){
		return dxbgDao.save(ecds);
	}
	
	@Override
	public int update(DxbgDO dxbg){
		return dxbgDao.update(dxbg);
	}
	
	@Override
	public int remove(String num){
		return dxbgDao.remove(num);
	}
	@Override
	public int removeAll(){
		return dxbgDao.removeAll();
	}
	@Override
	public int batchRemove(String[] nums){
		return dxbgDao.batchRemove(nums);
	}
	
}
