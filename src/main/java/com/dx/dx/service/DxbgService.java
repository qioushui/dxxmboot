package com.dx.dx.service;

import com.dx.dx.domain.DxbgDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2020-06-08 19:18:53
 */
public interface DxbgService {
	
	DxbgDO get(String num);
	
	List<DxbgDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);

	Integer save(List<DxbgDO> ecds);
	
	int update(DxbgDO dxbg);
	
	int remove(String num);
	int removeAll();
	int batchRemove(String[] nums);
}
