package com.ghl.wuhan.listview2;

/**
 * 项目名称：com.ghl.wuhan.listview2
 * 类描述：
 * 创建人：Liting
 * 创建时间：2019/1/31 11:35
 * 修改人：Liting
 * 修改时间：2019/1/31 11:35
 * 修改备注：
 * 版本：
 */

public class Fruit {
    private String name;
    private int imageId;

    public Fruit(String name,int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

}
