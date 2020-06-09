package com.dx.common.service;

import org.springframework.stereotype.Service;

import com.dx.common.domain.LogDO;
import com.dx.common.domain.PageDO;
import com.dx.common.utils.Query;
@Service
public interface LogService {
	void save(LogDO logDO);
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
