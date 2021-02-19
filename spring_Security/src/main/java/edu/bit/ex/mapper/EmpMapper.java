package edu.bit.ex.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.bit.ex.vo.EmpVO;

@Mapper
public interface EmpMapper {
	EmpVO getEmp(String ename);
}