package com.kaishengit.mapper;

import com.kaishengit.pojo.Sales;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/17.
 */
public interface SalesMapper {


    void save(Sales sales);

    List<Sales> findByParam(Map<String, Object> params);

    Long countByParam(Map<String, Object> params);


    Sales findById(Integer id);

    void update(Sales sales);

    void del(Integer id);

    List<Sales> findByCustId(Integer custId);
}
