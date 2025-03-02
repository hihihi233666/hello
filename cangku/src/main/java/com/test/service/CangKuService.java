package com.test.service;

import com.test.mapper.CangKuMapper;
import com.test.pojo.CangKu;
import com.test.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;
public class CangKuService {
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public void add(CangKu cangku){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CangKuMapper cangkuMapper = sqlSession.getMapper(CangKuMapper.class);
        System.out.println("wjhddj");
        cangkuMapper.addCangKu(cangku);
        System.out.println("hi的");
        sqlSession.commit();
        sqlSession.close();
    }

    public void delete(int num ){

        SqlSession sqlSession = sqlSessionFactory.openSession();
        CangKuMapper cangkuMapper = sqlSession.getMapper(CangKuMapper.class);
       cangkuMapper.deleteBynum(num);
        sqlSession.commit();
        sqlSession.close();
    }

    public CangKu Findbynum(int num){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CangKuMapper cangkuMapper = sqlSession.getMapper(CangKuMapper.class);
        System.out.println(num);
        CangKu cangku=cangkuMapper.Findbynum(num);
        sqlSession.close();
        return cangku;
    }

    public List<CangKu> Findbytwo(CangKu cangku){

        SqlSession sqlSession = sqlSessionFactory.openSession();
        CangKuMapper cangkuMapper = sqlSession.getMapper(CangKuMapper.class);
        List<CangKu> cls=cangkuMapper.Findbytwo(cangku);
        sqlSession.close();
        return cls;
    }

    public void update(CangKu cangku){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CangKuMapper cangKuMapper = sqlSession.getMapper(CangKuMapper.class);
        System.out.println("提交前");
        cangKuMapper.updateCangKu(cangku);
        System.out.println("提交后期");
        sqlSession.commit();
        sqlSession.close();
    }

    public List<CangKu> selectAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CangKuMapper cangkuMapper = sqlSession.getMapper(CangKuMapper.class);
        List<CangKu> CangKuSelectAll=cangkuMapper.selectAll();
        sqlSession.close();
        return CangKuSelectAll;
    }

    public CangKu Findbycall(int call){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CangKuMapper cangkuMapper = sqlSession.getMapper(CangKuMapper.class);
        System.out.println(call);
        CangKu cangku=cangkuMapper.Findbycall(call);
        sqlSession.close();
        return cangku;
    }
}
