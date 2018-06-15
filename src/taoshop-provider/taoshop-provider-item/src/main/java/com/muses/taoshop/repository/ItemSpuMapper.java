package com.muses.taoshop.repository;

import com.muses.taoshop.common.core.database.annotation.MybatisRepository;
import com.muses.taoshop.vo.ItemSpu;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MybatisRepository
public interface ItemSpuMapper {
//    int countByExample(ItemSpuExample example);
//
//    int deleteByExample(ItemSpuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItemSpu record);

    int insertSelective(ItemSpu record);

//    List<ItemSpu> selectByExample(ItemSpuExample example);

    ItemSpu selectByPrimaryKey(Long id);

//    int updateByExampleSelective(@Param("record") ItemSpu record, @Param("example") ItemSpuExample example);

//    int updateByExample(@Param("record") ItemSpu record, @Param("example") ItemSpuExample example);

    int updateByPrimaryKeySelective(ItemSpu record);

    int updateByPrimaryKey(ItemSpu record);
}