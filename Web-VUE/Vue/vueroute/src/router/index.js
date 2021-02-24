import Vue from 'vue'
import Router from 'vue-router'
// 引入加载的组件
import routedemo01 from "@/components/route_demo";

Vue.use(Router)

export default new Router({
  routes: [
    {
      // 点击所发出的超链接地址
      path: '/show',
      // 该路由的名称
      name: 'HelloWorld',
      // 点击该连接所加载的组件
      component: routedemo01
    }
  ]
})
