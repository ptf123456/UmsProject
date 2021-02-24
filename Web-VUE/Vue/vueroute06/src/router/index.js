import Vue from 'vue'
import Router from 'vue-router'
import enjoy from "@/components/enjoy";
import water from "@/components/water";
import kingdom from "@/components/kingdom";

// 守护路由
Vue.use(Router)

export default new Router({
  routes: [{
    path: '/kingdom',
    name: 'kingdom',
    component: kingdom,
    beforeEnter: (to, from, next) => {
      console.log("你瞅啥");
      let isLogin = to.params.isLogin;
      // 判断此时用户是否登录
      if (isLogin) {
        // 允许登录
        next();
      } else {
        // 此时未登录，定向到新闻页面
        next("/water");
      }
    }
  },{
    path: '/enjoy',
    name: 'enjoy',
    component: enjoy
  },{
    path: '/water',
    name: 'water',
    component: water
  }]
})

