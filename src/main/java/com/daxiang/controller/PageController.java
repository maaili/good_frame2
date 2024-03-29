package com.daxiang.controller;

import com.daxiang.mbg.po.Page;
import com.daxiang.model.PageRequest;
import com.daxiang.model.Response;
import com.daxiang.service.PageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by jiangyitao.
 */
@Slf4j
@RestController
@RequestMapping("/page")
public class PageController {

    @Autowired
    private PageService pageService;

    /**
     * 添加page
     *
     * @param page
     * @return
     */
    @PostMapping("/add")
    public Response add(@Valid @RequestBody Page page) {
        return pageService.add(page);
    }

    /**
     * 删除page
     *
     * @param pageId
     * @return
     */
    @DeleteMapping("/{pageId}")
    public Response delete(@PathVariable Integer pageId) {
        return pageService.delete(pageId);
    }

    /**
     * 修改page
     *
     * @param page
     * @return
     */
    @PostMapping("/update")
    public Response update(@Valid @RequestBody Page page) {
        return pageService.update(page);
    }


    /**
     * 查询page列表
     *
     * @return
     */
    @PostMapping("/list")
    public Response list(Page page, PageRequest pageRequest) {
        return pageService.list(page, pageRequest);
    }

}
