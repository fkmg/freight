package com.sxt.util;

import java.util.List;


//封装 分页需要显示的信息
public class PageBean {
    private List<?> datas; //分页需要展示的数据
    private Long totalRows; //总条数
    private Long totalPages; //总页数
    private Integer curPage = 1; //当前页
    private Integer pageSize = 10;//每页多少条
    private String url;// 查询路径
    private String export;


    public List<?> getDatas() {
        return datas;
    }

    public void setDatas(List<?> datas) {
        this.datas = datas;
    }

    public Long getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(Long totalRows) {
        this.totalRows = totalRows;
    }


    public Long getTotalPages() {
        //总页数=总条数%分页单位==0?总条数/分页单位:总条数/分页单位+1;
        totalPages = totalRows % pageSize == 0 ? totalRows / pageSize : totalRows / pageSize + 1;
        return totalPages;
    }

    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }


    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getExport() {
        return export;
    }

    public void setExport(String export) {
        this.export = export;
    }
}
