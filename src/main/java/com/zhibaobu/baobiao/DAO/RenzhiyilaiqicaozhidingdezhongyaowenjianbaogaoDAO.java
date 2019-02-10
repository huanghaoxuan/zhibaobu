package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Renzhiyilaiqicaozhidingdezhongyaowenjianbaogao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-02 12:29
 **/
public interface RenzhiyilaiqicaozhidingdezhongyaowenjianbaogaoDAO extends JpaRepository<Renzhiyilaiqicaozhidingdezhongyaowenjianbaogao, Integer>, JpaSpecificationExecutor<Renzhiyilaiqicaozhidingdezhongyaowenjianbaogao> {
}
