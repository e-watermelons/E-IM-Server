package org.e.chat.infrastructure.common;

import cn.hutool.core.util.StrUtil;

public class PageReq {
    private int pageStart = 0;
    private int pageEnd = 0;

    private int page;
    private int rows;

    public PageReq(){

    }
    public PageReq(String page,String rows){
        this.page = StrUtil.isEmpty(page) ? 1 : Integer.parseInt(page);
        this.rows = StrUtil.isEmpty(rows) ? 10 : Integer.parseInt(rows);
        if (0 == this.page){
            this.page = 1;
        }
        this.pageStart = (this.page - 1) * this.rows;
        this.pageEnd = this.rows;
    }

    public void setPage(String page,String rows){
        this.page = StrUtil.isEmpty(page) ? 1 : Integer.parseInt(page);
        this.rows = StrUtil.isEmpty(page) ? 10 : Integer.parseInt(rows);
        if (0 == this.page){
            this.page = 1;
        }
        this.pageStart = (this.page - 1) * this.rows;
        this.pageEnd = this.rows;
    }

    public int getPageStart() {
        return pageStart;
    }

    public void setPageStart(int pageStart) {
        this.pageStart = pageStart;
    }

    public int getPageEnd() {
        return pageEnd;
    }

    public void setPageEnd(int pageEnd) {
        this.pageEnd = pageEnd;
    }
}
