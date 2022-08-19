# 微服务学习Part1

## 服务拆分
> 通过restTamplete 获取其他服务信息

## 服务信息
### bookServer
> 获取书籍信息
> /book/{bid}
> 
### userServer
> 获取用户信息
> /user/{uid}
> 

### borrowServer
> 租借信息获取服务 /borrow/{uid}
> > 根据用户信息获取租借信息
> 
>
> 
## eureka 注册中心
### common 
> 公共的组件
> 
> 
### eureka-center
> eureka server


