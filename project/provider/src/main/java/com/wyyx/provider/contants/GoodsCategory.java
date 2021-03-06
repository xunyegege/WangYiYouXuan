package com.wyyx.provider.contants;

/**
 * **********************************************************
 *
 * @Project:
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2019-10-18 13:53
 * @description:
 ************************************************************/

public enum GoodsCategory {




    SHOES(5, "鞋子"),
    CLOTHES(2, "水果"),
    HAT(3, "衣服"),
    COMPUTER(4, "家电"),
    KITCHEN(1, "厨房用品");

    Integer category;
    String desc;



    public static GoodsCategory getByValue(int value){
        for(GoodsCategory transactType : values()){
            if (transactType.getCategory().equals(value)) {
                return transactType;
            }
        }
        return null;
    }

    GoodsCategory(Integer category, String desc) {
        this.category = category;
        this.desc = desc;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
