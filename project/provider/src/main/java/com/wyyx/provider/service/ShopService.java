package com.wyyx.provider.service;

import com.wyyx.provider.dto.ComProduct;

import java.util.List;

public interface ShopService {
    /**
     * @author kitty_zhu
     * @date 2019-10-17 12:11
     * 网页首页的分组商品信息
     */
    List<ComProduct> selectAll(int num);

    //返回一个随机的元素
    ComProduct randomProduct();

    /**
     * @author kitty_zhu
     * 根据商品类型查询商品
     */
    List<ComProduct> selectByClass(int p_type, int start, int offset);

    public long selectByClassCount(int p_type);

    /**
     * @author kitty_zhu
     * 模糊查询-分页
     */
    List<ComProduct> selectByName(String name, int start, int offset);

    public long selectByNameCount(String name);

    //dkl 通过商品id查询商品全部信息
    ComProduct selectByPrimaryKey(Long id);

    //kitty_zhu：：默认最火爆商品在搜索框
    List<ComProduct> selectByHot();

    List<ComProduct> selectAllC(int start, int offset);

    long selectAllCCount();



}
