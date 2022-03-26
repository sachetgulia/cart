package com.example.Postgresql.Feign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value="fiegnDemo",url="http://10.20.2.213:8085")
public interface  MerchantInterface {


//    @RequestMapping(method = RequestMethod.GET,value ="/checkstock")
     @GetMapping("/merchant/checkstock")
     boolean checkStock(@RequestParam("mid") Integer mid, @RequestParam("pid") Integer pid);

    @RequestMapping(method = RequestMethod.POST,value ="/merchant/stockupdate")
    public void stockUpdate(@RequestParam("mid") Integer mid ,@RequestParam("pid") Integer pid ,@RequestParam("quantity") Integer quantity );

}
