鉴权部分分成两个模块来写了
+---- Security模块负责Spring Security的一些基本配置
---- Config
定义了http请求拦截；注入userDetailsService和passwordEncoder
---- AuthFilter
从缓存中验证token，从token中加载用户信息进容器
---- LoginFilter
获取登录表单的数据并验证，并且定义了验证成功与失败的返回调用


+---- acl模块负责一些组件的具体实现




+---- Gateway模块
    ---- CorsConfig 就是设置跨域，全部开启*
    ---- AuthGlobalFilter token验证的逻辑存在问题
    ---- JsonExceptionHandler 用JSON来代替HTML的异常信息

+---- Properties中定义了路由的规则