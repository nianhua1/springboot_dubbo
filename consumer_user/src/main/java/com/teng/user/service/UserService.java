package com.teng.user.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.teng.ticket.service.TicketService;
import org.springframework.stereotype.Service;

/**
 * @author shkstart
 * @create 2021-06-19 14:03
 */
@Service
public class UserService {
    @Reference
    TicketService ticketService;

    public void hello(){
        String ticket = ticketService.getTicket();
        System.out.println("买到:"+ticket+"票了");
    }
}
