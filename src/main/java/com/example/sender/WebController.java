package com.example.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 

 
@RestController
public class WebController {
  
  @Autowired
  Sender sender;
  
  @RequestMapping("/send")
  public String sendMsg(@RequestParam("msg")String msg){
    sender.produceMsg(msg);
    
    return "Done";
  }
}