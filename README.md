# MFPE---Retrun-Order-Management
A leading Supply chain Management Organization wants to automate the return orders, by classifying them to repair or replacement. Repair is for all main or integral part of their product. Replacement is for accessories.   

Boiler Code  

Project Details  

Req-01 Component processing - port (8081) -  - componentProcessModule  
Req-02 Packaging and Delivery module - port (8082) - - packageDeliveryModule   
Req-03 Payment Module - port (8083) -  - paymentService    
Req-04 Authorization Module - port (8084) -  - authorizationService  
Req-05 Portal - port (8080) -  - mainPortal      

Discovery Server - Eureka - port (8085) - http://localhost:8085/    

Project Structure   
BasePackage - com.returnordermanag     
Controller Package - com.returnordermanag.<ServiceName>.Controller    
Data Package - com.returnordermanag.<ServiceName>.Model    
Test Package - com.returnordermanag.<ServiceName>Test   
  
     
Module Assinged  
Component processing - Swapnil & Ashutosh  
Packaging and Delivery module - Swapnil & Ashutosh  
Payment Module - Arun & Hariharan   
Authorization Module - Arun & Hariharan  
Portal - All  


Module Finsined    

1. Packaging and Delivery module - Ashutosh  
  Url Sample - http://localhost:8082/GetPackagingDeliveryCharge/Integral/10     
  Output - {"PacakagingAndDeliveryCharge":"3000.0"}   
  Error Checking 
        Url - http://localhost:8082/GetPackagingDeliveryCharge/Integral/0   
        Output - {"PacakagingAndDeliveryCharge":"error"}  
        
2. Payment module - Ashutosh  
  Url Sample - http://localhost:8083/ProcessPayment/ascd12345/1200/500     
  Output - {"CurrentBalance":"119500.0"}   
  Error Checking 
        Url - http://localhost:8083/ProcessPayment/ascd12345/1200/5000000   
        Output - {"CurrentBalance":"InffusicentFunds"}   

3. Component processing - Ashutosh    
  Url Sample - http://localhost:8081/CompleteProcessing/145asbcd/ascd12345/1200/500       
  Output - Payment is Succefull with Remaining value is 119500.0      
  Error Checking 
        Url - http://localhost:8081/CompleteProcessing/145asbcd/ascd12345/1200/5000000     
        Output - Payment is Declined due to Inffusicent Funds     





  
