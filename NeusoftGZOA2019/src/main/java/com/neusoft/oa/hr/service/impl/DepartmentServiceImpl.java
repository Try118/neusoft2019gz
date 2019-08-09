package com.neusoft.oa.hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.oa.hr.mapper.IDepartmentMapper;
import com.neusoft.oa.hr.model.DepartmentModel;
import com.neusoft.oa.hr.service.IDepartmentService;
/*
 * 模块：HR 人力资源
 * 部门业务层接口的实现类
 * @Author: 吕海东
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class DepartmentServiceImpl implements IDepartmentService {
	@Autowired
	private IDepartmentMapper departmentMapper=null;

	@Override
	public void add(DepartmentModel department) throws Exception {
		departmentMapper.insert(department);

	}

	@Override
	public void modify(DepartmentModel department) throws Exception {
		departmentMapper.update(department);

	}

	@Override
	public void delete(DepartmentModel department) throws Exception {
		departmentMapper.delete(department);

	}

	@Override
	public DepartmentModel getByNo(int no) throws Exception {
		
		return departmentMapper.selectByNo(no);
	}

	@Override
	public List<DepartmentModel> getListByAll() throws Exception {
		
		return departmentMapper.selectListByAll();
	}

	@Override
	public List<DepartmentModel> getListByAllWithPage(int rows, int page) throws Exception {
		
		return departmentMapper.selectListByAllWithPage(rows*(page-1), rows);
	}

	@Override
	public int getCountByAll() throws Exception {
		
		return departmentMapper.selectCountByAll();
	}

}
