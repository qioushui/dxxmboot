package com.dx.dx.dao;

import com.dx.dx.domain.DxbgDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2020-06-08 19:18:53
 */
@Mapper
public interface DxbgDao {

	DxbgDO get(String num);
	
	List<DxbgDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);

	Integer save(@Param("ecds") List<DxbgDO> ecds);
	
	int update(DxbgDO dxbg);
	
	int remove(String num);

	int removeAll();
	
	int batchRemove(String[] nums);
}
