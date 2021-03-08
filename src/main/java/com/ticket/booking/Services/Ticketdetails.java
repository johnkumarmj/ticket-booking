package com.ticket.booking.Services;



import com.ticket.booking.AppConstant.queryConstant;
import com.ticket.booking.Dao.ConnectionDao;
import com.ticket.booking.Entity.employeEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ticketdetails {
    @Autowired
public ConnectionDao connectionDao;
public final Logger log = LoggerFactory.getLogger(Ticketdetails.class);


    public employeEntity Getemployeesdetail(int employeE,employeEntity employeEntity){
        return connectionDao.getEmployeeDetails( queryConstant.employees,employeE,90,employeEntity).get(0);
       // log.info(employeEn.getEmployeeName());
    }

    public int tempval (){
        return 20;
    }

}
