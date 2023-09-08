package com.mdx.storage.repository;

import com.mdx.storage.entity.StorageTbl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @Classname StorageRepository
 * @Description TODO
 * @Date 2023/3/27 12:13
 * @Created by baiyang
 */
@Repository
public interface StorageRepository extends JpaRepository<StorageTbl,Integer> {


    /**
     * 通过商品code查询库存
     * @param commodityCode
     * @return
     */
    @Query
    StorageTbl findByCommodityCode(String commodityCode);
}
