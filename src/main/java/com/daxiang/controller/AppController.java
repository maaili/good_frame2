package com.daxiang.controller;

import com.daxiang.mbg.po.App;
import com.daxiang.model.PageRequest;
import com.daxiang.model.Response;
import com.daxiang.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by jiangyitao.
 */
@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private AppService appService;

    @PostMapping("/upload")
    public Response upload(@Valid App app, MultipartFile file, HttpServletRequest request) {
        return appService.upload(app, file, request);
    }

    @DeleteMapping("/{appId}")
    public Response delete(@PathVariable Integer appId) {
        return appService.delete(appId);
    }

    @PostMapping("/update")
    public Response update(@Valid @RequestBody App app) {
        return appService.update(app);
    }

    @PostMapping("/list")
    public Response list(App app, PageRequest pageRequest) {
        return appService.list(app, pageRequest);
    }

    @GetMapping("/{appId}/aaptDumpBadging")
    public Response aaptDumpBadging(@PathVariable Integer appId) {
        return appService.aaptDumpBadging(appId);
    }
}
