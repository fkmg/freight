package com.sxt.util;

import java.io.Serializable;
import java.util.List;

public class TreeNode implements Serializable {

    /**树id**/
    private String id;

    /**树名称**/
    private String name;

    /**是否为树节点**/
    private Boolean isParent;

    /**展开 / 折叠 状态**/
    private Boolean open;

    /**节点选择属性**/
    private Boolean checked;

    /**节点是否隐藏**/
    private Boolean isHidden;

    /**子节点**/
    private List<TreeNode> children;

    public Boolean getIsHidden(){
        return isHidden;
    }

    public void setIsHidden(Boolean hidden) {
        isHidden = hidden;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(Boolean parent) {
        isParent = parent;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }
}
