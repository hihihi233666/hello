package com.test.mapper;

import com.test.pojo.CangKu;

import java.util.List;

public interface CangKuMapper {

    void addCangKu(CangKu cangku);

    void deleteBynum(int num);

    CangKu Findbynum(int num);

    List<CangKu> Findbytwo(CangKu cangku);

    int updateCangKu(CangKu cangku);

    List<CangKu> selectAll();

    CangKu Findbycall(int call);
}