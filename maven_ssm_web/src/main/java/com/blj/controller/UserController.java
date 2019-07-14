package com.blj.controller;

import com.blj.domain.User;
import com.blj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @Value("${host}")
    private String host;

    @RequestMapping("/testContext")
    public String testContext(Model model) {
        model.addAttribute("host",host);
       return "testContext";
    }



    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("表现层：查询所有的用户信息");
        List<User> users = userService.finfAll();
        model.addAttribute("users", users);
        return "list";
    }


    @RequestMapping("/savaUser")
    public String savaUser(User user, Model model) {
        int num = userService.savaUser(user);
        if (num > 0) {
            model.addAttribute("tip", "用户增加成功");
        } else {
            model.addAttribute("tip", "用户增加失败");
        }
        return "welcome";
    }

    @RequestMapping("/fileupload")
    public String fileupload(HttpServletRequest request, MultipartFile upload) throws Exception {
        System.out.println("springmvc 文件上传");
        String path = request.getSession().getServletContext().getRealPath("/uploads");
        File file = new File(path);
        if (!file.exists()) {
            //如果没有这个目录就新建一个uploads文件夹
            file.mkdirs();
        }
        String filename = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid + "_" + filename;
        upload.transferTo(new File(path, filename));
        return "success";
    }




}
