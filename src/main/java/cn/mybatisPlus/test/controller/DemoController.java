package cn.mybatisPlus.test.controller;

import cn.mybatisPlus.test.entity.Demo;
import cn.mybatisPlus.test.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xtj
 * @since 2021-10-10
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    DemoService demoService;

    @RequestMapping("/{id}")
    public Demo queryById(@PathVariable("id")  Long id){
        return demoService.getById(id);
    }

    @PostMapping("/List")
    @ResponseBody
    public boolean existIdBoolean(@RequestBody List<Long> listIds){
        return demoService.existIdBoolean(listIds);
    }
}

